package com.trainerapp;

import java.util.ArrayList;

import clases.dominio.DtoEjercicioUsuario;
import database.controladores.DataBaseAdapter;
import adaptadoresList.AdapterListEjeDia;
import adaptadoresList.MenuItem;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class ActivityDiaEntrenamiento extends ActivityTiempo{
	ArrayList<MenuItem> ejerciciosDiaArray= new ArrayList<MenuItem>();
	private ListView listDias;
	private TextView diaSemana;
	private DataBaseAdapter db;
	private TextView hrTotal;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db =new DataBaseAdapter(this);
        setContentView(R.layout.activity_dia_entrenamiento);
        listDias = (ListView) findViewById(R.id.listEjeDia);
        diaSemana = (TextView) findViewById(R.id.diaSemana);
        hrTotal = (TextView) findViewById(R.id.txtHoraTotalDia);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
       // Cargar Nombre Dia de la semana
         diaSemana.setText(b.getString("DIA"));
        //--------------------------
        hrTotal.setText(sumarTotalTiempo(agregarListDias()));
        listDias.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
                }

            });
    }
	public String[] agregarListDias(){
		db.open();
		DtoEjercicioUsuario[] dtoEjer = db.obtenerEjerciciosUsuario();
		String[] tiempoTotal = new String[dtoEjer.length];
		for(int i=0; i<dtoEjer.length;i++){
			tiempoTotal[i]=  dtoEjer[i].getTiempo();
			ejerciciosDiaArray.add( new MenuItem(dtoEjer[i].getNombre(), dtoEjer[i].getTiempo()));
		}
        AdapterListEjeDia adaptador = new AdapterListEjeDia(ActivityDiaEntrenamiento.this, ejerciciosDiaArray);
        listDias.setAdapter(adaptador);
        return tiempoTotal;
	}
	 public void OnClickEditar(View view)
	    {
	    	    
		 Intent i = new Intent(ActivityDiaEntrenamiento.this,ActivityZonasMusculares.class);     
         startActivity(i);
	    }
}
