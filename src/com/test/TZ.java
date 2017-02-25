package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class TZ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Date date = Calendar.getInstance().getTime() ;
		
		
		LocalDate apptLocalDate = Instant.ofEpochMilli(java.sql.Date.valueOf("2016-10-21").getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
		
		System.out.println( apptLocalDate );
		
	       // System.out.println("Default Date:"+date.toString());
	        
	        /*System.out.println("System Date in PST: "+formatDateToString(date, "yyyy-MM-dd hh:mm:ss", "PST"));
	        System.out.println("System Date in IST: "+formatDateToString(date, "yyyy-MM-dd hh:mm:ss", "IST"));
	        System.out.println("System Date in GMT: "+formatDateToString(date, "yyyy-MM-dd hh:mm:ss", "GMT"));*/
		
		String slotStartTime = "05:00:00" ;
		
		
		Calendar currentTime = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		sdf1.setTimeZone(TimeZone.getTimeZone("CST"));
		System.out.println("CST" + sdf1.format(currentTime.getTime()));
		currentTime.setTime(sdf2.parse(sdf1.format(currentTime.getTime())));
		System.out.println("CurrentTime " + currentTime.getTime());
        
        
		if (!currentTime.getTime().before(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2016-03-14" + " " + slotStartTime))) {
			slotStartTime = new SimpleDateFormat("HH:mm:ss").format(currentTime.getTime());
			System.out.println( "IF" + slotStartTime);
		}else {
			System.out.println( slotStartTime);
		}
		
	        
	        
	        Calendar cal = Calendar.getInstance() ;
	        
	        //cal.setTimeZone(TimeZone.getTimeZone("PST"));
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        sdf.setTimeZone(TimeZone.getTimeZone("MST"));	        
	        System.out.println( sdf.format(cal.getTime()));
	        cal.setTime(sdf.parse(sdf.format(cal.getTime())));
	        System.out.println(cal.getTime());
	        
	        
	        sdf.setTimeZone(TimeZone.getTimeZone("CST"));
	        System.out.println( "CST" + sdf.format(cal.getTime()));
	        
	        sdf.setTimeZone(TimeZone.getTimeZone("PST"));
	        System.out.println( "PST" + sdf.format(cal.getTime()));
	        
	        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
	        System.out.println( "IST" + sdf.format(cal.getTime()));
			/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println( Calendar.getInstance(TimeZone.getTimeZone("CST")).getTime());
			System.out.println( sdf.format(Calendar.getInstance(TimeZone.getTimeZone("MST")).getTime()));
*/
	}
	
	public static String formatDateToString(Date date, String format,
            String timeZone) {
        // null check
        if (date == null) return null;
        // create SimpleDateFormat object with input format
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        // default system timezone if passed null or empty
        if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
            timeZone = Calendar.getInstance().getTimeZone().getID();
        }
        // set timezone to SimpleDateFormat
        sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
        // return Date in required format with timezone as String
        return sdf.format(date);
    }

}
