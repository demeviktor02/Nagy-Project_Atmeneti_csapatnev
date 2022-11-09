package com.example.calendar;

import androidx.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class EventRecyclerAdapter extends RecyclerView.Adapter<EventRecyclerAdapter.MyViewHolder>{

    Context context;
    ArrayList<Events> arrayList;

    public EventRecyclerAdapter(Context context,ArrayList<Events> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.show_events_rowlayout,parent, attachToRoot false);

        return new MyViewHolder(view);
    }

    public onBindViewHolder(@NonNull MyViewHolder holder,int position){
        Events events=arrayList.get(position);
        holder.Event.setText(events.getEVENT());
        holder.DateTxt.setText(events.getDATE());
        holder.Time.setText(events.getTIME());
    }

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