package database.controladores;

import clases.dominio.DtoRutina;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import database.controladores.DataBaseHelper;

public class DataBaseAdapter {
	public SQLiteDatabase open() throws SQLException {
        dbHelper = new DataBaseHelper(contexto);
        db = dbHelper.getWritableDatabase();
        return db;
	}
	public void close() {
        dbHelper.close();
	}
	public boolean insertarRutina(DtoRutina Parametro ) 
	{
		   Log.w("INSERTAR RUTINA", "insert into "+ DataBaseHelper.TABLA_RUT+ " ( " + DataBaseHelper.ID_RUT+", "+DataBaseHelper.TIPO_TRAB 
	        		+"," + DataBaseHelper.NIVEL + ","+DataBaseHelper.SEXO+") "+" values ('" +Parametro.ID_RUT +"','" +Parametro.+"')");
	       try{
	        db.execSQL("insert into "+ DataBaseHelper.TABLA_RUT + " ( " + DataBaseHelper.ID_PAR+", "+DataBaseHelper.VALOR 
	        		+") "+" values ('" +Parametro.ID_PAR +"','" +Parametro.VALOR+"')");
	        return true;
	       }catch(Exception e){return false;}
	}
}
