package com.py.yoga.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.py.yoga.R;
import com.py.yoga.object.adrine;

import java.util.List;

public class adrineAdapter extends RecyclerView.Adapter<adrineAdapter.productViewHolder>{


    private Context context;
    private List<adrine> adrineList;

    public adrineAdapter(Context context, List<adrine> tipsList) {
        this.context = context;
        this.adrineList = tipsList;
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {

        final View view = LayoutInflater.from(context).inflate(R.layout.card_adrine , viewGroup ,false );

        return new productViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final productViewHolder holder, final int i) {

        final adrine tip = adrineList.get(i);
        holder.adrinetitle.setText(tip.getTitle());

        holder.adrinecount.setImageDrawable(context.getResources().getDrawable(tip.getImage()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://"+tip.getId()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return adrineList.size();

    }

    class productViewHolder extends RecyclerView.ViewHolder{

        TextView adrinetitle;
        ImageView adrinecount;

        public productViewHolder(@NonNull final View itemView) {
            super(itemView);


            adrinetitle = itemView.findViewById(R.id.adrinetitle);
            adrinecount = itemView.findViewById(R.id.adrinecount);


        }
    }

}
