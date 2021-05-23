package com.example.taskslist;

import java.util.Date;

import android.R.color;

public class NormalTask extends Task {
	
	public NormalTask(String text, Date aDate) {
		super(text, aDate);
	}
	
	public String getDescription() {
		return ("Normal: " + description);
	}
	
	public int getBackgroundColor() {
		return color.holo_blue_light;
	}
}
