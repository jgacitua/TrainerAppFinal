package com.trainerapp;

import clases.dominio.DtoEjercicioUsuario;
import database.controladores.DataBaseAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityZonasMusculares extends ActivityTiempo{
	private Bundle b;
	private String dia;
	private TextView txtTotalTiempo;
	private DataBaseAdapter db;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonas_musculares);
        db =new DataBaseAdapter(this);
        txtTotalTiempo = (TextView) findViewById(R.id.txtTiempoZona);
        Intent iin= getIntent();
        b = iin.getExtras();
        dia = b.getString("DIA");
       // Cargar Nombre Dia de la semana
    }
	public void onResume(){
	    super.onResume();
	    txtTotalTiempo.setText(agregarTiemposDias(dia));
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
	 public String agregarTiemposDias(String dia){
			db.open();
			DtoEjercicioUsuario[] dtoEjer = db.obtenerEjerciciosUsuario(dia);
			String[] tiempos = new String[dtoEjer.length];
			
			for(int i=0; i<dtoEjer.length;i++){
				tiempos[i]= dtoEjer[i].getTiempo();
			}
			db.close();
			return sumarTotalTiempo(tiempos);
		}
}
