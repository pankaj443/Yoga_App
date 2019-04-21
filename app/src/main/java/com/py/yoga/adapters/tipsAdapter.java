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
import com.py.yoga.object.tips;

import java.util.List;

public class tipsAdapter extends RecyclerView.Adapter<tipsAdapter.productViewHolder>{


    private Context context;
    private List<tips> tipsList;

    public tipsAdapter(Context context, List<tips> tipsList) {
        this.context = context;
        this.tipsList = tipsList;
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.card_tips , viewGroup ,false );
        return new productViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int i) {

        tips tip = tipsList.get(i);
        holder.tiptitle.setText(tip.getTitle());

        holder.tipcount.setImageDrawable(context.getResources().getDrawable(tip.getImage()));


    }

    @Override
    public int getItemCount() {
        return tipsList.size();

    }

    class productViewHolder extends RecyclerView.ViewHolder{

        TextView tiptitle,tipDesc;
        ImageView tipcount;

        public productViewHolder(@NonNull View itemView) {
            super(itemView);

            tiptitle = itemView.findViewById(R.id.tipTitle);
            tipcount = itemView.findViewById(R.id.tipCount);


        }
    }

}
