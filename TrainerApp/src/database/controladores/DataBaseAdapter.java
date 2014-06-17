

package database.controladores;

import clases.dominio.DtoRutina;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import database.controladores.DataBaseHelper;

public class DataBaseAdapter {
    private DataBaseHelper dbHelper;
    private SQLiteDatabase db;
    private final Context contexto;
    
    public DataBaseAdapter(Context contexto) {
            this.contexto = contexto;
    }
    public SQLiteDatabase open() throws SQLException {
    	dbHelper = new DataBaseHelper(contexto);
    	db = dbHelper.getWritableDatabase();
    	return db;
    }
    public void close() {
    	dbHelper.close();
    }
	public boolean insertarRutina(DtoRutina Rutina ) {
	       try{
	        db.execSQL("insert into "+ DataBaseHelper.TABLA_RUT+ " ( " + DataBaseHelper.ID_RUT+", "+DataBaseHelper.TIPO_TRAB 
	        		+"," + DataBaseHelper.NIVEL + ","+DataBaseHelper.SEXO+") "+" values ('" +Rutina.getIdRutina() +"','" +Rutina.getTipoTrabajo()+"','"
				   +Rutina.getNivel()+"','"+Rutina.getSexo()+"')");
	        return true;
	       }catch(Exception e){return false;}
	}
}
