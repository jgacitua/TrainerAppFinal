package clases.dominio;

public class DtoZonaMuscular {
	private String ID;
	private String NOMBRE;
	
	public DtoZonaMuscular(){
		this.ID="";
		this.NOMBRE="";
	}
	
	public void setAll(String id, String nombre){
		this.ID=id;
		this.NOMBRE=nombre;
	}
	
	public String getId(){
		return this.ID;
	}
	
	public String getNombre(){
		return this.NOMBRE;
	}
}
