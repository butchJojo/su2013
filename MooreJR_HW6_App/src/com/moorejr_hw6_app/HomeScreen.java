package com.moorejr_hw6_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class HomeScreen extends Activity 
{
	int MANAGE_ASSIGNMENTS_REQUEST_CODE = 1;
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
	
		final Button assignmentsButton = (Button) findViewById(R.id.button3);
		assignmentsButton.setOnClickListener(new Button.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				try
				{
					startActivityForResult(new Intent(v.getContext(), 
					FormScreen.class), MANAGE_ASSIGNMENTS_REQUEST_CODE);
				}
				catch(Exception e)
				{				
				}
			}
		});
	}
}
