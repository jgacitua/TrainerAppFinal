package interfaces.dialogos;

import clases.dominio.DtoEjercicio;
import clases.dominio.DtoEjercicioMuscular;

import com.trainerapp.ActivityMenu;
import com.trainerapp.R;

import database.controladores.DataBaseAdapter;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Handler;

public class ProgresDialog extends AsyncTask<Void, Void, Void>{
	public ProgressDialog mDialog;
	private ActivityMenu mContext;
	private DataBaseAdapter db;
	final Handler puente = new Handler();
	final Runnable proceso = new Runnable(){
		public void run(){
		             try {
		            	 mDialog.dismiss();
					} catch (Throwable e) {
						e.printStackTrace();
					}
		   }
	  };
	
	  public void Hilo(){
			new Thread() {
				public void run() 
						{
					try {
						sleep(20000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 puente.post(proceso);
			        }
			    }.start();
	 }
    public ProgresDialog(ActivityMenu context){
        super();
        this.mContext = context;
        db = new DataBaseAdapter(mContext);
    }

    protected void onPreExecute() {
        mDialog = ProgressDialog.show(mContext, "Atencion", "Cargando Ejercicios", true);
    }

    protected void onPostExecute(Void result) {
        
    }
//
//
    @Override
    protected Void doInBackground(Void... params) {
    	DtoEjercicioMuscular dtoEjercioM = new DtoEjercicioMuscular();
    	      db.open();
    	      dtoEjercioM.setAll("1", "Ejercicios Bkn","asdas" , "2");
    	      db.insertarEjercicio(dtoEjercioM);
    	      dtoEjercioM.setAll("2", "Ejercicios Bkn", "asldasd", "2");
    	      db.insertarEjercicio(dtoEjercioM);
			  db.close();
			  Hilo();
			 
        return null;
    }
 

     
}
