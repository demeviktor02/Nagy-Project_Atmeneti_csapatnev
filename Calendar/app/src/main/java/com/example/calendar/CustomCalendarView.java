package com.example.calendar;

import android.content.Context;
import android.provider.CalendarContract;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CustomCalendarView extends LinearLayout{
    ImageButton NextButton,PreviousButton;
    TextView CurrentDate;
    GridView gridView;
    private static final int MAX_CALENDAR_DAYS = 42;
    Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
    Context context;
    SimpleDateFormat dateFormat = new SimpleDateFormat( "MMMM yyyy", Locale.ENGLISH);
    SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy", Locale.ENGLISH);

    AlertDialog alertDialog;
    List<Date> dates = new ArrayList<>();
    List<Events> eventsList = new ArrayList<>();

    public CustomCalendarView(Context context) {
        super(context);
    }

    public CustomCalendarView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        IntializeLayout();
        SetUpCalendar();

        PreviousButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar.add(Calendar.MONTH,-1);
                SetUpCalendar();
            }
        });

        NextButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.add(Calendar.MONTH,1);
                SetUpCalendar();
            }
        });

        gridView.SetOnItemClickListener(new AdapterView.onItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                AlertDialog.Builder builder=new AlertDialog.Builder(context);
                builder.SetCancellable=(true);
                final View addView=LayoutInflater.from(parent.getContext()).inflate (R.layout.add_newevent_layout, root null);
                EditText EventName=addView.findViewById(R.id.events_id);
                TextView EventTime=addView.findViewById(R.id.eventtime);
                ImageButton SetTime=addView.findViewById(R.id.seteventtime);
                Button AddEvent=addView.findViewById(R.id.addevent);
                SetTime.setOnClickListener(new onClickListener() {
                    @Override
                    public void onClick(View v) {
                    Calendar calendar = calendar.getInstance();
                    int hours = calendar.get(Calendar.HOUR_OF_DAY);
                    int minutes = calendar.get(Calendar.MINUTE);
                    TimePickerDialog timePickerDialog = new TimePickerDialog(addView.getContext(), R.style.Theme_AppCompat_Dialog
                            , new TimePickerDialog.OnTimeSetListener()) {
                            @Override
                            public void onTimeSet(Timepicker view,int hourOfDay,int minute){
                            Calendar c=Calendar.getInstance();
                            c.set(Calendar.HOUR_OF_DAY,hourOfDay);
                            c.set(Calendar.MINUTE,minute);
                            c.setTimeZone(TimeZone.getDefault());
                            SimpleDateFormat hformate= new SimpleDateFormat(pattern: "K:mm a",Locale.ENGLISH);
                            String event_Time=hformate.format(c.getTime());
                            EventTime.setText(event_Time);
                    }
                },hours,minutes,is24HourView false);
                    timePickerDialog.show();
                }


            });
            final String date=dateFormat.format(dates.get(position));
            final String month=monthFormat.format(dates.get(position));
            final String year=yearFormat.format(dates.get(position));

            AddEvent.setOnClickListener(new onClickListener(){
                public void onClick(View v){
                    SaveEvent(EventName.getText().toString(),EventTime.getText().toString(),date,month,year);
                    SetUpCalendar();
                    alertDialog.dismiss();
                }
            });
                builder.setView(addView);
                alertDialog=builder.create();
                alertDialog.show();

            }
        });


    }

    public CustomCalendarView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void SaveEvent(String event,String time,String date,String month,String year){
        dbOpenHelper=new dbOpenHelper=(context);
        SQLiteDatabase database = dbOpenHelper.getWritableDatabase();
        dbOpenHelper.SaveEvent(event,time,date,month,year,database);
        dbOpenHelper.close();
        Toast.makeText(context, text:"Event Saved",Toast.LENGTH_SHORT).show();
    }

    private void IntializeLayout(){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.calendar_layout, this);
        NextButton = view.findViewById(R.id.nextBtn);
        PreviousButton = view.findViewById(R.id.previousBtn);
        CurrentDate = view.findViewById(R.id.current_Date);
        gridView = view.findViewById(R.id.gridview);
    }

    private void SetUpCalendar(){
        String currentDate = dateFormat.format(calendar.getTime());
        CurrentDate.setText(currentDate);
        dates.clear();
        Calendar monthCalendar = (Calendar) calendar.clone();
        monthCalendar.set(Calendar.DAY_OF_MONTH,1);
        int FirstDayofMonth=monthCalendar.get(Calendar.DAY_OF_WEEK)-1;
        monthCalendar.add(Calendar.DAY_OF_MONTH,-FirstDayofMonth);

        while(dates.size()<MAX_CALENDAR_DAYS)
        {
            dates.add(monthCalendar.getTime());
            monthCalendar.add(Calendar.DAY_OF_MONTH, amount 1);
        }
    }

}
