package clases.dominio;



public class DtoEjercicioMuscular extends DtoEjercicio{
	private String DESCRIPCION;
	private String FOTO;
	private String ZONA_MUSCULAR_ID;
	private String TIEMPO;
	
	public DtoEjercicioMuscular(){
		this.ID="";
		this.DESCRIPCION="";
		this.FOTO=null;
		this.ZONA_MUSCULAR_ID="";
		this.TIEMPO="";
	}
	
	public void setAll(String id, String descripcion, String url, String zona_muscular_id,String tiempo){
		this.ID=id;
		this.DESCRIPCION=descripcion;
		this.FOTO= url;
		this.ZONA_MUSCULAR_ID=zona_muscular_id;
		this.TIEMPO = tiempo;
	}
	
	public String getId(){
		return this.ID;
	}
	
	public String getDescripcion(){
		return this.DESCRIPCION;
	}
	
	public String getFoto(){
		return this.FOTO;
	}
	public String getZonaMuscularId(){
		return this.ZONA_MUSCULAR_ID;
	}
	public String getTiempo(){
		return this.TIEMPO;
	}
	
}
