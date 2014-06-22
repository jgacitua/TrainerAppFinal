

package database.controladores;

import clases.dominio.DtoDiaDeEntrenamiento;
import clases.dominio.DtoEjercicioMuscular;
import clases.dominio.DtoEjercicioUsuario;
import clases.dominio.DtoRutina;
import clases.dominio.DtoZonaMuscular;
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
	public boolean insertarDiaEntrenamiento(DtoDiaDeEntrenamiento DiaEntrenamiento){
		try{
			db.execSQL("insert into "+ DataBaseHelper.TABLA_DIAENTR+ " ( " + DataBaseHelper.ID_DIAENTR+", "+DataBaseHelper.NOMBRE_DIA
	        		+"," + DataBaseHelper.TIEMPO_TOTAL+") "+" values ('" +DiaEntrenamiento.getId() +"','" +DiaEntrenamiento.getDia()+"','"
				   +DiaEntrenamiento.getTiempoTotal()+"')");
			return true;
		}catch(Exception e){
			return false;
		}
	}
	public boolean insertarEjercicio(DtoEjercicioMuscular EjercicioMuscular){
		try{
			db.execSQL("insert into "+ DataBaseHelper.TABLA_EJERCICIO+" ( " + DataBaseHelper.ID_EJER+", "+DataBaseHelper.NOMBRE_EJER
	        		+"," + DataBaseHelper.DESCRIPCION+", "+DataBaseHelper.TIEMPO+", "+DataBaseHelper.FOTO+", "+DataBaseHelper.ZONA_MUSCULAR_ID+") "+" values ('" + EjercicioMuscular.getId() +"','" +EjercicioMuscular.getNombre()+"','"
				   +EjercicioMuscular.getDescripcion()+"','"+EjercicioMuscular.getTiempo()+"','"+EjercicioMuscular.getFoto()+"','"+EjercicioMuscular.getZonaMuscularId()+"')");
			return true;
		}catch(Exception e){
			return false;
		}
	}
	public boolean insertarEjercicioUsuario(DtoEjercicioUsuario EjercicioUsuario){
		try{
			db.execSQL("insert into "+ DataBaseHelper.TABLA_EJER_USUARIO+" ( " + DataBaseHelper.ID_EJER_USU+", "+DataBaseHelper.EJERCICIO_ID+") "+" values ('" + EjercicioUsuario.getId() +"','" 
		+EjercicioUsuario.getEjercicioId()+"')");
			return true;
		}catch(Exception e){
			return false;
		}
	}
	public boolean insertarZonaMuscular(DtoZonaMuscular ZonaMuscular){
		try{
			db.execSQL("insert into "+ DataBaseHelper.TABLA_ZONA_MUS+" ( " + DataBaseHelper.ID_ZONA+", "+DataBaseHelper.NOMBRE_ZONA+") "+" values ('" + ZonaMuscular.getId() +"','" 
		+ZonaMuscular.getNombre()+"')");
			return true;
		}catch(Exception e){
			return false;
		}
	}
	public DtoRutina obtenerRutina(String id) {
	       try{
	    	   DtoRutina dtoRutina = new DtoRutina();
	    	   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_RUT + " WHERE id_rut = '"+id+"'",null);;
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
	public DtoEjercicioUsuario[] obtenerEjerciciosUsuario() {
	       try{
	    	   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_EJER_USUARIO,null);
	    	   DtoEjercicioUsuario[] dtoEjeUsu = new DtoEjercicioUsuario[cur.getCount()];
	    	   if(cur.moveToFirst())
			   {
	    		  int i= 0;
				do{ 
				    Cursor cur1= db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_EJERCICIO + " WHERE id = '"+cur.getString(1)+"'",null);
			    	   if(cur1.moveToFirst())
					   {
			    		    dtoEjeUsu[i] = new DtoEjercicioUsuario();
			    		   	dtoEjeUsu[i].setAll(cur.getString(0), cur1.getString(1), cur1.getString(4));
					   }
				   i= i +1;
				   cur1.close();
				}while(cur.moveToNext());
			  }
			cur.close();
		
	        return  dtoEjeUsu;
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
	    		   Log.w("Existe DB","Si existe Rutina");
//				do{ 
//				}while(cur.moveToNext());
			  }else{
				  Log.w("Existe DB","No existe Rutina");
			  }
			cur.close();
	        return  var;
	       }catch(Exception e){return var;}
	}
	public boolean existeEjercicio(){
		boolean var= false;
		try{
	    	   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_EJERCICIO,null);
	    	   if(cur.moveToFirst())
			   {
	    		   var=true;
	    		   Log.w("Existe DB","Si existe ejercicios");
			  }else{
				  Log.w("Existe DB","No existe ejercicios");
			  }
			cur.close();
	        return  var;
	       }catch(Exception e){return var;}
	}
}
