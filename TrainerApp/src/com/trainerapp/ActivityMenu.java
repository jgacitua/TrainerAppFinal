package com.trainerapp;

import interfaces.dialogos.DialogCustom;
import interfaces.dialogos.DialogMaker;
import database.controladores.DataBaseAdapter;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
public class ActivityMenu extends ActionBarActivity {
	private DataBaseAdapter dbRutina;
    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment())
//                    .commit();
//        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
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
    {       dbRutina = new DataBaseAdapter(this);
           dbRutina.open();
    	    if(dbRutina.existeRutina()){
    	    	final DialogCustom dialog = DialogMaker.createAlertDialog(this, "Atención","Si desea crear un nuevo entrenamiento, sera borrado el anterior(rutinas, ejercicos, etc..)");
    	    	dialog.setPositiveButton("Borrar", new OnClickListener(){
    				public void onClick(View v) {
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
    	    	dbRutina.close();
    	    	Intent i = new Intent(this,ActivityCrearEntrenamiento.class);
    	    	startActivity(i);
    	    }
    }
    public void OnClickVerRutina(View view)
    {
    	    Intent i = new Intent(this,ActivityVerRutina.class);
		   startActivity(i);
    }

}
