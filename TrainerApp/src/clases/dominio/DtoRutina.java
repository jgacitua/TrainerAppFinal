package clases.dominio;


public class DtoRutina { public String ID_ANOT ;
public String ANOTACION;

public DtoRutina(){
    this.ID_ANOT="";
    this.ANOTACION="";
}
public DtoRutina(String id_Anot, String anot){
    this.ID_ANOT=id_Anot;
    this.ANOTACION=anot;
}

public void setIdAnot(String Id) {
    this.ID_ANOT = Id;
}
public void setAnot(String Anot) {
    this.ANOTACION = Anot;
}
public void setAll(String Id, String anotacion) {
    this.ID_ANOT = Id;
    this.ANOTACION = anotacion;
}
public String getIdAnot(){
    return this.ID_ANOT;
}
public String getAnot(){
    return this.ANOTACION;
}


}
