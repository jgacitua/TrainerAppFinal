package database.controladores;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBaseHelper extends SQLiteOpenHelper{
	
	/** Propiedades a partir de aquí. */
	public static final String DATABASE_NAME = "DBTrainerApp";
	public static final int DATABASE_VERSION = 11;
	//-------------------------------------TABLA RUTINA----------------------------------------------
	public static final String TABLA_RUT = "rutina";
	public static final String ID_RUT = "id_rut";
	public static final String TIPO_TRAB= "tipo_trabajo";
	public static final String NIVEL = "nivel";
	public static final String SEXO = "sexo";
	//***********************************************************************************************
	public static final String TAB_CREATE_RUT = "create table " + TABLA_RUT
	                   + " (" + ID_RUT + " text PRIMARY KEY , "+ TIPO_TRAB + " text,"+ NIVEL + " text,"+ SEXO +" text);";

	//---------------------------TABLA DIA DE ENTRENAMIENTO------------------------------------------
	public static final String TABLA_DIAENTR = "dia_entrenamiento";
	public static final String ID_DIAENTR = "id_dia";
	public static final String NOMBRE_DIA = "dia";
	public static final String TIEMPO_TOTAL = "tiempo_total";
	//***********************************************************************************************
	public static final String TAB_CREATE_DIAENTR = "create table " + TABLA_DIAENTR
            + " (" + ID_DIAENTR + " text PRIMARY KEY , "+ NOMBRE_DIA + " text,"+ TIEMPO_TOTAL + " text);";
	
	//---------------------------TABLA EJERCICIO-----------------------------------------------------
	public static final String TABLA_EJERCICIO = "ejercicio";
	public static final String ID_EJER = "id";
	public static final String NOMBRE_EJER = "nombre";
	public static final String DESCRIPCION = "descripcion";
	public static final String FOTO = "foto";
	public static final String ZONA_MUSCULAR_ID = "zona_muscular_id";
	public static final String TIEMPO = "tiempo";
	//***********************************************************************************************
	public static final String TAB_CREATE_EJERCICIO = "create table " + TABLA_EJERCICIO
            + " (" + ID_EJER + " text PRIMARY KEY , "+ NOMBRE_EJER + " text,"+ DESCRIPCION + " text, "+
			FOTO +" text, "+ TIEMPO +" text, "+ ZONA_MUSCULAR_ID +" text);";
	//---------------------------TABLA ZONA MUSCULAR-------------------------------------------------
	public static final String TABLA_ZONA_MUS = "zona_muscular";
	public static final String ID_ZONA = "id";
	public static final String NOMBRE_ZONA = "nombre";
	//***********************************************************************************************
	public static final String TAB_CREATE_ZONA_MUS = "create table " + TABLA_ZONA_MUS
            + " (" + ID_ZONA + " text PRIMARY KEY , "+ NOMBRE_ZONA + " text);";
	//---------------------------TABLA EJERCICIO USUARIO--------------------*-------------------------
	public static final String TABLA_EJER_USUARIO = "ejercicio_usuario";
	public static final String ID_EJER_USU = "id";
	public static final String EJERCICIO_ID = "ejercicio_id";
	//***********************************************************************************************
	public static final String TAB_CREATE_EJER_USUARIO = "create table " + TABLA_EJER_USUARIO
            + " (" + ID_EJER_USU + " text PRIMARY KEY , "+ EJERCICIO_ID + " text);";
	public DataBaseHelper(Context contexto) {
	   	super(contexto, DATABASE_NAME, null, DATABASE_VERSION);
	}

	public void onCreate(SQLiteDatabase db) {
		db.execSQL(TAB_CREATE_RUT);	
	    db.execSQL(TAB_CREATE_DIAENTR);
	    db.execSQL(TAB_CREATE_EJERCICIO);
	    db.execSQL(TAB_CREATE_ZONA_MUS);
	    db.execSQL(TAB_CREATE_EJER_USUARIO);
	}
	public void Delete(SQLiteDatabase db){
	//	db.execSQL("DROP DATABASE IF EXISTS " + DATABASE_NAME);
	    db.execSQL("DROP TABLE IF EXISTS " + TABLA_RUT);
	    db.execSQL("DROP TABLE IF EXISTS " + TABLA_DIAENTR);
	    db.execSQL("DROP TABLE IF EXISTS " + TABLA_EJERCICIO);
	    db.execSQL("DROP TABLE IF EXISTS " + TABLA_ZONA_MUS);
	    db.execSQL("DROP TABLE IF EXISTS " + TABLA_EJER_USUARIO);
	    Log.w("Delete DB","Se borro DB");
	    onCreate(db);
	}
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	        Log.w("SqLiteHelper", "Upgrading database from version " + oldVersion
	                        + " to " + newVersion + ", which will destroy all old data");
	        // Se borra la tabla.
	        db.execSQL("DROP TABLE IF EXISTS " + TABLA_RUT);
	        db.execSQL("DROP TABLE IF EXISTS " + TABLA_DIAENTR);
	        db.execSQL("DROP TABLE IF EXISTS " + TABLA_EJERCICIO);
		    db.execSQL("DROP TABLE IF EXISTS " + TABLA_ZONA_MUS);
		    db.execSQL("DROP TABLE IF EXISTS " + TABLA_EJER_USUARIO);
	        onCreate(db);      
	        
	}
}
