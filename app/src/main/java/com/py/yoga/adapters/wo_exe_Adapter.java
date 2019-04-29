package com.py.yoga.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.py.yoga.R;
import com.py.yoga.activities.exerciseDescriptionActivity;
import com.py.yoga.activities.tipDescriptionActivity;
import com.py.yoga.activities.workout_desc;
import com.py.yoga.object.wo_exe;


import java.util.List;

import static com.py.yoga.activities.MainActivity.getmInterstitialAd;
import static com.py.yoga.activities.MainActivity.getmRewardedVideoAd;
import static com.py.yoga.activities.MainActivity.mInterstitialAd;
import static com.py.yoga.activities.MainActivity.mRewardedVideoAd;

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
        holder.image.setImageDrawable(context.getResources().getDrawable(current_Object.getImageView()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mRewardedVideoAd.isLoaded()) {
                    mRewardedVideoAd.show();
                }else
                if (getmInterstitialAd.isLoaded()) {
                    getmInterstitialAd.show();
                } else {
                    Log.d("TAGE", "The interstitial wasn't loaded yet.");
                }
                Intent intent = new Intent(holder.itemView.getContext(), exerciseDescriptionActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("title",current_Object.getName());
                intent.putExtra("desc",current_Object.getDesc());
                Bundle bundle=new Bundle();
                bundle.putInt("image",current_Object.getImageView());
                intent.putExtras(bundle);

                holder.itemView.getContext().startActivity(intent);

            }
        });
        getmInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                getmInterstitialAd.loadAd(new AdRequest.Builder().build());
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
            }
        });


        loadRewardedVideoAd1();
        getmRewardedVideoAd.setRewardedVideoAdListener(new RewardedVideoAdListener() {
            @Override
            public void onRewardedVideoAdLoaded() {

            }

            @Override
            public void onRewardedVideoAdOpened() {

            }

            @Override
            public void onRewardedVideoStarted() {
                loadRewardedVideoAd1();

            }

            @Override
            public void onRewardedVideoAdClosed() {

            }

            @Override
            public void onRewarded(RewardItem rewardItem) {

            }

            @Override
            public void onRewardedVideoAdLeftApplication() {
                loadRewardedVideoAd1();

            }

            @Override
            public void onRewardedVideoAdFailedToLoad(int i) {

            }

            @Override
            public void onRewardedVideoCompleted() {

            }
        });

    }

    private void loadRewardedVideoAd1() {
        getmRewardedVideoAd.loadAd("ca-app-pub-8427729765627466/4808978240",
                new AdRequest.Builder().build());
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
