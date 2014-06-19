package com.trainerapp;

import clases.dominio.DtoRutina;
import database.controladores.DataBaseAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ActivityCrearEntrenamiento extends Activity{
	private DataBaseAdapter dbRutina;
	RadioGroup rgTipoTrabajo, rgNivel, rgSexo; 
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_entrenamiento);
        dbRutina = new DataBaseAdapter(this);
        rgTipoTrabajo = (RadioGroup) findViewById(R.id.rGmuscular);
        rgNivel = (RadioGroup) findViewById(R.id.rGNivel);
        rgSexo = (RadioGroup) findViewById(R.id.rGsexo);
     
    }
	 public void OnClickGuardar(View view)
	    {
		    String varTrbjo = getStringButton(rgTipoTrabajo);
		    String varNvl = getStringButton(rgNivel);
		    String varSex = getStringButton(rgSexo);
		     
		    DtoRutina dtoRutina = new DtoRutina();
		    dbRutina.open();
		    dtoRutina.setAll("1",varTrbjo, varSex, varNvl);
			dbRutina.insertarRutina(dtoRutina);
			dbRutina.close();
			this.finish();
	    }
	 public String getStringButton(RadioGroup rg){
		    int selected = rg.getCheckedRadioButtonId();
			RadioButton btn = (RadioButton) findViewById(selected);
			CharSequence c = btn.getText();
			String s1 = c.toString();
			return s1;
	 }
}
