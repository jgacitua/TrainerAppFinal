package com.trainerapp;

import database.controladores.DataBaseAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityDescripcion extends ActivityTiempo{
	private DataBaseAdapter db;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
       // Cargar Nombre Dia de la semana
         b.getString("DIA");

     
    }
	 public void OnClickSeleccionar(View view){
		 
	 }
}
