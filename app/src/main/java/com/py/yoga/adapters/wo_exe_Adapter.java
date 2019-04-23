package com.py.yoga.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.py.yoga.R;
import com.py.yoga.activities.workout_desc;
import com.py.yoga.object.wo_exe;


import java.util.List;

public class wo_exe_Adapter extends RecyclerView.Adapter<wo_exe_Adapter.productViewHolder> {
    private Context context;
    private List<wo_exe> List;

    public wo_exe_Adapter(Context context, List<wo_exe> workoutsList) {
        this.context = context;
        this.List = workoutsList;
    }


    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(context).inflate(R.layout.card_workout_desc, viewGroup, false);

        return new productViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final productViewHolder holder, int i) {

        final wo_exe current_Object = List.get(i);

        holder.name.setText(current_Object.getName());
        // set image at here


    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class productViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;


        public productViewHolder(@NonNull final View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.card_exe_name);
            image = (ImageView) itemView.findViewById(R.id.card_exe_image);

        }
    }


}
