package com.trainerapp;

import java.util.ArrayList;

import clases.dominio.DtoEjercicio;
import clases.dominio.DtoRutina;
import clases.dominio.DtoZonaMuscular;
import database.controladores.DataBaseAdapter;
import adaptadoresList.AdapterListDias;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class ActivityListaEjercicios extends Activity{
	ArrayList<DtoEjercicio> ejerciciosDiaArray= new ArrayList<DtoEjercicio>();
	private ListView listDias;
	private AdapterListDias adaptador;
	private String dia;
	private DataBaseAdapter db;
	private TextView titilo_zona;
	private String zona;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db =new DataBaseAdapter(this);
        setContentView(R.layout.activity_list_ejercicios);
        listDias = (ListView) findViewById(R.id.listEje);
        titilo_zona = (TextView) findViewById(R.id.titulo_zona);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        dia = b.getString("DIA");
        zona= b.getString("ZONA");
        titilo_zona.setText(zona);
        
        listDias.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
            	String id_ejer = adaptador.getItemIdEjer(position);
            	llamarActivityDiaEntrenamiento(id_ejer, dia,zona);
                }

            });
    }
	 protected void onResume()
	    {
	       super.onResume();
	       try{
	       listDias = (ListView) findViewById(R.id.listEje);
	       agregarListDias(zona);
	       adaptador.setDia(dia);
	       }catch(Exception e){
				
			}
	    }
	public void agregarListDias(String zona){
		ejerciciosDiaArray= new ArrayList<DtoEjercicio>();
		DtoRutina dtoRutina = new DtoRutina();
		db.open();
		dtoRutina = db.obtenerRutina();
		DtoZonaMuscular dtoZonaM = db.obtenerZona(zona);
		DtoEjercicio[] dtoEjer = db.obtenerEjercicios(dtoZonaM.getId(),dtoRutina.getNivel(),dtoRutina.getSexo());
		
			for(int i=0; i<dtoEjer.length;i++){
				ejerciciosDiaArray.add( new DtoEjercicio(dtoEjer[i].getId(),dtoEjer[i].getNombre(), dtoEjer[i].getTiempo()));
			}
			
		adaptador = new AdapterListDias(ActivityListaEjercicios.this, ejerciciosDiaArray);
        listDias.setAdapter(adaptador);
        db.close();
	}
	public void llamarActivityDiaEntrenamiento(String id, String dia,String zona){
		Intent i = new Intent(ActivityListaEjercicios.this,ActivitySlideDescripcion.class); 
		i.putExtra("DIA", dia);
		i.putExtra("ID", id);
		i.putExtra("ZONA", zona);
     	startActivity(i);
	}
	 public void OnClickGuardar(View view)
	    {
	    	    
		 	this.finish();
	    }
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
	        if (keyCode == KeyEvent.KEYCODE_BACK) {
	            // Show your Alert Box here
	        }
	        return false;
	    }
}
