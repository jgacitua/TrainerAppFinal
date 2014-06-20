package clases.dominio;

public class DtoDiaDeEntrenamiento {
	private String ID;
	private String DIA;
	private String TIEMPO_TOTAL;
	
	public DtoDiaDeEntrenamiento(){
		this.ID="";
		this.DIA="";
		this.TIEMPO_TOTAL="";
	}
	
	public void setAll(String id, String dia, String tiempo_total){
		this.ID=id;
		this.DIA=dia;
		this.TIEMPO_TOTAL=tiempo_total;
	}
	
	public String getId(){
		return this.ID;
	}
	
	public String getDia(){
		return this.DIA;
	}
	
	public String getTiempoTotal(){
		return this.TIEMPO_TOTAL;
	}
}
