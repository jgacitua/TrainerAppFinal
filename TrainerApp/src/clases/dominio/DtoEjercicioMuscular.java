package clases.dominio;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class DtoEjercicioMuscular extends DtoEjercicio{
	private String DESCRIPCION;
	private Bitmap FOTO;
	private String ZONA_MUSCULAR_ID;
	
	public DtoEjercicioMuscular(){
		this.ID="";
		this.DESCRIPCION="";
		this.FOTO=null;
		this.ZONA_MUSCULAR_ID="";
	}
	
	public void setAll(String id, String descripcion, String url, String zona_muscular_id){
		this.ID=id;
		this.DESCRIPCION=descripcion;
		this.FOTO=BitmapFactory.decodeFile(url);
		this.ZONA_MUSCULAR_ID=zona_muscular_id;
	}
	
	public String getId(){
		return this.ID;
	}
	
	public String getDescripcion(){
		return this.DESCRIPCION;
	}
	
	public Bitmap getFoto(){
		return this.FOTO;
	}
	
	public String getZonaMuscularId(){
		return this.ZONA_MUSCULAR_ID;
	}
}
