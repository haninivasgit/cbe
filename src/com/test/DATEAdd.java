package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DATEAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance() ;
		System.out.println( formatter.format(cal.getTime()));
		
		cal.add(Calendar.DATE, 30);
		System.out.println( formatter.format(cal.getTime()));
	}

}
