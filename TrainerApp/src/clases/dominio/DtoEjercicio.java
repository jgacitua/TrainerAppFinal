package clases.dominio;

public class DtoEjercicio {
	protected String ID;
	protected String NOMBRE;
	protected String TIEMPO;
	
	public DtoEjercicio(){
		this.ID="";
		this.NOMBRE="";
		this.TIEMPO="";
	}
	
	public DtoEjercicio(String id, String nombre, String tiempo) {
		this.ID=id;
		this.NOMBRE=nombre;
		this.TIEMPO = tiempo;
	}

	public void setAll(String id, String nombre,String tiempo){
		this.ID=id;
		this.NOMBRE=nombre;
		this.TIEMPO = tiempo;
	}
	
	public String getId(){
		return this.ID;
	}
	
	public String getNombre(){
		return this.NOMBRE;
	}
	public String getTiempo(){
		return this.TIEMPO;
	}
	
}
