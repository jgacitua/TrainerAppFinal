package com.trainerapp;

import clases.dominio.DtoEjercicioUsuario;
import database.controladores.DataBaseAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

public class ActivityDescripcion extends ActivityTiempo{
	private DataBaseAdapter db;
	private String id;
	private CheckBox chkBox;
	private String dia;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        db = new DataBaseAdapter(this);
        chkBox = (CheckBox) findViewById(R.id.chkBox);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
       // Cargar id del ejercicio seleccionado
        
        id = b.getString("ID");
        dia = b.getString("DIA");
        db.open();
         chkBox.setChecked(db.existeEjercicioUsuario(id,dia));
        db.close();
        chkBox.setOnClickListener(new OnClickListener() {
      	  public void onClick(View v) {
                      db.open();
      		if (((CheckBox) v).isChecked()) {
      			if(!db.existeEjercicioUsuario(id,dia)){
      				DtoEjercicioUsuario dtoEjerUs = new DtoEjercicioUsuario();
      				dtoEjerUs.setAll(id, dia);
      				db.insertarEjercicioUsuario(dtoEjerUs);
      				
      			}
      		}else { db.borrarEjercicio(id);
      			   
      		}
           db.close();
      	  }
      	 
      	});
        

     
    }
}
