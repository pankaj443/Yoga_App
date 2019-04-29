package com.py.yoga.adapters;

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
import com.py.yoga.object.exercise;

import java.util.List;

import static com.py.yoga.activities.MainActivity.mInterstitialAd;
import static com.py.yoga.activities.MainActivity.mRewardedVideoAd;

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
    public void onBindViewHolder(@NonNull final productViewHolder holder, int i) {


        final exercise exe = exerciseList.get(i);
        holder.extitle.setText(exe.getTitle());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(exe.getImageView()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mRewardedVideoAd.isLoaded()) {
                    mRewardedVideoAd.show();
                }
                else if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAGE", "The interstitial wasn't loaded yet.");
                }
                Intent intent = new Intent(holder.itemView.getContext(), exerciseDescriptionActivity.class);
                intent.putExtra("title",exe.getTitle());
                intent.putExtra("desc",exe.getDesc());
                Bundle bundle=new Bundle();
                bundle.putInt("image",exe.getImageView());
                intent.putExtras(bundle);


                holder.itemView.getContext().startActivity(intent);

            }
        });
        mInterstitialAd.setAdListener(new AdListener() {
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
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
            }
        });

        loadRewardedVideoAd();
        mRewardedVideoAd.setRewardedVideoAdListener(new RewardedVideoAdListener() {
            @Override
            public void onRewardedVideoAdLoaded() {

            }

            @Override
            public void onRewardedVideoAdOpened() {

            }

            @Override
            public void onRewardedVideoStarted() {
                loadRewardedVideoAd();

            }

            @Override
            public void onRewardedVideoAdClosed() {

            }

            @Override
            public void onRewarded(RewardItem rewardItem) {

            }

            @Override
            public void onRewardedVideoAdLeftApplication() {
                loadRewardedVideoAd();

            }

            @Override
            public void onRewardedVideoAdFailedToLoad(int i) {

            }

            @Override
            public void onRewardedVideoCompleted() {

            }
        });


    }

    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-8427729765627466/8556651561",
                new AdRequest.Builder().build());
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
