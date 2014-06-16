package clases.dominio;


public class DtoRutina { 
private String ID_RUT ;
private String TIPO_TRAB;
private String SEXO;
private String NIVEL;


public DtoRutina(){
    this.ID_RUT="";
    this.TIPO_TRAB="";
}

public void setIdRutina(String Id) {
    this.ID_RUT = Id;
}
public void setTipoTrab(String tipo_trab) {
    this.TIPO_TRAB = tipo_trab;
} 
public void setAll(String Id, String tipo_trab, String sexo, String nivel) {
    this.ID_RUT = Id;
    this.TIPO_TRAB = tipo_trab;
    this.SEXO = sexo; 
    this.NIVEL = nivel; 
}
public String getIdRutina(){
    return this.ID_RUT;
}
public String getTipoTrabajo(){
    return this.TIPO_TRAB;
}
public String getSexo(){
    return this.SEXO;
}
public String getNivel(){
    return this.NIVEL;
}


}
