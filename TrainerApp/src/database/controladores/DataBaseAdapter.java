

package database.controladores;

import clases.dominio.DtoDiaDeEntrenamiento;
import clases.dominio.DtoEjercicio;
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
			db.execSQL("insert into "+ DataBaseHelper.TABLA_EJERCICIO+" ( "+DataBaseHelper.NOMBRE_EJER
	        		+"," + DataBaseHelper.DESCRIPCION+", "+DataBaseHelper.TIEMPO+", "+DataBaseHelper.FOTO+", "+DataBaseHelper.ZONA_MUSCULAR_ID+", "+DataBaseHelper.SEXO+", "+DataBaseHelper.DIFICULTAD+") "+" values ('" +EjercicioMuscular.getNombre()+"','"
				   +EjercicioMuscular.getDescripcion()+"','"+EjercicioMuscular.getTiempo()+"','"+EjercicioMuscular.getFoto()+"','"+EjercicioMuscular.getZonaMuscularId()+"','"+EjercicioMuscular.getSexo()+"','"+EjercicioMuscular.getDificultad()+"')");
			return true;
		}catch(Exception e){
			return false;
		}
	}
	public boolean insertarEjercicioUsuario(DtoEjercicioUsuario EjercicioUsuario){
		try{
			db.execSQL("insert into "+ DataBaseHelper.TABLA_EJER_USUARIO+" ("+DataBaseHelper.EJERCICIO_ID+", "+DataBaseHelper.DIA+") "+" values ('" 
		+EjercicioUsuario.getEjercicioId()+"','"+EjercicioUsuario.getDia()+"')");
			Log.w("Insertando Ejercicio Usuario", "Correctamente");
			return true;
		}catch(Exception e){
			Log.w("Insertando Ejercicio Usuario", "ERROR");
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
	public DtoRutina obtenerRutina() {
	       try{
	    	   DtoRutina dtoRutina = new DtoRutina();
	    	   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_RUT,null);;
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
	public DtoZonaMuscular obtenerZona(String zona) {
	       try{
	    	   DtoZonaMuscular dtoZona = new DtoZonaMuscular();    	  
	    			   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_ZONA_MUS + " WHERE nombre = '"+zona+"'",null);;
	    	   if(cur.moveToFirst())
			   {
	    		  dtoZona.setAll(cur.getString(0), cur.getString(1));
			  }
			cur.close();
	        return  dtoZona;
	       }catch(Exception e){return null;}
	}
	public DtoEjercicioUsuario[] obtenerEjerciciosUsuario(String dia) {
	       try{
	    	   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_EJER_USUARIO + " WHERE DIA = '"+dia+"'",null);
	    	   DtoEjercicioUsuario[] dtoEjeUsu = new DtoEjercicioUsuario[cur.getCount()];
	    	   if(cur.moveToFirst())
			   {
	    		  int i= 0;
				do{ 
				    Cursor cur1= db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_EJERCICIO + " WHERE id = '"+cur.getString(1)+"'",null);
			    	   if(cur1.moveToFirst())
					   {
			    		    dtoEjeUsu[i] = new DtoEjercicioUsuario();
			    		   	dtoEjeUsu[i].setAll(cur.getString(0), cur1.getString(1),cur1.getString(0), cur1.getString(4),cur.getString(2));
					   }
				   i= i +1;
				   cur1.close();
				}while(cur.moveToNext());
			  }
			cur.close();
		
	        return  dtoEjeUsu;
	       }catch(Exception e){return null;}
	}
	public DtoEjercicio[] obtenerEjercicios(String id_zona, String dificultad, String sexo) {
	       try{
	    	   Cursor cur= db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_EJERCICIO + " WHERE zona_muscular_id = '"+id_zona+"' AND dificultad= '"+dificultad+"'"+" AND sexo= '"+sexo+"'",null);
	    	   DtoEjercicio[] dtoEje = new DtoEjercicio[cur.getCount()];
	    	   if(cur.moveToFirst())
			   {
	    		  int i= 0;
				do{ 
			    		    dtoEje[i] = new DtoEjercicio();
			    		   	dtoEje[i].setAll(cur.getString(0), cur.getString(1), cur.getString(4));
					   
				   i= i +1;
				}while(cur.moveToNext());
			  }
			cur.close();
		
	        return  dtoEje;
	       }catch(Exception e){return null;}
	}
	public DtoEjercicioMuscular obtenerEjercicios(String id) {
	       try{
	    	   Cursor cur= db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_EJERCICIO + " WHERE id = '"+id+"'",null);
	    	   DtoEjercicioMuscular dtoEje = new DtoEjercicioMuscular();
	    	   if(cur.moveToFirst())
			   {
			    		   	dtoEje.setAll(cur.getString(0), cur.getString(1), cur.getString(2), cur.getString(3), cur.getString(5), cur.getString(4));
					   
			  }
			cur.close();
		
	        return  dtoEje;
	       }catch(Exception e){return null;}
	}
	
//	public void actualizarEjercicioUsuario(String seleccion) {
//        db.execSQL("UPDATE "+DataBaseHelper.TABLA_PED+" SET "+DataBaseHelper.SELECCION+" = '"+seleccion+"' " +
//        		"WHERE "+DataBaseHelper.ID_PEDIDO+" = '"+id_tx+"'");
//     }
	public boolean borrarAllEjercicioUsuario() {
	       try{
	         db.execSQL("DELETE  FROM "+DataBaseHelper.TABLA_EJER_USUARIO);
	        return true;
	       }catch(Exception e){return false;}
	}
	public boolean borrarEjercicioUsuario(String id) {
	       try{
	         db.execSQL("DELETE  FROM "+DataBaseHelper.TABLA_EJER_USUARIO + " WHERE id = '"+id+"'");
	        return true;
	       }catch(Exception e){return false;}
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
	public boolean existeEjercicioUsuario(){
		boolean var= false;
		try{
	    	   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_EJER_USUARIO ,null);
	    	   if(cur.moveToFirst())
			   {
	    		   var=true;
	    		   Log.w("Existe DB","Si existe ejercicios_Usuario");
			  }else{
				  Log.w("Existe DB","No existe ejercicios_Usuario");
			  }
			cur.close();
	        return  var;
	       }catch(Exception e){return var;}
	}
	public boolean existeEjercicioUsuario(String ejercicio_id, String dia){
		boolean var= false;
		try{
	    	   Cursor cur =  db.rawQuery("SELECT *  FROM "+DataBaseHelper.TABLA_EJER_USUARIO + " WHERE ejercicio_id  = '"+ejercicio_id+"' AND dia= '"+dia+"'",null);
	    	   if(cur.moveToFirst())
			   {
	    		   var=true;
	    		   Log.w("Existe DB","Si existe ejercicios_Usuario");
			  }else{
				  Log.w("Existe DB","No existe ejercicios_Usuario");
			  }
			cur.close();
	        return  var;
	       }catch(Exception e){return var;}
	}
}
