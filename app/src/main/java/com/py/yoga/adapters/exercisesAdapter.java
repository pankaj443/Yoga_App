package com.py.yoga.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.py.yoga.R;
import com.py.yoga.object.exercise;

import java.util.List;

public class exercisesAdapter extends  RecyclerView.Adapter<exercisesAdapter.productViewHolder> {


    private Context context;
    private List<exercise> exerciseList;

    public exercisesAdapter(Context context, List<exercise> exerciseList) {
        this.context = context;
        this.exerciseList = exerciseList;
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        final View view = LayoutInflater.from(context).inflate(R.layout.card_exercise , viewGroup ,false );

        return new productViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int i) {


        final exercise exe = exerciseList.get(i);
        holder.extitle.setText(exe.getTitle());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(exe.getImageView()));

    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    class productViewHolder extends RecyclerView.ViewHolder{

        TextView extitle;
        ImageView imageView;

        public productViewHolder(@NonNull final View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            extitle = itemView.findViewById(R.id.excercise_name);


        }
    }

}
