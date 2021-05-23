package com.example.taskslist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class InputScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_input_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.input_screen, menu);
		return true;
	}
	
	public void sendMessage(View view) {
		
		EditText descriptionEditText = (EditText) findViewById(R.id.editText2);
		EditText dateEditText = (EditText) findViewById(R.id.editText1);
		RadioButton normalRadio = (RadioButton) findViewById(R.id.radio0);
		RadioButton urgentRadio = (RadioButton) findViewById(R.id.radio1);
		
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		String dateText = dateEditText.getText().toString();
		
		try {
			date = sdf.parse(dateText);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String descriptionText = descriptionEditText.getText().toString(); 
		
		Task task = null;
		if(normalRadio.isChecked())
			task = new NormalTask(descriptionText, date);
		else
			task = new UrgentTask(descriptionText, date);
		
		Intent intent = new Intent(this, TasksView.class);
		intent.putExtra("Task", task);
		this.startActivity(intent);
	}

}
