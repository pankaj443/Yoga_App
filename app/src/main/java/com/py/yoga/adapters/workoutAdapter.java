package com.py.yoga.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.py.yoga.R;
import com.py.yoga.activities.workout_desc;
import com.py.yoga.object.wo_exe;
import com.py.yoga.object.workout;

import java.security.AccessControlContext;
import java.util.List;


public class workoutAdapter extends RecyclerView.Adapter<workoutAdapter.productViewHolder>
{
    private Context context;
    private List<workout> workoutsList;

    public workoutAdapter(Context context, List<workout> workoutsList) {
        this.context = context;
        this.workoutsList = workoutsList;
    }


    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(context).inflate(R.layout.card_workout , viewGroup ,false );

        return new productViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final productViewHolder holder, int i) {

        final workout current_WO = workoutsList.get(i);
        Log.d("Hello",current_WO.getExercises());
        holder.woName.setText(current_WO.getExercises());
        holder.woTotal.setText(current_WO.getTotalexe());
        holder.woDur.setText(current_WO.getDuration());
        holder.woDesc.setText(current_WO.getDescription());




        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(holder.itemView.getContext(), workout_desc.class);
                i.putExtra("title",String.valueOf(current_WO.getExercises()));
                i.putExtra("total",String.valueOf(current_WO.getTotalexe()));
                i.putExtra("dur",String.valueOf(current_WO.getDuration()));
                i.putExtra("desc",String.valueOf(current_WO.getDescription()));

                holder.itemView.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return workoutsList.size();
    }

    public class productViewHolder extends RecyclerView.ViewHolder
    {
        TextView woName, woTotal, woDur, woDesc;

        public productViewHolder(@NonNull final View itemView)
        {
            super(itemView);

            woName = (TextView)itemView.findViewById(R.id.wo_name);
            woTotal = (TextView)itemView.findViewById(R.id.wo_totalexe);
            woDur = (TextView)itemView.findViewById(R.id.wo_dur);
            woDesc =(TextView) itemView.findViewById(R.id.wo_desc);
        }
    }
}