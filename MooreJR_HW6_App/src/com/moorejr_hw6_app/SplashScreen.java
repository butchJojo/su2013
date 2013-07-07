package com.moorejr_hw6_app;

//import java.util.logging.Handler;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		//To fire up z home screen after 5 seconds.
		Handler h = new Handler();
		h.postDelayed(new HomeScreenActivator(), 5000);
	}
	
/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}
*/
//}

class HomeScreenActivator implements Runnable
{
	public void run()
	{
		startActivity(new Intent(getApplication(), HomeScreen.class));
		finish();
	}	
	
}}