package com.example.sleepyhead;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private Activity activity;
    private ArrayList alarm_id, alarm_repeatable, alarm_disable, alarm_minutes, alarm_hours;

    CustomAdapter(Activity activity, Context context, ArrayList alarm_id, ArrayList alarm_repeatable, ArrayList alarm_disable, ArrayList alarm_hours,
                  ArrayList alarm_minutes){
        this.activity = activity;
        this.context = context;
        this.alarm_id = alarm_id;
        this.alarm_repeatable = alarm_repeatable;
        this.alarm_disable = alarm_disable;
        this.alarm_hours = alarm_hours;
        this.alarm_minutes = alarm_minutes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.id_txt.setText(String.valueOf(alarm_id.get(position)));
        holder.repeatable_txt.setText(String.valueOf(alarm_repeatable.get(position)));
        holder.displayed_txt.setText(String.valueOf(alarm_disable.get(position)));
        holder.hours_txt.setText(String.valueOf(alarm_hours.get(position)));
        holder.minutes_txt.setText(String.valueOf(alarm_minutes.get(position)));
        //Recyclerview onClickListener
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("id", String.valueOf(alarm_id.get(position)));
                intent.putExtra("repeatable", String.valueOf(alarm_repeatable.get(position)));
                intent.putExtra("disable", String.valueOf(alarm_disable.get(position)));
                intent.putExtra("hours", String.valueOf(alarm_hours.get(position)));
                intent.putExtra("minutes", String.valueOf(alarm_minutes.get(position)));
                activity.startActivityForResult(intent, 1);
            }
        });


    }

    @Override
    public int getItemCount() {
        return alarm_id.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView id_txt, repeatable_txt, displayed_txt, minutes_txt, hours_txt;
        LinearLayout mainLayout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id_txt = itemView.findViewById(R.id.id_txt);
            repeatable_txt = itemView.findViewById(R.id.disables_txt);
            displayed_txt = itemView.findViewById(R.id.weekdays_txt);
            hours_txt = itemView.findViewById(R.id.hours_txt);
            minutes_txt = itemView.findViewById(R.id.minutes_txt);
            mainLayout = itemView.findViewById(R.id.mainLayout);
            //Animate Recyclerview
            Animation translate_anim = AnimationUtils.loadAnimation(context, R.anim.translate_anim);
            mainLayout.setAnimation(translate_anim);
        }

    }

}
