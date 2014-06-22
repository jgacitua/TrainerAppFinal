package com.trainerapp;
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
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_ver_rutina);
        hrLunes = (TextView) findViewById(R.id.txtHorasLunes);
        hrMartes = (TextView) findViewById(R.id.txtHorasMartes);
        hrMiercoles = (TextView) findViewById(R.id.txtHoraMiercoles);
        hrJueves = (TextView) findViewById(R.id.txtHorasJueves);
        hrViernes = (TextView) findViewById(R.id.txtHorasViernes);
        hrSabado = (TextView) findViewById(R.id.txtHorasSabado);
        hrDomingo = (TextView) findViewById(R.id.txtHorasDomingo);
        
        hrTotal = (TextView) findViewById(R.id.txtHoraTotal);
        //Extrayendo a un String array las horas de los dias para luego poder sumarlas
        String diasHoras[] = {hrLunes.getText().toString(),hrMartes.getText().toString(),
        		hrMiercoles.getText().toString(),hrJueves.getText().toString(),
        		hrViernes.getText().toString(),hrSabado.getText().toString(),hrDomingo.getText().toString()};
       hrTotal.setText(sumarTotalTiempo(diasHoras)); 
    }
	public void actualizarPantalla(){}
	
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
