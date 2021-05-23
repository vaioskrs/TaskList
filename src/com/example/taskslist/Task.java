package com.example.taskslist;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Task implements Serializable{
	
	private Date date;
	protected String description;
	
	public Task(String text, Date aDate) {
		description = text;
		date = aDate;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getDateText() {
		String sDate = new SimpleDateFormat("yyyy/MM/dd").format(date);
		return sDate;
	}
	
	public abstract String getDescription();
	public abstract int getBackgroundColor();
	

}
