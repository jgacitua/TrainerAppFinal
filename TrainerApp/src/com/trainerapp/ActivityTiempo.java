package com.trainerapp;
import android.app.Activity;

public class ActivityTiempo extends Activity{

	 public String sumarTotalTiempo(String[] hora2 ){
		 
		 String hora1 = "00:00:00";
        for(int i=0; i<hora2.length; i++)
		 hora1 = sumartiempo(hora1, hora2[i]);
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
		 if(segundo >= 60){
			    segundo = segundo - 60;
			    resto = resto + 1;
		 }
		 int minuto = (Integer.parseInt(h2[1]) + Integer.parseInt(h1[1])) + resto;
		 resto = 0;
		 if (minuto >= 60){
		    minuto = minuto - 60;
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
