package clases.dominio;



public class DtoEjercicioMuscular extends DtoEjercicio{
	private String DESCRIPCION;
	private String FOTO;
	private String ZONA_MUSCULAR_ID;
	private String SEXO;
	private String DIFICULTAD;
	
	public DtoEjercicioMuscular(){
		this.ID="";
		this.DESCRIPCION="";
		this.FOTO=null;
		this.ZONA_MUSCULAR_ID="";
	}
	
	public void setAll(String id, String nombre ,String descripcion, String url, String zona_muscular_id,String tiempo){
		this.ID=id;
		this.DESCRIPCION=descripcion;
		this.FOTO= url;
		this.ZONA_MUSCULAR_ID=zona_muscular_id;
		this.TIEMPO = tiempo;
		this.NOMBRE = nombre;
	}
	public void setAll( String nombre ,String descripcion, String url, String zona_muscular_id,String tiempo, String sexo, String dificultad){
		this.DESCRIPCION=descripcion;
		this.FOTO= url;
		this.ZONA_MUSCULAR_ID=zona_muscular_id;
		this.TIEMPO = tiempo;
		this.NOMBRE = nombre;
		this.SEXO = sexo;
		this.DIFICULTAD = dificultad;
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
	public String getSexo(){
		return this.SEXO;
	}
	public String getDificultad(){
		return this.DIFICULTAD;
	}
	
}
