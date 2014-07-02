package adaptadoresList;

public class MenuItem {
	 
	   private String nombre;
	   private int logotipo;
	   private String tiempo;
	   private String id;
	 
	   public MenuItem(String nombre, int logotipo) {
	      this.nombre = nombre;
	      this.logotipo = logotipo;
	   }
	   public MenuItem(String nombre, String tiempo, String id) {
		      this.nombre = nombre;
		      this.tiempo = tiempo;
		      this.id = id;
		   }
	 
	   public void setNombre(String nombre) { this.nombre = nombre; }
	   public void setLogotipo(int logotipo) { this.logotipo = logotipo; }
	   public void setTiempo(String tiempo) { this.tiempo = tiempo; }
	   
	   public String getNombre() { return nombre; }
	   public int getLogotipo() { return logotipo; }
	   public String getTiempo() { return tiempo; }
	   public String getId() { return id; }
	 
	}