

package database.controladores;

import clases.dominio.DtoRutina;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
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
	public DtoRutina obtenerRutina(String id) {
	       try{
	    	   DtoRutina dtoRutina = new DtoRutina();
	    	   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_RUT + " WHERE id_Par = '"+id+"'",null);;
	    	   if(cur.moveToFirst())
			   {
	    		  dtoRutina.setAll(cur.getString(0), cur.getString(1), cur.getString(3), cur.getString(2));
//				do{ 
//					  
//				   
//				}while(cur.moveToNext());
			  }
			cur.close();
	        return  dtoRutina;
	       }catch(Exception e){return null;}
	}
	public boolean borrarDB() 
	{
		
		try{
			dbHelper.Delete(db);
	        return  true;
	       }catch(Exception e){  Log.w("Delete DB",e);return false;}
	}
	public boolean existeRutina(){
		boolean var= false;
		try{
	    	   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_RUT,null);
	    	 
	    	   if(cur.moveToFirst())
			   {
	    		   var=true;
	    		   Log.w("Existe DB","Si existe");
//				do{ 
//				}while(cur.moveToNext());
			  }else{
				  Log.w("Existe DB","No existe");
			  }
			cur.close();
	        return  var;
	       }catch(Exception e){return var;}
	}
}
