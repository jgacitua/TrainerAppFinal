package com.trainerapp;
import java.util.ArrayList;


import adaptadoresList.AdapterListDias;
import adaptadoresList.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityVerRutina extends Activity{
	ArrayList<MenuItem> DiasArray= new ArrayList<MenuItem>();
	private ListView listDias;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_rutina);
        listDias = (ListView) findViewById(R.id.listDiaSeman);
        agregarListDias();
        listDias.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
            	Intent newActivity0 = new Intent(ActivityVerRutina.this,ActivityDiaEntrenamiento.class);     
            	startActivity(newActivity0);
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
		DiasArray.add( new MenuItem("Lunes", "01:10:00"));
        DiasArray.add( new MenuItem("Martes", "01:40:00"));
        DiasArray.add( new MenuItem("Miercoles", "01:30:00"));
        DiasArray.add( new MenuItem("Jueves", "01:15:00"));
        DiasArray.add( new MenuItem("Viernes", "01:10:00"));
        DiasArray.add( new MenuItem("Sabado", "01:40:00"));
        DiasArray.add( new MenuItem("Domingo", "00:30:00"));
        AdapterListDias adaptador = new AdapterListDias(ActivityVerRutina.this, DiasArray);
        listDias.setAdapter(adaptador);
	}
	public void actualizarTiempo(){}
}
