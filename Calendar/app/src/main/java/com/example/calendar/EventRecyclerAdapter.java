package com.example.calendar;

import androidx.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class EventRecyclerAdapter extends RecyclerView.Adapter<EventRecyclerAdapter.MyViewHolder>{

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView DateTxt,Event,Time;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            DateTxt=itemView.findViewById(R.id.);
            Event=itemView.findViewById(R.id.eventname);
            Time=itemView.findViewById(R.id.eventime);
        }
    }
}