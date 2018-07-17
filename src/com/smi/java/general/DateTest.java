package com.smi.java.general;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

public class DateTest {


    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTimeInMillis())); 
        
        
     //   System.out.println(UUID.randomUUID().toString());
     
        
        Date date = new Date(Calendar.getInstance().getTimeInMillis());
        String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
        SimpleDateFormat formatDate = new SimpleDateFormat(DATE_FORMAT);
        formatDate.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        System.out.println(formatDate.format(Calendar.getInstance().getTimeInMillis()));
        
        System.out.println(Instant.now()) ;
        
    }
}
