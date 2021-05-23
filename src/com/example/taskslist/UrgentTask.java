package com.example.taskslist;

import java.util.Date;

import android.R.color;

public class UrgentTask extends Task {
	
	public UrgentTask(String text, Date aDate) {
		super(text, aDate);
	}
	
	public String getDescription() {
		return ("Urgent: " + description);
	}
	
	public int getBackgroundColor() {
		return color.holo_red_light;
	}
}
