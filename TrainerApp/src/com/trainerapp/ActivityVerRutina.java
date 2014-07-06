package com.trainerapp;

import clases.dominio.DtoEjercicioUsuario;
import database.controladores.DataBaseAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityVerRutina extends ActivityTiempo{
	
	//--------------textos dias----------------
	private TextView hrLunes;
	private TextView hrMartes;
	private TextView hrMiercoles;
	private TextView hrJueves;
	private TextView hrViernes;
	private TextView hrSabado;
	private TextView hrDomingo;  
	private TextView hrTotal;
	//--------------Nombres dias----------------
	private String Lunes= "Lunes";
	private String Martes= "Martes";
	private String Miercoles= "Miercoles";
	private String Jueves= "Jueves";
	private String Viernes= "Viernes";
	private String Sabado= "Sabado";
	private String Domingo= "Domingo";
	//--------------botones dias----------------
	private Button btnLunes;
	private Button btnMartes;
	private Button btnMiercoles;
	private Button btnJueves;
	private Button btnViernes;
	private Button btnSabado;
	private Button btnDomingo;
	
	private Button btnEliminar;
	private DataBaseAdapter db;
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
        
        btnLunes  = (Button) findViewById(R.id.btnLunes);
        btnMartes  = (Button) findViewById(R.id.btnMartes);
        btnMiercoles  = (Button) findViewById(R.id.btnMiercoles);
        btnJueves  = (Button) findViewById(R.id.btnJueves);
        btnViernes  = (Button) findViewById(R.id.btnViernes);
        btnSabado = (Button) findViewById(R.id.btnSabado);
        btnDomingo  = (Button) findViewById(R.id.btnDomingo);
        
        btnEliminar = (Button) findViewById(R.id.btnEliminar);
        db =new DataBaseAdapter(this);
        agregarTextosDias();
        actualizarColoresBtn();
        estadoBtnEliminar();
        
        
    }
	public void onResume(){
	    super.onResume();
	    agregarTextosDias();
	    actualizarColoresBtn();
	    estadoBtnEliminar();
	}
	private void agregarTextosDias() {
		   
	        hrLunes.setText(obtenerTiemposDias(Lunes));
	        hrMartes.setText(obtenerTiemposDias(Martes));
	        hrMiercoles.setText(obtenerTiemposDias(Miercoles));
	        hrJueves.setText(obtenerTiemposDias(Jueves));
	        hrViernes.setText(obtenerTiemposDias(Viernes));
	        hrSabado.setText(obtenerTiemposDias(Sabado));
	        hrDomingo.setText(obtenerTiemposDias(Domingo));
	       
	        //Extrayendo a un String array las horas de los dias para luego poder sumarlas
	        actualizarTiempo();
		
	}
	private void actualizarColoresBtn(){
		cambiarColorBtn(btnLunes, obtenerTiemposDias(Lunes));
		cambiarColorBtn(btnMartes, obtenerTiemposDias(Martes));
		cambiarColorBtn(btnMiercoles, obtenerTiemposDias(Miercoles));
		cambiarColorBtn(btnJueves, obtenerTiemposDias(Jueves));
		cambiarColorBtn(btnViernes, obtenerTiemposDias(Viernes));
		cambiarColorBtn(btnSabado, obtenerTiemposDias(Sabado));
		cambiarColorBtn(btnDomingo, obtenerTiemposDias(Domingo));
		
	}
	private void cambiarColorBtn(Button btn, String tiempo){
		if(tiempo.contentEquals("00:00:00")){
			btn.setBackgroundResource(R.drawable.btn_style_azul);
			
		}else{
			btn.setBackgroundResource(R.drawable.btn_style_negro);
			
		}
		
	}
	public String obtenerTiemposDias(String dia){
		db.open();
		DtoEjercicioUsuario[] dtoEjer = db.obtenerEjerciciosUsuario(dia);
		String[] tiempos = new String[dtoEjer.length];
		
		for(int i=0; i<dtoEjer.length;i++){
			tiempos[i]= dtoEjer[i].getTiempo();
		}
		db.close();
		return sumarTotalTiempo(tiempos);
	}
	public void actualizarTiempo(){
		  String diasHoras[] = {hrLunes.getText().toString(),hrMartes.getText().toString(),
	        		hrMiercoles.getText().toString(),hrJueves.getText().toString(),
	        		hrViernes.getText().toString(),hrSabado.getText().toString(),hrDomingo.getText().toString()};
		hrTotal.setText(sumarTotalTiempo(diasHoras)); 
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
	//--------------------------------------------Eliminar Rutina-----------------
	 public void OnClickEliminarRutina(View view){
		 try{
		 db.open();
		 db.borrarAllEjercicioUsuario();
		 db.close();
		 agregarTextosDias();
		 actualizarColoresBtn();
		 estadoBtnEliminar();
		 }catch (Exception e){
			 
		 }
		 
	 }
	 public void estadoBtnEliminar(){
		 if(existeEjercicios()){btnEliminar.setEnabled(true);}
    	 else {btnEliminar.setEnabled(false);}
	 }
	private boolean existeEjercicios() {
		 db.open();
         if(db.existeEjercicioUsuario()){db.close(); return true;}
         else {db.close(); return false; }
	}
}
