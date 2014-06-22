package com.trainerapp;

import database.controladores.DataBaseAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityZonasMusculares extends Activity{
	private Bundle b;
	private String dia;
	private DataBaseAdapter db;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db =new DataBaseAdapter(this);
        setContentView(R.layout.activity_zonas_musculares);
        Intent iin= getIntent();
        b = iin.getExtras();
        dia = b.getString("DIA");
       // Cargar Nombre Dia de la semana
    }
	// ************Todos los OnClick de los botones de las zonas musculares************
	 public void OnClickHombros(View view){irActivityListEjer(dia,"Hombros");}
	 public void OnClickEspalda(View view){irActivityListEjer(dia,"Espalda");}
	 public void OnClickTriceps(View view){irActivityListEjer(dia,"Triceps");}
	 public void OnClickBiceps(View view){irActivityListEjer(dia,"Biceps");}
	 public void OnClickPectorales(View view){irActivityListEjer(dia,"Pectorales");}
	 public void OnClickPiernas(View view){irActivityListEjer(dia,"Piernas");}
	 public void OnClickAbdomen(View view){irActivityListEjer(dia,"Abdomen");}
	 public void irActivityListEjer(String dia, String zona){
		 Intent i = new Intent(ActivityZonasMusculares.this, ActivityListaEjercicios.class); 
		 i.putExtra("DIA", dia);
		 i.putExtra("ZONA",zona);
         startActivity(i);
	 }
}
