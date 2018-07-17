package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddTime {

  public static void main(String[] args) throws ParseException {
    // TODO Auto-generated method stub
    String myTime = "14:10:00";
    SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
    Date d = df.parse(myTime);
    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    cal.add(Calendar.MINUTE, -60);
    System.out.println(df.format(cal.getTime()));


    String time1 = "12:15:00";
    String time2 = "12:45:00";

    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
    Date date1 = format.parse(time1);
    Date date2 = format.parse(time2);
    long difference = date2.getTime() - date1.getTime();
    System.out.println((difference / 1000) / 60);
    
    

  }

}
