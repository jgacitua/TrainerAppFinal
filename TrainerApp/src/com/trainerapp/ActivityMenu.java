package com.trainerapp;

import interfaces.dialogos.DialogCustom;
import interfaces.dialogos.DialogMaker;
import database.controladores.DataBaseAdapter;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class ActivityMenu extends ActionBarActivity {
	private DataBaseAdapter dbRutina;
	private Button btnVerRutina;
    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbRutina = new DataBaseAdapter(this);
        setContentView(R.layout.activity_menu);
        btnVerRutina = (Button) findViewById(R.id.btnVerRutina);
        actualizarPantalla();
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment())
//                    .commit();
//        }
    }
    protected void onResume()
    {
       super.onResume();
       actualizarPantalla();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    /**
     * A placeholder fragment containing a simple view.
     */
    public void OnClickCrearEntrenamiento(View view)
    {      
    	    if(existeRutina()){
    	    	final DialogCustom dialog = DialogMaker.createAlertDialog(this, "Atención","Si desea crear un nuevo entrenamiento, sera borrado el anterior(rutinas, ejercicos, etc..)");
    	    	dialog.setPositiveButton("Borrar", new OnClickListener(){
    				public void onClick(View v) {
    					dbRutina.open();
    					dbRutina.borrarDB();
    					dbRutina.close();
    					dialog.dismiss();
    					Intent i = new Intent(ActivityMenu.this,ActivityCrearEntrenamiento.class);
    	    	    	startActivity(i);
    					}	
    			   });
    	    	dialog.setNegativeButton("Cancelar", new OnClickListener() {
    	            @Override
    	            public void onClick(View v) {
    	            	dialog.dismiss();              
    	            }
    	        });
    		     dialog.show();
    	    }else{
    	    	Intent i = new Intent(this,ActivityCrearEntrenamiento.class);
    	    	startActivity(i);
    	    }
    }
    public void OnClickVerRutina(View view)
    {
    	    Intent i = new Intent(this,ActivityVerRutina.class);
		   startActivity(i);
    }
    public void actualizarPantalla(){
    	 if(existeRutina()){btnVerRutina.setEnabled(true);}
    	 else {btnVerRutina.setEnabled(false);}
    }
    public boolean existeRutina(){
         dbRutina.open();
         if(dbRutina.existeRutina()){dbRutina.close(); return true;}
         else {dbRutina.close(); return false; }
    }

}
