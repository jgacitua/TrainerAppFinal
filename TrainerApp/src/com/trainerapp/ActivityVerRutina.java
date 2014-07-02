package com.trainerapp;

import clases.dominio.DtoEjercicioUsuario;
import database.controladores.DataBaseAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityVerRutina extends ActivityTiempo{
	private TextView hrLunes;
	private TextView hrMartes;
	private TextView hrMiercoles;
	private TextView hrJueves;
	private TextView hrViernes;
	private TextView hrSabado;
	private TextView hrDomingo;  
	private TextView hrTotal;
	private DataBaseAdapter db;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_ver_rutina);
        db =new DataBaseAdapter(this);
        agregarTextosDias();
        
        
    }
	public void onResume(){
	    super.onResume();
	    agregarTextosDias();
	}
	private void agregarTextosDias() {
		    hrLunes = (TextView) findViewById(R.id.txtHorasLunes);
	        hrLunes.setText(agregarTiemposDias("Lunes"));
	        hrMartes = (TextView) findViewById(R.id.txtHorasMartes);
	        hrMartes.setText(agregarTiemposDias("Martes"));
	        hrMiercoles = (TextView) findViewById(R.id.txtHoraMiercoles);
	        hrMiercoles.setText(agregarTiemposDias("Miercoles"));
	        hrJueves = (TextView) findViewById(R.id.txtHorasJueves);
	        hrJueves.setText(agregarTiemposDias("Jueves"));
	        hrViernes = (TextView) findViewById(R.id.txtHorasViernes);
	        hrViernes.setText(agregarTiemposDias("Viernes"));
	        hrSabado = (TextView) findViewById(R.id.txtHorasSabado);
	        hrSabado.setText(agregarTiemposDias("Sabado"));
	        hrDomingo = (TextView) findViewById(R.id.txtHorasDomingo);
	        hrDomingo.setText(agregarTiemposDias("Domingo"));
	        hrTotal = (TextView) findViewById(R.id.txtHoraTotal);
	        //Extrayendo a un String array las horas de los dias para luego poder sumarlas
	        String diasHoras[] = {hrLunes.getText().toString(),hrMartes.getText().toString(),
	        		hrMiercoles.getText().toString(),hrJueves.getText().toString(),
	        		hrViernes.getText().toString(),hrSabado.getText().toString(),hrDomingo.getText().toString()};
	       hrTotal.setText(sumarTotalTiempo(diasHoras)); 
		
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
	public void llamarActivityDiaEntrenamiento(String dia){
		Intent i = new Intent(ActivityVerRutina.this,ActivityDiaEntrenamiento.class); 
		i.putExtra("DIA", dia);
     	startActivity(i);
	}
	// Ir a los dias de entrenamiento
	 public void OnClickLunes(View view){
		 
		 llamarActivityDiaEntrenamiento("Lunes");
	 }
	 public void OnClickMartes(View view){
		 llamarActivityDiaEntrenamiento("Martes");
	 }
	 public void OnClickMiercoles(View view){
		 llamarActivityDiaEntrenamiento("Miercoles");
	 }
	 public void OnClickJueves(View view){
		 llamarActivityDiaEntrenamiento("Jueves");
	 }
	 public void OnClickViernes(View view){
		 llamarActivityDiaEntrenamiento("Viernes");
	 }
	 public void OnClickSabado(View view){
		 llamarActivityDiaEntrenamiento("Sabado");
	 }
	 public void OnClickDomingo(View view){
		 llamarActivityDiaEntrenamiento("Domingo");
	 }
	
}
