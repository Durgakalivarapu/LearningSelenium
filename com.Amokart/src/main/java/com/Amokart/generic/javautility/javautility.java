package com.Amokart.generic.javautility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class javautility
{
	public int getRandomNum()
	{
		Random r = new Random();
		int ranDomNumber = r.nextInt(5000);
		return ranDomNumber;
		
	}
	
	public String getSystemDateYYYYDDMM()
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(d);
		return date;
	}
	
	public String getRequiredDateYYYYDDMM(int days)
	{
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar c = sim.getCalendar();
		c.add(Calendar.DAY_OF_MONTH,days);
		String reqDate = sim.format(c.getTime());
		return reqDate;
		
	}

}
