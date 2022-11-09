package com.example.calendar;
import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;
import androidx.annotation.NonNull;

public class MyGridAdapter extends ArrayAdapter
{
    List<Date> dates;
    Calendar currentDate;
    List<Events> events;
    LayoutInflater inflater;

    public MyGridAdapter(@NonNull Context context,List<Date> dates,Calendar currentDate,List<Events> events) {
        super(context,R.layout.single_cell_layout);

        this.dates=dates;
        this.currentDate=currentDate;
        this.events=events;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        Date monthDate=dates.get(position);
        Calendar dateCalendar=Calendar.getInstance();
        int DayNo=dateCalendar.get(Calendar.DAY_OF_MONTH);
        int displayMonth=dateCalendar.get(Calendar.MONTH)+1;
        int displayYear=dateCalendar.get(Calendar.YEAR);
        int currentMonth=currentDate.get(Calendar.Month)+1;
        int currentYear=currentDate.get(Calendar.Month);

        View view=convertView;
        if(view==null)
        {
            view=inflater.inflate(R.layout.single_cell_layout,root null);
        }

        if(displayMonth==currentMonth && displayYear==currentYear){
            view.setBackGroundColor(getContext().getResources().getColor(R.color.green));
        }

        return convertView;
    }

    @Override
    public int getCount(){
        return dates.size();
    }

    @override
    public int getPosition(@Nullable Object item)
    {
        return dates.indexOf(item);
    }

    @Nullable
    @Override
    public Object getItem(int position){
        return dates.get(postiton);
    }


}