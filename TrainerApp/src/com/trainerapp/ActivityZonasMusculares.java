package com.trainerapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityZonasMusculares extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonas_musculares);

     
    }
	
	
	// ************Todos los OnClick de los botones de las zonas musculares************
	 public void OnClickHombros(View view)
	    {
		 Intent i = new Intent(ActivityZonasMusculares.this, ActivityListaEjercicios.class);     
         startActivity(i);   
	    }
	 public void OnClickEspalda(View view)
	    {
		 Intent i = new Intent(ActivityZonasMusculares.this, ActivityListaEjercicios.class);     
		 startActivity(i);   
	    }
	 public void OnClickTriceps(View view)
	    {
		 Intent i = new Intent(ActivityZonasMusculares.this, ActivityListaEjercicios.class);     
		 startActivity(i);   
	    }
	 public void OnClickBiceps(View view)
	    {
		 Intent i = new Intent(ActivityZonasMusculares.this, ActivityListaEjercicios.class);     
		 startActivity(i);   
	    }
	 public void OnClickPectorales(View view)
	    {
		 Intent i = new Intent(ActivityZonasMusculares.this, ActivityListaEjercicios.class);     
		 startActivity(i);   
	    }
	 public void OnClickPiernas(View view)
	    {
		 Intent i = new Intent(ActivityZonasMusculares.this, ActivityListaEjercicios.class);     
         startActivity(i);   
	    }
	 public void OnClickAbdomen(View view)
	    {
		 Intent i = new Intent(ActivityZonasMusculares.this, ActivityListaEjercicios.class);     
         startActivity(i);   
	    }
}
