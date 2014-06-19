package com.trainerapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityVerRutina extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_rutina);
        

    }
	public void actualizarTiempo(){}
	public void llamarActivityDiaEntrenamiento(String Dia){
		Intent i = new Intent(ActivityVerRutina.this,ActivityDiaEntrenamiento.class);     
     	startActivity(i);
	}
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
