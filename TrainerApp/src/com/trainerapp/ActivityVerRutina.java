package com.trainerapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityVerRutina extends Activity{
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
	 public String sumarTotalTiempo(String[] hora2 ){
		 String hora1 = "00:00:00";
        for(int i=0; i<hora2.length; i++)
		 hora1 = sumartiempo(hora1, hora2[0]);
		return hora1;
	 }
	 public String sumartiempo(String hora1, String hora2){
		 String horaTotal=null;
		 String segundos="00";
		 String horas="00";
		 String minutos="00";
		 String[] h1 = hora1.split(":");
		 String[] h2 = hora2.split(":");
		 int resto = 0;
// Sumamos las dos tipo de horas
		 int segundo = Integer.parseInt(h2[2]) + Integer.parseInt(h1[2]);
		 if (segundo >= 60){
		    resto = 1;
		    segundo = 0;
		 }
		 int minuto = (Integer.parseInt(h2[1]) + Integer.parseInt(h1[1])) + resto;
		 resto = 0;
		 if (minuto >= 60){
		    minuto = 0;
		    resto = 1;
		 }
		 int hora = (Integer.parseInt(h2[0]) + Integer.parseInt(h1[0])) + resto;
		 // lo volvemos al formato normal de hora y lo dejamos en hora total
		 if(segundo < 10)
			 segundos = "0"+segundo;
		 else
			 segundos = ""+segundo;
		 if(minuto < 10)
			 minutos = "0"+minuto;
		 else 
			 minutos = ""+minuto;
		 if(hora < 10)
			 horas = "0"+hora;
		 else
			 horas = ""+hora;
		 
		 horaTotal = horas +":"+ minutos+":"+segundos;
		 return horaTotal;
		 
	 }
}
