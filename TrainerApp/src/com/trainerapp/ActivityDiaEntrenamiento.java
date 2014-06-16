package com.trainerapp;

import java.util.ArrayList;

import adaptadoresList.AdapterListEjeDia;
import adaptadoresList.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityDiaEntrenamiento extends Activity{
	ArrayList<MenuItem> ejerciciosDiaArray= new ArrayList<MenuItem>();
	private ListView listDias;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_entrenamiento);
        listDias = (ListView) findViewById(R.id.listEjeDia);
        agregarListDias();
        listDias.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
//            	Intent newActivity0 = new Intent(ActivityDiaEntrenamiento.this,ActivityDiaEntrenamiento.class);     
//            	startActivity(newActivity0);
//                switch (position) {
//                  case 0:
//                   Intent newActivity0 = new Intent(InterfazMenu.this,InterfazMapa.class);     
//                   startActivity(newActivity0);
//                  break;
////                  case 1:
////                   Intent newActivity1 = new Intent(InterfazMenu.this,NewActivity1.class);     
////                   startActivity(newActivity1);
////                  break;
////                  case 2:
////                   Intent newActivity2 = new Intent(InterfazMenu.this,NewActivity2.class);     
////                   startActivity(newActivity2);
////                  break;
//                  case 3:
//                   Intent newActivity3 = new Intent(InterfazMenu.this,InterfazPostulaciones.class);     
//                   startActivity(newActivity3);
//                  break;
//                  default:
                    // Nothing do!
                }

            });
    }
	public void agregarListDias(){
		ejerciciosDiaArray.add( new MenuItem("Press Inclinado", "00:10:00"));
		ejerciciosDiaArray.add( new MenuItem("Press Banca", "00:05:00"));
		ejerciciosDiaArray.add( new MenuItem("Sentadillas", "00:15:00"));
		ejerciciosDiaArray.add( new MenuItem("Apertura Inclinado", "00:15:00"));
		ejerciciosDiaArray.add( new MenuItem("Fondo En banco", "00:10:00"));
		ejerciciosDiaArray.add( new MenuItem("Estiramiento Pectorales", "00:07:00"));
		ejerciciosDiaArray.add( new MenuItem("Remo Sentado", "00:12:00"));
        AdapterListEjeDia adaptador = new AdapterListEjeDia(ActivityDiaEntrenamiento.this, ejerciciosDiaArray);
        listDias.setAdapter(adaptador);
	}
	public void actualizarTiempo(){}

	 public void OnClickEditar(View view)
	    {
	    	    
		 Intent i = new Intent(ActivityDiaEntrenamiento.this,ActivityZonasMusculares.class);     
         startActivity(i);
	    }
}
