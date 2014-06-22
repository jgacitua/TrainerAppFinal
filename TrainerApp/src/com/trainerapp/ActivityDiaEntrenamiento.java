package com.trainerapp;

import java.util.ArrayList;

import clases.dominio.DtoEjercicioUsuario;
import database.controladores.DataBaseAdapter;
import adaptadoresList.AdapterListEjeDia;
import adaptadoresList.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class ActivityDiaEntrenamiento extends Activity{
	ArrayList<MenuItem> ejerciciosDiaArray= new ArrayList<MenuItem>();
	private ListView listDias;
	private TextView diaSemana;
	private DataBaseAdapter db;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db =new DataBaseAdapter(this);
        setContentView(R.layout.activity_dia_entrenamiento);
        listDias = (ListView) findViewById(R.id.listEjeDia);
        diaSemana = (TextView) findViewById(R.id.diaSemana);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
       // Cargar Nombre Dia de la semana
         diaSemana.setText(b.getString("DIA"));
        //--------------------------
        agregarListDias();
        listDias.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
                }

            });
    }
	public void agregarListDias(){
		db.open();
		DtoEjercicioUsuario[] dtoEjer = db.obtenerEjerciciosUsuario();
		for(int i=0; i<dtoEjer.length;i++){
			ejerciciosDiaArray.add( new MenuItem(dtoEjer[i].getNombre(), dtoEjer[i].getTiempo()));
		}
//		ejerciciosDiaArray.add( new MenuItem("Press Inclinado", "00:10:00"));
//		ejerciciosDiaArray.add( new MenuItem("Press Banca", "00:05:00"));
//		ejerciciosDiaArray.add( new MenuItem("Sentadillas", "00:15:00"));
//		ejerciciosDiaArray.add( new MenuItem("Apertura Inclinado", "00:15:00"));
//		ejerciciosDiaArray.add( new MenuItem("Fondo En banco", "00:10:00"));
//		ejerciciosDiaArray.add( new MenuItem("Estiramiento Pectorales", "00:07:00"));
//		ejerciciosDiaArray.add( new MenuItem("Remo Sentado", "00:12:00"));
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
