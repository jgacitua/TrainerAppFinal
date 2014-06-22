package interfaces.dialogos;

import clases.dominio.DtoEjercicioMuscular;
import clases.dominio.DtoEjercicioUsuario;
import clases.dominio.DtoZonaMuscular;

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
    	DtoZonaMuscular dtoZonaMuscular = new DtoZonaMuscular();
    	      db.open();
    	     //------------------------------- espalda
    	      dtoEjercioM.setAll("Remo sentado","descripcionnnn","as", "2","01:10:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Jalon de polea frente con agarre","descripcionnnn","as", "2","01:10:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Remo orizontal mancuernas","descripcionnnn","as", "2","01:10:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	    //------------------------------- hombros
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Rotacion externa del hombro ", "descripcionnnn","safa", "1","00:30:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Ejercicios Bkn", "descripcionnnn","safa", "1","00:10:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Ejercicios Bkn", "descripcionnnn","safa", "1","00:17:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Ejercicios Bkn", "descripcionnnn","safa", "1","00:15:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	    //------------------------------- Pectorales
    	      dtoEjercioM.setAll("Mariposa","descripcionnnn","as", "3","00:15:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Press Mancuernas banca inclinida","descripcionnnn", "safa", "3","00:10:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Press barra orizontal", "descripcionnnn","safa", "3","00:08:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Apertura Mancuernas","descripcionnnn","as", "2","00:20:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	    //------------------------------- Biceps
    	      dtoEjercioM.setAll("Curl de biceps en maquina","descripcionnnn","as", "5","00:15:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Curl de biceps barra","descripcionnnn", "safa", "5","00:10:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Curl de bíceps concentrado", "descripcionnnn","safa", "5","00:08:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Curl de bíceps con polea","descripcionnnn","as", "5","00:12:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	    //------------------------------- Triceps
    	      dtoEjercioM.setAll("Extensiones de tríceps en polea alta","descripcionnnn","as", "4","00:12:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Press francés en banco plano","descripcionnnn", "safa", "4","00:11:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Press francés en banco plano con mancuernas", "descripcionnnn","safa", "4","00:07:30");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll(" Extensión alternada de los antebrazos con mancuerna","descripcionnnn","as", "4","00:10:00");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      //piernas
    	      dtoEjercioM.setAll("Apductores de cadera", "descripcionnnn","safa", "6","00:10:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Extencion de cadera en banco", "descripcionnnn","safa", "6","00:12:00");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      //-------------------------------Abdomen-----------------------------------
    	      dtoEjercioM.setAll("Encogimientos abdominales o (crunch)", "descripcionnnn","safa", "7","00:10:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Elevaciones del tronco en el suelo", "descripcionnnn","safa", "7","00:12:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Elevaciones del tronco en espaldera", "descripcionnnn","safa", "7","00:12:30");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Elevaciones del tronco en banco inclinado", "descripcionnnn","safa", "7","00:13:20");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll(" Elevaciones de rodillas en paralelas", "descripcionnnn","safa", "7","00:15:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll(" Elevaciones de piernas, suspendido en barra fija", "descripcionnnn","safa", "7","00:08:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      dtoEjercioM.setAll("Rotación del tronco con bastón", "descripcionnnn","safa", "7","00:12:10");
    	      Log.w("Insertando Ejercicios",""+db.insertarEjercicio(dtoEjercioM));
    	      
    	      //------------------------------------------------------------------
    	    
    	      
    	      
    	      dtoZonaMuscular.setAll("1", "Hombros");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("2", "Espalda");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("3", "Pectorales");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("4", "Triceps");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("5", "Biceps");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular)); 
    	      dtoZonaMuscular.setAll("6", "Piernas");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("7", "Abdomen");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
			  db.close();
			 
        return null;
    }
 

     
}
