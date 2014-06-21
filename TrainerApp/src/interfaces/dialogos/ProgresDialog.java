package interfaces.dialogos;

import clases.dominio.DtoEjercicioMuscular;

import com.trainerapp.ActivityMenu;

import database.controladores.DataBaseAdapter;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;

public class ProgresDialog extends AsyncTask<Void, Void, Void>{
	public ProgressDialog mDialog;
	private ActivityMenu mContext;
	private DataBaseAdapter db;
    public ProgresDialog(ActivityMenu context){
        super();
        this.mContext = context;
        db = new DataBaseAdapter(mContext);
    }

    protected void onPreExecute() {
        mDialog = ProgressDialog.show(mContext, "Atencion", "Cargando Ejercicios", true);
    }

    protected void onPostExecute(Void result) {
        mDialog.dismiss();
    }
//
//
    @Override
    protected Void doInBackground(Void... params) {
    	DtoEjercicioMuscular dtoEjercioM = new DtoEjercicioMuscular();
    	      db.open();
    	      dtoEjercioM.setAll("3", "Ejercicios Bkn","as", "2");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("4", "Ejercicios Bkn", "safa", "2");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("5", "Ejercicios Bkn", "safa", "2");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("6", "Ejercicios Bkn","as", "2");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("7", "Ejercicios Bkn", "safa", "2");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("8", "Ejercicios Bkn", "safa", "2");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("9", "Ejercicios Bkn","as", "2");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("10", "Ejercicios Bkn", "safa", "2");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("11", "Ejercicios Bkn", "safa", "2");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
			  db.close();
			 
        return null;
    }
 

     
}
