package com.samteladze.sample.android.bootdialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Message")
			   .setTitle("Title")
		       .setCancelable(false)
		       .setPositiveButton("OK", new DialogInterface.OnClickListener()
	       	   {
		           public void onClick(DialogInterface dialog, int id) 
		           {
		        	  MainActivity.this.finish();
		           }
		       });
		
		
		AlertDialog alert = builder.create();
		alert.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
