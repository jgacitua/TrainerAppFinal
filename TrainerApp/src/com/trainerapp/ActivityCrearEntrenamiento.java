package com.trainerapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ActivityCrearEntrenamiento extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_entrenamiento);
        
 
     
    }
	 public void OnClickGuardar(View view)
	    {
	    	    
			   this.finish();
	    }
}
