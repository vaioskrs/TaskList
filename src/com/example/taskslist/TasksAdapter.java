package com.example.taskslist;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TasksAdapter extends BaseAdapter {

	private static ArrayList<Task> tasks = new ArrayList<Task>();
	
	public TasksAdapter() {
		/*tasks.add(new SampleRecord("Meeting with Joe Black"));
		tasks.add(new SampleRecord("Lecture at PZ101"));
		tasks.add(new SampleRecord("Dinner with Mr. Johnson"));
		tasks.add(new SampleRecord("Lab Meeting at Lab 101"));
		tasks.add(new SampleRecord("Staff meeting"));
		tasks.add(new SampleRecord("Write chapter XYZ"));
		tasks.add(new SampleRecord("Review Paper from ICSM"));
		tasks.add(new SampleRecord("Prepare Lecture Slides"));
		tasks.add(new SampleRecord("Flight to Rome"));
		tasks.add(new SampleRecord("Meeting with SQJ Group"));
		tasks.add(new SampleRecord("Flight to Base"));
		tasks.add(new SampleRecord("Attend DEA Workshop"));*/
	}
	
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	@Override
	public int getCount() {
		return tasks.size();
	}

	@Override
	public Object getItem(int index) {
		return tasks.get(index);
	}

	@Override
	public long getItemId(int index) {
		return index;
	}

	@Override
	public View getView(int index, View view, ViewGroup parent) {
		
		//LayoutInflater: Instantiates a layout XML file into its corresponding View objects
		if(view == null) {
			LayoutInflater inflater = LayoutInflater.from(parent.getContext());
			
			view = inflater.inflate(R.layout.tasks_list_item, parent, false);
			
		}
		
		Task task = tasks.get(index);
		
		TextView descriptionTextView = (TextView)view.findViewById(R.id.description_view);
		
		descriptionTextView.setText(task.getDescription());
		
		descriptionTextView.setBackgroundResource(task.getBackgroundColor());
		
		return view;
	}
}
