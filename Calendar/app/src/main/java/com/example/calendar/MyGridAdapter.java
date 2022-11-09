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