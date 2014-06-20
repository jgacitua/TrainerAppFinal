package clases.dominio;

public class DtoEjercicio {
	protected String ID;
	protected String NOMBRE;
	
	public DtoEjercicio(){
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
