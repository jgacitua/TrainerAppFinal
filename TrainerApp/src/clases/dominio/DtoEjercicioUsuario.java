package clases.dominio;


public class DtoEjercicioUsuario extends DtoEjercicio {
	private String ID;
	private String EJERCICIO_ID;
	
	public DtoEjercicioUsuario(){
		this.ID="";
		this.NOMBRE="";
		this.EJERCICIO_ID="";
	}
	
	public void setAll(String id, String nombre, String ejercicio_id, String tiempo){
		this.ID=id;
		this.NOMBRE=nombre;
		this.EJERCICIO_ID=ejercicio_id;
		this.TIEMPO = tiempo;
	}
	public void setAll(String id,String ejercicio_id){
		this.ID=id;
		this.EJERCICIO_ID=ejercicio_id;
	}
	public void setAll(String ejercicio_id){
		this.EJERCICIO_ID=ejercicio_id;
	}
	
	public String getId(){
		return this.ID;
	}
	
	public String getNombre(){
		return this.NOMBRE;
	}
	
	public String getEjercicioId(){
		return this.EJERCICIO_ID;
	}
}
