package interfaces.dialogos;

import clases.dominio.DtoEjercicioMuscular;
import clases.dominio.DtoEjercicioUsuario;

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
    	DtoEjercicioUsuario dtoEje = new DtoEjercicioUsuario();
    	      db.open();
    	      dtoEjercioM.setAll("3", "Ejercicios Bkn","descripcionnnn","as", "2","01:10:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("4", "Ejercicios Bkn", "descripcionnnn","safa", "2","01:30:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("5", "Ejercicios Bkn", "descripcionnnn","safa", "2","00:10:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("6", "Ejercicios Bkn","descripcionnnn","as", "2","00:15:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("7", "Ejercicios Bkn","descripcionnnn", "safa", "2","00:10:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("8", "Ejercicios Bkn", "descripcionnnn","safa", "2","00:08:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("9", "Ejercicios Bkn","descripcionnnn","as", "2","00:20:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("10", "Ejercicios Bkn", "descripcionnnn","safa", "2","00:17:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("11", "Ejercicios Bkn", "descripcionnnn","safa", "2","00:15:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      //------------------------------------------------------------------
    	      dtoEje.setAll("1", "3");
    	      Log.w("Insertando Ejercicios Usuario",""+db.insertarEjercicioUsuario(dtoEje));
    	      dtoEje.setAll("2", "3");
    	      Log.w("Insertando Ejercicios Usuario",""+db.insertarEjercicioUsuario(dtoEje));
    	      dtoEje.setAll("3", "3");
    	      Log.w("Insertando Ejercicios Usuario",""+db.insertarEjercicioUsuario(dtoEje));
    	      dtoEje.setAll("4", "3");
    	      Log.w("Insertando Ejercicios Usuario",""+db.insertarEjercicioUsuario(dtoEje));
    	      dtoEje.setAll("5", "3");
    	      Log.w("Insertando Ejercicios Usuario",""+db.insertarEjercicioUsuario(dtoEje));
    	      dtoEje.setAll("6", "4");
    	      Log.w("Insertando Ejercicios Usuario",""+db.insertarEjercicioUsuario(dtoEje));
    	      dtoEje.setAll("7", "4");
    	      Log.w("Insertando Ejercicios Usuario",""+db.insertarEjercicioUsuario(dtoEje));
    	      dtoEje.setAll("8", "5");
    	      Log.w("Insertando Ejercicios Usuario",""+db.insertarEjercicioUsuario(dtoEje));
    	      
			  db.close();
			 
        return null;
    }
 

     
}
