package interfaces.dialogos;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
 



import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import clases.dominio.DtoEjercicioMuscular;
import clases.dominio.DtoZonaMuscular;

import com.trainerapp.ActivityMenu;

import database.controladores.DataBaseAdapter;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

public class ProgresDialog extends AsyncTask<Void, Void, Void>{
	public ProgressDialog mDialog;
	private ActivityMenu mContext;
	private DataBaseAdapter db;
    public ProgresDialog(ActivityMenu context){
        super();
        this.mContext = context;
        db = new DataBaseAdapter(mContext);
    }

    protected void onPreExecute() {
        mDialog = ProgressDialog.show(mContext, "Atencion", "Cargando Ejercicios", true);
    }

    protected void onPostExecute(Void result) {
        mDialog.dismiss();
    }
//
//
    @Override
    protected Void doInBackground(Void... params) {
    	DtoEjercicioMuscular dtoEjercioM = new DtoEjercicioMuscular();
    	DtoZonaMuscular dtoZonaMuscular = new DtoZonaMuscular();
    	      db.open();
    	    //fila 1-----------------------------------------
    	      dtoEjercioM.setAll("Extensi�n de triceps en polea alta","De pie, utilizando un equipo con polea, se colocan las manos  en pronaci�n (con las palmas hacia abajo), sosteniendo firmemente la barra recta que se utiliza para el  equipo de polea. Las manos estar�n en l�nea recta  o ligeramente  por adentro de los hombros y se formar� un �ngulo de 90 grados entre el brazo y  el antebrazo. Luego se extender�n los brazos con el consiguiente  movimiento hacia abajo hasta casi tocarse los muslos con la barra. Finalmente, flexionas los  brazos hasta llevarlos a la posici�n inicial.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 2-----------------------------------------
    	      dtoEjercioM.setAll("Press Franc�s","Acostado, se sostiene una barra con pesos por arriba del  pecho colocando las manos aproximadamente en l�nea recta a los lados de la cara (agarre cerrado).  Luego se elevar� la  barra  hasta   tener  ambos brazos extendidos y posteriormente se descender� la barra a  su posici�n inicial. Se trabaja sobre todo la regi�n lateral del tr�ceps.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 3-----------------------------------------
    	      dtoEjercioM.setAll("Extensi�n alternada de antebrazos con mancuernas","Primero coloca tu rodilla y tu mano sobre un banco y coge una mancuerna con tu otra mano, con la palma apuntando hacia tu cuerpo, y la parte superior de tu brazo paralela a tu cuerpo. Luego empuja la mancuerna hacia atr�s mediante la extensi�n de tu codo y perm�tele retornar lentamente luego de una breve pausa. Es importante mantener firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 4-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps Acostado","Recu�state de espalda sobre un banco y sujeta una mancuerna en cada mano, con las palmas apuntando hacia arriba, y las partes superiores de tus brazos apuntando al techo. Eleva las mancuernas mediante la extensi�n de tus codos y luego de una breve pausa, perm�teles retornar al punto de partida.Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 5-----------------------------------------
    	      dtoEjercioM.setAll("Prensa en Banco para Tr�ceps","Recu�state de espalda sobre un banco y sujeta las mancuernas a los costados de tu cuerpo, justo por encima de tu pecho, con las palmas apuntando una a otra. Empuja las mancuernas hacia arriba hasta que tus brazos est�n casi totalmente extendidos y luego de una breve pausa b�jalas. Exhala al empujar las mancuernas hacia arriba e inhala al bajarlas.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 6-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps Inclinado, A Un Brazo","Si�ntate, ag�chate hacia adelante y sujeta una mancuerna con una mano, con tu codo formando un �ngulo de 90 grados y la palma apuntando hacia tu cuerpo. Eleva la mancuerna con una mano hasta que tu brazo est� paralelo al suelo y luego de una breve pausa lentamente b�jala. Luego de cada serie ve alternando el brazo. Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 7-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps Sentado","Si�ntate y sujeta una mancuerna con ambas manos, detr�s de tu cabeza, con los codos formando �ngulos de 90 grados y las partes superiores de los brazos hacia arriba en forma recta. Eleva la mancuerna con ambas manos hasta que tus brazos est�n casi totalmente extendidos y luego de una breve pausa b�jala lentamente. Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 8-----------------------------------------
    	      dtoEjercioM.setAll("Patada de Burro de Tr�ceps","Coloca tu rodilla y tu mano sobre un banco y coge una mancuerna con tu otra mano, con la palma apuntando hacia tu cuerpo, y la parte superior de tu brazo paralela a tu cuerpo. Empuja la mancuerna hacia atr�s mediante la extensi�n de tu codo y perm�tele retornar lentamente luego de una breve pausa. Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 9-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps, A Un Brazo","Ponte de pie y sujeta una mancuerna con una mano, detr�s de tu cabeza, con el codo formando un �ngulo de 90 grados, y la parte superior del brazo apuntando hacia arriba en forma recta. Eleva la mancuerna con una mano hasta que tu brazo est� casi totalmente extendido y luego de una breve pausa b�jala lentamente. Luego de cada serie ve alternando el brazo. Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 10-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps, A Dos Brazos","Ponte de pie y sujeta una mancuerna con ambas manos, detr�s de tu cabeza, con las partes superiores de los brazos apuntando hacia arriba en forma recta.Eleva la mancuerna hacia arriba mediante la flexi�n de tus codos y luego de una breve pausa b�jala lentamente.Las partes superiores de tus brazos deben permanecer firmes durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 11-----------------------------------------
    	      dtoEjercioM.setAll("Extensi�n de triceps en polea alta","De pie, utilizando un equipo con polea, se colocan las manos  en pronaci�n (con las palmas hacia abajo), sosteniendo firmemente la barra recta que se utiliza para el  equipo de polea. Las manos estar�n en l�nea recta  o ligeramente  por adentro de los hombros y se formar� un �ngulo de 90 grados entre el brazo y  el antebrazo. Luego se extender�n los brazos con el consiguiente  movimiento hacia abajo hasta casi tocarse los muslos con la barra. Finalmente, flexionas los  brazos hasta llevarlos a la posici�n inicial.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 12-----------------------------------------
    	      dtoEjercioM.setAll("Press Franc�s","Acostado, se sostiene una barra con pesos por arriba del  pecho colocando las manos aproximadamente en l�nea recta a los lados de la cara (agarre cerrado).  Luego se elevar� la  barra  hasta   tener  ambos brazos extendidos y posteriormente se descender� la barra a  su posici�n inicial. Se trabaja sobre todo la regi�n lateral del tr�ceps.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 13-----------------------------------------
    	      dtoEjercioM.setAll("Extensi�n alternada de antebrazos con mancuernas","Primero coloca tu rodilla y tu mano sobre un banco y coge una mancuerna con tu otra mano, con la palma apuntando hacia tu cuerpo, y la parte superior de tu brazo paralela a tu cuerpo. Luego empuja la mancuerna hacia atr�s mediante la extensi�n de tu codo y perm�tele retornar lentamente luego de una breve pausa. Es importante mantener firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 14-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps Acostado","Recu�state de espalda sobre un banco y sujeta una mancuerna en cada mano, con las palmas apuntando hacia arriba, y las partes superiores de tus brazos apuntando al techo. Eleva las mancuernas mediante la extensi�n de tus codos y luego de una breve pausa, perm�teles retornar al punto de partida. Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 15-----------------------------------------
    	      dtoEjercioM.setAll("Prensa en Banco para Tr�ceps","Recu�state de espalda sobre un banco y sujeta las mancuernas a los costados de tu cuerpo, justo por encima de tu pecho, con las palmas apuntando una a otra. Empuja las mancuernas hacia arriba hasta que tus brazos est�n casi totalmente extendidos y luego de una breve pausa b�jalas. Exhala al empujar las mancuernas hacia arriba e inhala al bajarlas.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 16-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps Inclinado, A Un Brazo","Si�ntate, ag�chate hacia adelante y sujeta una mancuerna con una mano, con tu codo formando un �ngulo de 90 grados y la palma apuntando hacia tu cuerpo. Eleva la mancuerna con una mano hasta que tu brazo est� paralelo al suelo y luego de una breve pausa lentamente b�jala. Luego de cada serie ve alternando el brazo. Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 17-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps Sentado","Si�ntate y sujeta una mancuerna con ambas manos, detr�s de tu cabeza, con los codos formando �ngulos de 90 grados y las partes superiores de los brazos hacia arriba en forma recta. Eleva la mancuerna con ambas manos hasta que tus brazos est�n casi totalmente extendidos y luego de una breve pausa b�jala lentamente. Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 18-----------------------------------------
    	      dtoEjercioM.setAll("Patada de Burro de Tr�ceps","Coloca tu rodilla y tu mano sobre un banco y coge una mancuerna con tu otra mano, con la palma apuntando hacia tu cuerpo, y la parte superior de tu brazo paralela a tu cuerpo. Empuja la mancuerna hacia atr�s mediante la extensi�n de tu codo y perm�tele retornar lentamente luego de una breve pausa.  Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 19-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps, A Un Brazo","Ponte de pie y sujeta una mancuerna con una mano, detr�s de tu cabeza, con el codo formando un �ngulo de 90 grados, y la parte superior del brazo apuntando hacia arriba en forma recta. Eleva la mancuerna con una mano hasta que tu brazo est� casi totalmente extendido y luego de una breve pausa b�jala lentamente. Luego de cada serie ve alternando el brazo. Mant�n firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 20-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tr�ceps, A Dos Brazos","Ponte de pie y sujeta una mancuerna con ambas manos, detr�s de tu cabeza, con las partes superiores de los brazos apuntando hacia arriba en forma recta. Eleva la mancuerna hacia arriba mediante la flexi�n de tus codos y luego de una breve pausa b�jala lentamente. Las partes superiores de tus brazos deben permanecer firmes durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 21-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps, Una a la Vez","Sujeta una mancuerna en cada mano, con las palmas apuntando hacia adelante. Con un brazo a la vez, eleva una mancuerna mediante la flexi�n de tu codo y b�jala luego de una breve pausa. Alterna las manos luego de que el movimiento est� finalizado","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 22-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Alternadas","Ponte de pie y sujeta una mancuerna con cada mano, a los costados de tu cuerpo, con las palmas apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 23-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones Martillo","Coge una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas apuntando hacia tu cuerpo.  Eleva ambas mancuernas mediante la flexi�n de tus codos y b�jalas luego de una breve pausa. Mant�n quieta la parte superior de tus brazos durante todo el movimiento.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 24-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Sentado, Alternadas","Si�ntate sobre un banco y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 25-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Inclinado, Alternadas","Si�ntate sobre un banco inclinado y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra.  Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 26-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Inclinado, Alternadas","Si�ntate sobre un banco inclinado y sujeta una mancuerna con cada mano, con las palmas de tu mano apuntando una hacia otra.  Eleva ambas mancuernas hasta que alcancen la altura de tus hombros y luego de una breve pausa, b�jalas lentamente.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 27-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Concentradas","P�rate detr�s de un banco inclinado y apoya un brazo sobre el respaldo, mientras sujetas una mancuerna, con la palma apuntando hacia adelante. Eleva la mancuerna hacia tu hombro y b�jala luego de una breve pausa. Durante el ejercicio, s�lo debes mover la parte inferior de tu brazo.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 28-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Interior, Sentado","Si�ntate sobre un banco y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva ambas mancuernas hasta que alcancen la altura de tus hombros y luego de una breve pausa, b�jalas lentamente.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 29-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones Concentradas, Sentado","Si�ntate sobre un banco, apoya un brazo en tu muslo y sujeta por lo bajo una mancuerna con esa mano, entre tus piernas, con la palma apuntando hacia la otra pierna. Eleva la mancuerna hasta que alcance tu hombro y lentamente b�jala luego de una breve pausa. Luego de finalizar la serie, cambia de brazo.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 30-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones con Mancuernas Aisladas, Sentado","Si�ntate sobre uno de los extremos del banco, sujeta una mancuerna con tu mano y apoya el codo (extendido) de dicha mano sobre el frente de tu muslo.   Eleva una mancuerna hasta que alcance la altura de tus hombros y lentamente b�jala luego de una breve pausa. Luego de finalizar la serie, cambia de brazo.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 31-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps � Scott (Empu�adura Supinadora)","Coloca la parte superior de uno de tus brazos sobre la almohadilla, la otra en un �ngulo de 90 grados, y coge una mancuerna con cada mano, con las palmas apuntando hacia arriba.  Eleva las mancuernas alternadamente, hasta que tus antebrazos est�n paralelos al suelo, y luego de una breve pausa, b�jalas alternadamente.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 32-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Alternadas en Banco","Recu�state boca abajo sobre un banco elevado, y sujeta una mancuerna con cada mano, en l�nea recta por debajo de tus hombros. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 33-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Supinadoras","Recu�state de espalda sobre un banco y sujeta una mancuerna con cada mano hacia cada lado de tu cuerpo, por debajo de la altura del cuerpo, con las palmas apuntando hacia arriba.  Eleva las mancuernas hasta que alcancen la altura de tu cuerpo y lentamente b�jalas luego de una breve pausa. Exhala en el momento de levantar las cargas e inhala al bajarlas.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 34-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps, Una a la Vez","Sujeta una mancuerna en cada mano, con las palmas apuntando hacia adelante. Con un brazo a la vez, eleva una mancuerna mediante la flexi�n de tu codo y b�jala luego de una breve pausa. Alterna las manos luego de que el movimiento est� finalizado","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 35-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Alternadas","Ponte de pie y sujeta una mancuerna con cada mano, a los costados de tu cuerpo, con las palmas apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 36-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones Martillo","Coge una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas apuntando hacia tu cuerpo. Eleva ambas mancuernas mediante la flexi�n de tus codos y b�jalas luego de una breve pausa. Mant�n quieta la parte superior de tus brazos durante todo el movimiento.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 37-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Sentado, Alternadas","Si�ntate sobre un banco y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 38-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Inclinado, Alternadas","Si�ntate sobre un banco inclinado y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 39-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Inclinado, Alternadas","Si�ntate sobre un banco inclinado y sujeta una mancuerna con cada mano, con las palmas de tu mano apuntando una hacia otra. Eleva ambas mancuernas hasta que alcancen la altura de tus hombros y luego de una breve pausa, b�jalas lentamente.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 40-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Concentradas","P�rate detr�s de un banco inclinado y apoya un brazo sobre el respaldo, mientras sujetas una mancuerna, con la palma apuntando hacia adelante.  Eleva la mancuerna hacia tu hombro y b�jala luego de una breve pausa. Durante el ejercicio, s�lo debes mover la parte inferior de tu brazo.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 41-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Interior, Sentado","Si�ntate sobre un banco y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva ambas mancuernas hasta que alcancen la altura de tus hombros y luego de una breve pausa, b�jalas lentamente.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 42-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones Concentradas, Sentado","Si�ntate sobre un banco, apoya un brazo en tu muslo y sujeta por lo bajo una mancuerna con esa mano, entre tus piernas, con la palma apuntando hacia la otra pierna. Eleva la mancuerna hasta que alcance tu hombro y lentamente b�jala luego de una breve pausa. Luego de finalizar la serie, cambia de brazo.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 43-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones con Mancuernas Aisladas, Sentado","Si�ntate sobre uno de los extremos del banco, sujeta una mancuerna con tu mano y apoya el codo (extendido) de dicha mano sobre el frente de tu muslo. Eleva una mancuerna hasta que alcance la altura de tus hombros y lentamente b�jala luego de una breve pausa. Luego de finalizar la serie, cambia de brazo.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 44-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps � Scott (Empu�adura Supinadora)","Coloca la parte superior de uno de tus brazos sobre la almohadilla, la otra en un �ngulo de 90 grados, y coge una mancuerna con cada mano, con las palmas apuntando hacia arriba.  Eleva las mancuernas alternadamente, hasta que tus antebrazos est�n paralelos al suelo, y luego de una breve pausa, b�jalas alternadamente.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 45-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Alternadas en Banco","Recu�state boca abajo sobre un banco elevado, y sujeta una mancuerna con cada mano, en l�nea recta por debajo de tus hombros. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 46-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de B�ceps Supinadoras","Recu�state de espalda sobre un banco y sujeta una mancuerna con cada mano hacia cada lado de tu cuerpo, por debajo de la altura del cuerpo, con las palmas apuntando hacia arriba. Eleva las mancuernas hasta que alcancen la altura de tu cuerpo y lentamente b�jalas luego de una breve pausa. Exhala en el momento de levantar las cargas e inhala al bajarlas.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 47-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco","Recu�state de espalda sobre un banco y sujeta 2 mancuernas al nivel del pecho, a los lados del cuerpo, con las palmas apuntando hacia tus pies. Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y b�jalas lentamente luego de una breve pausa. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 48-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco (Empu�adura Neutral)","Recu�state de espalda sobre un banco y sujeta 2 mancuernas al nivel del pecho, a los lados del cuerpo, con las palmas apuntando una hacia otra. Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y b�jalas lentamente luego de una breve pausa.   Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 49-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco - Inclinada","Recu�state de espalda sobre un banco inclinado y sujeta 2 mancuernas al nivel del pecho, a los lados del cuerpo, con las palmas apuntando hacia adelante. Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y b�jalas lentamente luego de una breve pausa. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 50-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco - Inclinada (Empu�adura Neutral)","Recu�state de espalda sobre un banco inclinado y sujeta dos mancuernas al nivel del pecho, a los lados del cuerpo, con las palmas apuntando una hacia otra.  Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y b�jalas lentamente luego de una breve pausa.  Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 51-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco - Declinada","Recu�state de espalda sobre un banco declinado y sujeta dos mancuernas al nivel del pecho, con las palmas apuntando hacia adelante.  Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y b�jalas lentamente luego de una breve pausa. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 52-----------------------------------------
    	      dtoEjercioM.setAll("Apertura - Recostado","Recu�state de espalda sobre el banco y coge una mancuerna con cada mano a la altura del cuerpo, con tus codos ligeramente arqueados. Eleva las mancuernas hasta que est�n lado a lado por encima de tu cuerpo y luego de una breve pausa b�jalas lentamente. Intenta mantener el mismo �ngulo en tus codos durante todo el movimiento.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 53-----------------------------------------
    	      dtoEjercioM.setAll("Apertura - Inclinada","Recu�state de espalda sobre un banco inclinado y coge una mancuerna con cada mano a la altura del cuerpo, con tus codos ligeramente arqueados. Eleva las mancuernas hasta que est�n lado a lado por encima de tu cuerpo y luego de una breve pausa b�jalas lentamente. Intenta mantener el mismo �ngulo en tus codos durante todo el movimiento.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 54-----------------------------------------
    	      dtoEjercioM.setAll("Pullover � Brazos Rectos","Recu�state de espalda sobre uno de los extremos del banco y sujeta una mancuerna con ambas manos por sobre el �rea de tu pecho, con los brazos extendidos. Eleva la mancuerna hacia arriba en forma recta, hasta que tus brazos est�n perpendiculares al suelo y b�jala nuevamente luego de una breve pausa. Mant�n tus brazos extendidos a lo largo de todo el movimiento, conservando el �ngulo de tus codos.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 55-----------------------------------------
    	      dtoEjercioM.setAll("Pullover � Brazos Flexionados","Recu�state de espalda sobre uno de los extremos del banco y sujeta dos mancuernas por debajo del nivel de tu cabeza, con los codos formando un �ngulo de 90 grados. Eleva ambas mancuernas hasta que est�n pr�ximas a tu pecho, mientras mantienes un �ngulo de 90 grados en tus codos, y luego de una breve pausa b�jalas nuevamente. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 56-----------------------------------------
    	      dtoEjercioM.setAll("Press de pecho plano con mancuernas","T�mbate boca arriba con las rodillas dobladas y una mancuerna en cada mano. Baja las mancuernas a la altura de los hombros con las palmas mirando hacia el frente. Extiende los brazos hacia el techo.  Baja las mancuernas hasta que toques el suelo con los codos. Vuelve a subir los brazos hasta la posici�n inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 57-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones","Ponte de rodillas con las manos apoyadas en el suelo.  Las manos deben estar ligeramente m�s separadas que los hombros. Dobla los codos y baja el pecho hacia el suelo. Vuelve a extender los brazos sin estirar del todo los codos.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 58-----------------------------------------
    	      dtoEjercioM.setAll("Apertura con mancuernas plana  sobre bal�n de estabilidad","Coloca el bal�n de estabilidad contra la pared para que quede firme y ap�yate encima.  Coge una mancuerna en cada mano con las palmas mir�ndose entre s�.  Sube los brazos hasta que se toquen las mancuernas pero no estires del todo los codos. Esta es la posici�n inicial. Abre los brazos hacia los lados hasta que las mancuernas queden a la altura de los hombros. Vuelve a la posici�n inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 59-----------------------------------------
    	      dtoEjercioM.setAll("Extensi�n en el bal�n de estabilidad","Recu�state boca arriba en el bal�n de estabilidad con las rodillas en �ngulo. Coge una mancuerna en cada mano y levanta los brazos hacia el techo con las palmas mirando hacia el frente. Esta es la posici�n inicial. Luego pasa los brazos sobre la cabeza manteni�ndolos rectos. Vuelve a la posici�n inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 60-----------------------------------------
    	      dtoEjercioM.setAll("Press Franc�s con mancuernas  inclinadas en bal�n de estabilidad","Recu�state boca arriba en el bal�n de estabilidad con las rodillas en �ngulo.Coge una mancuerna en cada mano y levanta los brazos hacia el techo con las palmas mirando hacia el frente. Esta es la posici�n inicial. Luego pasa los brazos sobre la cabeza manteni�ndolos rectos.Vuelve a la posici�n inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 61-----------------------------------------
    	      dtoEjercioM.setAll("Apertura con mancuernas inclinadas sobre el bal�n de estabilidad","Recu�state en el bal�n de estabilidad apoyando la cabeza y los hombros, y coloca las rodillas en �ngulo. Luego coge una mancuerna en cada mano y sube los brazos con las palmas mir�ndose entre s�. Esta es la posici�n inicial. Mant�n los codos ligeramente doblados y abre los brazos hasta que las mancuernas te queden a la altura de los hombros. Finalmente vuelve a la posici�n inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 62-----------------------------------------
    	      dtoEjercioM.setAll("Apertura - Inclinada","Recu�state de espalda sobre un banco inclinado y coge una mancuerna con cada mano a la altura del cuerpo, con tus codos ligeramente arqueados. Eleva las mancuernas hasta que est�n lado a lado por encima de tu cuerpo y luego de una breve pausa b�jalas lentamente.  Intenta mantener el mismo �ngulo en tus codos durante todo el movimiento.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 63-----------------------------------------
    	      dtoEjercioM.setAll("Pullover � Brazos Rectos","Recu�state de espalda sobre uno de los extremos del banco y sujeta una mancuerna con ambas manos por sobre el �rea de tu pecho, con los brazos extendidos. Eleva la mancuerna hacia arriba en forma recta, hasta que tus brazos est�n perpendiculares al suelo y b�jala nuevamente luego de una breve pausa. Mant�n tus brazos extendidos a lo largo de todo el movimiento, conservando el �ngulo de tus codos.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 64-----------------------------------------
    	      dtoEjercioM.setAll("Pullover � Brazos Flexionados","Recu�state de espalda sobre uno de los extremos del banco y sujeta dos mancuernas por debajo del nivel de tu cabeza, con los codos formando un �ngulo de 90 grados.  Eleva ambas mancuernas hasta que est�n pr�ximas a tu pecho, mientras mantienes un �ngulo de 90 grados en tus codos, y luego de una breve pausa b�jalas nuevamente. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 65-----------------------------------------
    	      dtoEjercioM.setAll("Sentadilla con barra","Este ejercicio se realiza mejor dentro de una jaula de sentadillas con fines de seguridad. Para empezar, en primer lugar puesto el list�n en un estante hasta justo por debajo del nivel del hombro. Una vez elegida la altura correcta y la barra se carga, paso bajo la barra y coloque la parte posterior de los hombros (ligeramente por debajo del cuello) a trav�s de ella.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 66-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de pierna","Aferrarse a la barra utilizando ambos brazos a cada lado y levantarlo de la rejilla por primera empujando con las piernas y, al mismo tiempo de enderezar su torso.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 67-----------------------------------------
    	      dtoEjercioM.setAll("Peso muerto Rumano","Al�jese de la cremallera y la posici�n de sus piernas usando un ancho de hombros posici�n media con los dedos de los pies ligeramente se�al�. Mantenga la cabeza en alto en todo momento y tambi�n mantener la espalda recta. Esta ser� su posici�n inicial. ( Nota: A los efectos de este an�lisis, utilizaremos la postura medio descrito anteriormente que se enfoca en el desarrollo general, sin embargo se puede elegir cualquiera de las tres posiciones debatidas en el pie secci�n posturas).","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 68-----------------------------------------
    	      dtoEjercioM.setAll("Flexi�n de Pierna Sentada","Comienza a bajar lentamente la barra doblando las rodillas y las caderas como a mantener una postura erguida, con la cabeza hacia arriba. Continuar hacia abajo hasta que el �ngulo entre la pata superior y los terneros se convierte en ligeramente menos de 90 grados. Inhale a medida que realiza esta parte del movimiento.Consejo: Si ha realizado el ejercicio correctamente, la parte delantera de las rodillas debe hacer una l�nea recta imaginaria con los dedos de los pies que es perpendicular a la parte delantera. Si sus rodillas est�n m�s all� de esa l�nea imaginaria (si est�n m�s all� de sus dedos del pie), entonces usted est� poniendo la tensi�n indebida en la rodilla y el ejercicio se ha realizado de forma incorrecta.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 69-----------------------------------------
    	      dtoEjercioM.setAll("Flexi�n de pierna de pi�","Comenzar a subir el list�n a medida que exhala empujando el suelo con el tal�n de su pie mientras estira las piernas de nuevo y vuelve a la posici�n inicial.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 70-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Piernas","Repita el procedimiento para la cantidad recomendada de repeticiones","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 71-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n de pantorrilla sentada","Repita el procedimiento para la cantidad recomendada de repeticiones.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 72-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n de caderas","Un gran ejercicio para principiantes y expertos por igual. Los puentes, junto con las tablillas, son herramientas simples pero efectivas para aumentar y mantener la fuerza de los m�sculos centrales. Pasos: Recu�stese boca arriba con las rodillas flexionadas y los pies apoyados sobre el suelo. Levante las caderas del suelo mientras contrae abdomen y gl�teos.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 73-----------------------------------------
    	      dtoEjercioM.setAll("Flexi�n de Pierna Sentada","Se trata de un ejercicio cl�sico para las piernas y para la parte inferior del cuerpo que presenta muchas variantes, esta es la versi�n b�sica. Pasos: Comience colocando una barra sobre la parte superior de su espalda, utilice un agarre ligeramente m�s abierto que el ancho de sus hombros. P�ngase de pie con los pies separados aproximadamente 20 cm., con los dedos hacia el frente. D� un paso adelante (60-90 cm.), manteniendo el abdomen contra�do y el torso recto. Lentamente, baje una rodilla como si se arrodillara, mientras mantiene la otra rodilla doblada a un �ngulo de 90 grados. No deje que su rodilla toque el suelo. Baje su cuerpo hasta colocarlo por encima del suelo y sost�ngalo por un momento antes de volver a la posici�n inicial. Consejos: No presione su cuerpo sobre su rodilla durante el ejercicio. La rodilla que inclina hacia adelante no debe rebasar la punta de ese pie.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 74-----------------------------------------
    	      dtoEjercioM.setAll("Flexi�n de pierna de pi�","Es el ejercicio preferido para cualquiera que desee reafirmar sus gluteos. Pasos: De pie frente a un aparato de cable sujete una tobillera a una polea baja. De frente hacia la columna de pesos, flexionando ligeramente las rodillas y con el abdomen contra�do, empuje su tobillo lentamente hacia atr�s y arqu�elo lo m�s alto que le sea posible. Vuelva a la posici�n inicial y cambie de tobillo.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 75-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Piernas","Este ejercicio trabaja y desarrolla los m�sculos internos del muslo. Pasos:Si�ntese en el aparato y coloque sus rodillas contra las almohadillas. Contraiga su abdomen y aduzca o empuje sus muslos contra las almohadillas y j�ntelas. Vuelva lentamente a la posici�n inicial y repita. Consejos: Para mejores resultados, mantenga el mismo nivel de resistencia a lo largo del ejercicio.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 76-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n de pantorrilla sentada","Este ejercicio trabaja y desarrolla los m�sculos externos del muslo. Pasos: Si�ntese en el aparato y coloque sus rodillas contra las almohadillas. Contraiga el abdomen y abduzca o separe sus muslos contra las almohadillas. Vuelva lentamente a la posici�n inicial y repita. Consejos: Para mejores resultados, mantenga el mismo nivel de resistencia a lo largo del ejercicio.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 77-----------------------------------------
    	      dtoEjercioM.setAll("Sentadilla con barra","Las sentadillas con barra son uno de los ejercicios m�s potentes, usado para aumentar la masa muscular y fortalecer los cu�driceps. Pasos: A menos que est� haciendo sentadillas con muy poco peso, le recomendamos utilizar un soporte para sentadillas que le ayude con este ejercicio. Comience por establecer el peso deseado en la barra sobre el soporte para sentadillas. Coloque la barra de tal forma que descanse sobre su trapecio, luego lev�ntela del soporte. Mantenga su cabeza mirando ligeramente hacia arriba. Ahora flexione sus rodillas y empuje hacia atr�s sus caderas. Mantenga su espalda recta mientras baja su cuerpo. Contin�e hasta que sus cu�driceps queden paralelos al suelo. Mantenga la posici�n baja por un momento, despu�s levante su cuerpo otra vez. Una repetici�n termina cuando se pone de pie nuevamente. Consejos: Mantenga su cabeza mirando ligeramente hacia arriba. Esto le ayudar� a evitar arquear su espalda. Mantenga su abdomen contra�do para aliviar la presi�n de su espalda. Antes de comenzar a usar un peso mayor, aseg�rese de que su espalda sea lo suficientemente fuerte para resistir la presi�n. Realice pesos muertos y supermans. Si siente dolor en su espalda despu�s de hacer sentadillas, deje de hacerlas inmediatamente. Despu�s de que su espalda se haya recuperado, utilice un peso menor. No olvide respirar.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 78-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de pierna","Junto con las sentadillas, este ejercicio es crucial para desarrollar y fortalecer las piernas. Pasos: Ajuste el asiento de la m�quina de tal forma que sus pies alcancen c�modamente el travesa�o, con las rodillas ligeramente flexionadas. Para comenzar, presione sus pies hacia adelante a la distancia del ancho de sus hombros y suelte los seguros. Baje lentamente el peso hacia su cuerpo, manteniendo su abdomen contra�do y mueva sus rodillas en la misma direcci�n que sus pies a un �ngulo de 90 grados. Consejos: No trabe sus rodillas ni rebote el peso.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 79-----------------------------------------
    	      dtoEjercioM.setAll("Peso muerto Rumano","Este ejercicio es similar al peso muerto normal, pero en este caso las piernas se mantienen rectas y la barra se lleva hasta el suelo en cada repetici�n. Pasos: Coloque la barra en el suelo frente a sus pies. Sujete la barra con un agarre un poco m�s abierto que el ancho de sus hombros. Flexione las rodillas ligeramente, manteniendo las caderas y la espalda rectas. Levante la barra hacia arriba y conc�ntrese en usar sus caderas al ponerse de pie. Cuando se encuentre de pie, la barra debe descansar contra sus muslos. Baje la barra al suelo con una ligera flexi�n en sus rodillas y flexione sus caderas hacia atr�s para tener estabilidad. Consejos: Use poco peso para acostumbrarse a este ejercicio. Mantenga sus brazos rectos durante todo el ejercicio.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 80-----------------------------------------
    	      dtoEjercioM.setAll("Flexi�n de Pierna Sentada","Esta es otra alternativa a las flexiones de pierna acostadas para fortalecer los tendones de la corva (los m�sculos en la parte posterior de los muslos). Pasos: Ajuste el aparato de forma que la almohadilla quede apenas sobre sus talones. Si�ntese con la espalda recta, el abdomen contra�do y las piernas al frente. Flexione lentamente sus piernas hacia usted y sost�ngalas por un momento. Regrese a la posici�n inicial con un movimiento controlado. Consejos: No balancee el peso, ni lo mueva demasiado r�pido durante el ejercicio.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 81-----------------------------------------
    	      dtoEjercioM.setAll("Flexi�n de pierna de pi�","Este ejercicio trabaja los tendones de la corva, los m�sculos en la parte posterior del muslo. Pasos: De pie en un aparato para flexi�n de pierna, ajuste la almohadilla posterior de forma que quede apenas sobre su tobillo. Tome los mangos del aparato como soporte y contraiga su abdomen. Lentamente levante su pie hacia su espalda. Regrese a la posici�n inicial y cambie de pierna. Consejos: Mantenga su espalda recta a lo largo de este ejercicio. Realice este ejercicio con un movimiento lento y controlado.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 82-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Piernas","Este ejercicio es b�sico para lograr piernas fuertes. Pasos: Ajuste el asiento de tal forma que sus rodillas un rango completo de movimiento y la almohadilla se ajuste sobre sus piernas, justo sobre sus tobillos. Tome los mangos con sus manos para apoyarse, manteniendo su cadera y espalda contra el banco. Lentamente extienda las piernas hasta que sus rodillas est�n rectas. No trabe sus rodillas. Sost�ngalas por un momento y despu�s, con movimientos controlados, regrese a la posici�n inicial. Consejos: Para este ejercicio, utilice movimientos controlados. No balancee el peso hacia arriba.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 83-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n de pantorrilla sentada","Este es uno de los ejercicios m�s simples y m�s efectivos para las pantorrillas. Pasos: Si�ntese en un aparato de elevaci�n de pantorrillas. Coloque las bolas de los pies en la almohadilla para pies. Coloque sus muslos bajo la almohadilla para piernas sobre sus rodillas. Tome la barra y lentamente suba los pies tanto como sea posible. Det�ngase por un momento y luego regrese a la posici�n inicial. Consejos: Practique este ejercicio con movimientos lentos y precisos.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 84-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n de caderas","Un gran ejercicio para principiantes y expertos por igual. Los puentes, junto con las tablillas, son herramientas simples pero efectivas para aumentar y mantener la fuerza de los m�sculos centrales. Pasos: Recu�stese boca arriba con las rodillas flexionadas y los pies apoyados sobre el suelo. Levante las caderas del suelo mientras contrae abdomen y gl�teos.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 85-----------------------------------------
    	      dtoEjercioM.setAll("Flexi�n de pierna sentada","Se trata de un ejercicio cl�sico para las piernas y para la parte inferior del cuerpo que presenta muchas variantes, esta es la versi�n b�sica. Pasos: Comience colocando una barra sobre la parte superior de su espalda, utilice un agarre ligeramente m�s abierto que el ancho de sus hombros. P�ngase de pie con los pies separados aproximadamente 20 cm., con los dedos hacia el frente. D� un paso adelante (60-90 cm.), manteniendo el abdomen contra�do y el torso recto. Lentamente, baje una rodilla como si se arrodillara, mientras mantiene la otra rodilla doblada a un �ngulo de 90 grados. No deje que su rodilla toque el suelo. Baje su cuerpo hasta colocarlo por encima del suelo y sost�ngalo por un momento antes de volver a la posici�n inicial. Consejos: No presione su cuerpo sobre su rodilla durante el ejercicio. La rodilla que inclina hacia adelante no debe rebasar la punta de ese pie.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 86-----------------------------------------
    	      dtoEjercioM.setAll("Flexi�n de pierna de pi�","Es el ejercicio preferido para cualquiera que desee reafirmar sus gluteos. Pasos: De pie frente a un aparato de cable sujete una tobillera a una polea baja. De frente hacia la columna de pesos, flexionando ligeramente las rodillas y con el abdomen contra�do, empuje su tobillo lentamente hacia atr�s y arqu�elo lo m�s alto que le sea posible. Vuelva a la posici�n inicial y cambie de tobillo.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 87-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Piernas","Este ejercicio trabaja y desarrolla los m�sculos internos del muslo. Pasos:Si�ntese en el aparato y coloque sus rodillas contra las almohadillas. Contraiga su abdomen y aduzca o empuje sus muslos contra las almohadillas y j�ntelas. Vuelva lentamente a la posici�n inicial y repita. Consejos: Para mejores resultados, mantenga el mismo nivel de resistencia a lo largo del ejercicio.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 88-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n de pantorrilla sentada","Este ejercicio trabaja y desarrolla los m�sculos externos del muslo. Pasos: Si�ntese en el aparato y coloque sus rodillas contra las almohadillas. Contraiga el abdomen y abduzca o separe sus muslos contra las almohadillas. Vuelva lentamente a la posici�n inicial y repita. Consejos: Para mejores resultados, mantenga el mismo nivel de resistencia a lo largo del ejercicio.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 89-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n frontal con cable","La elevaci�n frontal con cable trabaja los m�sculos frontales de los hombros para mejorar todo el movimiento de su brazo y ayudarle en la vida cotidiana. Se sentir� mejor con hombros desarrollados. Pasos: Primero ate una agarradera al aparato de cable. Sostenga la agarradera del cable con un agarre frontal. Mantenga su abdomen contra�do. Con sus brazos relativamente rectos, con s�lo una leve flexi�n en sus codos y las rodillas ligeramente flexionadas, levante el brazo a la altura de los hombros. Sostenga la posici�n brevemente, despu�s baje de forma controlada. Consejos: Aseg�rese de mantener su abdomen contra�do para dar soporte a su espalda. Por m�s tentador que sea, no doble su espalda para ayudarse a levantar el peso. Tambi�n tenga cuidado de no trabar sus codos.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 90-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n lateral","La elevaci�n lateral con mancuernas le ayudar� a lograr hombros fuertes y mejorar su definici�n. Pasos: De pie con los pies separados el ancho de sus hombros y el abdomen contra�do, sostenga una mancuerna en cada mano con las palmas hacia el cuerpo. Mantenga las rodillas ligeramente flexionadas mientras levanta sus brazos hacia los lados hasta que sus palmas apunten al suelo. Sostenga esta posici�n brevemente, luego baje lentamente. Consejos: Trate de sentir que gu�a el movimiento con los codos y mantenga las mu�ecas debajo de los codos. Resista la tentaci�n de balancear las mancuernas. Sus hombros deben hacer la elevaci�n, no la inercia.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 91-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n lateral inclinada con polea baja","La elevaci�n lateral inclinada con cable es un buen ejercicio para trabajar sus deltoides posteriores. El aparato de cable ofrece una resistencia m�s constante que la elevaci�n inclinada con mancuerna. Pasos: En primer lugar, ajuste una agarradera al aparato de cable. P�ngase de pie frente al aparato. Doble sus rodillas y cadera para lograr la posici�n inclinada. No flexione su espalda. De lado, usted debe verse como el s�mbolo de un rayo. Sostenga la agarradera del cable con el brazo m�s alejado del aparato. Su brazo debe cruzar frente a su cuerpo. Levante su brazo frente a su cuerpo y hacia el lado. Contin�e hasta nivelar su brazo con el suelo. Mantenga la posici�n m�s alta por un segundo y luego baje su brazo otra vez y vuelva a la posici�n inicial.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 92-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n lateral sentada con cable","Esta es una variante interesante de la elevaci�n lateral est�ndar. Pasos: Coloque un banco entre 2 aparatos de cable. Sujete la agarradera de los aparatos de cable de forma que los brazos se crucen detr�s de su espalda. Sostenga la agarradera de la polea izquierda con su mano derecha y viceversa. Si�ntese en un banco con los pies al frente y sus brazos cruzados bajo los muslos. Incl�nese hacia adelante hasta que su pecho toque sus rodillas o quede justo sobre ellas. Lentamente tire de sus brazos hacia los lados. Inicie el movimiento con sus codos y conc�ntrese en usar sus hombros para hacer la elevaci�n. Levante los brazos hasta dejarlos paralelos al suelo. Mantenga esta posici�n por un momento, luego baje sus brazos a la posici�n inicial.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 93-----------------------------------------
    	      dtoEjercioM.setAll("Prensa Arnold con mancuerna","La prensa Arnold es una variante de una prensa militar est�ndar que permite trabajar el manguito rotador. Trabaja tanto sus deltoides frontales como los laterales. Pasos: Si�ntese en un banco plano con los pies apuntando hacia el frente y su abdomen contra�do. Con un agarre invertido, tome una mancuerna en cada mano con los codos flexionados y con las palmas una frente a la otra debajo del nivel de los hombros. Con un movimiento controlado y constante, levante las mancuernas mientras rota sus hombros y gira sus pulgares hasta que se encuentren uno frente al otro. Usando un movimiento controlado, baje las mancuernas en sentido contrario hasta volver a la posici�n inicial. Consejos: Evite hacer la prensa Arnold en caso de experimentar dolor en los hombros. Los principiantes deben hacer este ejercicio con poco peso hasta dominar la postura correcta. Para la mayor�a de las personas, el manguito rotador es un conjunto subutilizado. Usar poco peso mientras domina la prensa Arnold le ayudar� a evitar lesiones.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 94-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de hombro (militar) en aparato","El aparato de prensa de hombro trabaja principalmente los deltoides, pero tambi�n involucra a los m�sculos circundantes. Trabajar todos los m�sculos del hombro al mismo tiempo ayuda a prevenir lesiones causadas por una descompensaci�n muscular. Pasos: Si�ntese con la espalda recta y el abdomen contra�do. Tome la barra con ambas manos. Con un movimiento suave, empuje la barra hacia arriba, extendiendo sus brazos. Det�ngase brevemente en la parte superior, despu�s baje sus brazos de la misma forma controlada. Consejos: Ajuste el asiento de forma que los mangos est�n nivelados con sus hombros mientras al sentarse con la espalda recta. No olvide mantener una buena postura, a pesar de estar sentado.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 95-----------------------------------------
    	      dtoEjercioM.setAll("Prensa hombro con mancuernas","La prensa de hombro con mancuernas es una variaci�n de la prensa militar est�ndar que se enfoca m�s en los m�sculos estabilizadores. Es bueno alternar entre las versiones con barra y mancuernas de este ejercicio. Pasos: Comience la prensa de hombro con mancuernas, sentado en un banco, con su abdomen contra�do y una mancuerna en cada mano. Sus palmas deben estar hacia el frente y sus manos a la altura de sus hombros. Extienda sus brazos para levantar las mancuernas hasta que sus brazos est�n derechos y el borde interno de cada mancuerna se encuentre por encima de su cabeza. Puede chocar las mancuernas si prefiere. Mantenga esta posici�n por un momento, luego baje y doble sus brazos lentamente. Contin�e hasta que sus manos est�n una vez m�s sobre el nivel de los hombros. Consejos: Aseg�rese de no trabar los codos en la posici�n superior de la prensa de hombro. Trabar los codos, especialmente cuando se usa m�s peso, puede causar lesiones extremadamente graves. Tambi�n puede realizar este ejercicio en una pelota de ejercicio.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 96-----------------------------------------
    	      dtoEjercioM.setAll("Prensa militar sentada con barra","Al igual que con la prensa de hombro sentada en aparato, este ejercicio trabaja principalmente los deltoides y tambi�n involucra a los m�sculos circundantes. Trabajar todos los m�sculos del hombro al mismo tiempo ayuda a prevenir lesiones causadas por la descompensaci�n m�scular. Pasos: Si�ntese en el banco con los dedos de los pies apuntando al frente, la espalda recta y el abdomen contra�do. Sostenga la barra con un agarre frontal (las palmas hacia fuera del cuerpo). Mantenga las manos separadas el ancho de sus hombros. La barra debe estar alineada con su barbilla. Empuje la barra hacia arriba extendiendo los brazos. Det�ngase brevemente en la parte superior y baje la barra de manera lenta y controlada a la posici�n inicial. Consejos: No debe hacer este ejercicio en caso de sentir cualquier tipo de dolor en los hombros. Tenga cuidado de no sobrextender su espalda. Si no puede hacer este ejercicio sin inclinarse hacia atr�s, entonces use menos peso. Este ejercicio tambi�n puede realizarse con mancuernas.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 97-----------------------------------------
    	      dtoEjercioM.setAll("Remo erguido con barra","El remo erguido con barra es un ejercicio de remo vertical est�ndar que trabaja sus trapecios y deltoides. Pasos: P�ngase de pie con la espalda recta y los pies separados el ancho de sus hombros. Sostenga la barra con un agarre frontal (las palmas hacia su cuerpo). No deje caer sus hombros. Incluso en esta posici�n inicial, la barra debe estar alineada con la parte inferior de su cadera. A continuaci�n, eleve la barra hacia su barbilla. Conc�ntrese en la contracci�n de sus hombros y trapecios. Levante la barra justo por encima de su clav�cula. Mantenga esta posici�n durante un momento y luego baje la barra lentamente a su posici�n inicial. Consejos: Si es posible, realice el remo erguido con barra usando un soporte. Podr� descansar su barra en el soporte y tomarla desde una altura m�s c�moda al iniciar. Es m�s seguro que tomar la barra del suelo. Mantener su abdomen contra�do le ayudar� a proteger su espalda durante el remo erguido. Mantenga una buena postura y mantenga sus mu�ecas rectas. El agarre al ancho de los hombros es ideal. Un agarre m�s cerrado trabajar� m�s los trapecios, pero lo har� m�s propenso a una lesi�n de hombro.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 98-----------------------------------------
    	      dtoEjercioM.setAll("Remo inclinado para deltoides posteriores","La ventaja de este ejercicio frente al remo para deltoides est�ndar, es que puede utilizar el banco para mantener el equilibrio y evitarse lesiones en la espalda. Pasos: P�ngase de pie frente a un banco inclinado sosteniendo un par de mancuernas. Flexione ligeramente sus rodillas y mantenga su abdomen contra�do. Ag�chese lentamente hasta que su frente toque la parte superior del banco. Sus brazos deben estar colgados y sus palmas una frente a la otra. Levante sus brazos lentamente hacia los lados. Para este ejercicio, conc�ntrese en usar la parte posterior de sus deltoides. Levante las mancuernas hasta que sus brazos queden paralelos al suelo. Mantenga esta posici�n por un momento, luego baje lentamente las mancuernas.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 99-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n frontal con cable","La elevaci�n frontal con cable trabaja los m�sculos frontales de los hombros para mejorar todo el movimiento de su brazo y ayudarle en la vida cotidiana. Se sentir� mejor con hombros desarrollados. Pasos: Primero ate una agarradera al aparato de cable. Sostenga la agarradera del cable con un agarre frontal. Mantenga su abdomen contra�do. Con sus brazos relativamente rectos, con s�lo una leve flexi�n en sus codos y las rodillas ligeramente flexionadas, levante el brazo a la altura de los hombros. Sostenga la posici�n brevemente, despu�s baje de forma controlada. Consejos: Aseg�rese de mantener su abdomen contra�do para dar soporte a su espalda. Por m�s tentador que sea, no doble su espalda para ayudarse a levantar el peso. Tambi�n tenga cuidado de no trabar sus codos.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 100-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n lateral","La elevaci�n lateral con mancuernas le ayudar� a lograr hombros fuertes y mejorar su definici�n. Pasos: De pie con los pies separados el ancho de sus hombros y el abdomen contra�do, sostenga una mancuerna en cada mano con las palmas hacia el cuerpo. Mantenga las rodillas ligeramente flexionadas mientras levanta sus brazos hacia los lados hasta que sus palmas apunten al suelo. Sostenga esta posici�n brevemente, luego baje lentamente. Consejos: Trate de sentir que gu�a el movimiento con los codos y mantenga las mu�ecas debajo de los codos. Resista la tentaci�n de balancear las mancuernas. Sus hombros deben hacer la elevaci�n, no la inercia.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 101-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n lateral inclinada con polea baja","La elevaci�n lateral inclinada con cable es un buen ejercicio para trabajar sus deltoides posteriores. El aparato de cable ofrece una resistencia m�s constante que la elevaci�n inclinada con mancuerna. Pasos: En primer lugar, ajuste una agarradera al aparato de cable. P�ngase de pie frente al aparato. Doble sus rodillas y cadera para lograr la posici�n inclinada. No flexione su espalda. De lado, usted debe verse como el s�mbolo de un rayo. Sostenga la agarradera del cable con el brazo m�s alejado del aparato. Su brazo debe cruzar frente a su cuerpo. Levante su brazo frente a su cuerpo y hacia el lado. Contin�e hasta nivelar su brazo con el suelo. Mantenga la posici�n m�s alta por un segundo y luego baje su brazo otra vez y vuelva a la posici�n inicial.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 102-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n lateral sentada con cable","Esta es una variante interesante de la elevaci�n lateral est�ndar. Pasos: Coloque un banco entre 2 aparatos de cable. Sujete la agarradera de los aparatos de cable de forma que los brazos se crucen detr�s de su espalda. Sostenga la agarradera de la polea izquierda con su mano derecha y viceversa. Si�ntese en un banco con los pies al frente y sus brazos cruzados bajo los muslos. Incl�nese hacia adelante hasta que su pecho toque sus rodillas o quede justo sobre ellas. Lentamente tire de sus brazos hacia los lados. Inicie el movimiento con sus codos y conc�ntrese en usar sus hombros para hacer la elevaci�n. Levante los brazos hasta dejarlos paralelos al suelo. Mantenga esta posici�n por un momento, luego baje sus brazos a la posici�n inicial.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 103-----------------------------------------
    	      dtoEjercioM.setAll("Prensa Arnold con mancuerna","La prensa Arnold es una variante de una prensa militar est�ndar que permite trabajar el manguito rotador. Trabaja tanto sus deltoides frontales como los laterales. Pasos: Si�ntese en un banco plano con los pies apuntando hacia el frente y su abdomen contra�do. Con un agarre invertido, tome una mancuerna en cada mano con los codos flexionados y con las palmas una frente a la otra debajo del nivel de los hombros. Con un movimiento controlado y constante, levante las mancuernas mientras rota sus hombros y gira sus pulgares hasta que se encuentren uno frente al otro. Usando un movimiento controlado, baje las mancuernas en sentido contrario hasta volver a la posici�n inicial. Consejos: Evite hacer la prensa Arnold en caso de experimentar dolor en los hombros. Los principiantes deben hacer este ejercicio con poco peso hasta dominar la postura correcta. Para la mayor�a de las personas, el manguito rotador es un conjunto subutilizado. Usar poco peso mientras domina la prensa Arnold le ayudar� a evitar lesiones.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 104-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de hombro (militar) en aparato","El aparato de prensa de hombro trabaja principalmente los deltoides, pero tambi�n involucra a los m�sculos circundantes. Trabajar todos los m�sculos del hombro al mismo tiempo ayuda a prevenir lesiones causadas por una descompensaci�n muscular. Pasos: Si�ntese con la espalda recta y el abdomen contra�do. Tome la barra con ambas manos. Con un movimiento suave, empuje la barra hacia arriba, extendiendo sus brazos. Det�ngase brevemente en la parte superior, despu�s baje sus brazos de la misma forma controlada. Consejos: Ajuste el asiento de forma que los mangos est�n nivelados con sus hombros mientras al sentarse con la espalda recta. No olvide mantener una buena postura, a pesar de estar sentado.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 105-----------------------------------------
    	      dtoEjercioM.setAll("Prensa hombro con mancuernas","La prensa de hombro con mancuernas es una variaci�n de la prensa militar est�ndar que se enfoca m�s en los m�sculos estabilizadores. Es bueno alternar entre las versiones con barra y mancuernas de este ejercicio. Pasos: Comience la prensa de hombro con mancuernas, sentado en un banco, con su abdomen contra�do y una mancuerna en cada mano. Sus palmas deben estar hacia el frente y sus manos a la altura de sus hombros. Extienda sus brazos para levantar las mancuernas hasta que sus brazos est�n derechos y el borde interno de cada mancuerna se encuentre por encima de su cabeza. Puede chocar las mancuernas si prefiere. Mantenga esta posici�n por un momento, luego baje y doble sus brazos lentamente. Contin�e hasta que sus manos est�n una vez m�s sobre el nivel de los hombros. Consejos: Aseg�rese de no trabar los codos en la posici�n superior de la prensa de hombro. Trabar los codos, especialmente cuando se usa m�s peso, puede causar lesiones extremadamente graves. Tambi�n puede realizar este ejercicio en una pelota de ejercicio.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 106-----------------------------------------
    	      dtoEjercioM.setAll("Prensa militar sentada con barra","Al igual que con la prensa de hombro sentada en aparato, este ejercicio trabaja principalmente los deltoides y tambi�n involucra a los m�sculos circundantes. Trabajar todos los m�sculos del hombro al mismo tiempo ayuda a prevenir lesiones causadas por la descompensaci�n m�scular. Pasos: Si�ntese en el banco con los dedos de los pies apuntando al frente, la espalda recta y el abdomen contra�do. Sostenga la barra con un agarre frontal (las palmas hacia fuera del cuerpo). Mantenga las manos separadas el ancho de sus hombros. La barra debe estar alineada con su barbilla. Empuje la barra hacia arriba extendiendo los brazos. Det�ngase brevemente en la parte superior y baje la barra de manera lenta y controlada a la posici�n inicial. Consejos: No debe hacer este ejercicio en caso de sentir cualquier tipo de dolor en los hombros. Tenga cuidado de no sobrextender su espalda. Si no puede hacer este ejercicio sin inclinarse hacia atr�s, entonces use menos peso. Este ejercicio tambi�n puede realizarse con mancuernas.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 107-----------------------------------------
    	      dtoEjercioM.setAll("Remo erguido con barra","El remo erguido con barra es un ejercicio de remo vertical est�ndar que trabaja sus trapecios y deltoides. Pasos: P�ngase de pie con la espalda recta y los pies separados el ancho de sus hombros. Sostenga la barra con un agarre frontal (las palmas hacia su cuerpo). No deje caer sus hombros. Incluso en esta posici�n inicial, la barra debe estar alineada con la parte inferior de su cadera. A continuaci�n, eleve la barra hacia su barbilla. Conc�ntrese en la contracci�n de sus hombros y trapecios. Levante la barra justo por encima de su clav�cula. Mantenga esta posici�n durante un momento y luego baje la barra lentamente a su posici�n inicial. Consejos: Si es posible, realice el remo erguido con barra usando un soporte. Podr� descansar su barra en el soporte y tomarla desde una altura m�s c�moda al iniciar. Es m�s seguro que tomar la barra del suelo. Mantener su abdomen contra�do le ayudar� a proteger su espalda durante el remo erguido. Mantenga una buena postura y mantenga sus mu�ecas rectas. El agarre al ancho de los hombros es ideal. Un agarre m�s cerrado trabajar� m�s los trapecios, pero lo har� m�s propenso a una lesi�n de hombro.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 108-----------------------------------------
    	      dtoEjercioM.setAll("Remo inclinado para deltoides posteriores","La ventaja de este ejercicio frente al remo para deltoides est�ndar, es que puede utilizar el banco para mantener el equilibrio y evitarse lesiones en la espalda. Pasos: P�ngase de pie frente a un banco inclinado sosteniendo un par de mancuernas. Flexione ligeramente sus rodillas y mantenga su abdomen contra�do. Ag�chese lentamente hasta que su frente toque la parte superior del banco. Sus brazos deben estar colgados y sus palmas una frente a la otra. Levante sus brazos lentamente hacia los lados. Para este ejercicio, conc�ntrese en usar la parte posterior de sus deltoides. Levante las mancuernas hasta que sus brazos queden paralelos al suelo. Mantenga esta posici�n por un momento, luego baje lentamente las mancuernas.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 109-----------------------------------------
    	      dtoEjercioM.setAll("Arrastre con barra en V","Este es otro ejercicio para esculpir el m�sculo dorsal ancho (los m�sculos de la espalda). Pasos: Sujete una barra en V a la polea de arrastre en un aparato de cable. Sentado en posici�n vertical con su abdomen contra�do, sostenga la barra con un agarre frontal. Tire de la barra desde abajo hasta la parte superior del pecho. Det�ngase por un momento despu�s de tocar el pecho y regrese lentamente la barra a la posici�n inicial. Consejos: Mantenga la espalda recta durante el ejercicio.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 110-----------------------------------------
    	      dtoEjercioM.setAll("Arrastre de dorsal ancho","Este es uno de los ejercicios cl�sicos del fisicoculturismo para construir y esculpir el dorsal ancho (m�sculos de la espalda). Pasos: Si�ntese en un aparato de arrastre con cable, unido a una barra larga. Sostenga la barra con un agarre frontal. Con su abdomen contra�do y la espalda recta, tire de la barra hacia su pecho superior. Det�ngase un momento y regrese la barra a la posici�n inicial. Consejos: Durante este ejercicio utilice movimientos lentos y controlados. No balancee su espalda.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 111-----------------------------------------
    	      dtoEjercioM.setAll("Hiperextensiones","Este ejercicio no s�lo aumenta la fuerza de la espalda y los m�sculos centrales, tambi�n brinda flexibilidad. Pasos: Ajuste el banco de hiperextensi�n de forma que sus tobillos queden debajo de las almohadillas para los pies y sus muslos est�n firmes sobre la almohadilla superior. Con los brazos cruzados sobre su pecho y la espalda recta, flexione lentamente la cintura hacia el suelo. Despacio, regrese a la posici�n inicial. Consejos: No arquee la espalda en ning�n momento durante el ejercicio.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 112-----------------------------------------
    	      dtoEjercioM.setAll("Mariposas para espalda con bandas de resistencia","Las mariposas para espalda fortalecer�n su espalda superior y mejorar�n su postura. Pasos: Coloque una banda de resistencia alrededor de un poste o un aparato de ejercicio, a la altura de su cintura. Manteniendo los pies juntos, su abdomen contra�do y las rodillas ligeramente flexionadas, p�ngase de pie lo suficientemente lejos del poste para tensar la banda. Desde esa posici�n, lleve los brazos hacia atr�s de forma controlada, hasta dejarlos paralelos a sus laterales. Lentamente regrese sus brazos a la posici�n inicial. Consejos: Tenga cuidado de no utilizar una banda que sea tan fuerte que no le permita usarla con buena postura.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 113-----------------------------------------
    	      dtoEjercioM.setAll("Remo con T-Bar","Si tiene un aparato T-Bar, este es un buen ejercicio para aumentar los principales m�sculos de su espalda. Pasos: Coloque los pies a ambos lados del aparato T-Bar. Con las rodillas ligeramente flexionadas y el abdomen contra�do, sostenga los mangos con un agarre cerrado. Flexione su cuerpo por la cintura, de forma que su tronco quede casi paralelo al suelo. Desde esta posici�n de inicio, tire lentamente de la barra hacia arriba de su pecho. Tire de la barra tan arriba como le sea posible. Det�ngase por un momento en la parte superior de este ejercicio, luego baje los mangos a la posici�n inicial. Consejos: Mantenga sus codos cerca de su cuerpo al realizar el remo T-Bar.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 114-----------------------------------------
    	      dtoEjercioM.setAll("Remo inclinado con agarre invertido","Este ejercicio es excelente para desarrollar fuerza en la espalda en general. Pasos: Manteniendo sus rodillas flexionadas y su espalda recta, levante la barra. Sostenga la barra con un agarre invertido o con las palmas hacia arriba. Lentamente tire de la barra hacia su abdomen. Mantenga los codos metidos a los costados. Det�ngase en el punto m�ximo del ejercicio y baje la barra de forma controlada. Consejos: Debe mantener la espalda recta al realizar este ejercicio. Si la espalda comienza a arquearse, s�lo doble sus rodillas un poco m�s para mantenerse derecho.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 115-----------------------------------------
    	      dtoEjercioM.setAll("Remo para deltoides posteriores","El remo para deltoides posteriores es un ejercicio simple, pero efectivo para trabajar su m�sculo dorsal ancho y sus deltoides posteriores. Pasos: Coloque su pie derecho sobre el suelo con la rodilla izquierda apoyada en un banco. Sostenga el peso de su cuerpo con su brazo izquierdo. Con la espalda recta, recoja la mancuerna con su mano derecha. Levante su brazo, levant�ndolo por el codo y manteniendo el brazo cerca de su pecho. Det�ngase en la parte superior del ejercicio y luego baje de forma controlada. Cambie de lado y repita. Consejos: Mantenga su espalda recta y su cabeza alineada con su cuerpo durante el ejercicio.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 116-----------------------------------------
    	      dtoEjercioM.setAll("Remo sentado con cable","El remo sentado con cable trabaja los grandes m�sculos de su espalda. Pasos: Si�ntese en un aparato de polea baja con sus pies apoyados sobre los descansapies y sus rodillas ligeramente flexionadas. Si�ntese en posici�n recta, mantenga su abdomen contra�do y su espalda erguida. Incl�nese ligeramente hacia adelante y sujete las poleas, despu�s regrese a su posici�n recta. Manteniendo sus codos cerca de su pecho, regr�selos lentamente. Det�ngase en el punto m�ximo de la contracci�n y vuelva lentamente a la posici�n inicial. Consejos: Mantenga la espalda recta durante todo el ejercicio.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 117-----------------------------------------
    	      dtoEjercioM.setAll("Arrastre con barra en V","Este es otro ejercicio para esculpir el m�sculo dorsal ancho (los m�sculos de la espalda). Pasos: Sujete una barra en V a la polea de arrastre en un aparato de cable. Sentado en posici�n vertical con su abdomen contra�do, sostenga la barra con un agarre frontal. Tire de la barra desde abajo hasta la parte superior del pecho. Det�ngase por un momento despu�s de tocar el pecho y regrese lentamente la barra a la posici�n inicial. Consejos: Mantenga la espalda recta durante el ejercicio.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 118-----------------------------------------
    	      dtoEjercioM.setAll("Arrastre de dorsal ancho","Este es uno de los ejercicios cl�sicos del fisicoculturismo para construir y esculpir el dorsal ancho (m�sculos de la espalda). Pasos: Si�ntese en un aparato de arrastre con cable, unido a una barra larga. Sostenga la barra con un agarre frontal. Con su abdomen contra�do y la espalda recta, tire de la barra hacia su pecho superior. Det�ngase un momento y regrese la barra a la posici�n inicial. Consejos: Durante este ejercicio utilice movimientos lentos y controlados. No balancee su espalda.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 119-----------------------------------------
    	      dtoEjercioM.setAll("Hiperextensiones","Este ejercicio no s�lo aumenta la fuerza de la espalda y los m�sculos centrales, tambi�n brinda flexibilidad. Pasos: Ajuste el banco de hiperextensi�n de forma que sus tobillos queden debajo de las almohadillas para los pies y sus muslos est�n firmes sobre la almohadilla superior. Con los brazos cruzados sobre su pecho y la espalda recta, flexione lentamente la cintura hacia el suelo. Despacio, regrese a la posici�n inicial. Consejos: No arquee la espalda en ning�n momento durante el ejercicio.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 120-----------------------------------------
    	      dtoEjercioM.setAll("Mariposas para espalda con bandas de resistencia","Las mariposas para espalda fortalecer�n su espalda superior y mejorar�n su postura. Pasos: Coloque una banda de resistencia alrededor de un poste o un aparato de ejercicio, a la altura de su cintura. Manteniendo los pies juntos, su abdomen contra�do y las rodillas ligeramente flexionadas, p�ngase de pie lo suficientemente lejos del poste para tensar la banda. Desde esa posici�n, lleve los brazos hacia atr�s de forma controlada, hasta dejarlos paralelos a sus laterales. Lentamente regrese sus brazos a la posici�n inicial. Consejos: Tenga cuidado de no utilizar una banda que sea tan fuerte que no le permita usarla con buena postura.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 121-----------------------------------------
    	      dtoEjercioM.setAll("Remo con T-Bar","Si tiene un aparato T-Bar, este es un buen ejercicio para aumentar los principales m�sculos de su espalda. Pasos: Coloque los pies a ambos lados del aparato T-Bar. Con las rodillas ligeramente flexionadas y el abdomen contra�do, sostenga los mangos con un agarre cerrado. Flexione su cuerpo por la cintura, de forma que su tronco quede casi paralelo al suelo. Desde esta posici�n de inicio, tire lentamente de la barra hacia arriba de su pecho. Tire de la barra tan arriba como le sea posible. Det�ngase por un momento en la parte superior de este ejercicio, luego baje los mangos a la posici�n inicial. Consejos: Mantenga sus codos cerca de su cuerpo al realizar el remo T-Bar.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 122-----------------------------------------
    	      dtoEjercioM.setAll("Remo inclinado con agarre invertido","Este ejercicio es excelente para desarrollar fuerza en la espalda en general. Pasos: Manteniendo sus rodillas flexionadas y su espalda recta, levante la barra. Sostenga la barra con un agarre invertido o con las palmas hacia arriba. Lentamente tire de la barra hacia su abdomen. Mantenga los codos metidos a los costados. Det�ngase en el punto m�ximo del ejercicio y baje la barra de forma controlada. Consejos: Debe mantener la espalda recta al realizar este ejercicio. Si la espalda comienza a arquearse, s�lo doble sus rodillas un poco m�s para mantenerse derecho.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 123-----------------------------------------
    	      dtoEjercioM.setAll("Remo para deltoides posteriores","El remo para deltoides posteriores es un ejercicio simple, pero efectivo para trabajar su m�sculo dorsal ancho y sus deltoides posteriores. Pasos: Coloque su pie derecho sobre el suelo con la rodilla izquierda apoyada en un banco. Sostenga el peso de su cuerpo con su brazo izquierdo. Con la espalda recta, recoja la mancuerna con su mano derecha. Levante su brazo, levant�ndolo por el codo y manteniendo el brazo cerca de su pecho. Det�ngase en la parte superior del ejercicio y luego baje de forma controlada. Cambie de lado y repita. Consejos: Mantenga su espalda recta y su cabeza alineada con su cuerpo durante el ejercicio.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 124-----------------------------------------
    	      dtoEjercioM.setAll("Remo sentado con cable","El remo sentado con cable trabaja los grandes m�sculos de su espalda. Pasos: Si�ntese en un aparato de polea baja con sus pies apoyados sobre los descansapies y sus rodillas ligeramente flexionadas. Si�ntese en posici�n recta, mantenga su abdomen contra�do y su espalda erguida. Incl�nese ligeramente hacia adelante y sujete las poleas, despu�s regrese a su posici�n recta. Manteniendo sus codos cerca de su pecho, regr�selos lentamente. Det�ngase en el punto m�ximo de la contracci�n y vuelva lentamente a la posici�n inicial. Consejos: Mantenga la espalda recta durante todo el ejercicio.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 125-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales","Este es el ejercicio abdominal m�s com�n y posiblemente el que con m�s frecuencia se realiza de forma incorrecta. Esta es la forma correcta de realizarlo. Pasos: Recu�stese sobre su espalda con los pies sobre un banco y sus rodillas dobladas a un �ngulo de 90 grados. Ponga sus manos sobre su pecho o a ambos lados de la cabeza (sobre sus orejas). Levante su cabeza, hombros y pecho del piso y hacia sus rodillas, flexionando su abdomen. Mantenga la posici�n por un momento y luego descienda a la posici�n inicial. Consejos: Durante este ejercicio mantenga sus caderas rectas y la espalda baja contra el piso.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 126-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales cruzadas","Esta versi�n de abdominales trabajan la parte superior e inferior del abdomen. Pasos: Recu�stese sobre su espalda y levante las rodillas hasta en �ngulo de 60 grados, mantenga los pies apoyados en el piso. Coloque las manos a ambos lados de la cabeza (sobre sus orejas). Flexi�nese levantando su codo derecho y su rodilla izquierda de tal forma que se toquen sobre su pecho. Regrese a la posici�n inicial y rep�talo alternando brazos y piernas. Consejos: Contraiga su abdomen al flexionarse durante el ejercicio.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 127-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales inclinadas","Usar abdominales inclinadas le permite mantener sus piernas firmes y aislar todos los m�sculos abdominales. Paso: Recu�stese boca arriba sobre un banco inclinado. Apoye sus pies con firmeza bajo las almohadillas. Ponga sus manos sobre su pecho o a ambos lados de la cabeza (sobre sus orejas). Recu�stese completamente sobre su espalda y luego lev�ntese lentamente, flexionando su abdomen. Det�ngase un momento y luego regrese a la posici�n inicial. Consejos: Use todo el rango de movimiento en este ejercicio para lograr resultados �ptimos.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 128-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales sentadas","Este ejercicio utiliza el peso de un aparato de cable para ayudar en las abdominales. Pasos: Sujete una cuerda a una polea de cable alta. Coloque un banco delante de la columna de peso del cable. Tome la cuerda sobre sus hombros y si�ntese con la espalda hacia el soporte. Con los pies firmes sobre el suelo y manteniendo sus caderas fijas flexione la cintura llevando los codos hacia sus rodillas. Regrese a la posici�n inicial. Consejos: Realice este ejercicio de forma lenta y controlada.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 129-----------------------------------------
    	      dtoEjercioM.setAll("Bent Knee Hip Raise","Este es un buen ejercicio para desarrollar los m�sculos centrales. Pasos: Recu�stese boca arriba con los brazos extendidos a los lados. Doble las rodillas a un �ngulo de 60 grados y levante los pies a cierta distancia del piso. Manteniendo su espalda y brazos hacia abajo, levante las caderas del piso de tal forma que sus rodillas queden sobre su pecho. Contraiga su abdomen por un momento y luego regrese a la posici�n inicial.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 130-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n de piernas","La elevaci�n de piernas trabaja su abdomen inferior, que suele ser de dif�cil alcance. Pasos: Recu�stese sobre un banco plano, si tiene uno. Si no lo tiene, entonces simplemente recu�stese sobre el suelo. Mantenga sus manos bajo sus caderas para dar soporte a su espalda. Sus piernas deben colgar fuera del banco de las rodillas hacia abajo. Con los pies juntos hacia el frente, levante sus piernas rectas en direcci�n del techo. Mantenga las piernas rectas pero no flexione las rodillas. Sost�ngalas arriba y despu�s baje sus piernas a la posici�n de inicial de forma lenta y controlada. Consejos: El rango del movimiento no debe ser muy amplio para que el ejercicio sea efectivo.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 131-----------------------------------------
    	      dtoEjercioM.setAll("Side Bend","Este ejercicio trabaja los oblicuos, los m�sculos a ambos lados de su abdomen. Pasos: P�ngase de pie con los pies separados el ancho de sus hombros, sus rodillas ligeramente flexionadas y su abdomen contra�do. Sostenga una mancuerna en una mano y par�ndose derecho flexione la cintura hacia un lado lo m�s lejos posible. Lentamente vuelva a levantarse a la posici�n inicial. Cambie la mancuerna a la otra mano y repita el ejercicio. Consejos: Tenga cuidado de flexionar �nicamente la cintura y no las caderas o las rodillas.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 132-----------------------------------------
    	      dtoEjercioM.setAll("Tablilla lateral","Es un ejercicio simple para fortalecer y acondicionar los m�sculos centrales. Pasos: Recu�stese sobre un lado de su cuerpo con las piernas rectas y el antebrazo perpendicular a su cuerpo, frente a usted. Contrayendo su abdomen, lev�ntese lentamente de manera que se equilibre entre sus pies y su antebrazo. Mantenga esta posici�n y lentamente regrese a la posici�n inicial.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 133-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales","Este es el ejercicio abdominal m�s com�n y posiblemente el que con m�s frecuencia se realiza de forma incorrecta. Esta es la forma correcta de realizarlo. Pasos: Recu�stese sobre su espalda con los pies sobre un banco y sus rodillas dobladas a un �ngulo de 90 grados. Ponga sus manos sobre su pecho o a ambos lados de la cabeza (sobre sus orejas). Levante su cabeza, hombros y pecho del piso y hacia sus rodillas, flexionando su abdomen. Mantenga la posici�n por un momento y luego descienda a la posici�n inicial. Consejos: Durante este ejercicio mantenga sus caderas rectas y la espalda baja contra el piso.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 134-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales cruzadas","Esta versi�n de abdominales trabajan la parte superior e inferior del abdomen. Pasos: Recu�stese sobre su espalda y levante las rodillas hasta en �ngulo de 60 grados, mantenga los pies apoyados en el piso. Coloque las manos a ambos lados de la cabeza (sobre sus orejas). Flexi�nese levantando su codo derecho y su rodilla izquierda de tal forma que se toquen sobre su pecho. Regrese a la posici�n inicial y rep�talo alternando brazos y piernas. Consejos: Contraiga su abdomen al flexionarse durante el ejercicio.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 135-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales inclinadas","Usar abdominales inclinadas le permite mantener sus piernas firmes y aislar todos los m�sculos abdominales. Paso: Recu�stese boca arriba sobre un banco inclinado. Apoye sus pies con firmeza bajo las almohadillas. Ponga sus manos sobre su pecho o a ambos lados de la cabeza (sobre sus orejas). Recu�stese completamente sobre su espalda y luego lev�ntese lentamente, flexionando su abdomen. Det�ngase un momento y luego regrese a la posici�n inicial. Consejos: Use todo el rango de movimiento en este ejercicio para lograr resultados �ptimos.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 136-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales sentadas","Este ejercicio utiliza el peso de un aparato de cable para ayudar en las abdominales. Pasos: Sujete una cuerda a una polea de cable alta. Coloque un banco delante de la columna de peso del cable. Tome la cuerda sobre sus hombros y si�ntese con la espalda hacia el soporte. Con los pies firmes sobre el suelo y manteniendo sus caderas fijas flexione la cintura llevando los codos hacia sus rodillas. Regrese a la posici�n inicial. Consejos: Realice este ejercicio de forma lenta y controlada.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 137-----------------------------------------
    	      dtoEjercioM.setAll("Bent Knee Hip Raise","Este es un buen ejercicio para desarrollar los m�sculos centrales. Pasos: Recu�stese boca arriba con los brazos extendidos a los lados. Doble las rodillas a un �ngulo de 60 grados y levante los pies a cierta distancia del piso. Manteniendo su espalda y brazos hacia abajo, levante las caderas del piso de tal forma que sus rodillas queden sobre su pecho. Contraiga su abdomen por un momento y luego regrese a la posici�n inicial.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 138-----------------------------------------
    	      dtoEjercioM.setAll("Elevaci�n de piernas","La elevaci�n de piernas trabaja su abdomen inferior, que suele ser de dif�cil alcance. Pasos: Recu�stese sobre un banco plano, si tiene uno. Si no lo tiene, entonces simplemente recu�stese sobre el suelo. Mantenga sus manos bajo sus caderas para dar soporte a su espalda. Sus piernas deben colgar fuera del banco de las rodillas hacia abajo. Con los pies juntos hacia el frente, levante sus piernas rectas en direcci�n del techo. Mantenga las piernas rectas pero no flexione las rodillas. Sost�ngalas arriba y despu�s baje sus piernas a la posici�n de inicial de forma lenta y controlada. Consejos: El rango del movimiento no debe ser muy amplio para que el ejercicio sea efectivo.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 139-----------------------------------------
    	      dtoEjercioM.setAll("Side Bend","Este ejercicio trabaja los oblicuos, los m�sculos a ambos lados de su abdomen. Pasos: P�ngase de pie con los pies separados el ancho de sus hombros, sus rodillas ligeramente flexionadas y su abdomen contra�do. Sostenga una mancuerna en una mano y par�ndose derecho flexione la cintura hacia un lado lo m�s lejos posible. Lentamente vuelva a levantarse a la posici�n inicial. Cambie la mancuerna a la otra mano y repita el ejercicio. Consejos: Tenga cuidado de flexionar �nicamente la cintura y no las caderas o las rodillas.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 140-----------------------------------------
    	      dtoEjercioM.setAll("Tablilla lateral","Es un ejercicio simple para fortalecer y acondicionar los m�sculos centrales. Pasos: Recu�stese sobre un lado de su cuerpo con las piernas rectas y el antebrazo perpendicular a su cuerpo, frente a usted. Contrayendo su abdomen, lev�ntese lentamente de manera que se equilibre entre sus pies y su antebrazo. Mantenga esta posici�n y lentamente regrese a la posici�n inicial.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);
    	    
    	      
    	      
    	      dtoZonaMuscular.setAll("1", "Hombros");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("2", "Espalda");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("3", "Pectorales");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("4", "Triceps");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("5", "Biceps");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular)); 
    	      dtoZonaMuscular.setAll("6", "Piernas");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
    	      dtoZonaMuscular.setAll("7", "Abdomen");
    	      Log.w("Insertando Zona Muscular",""+db.insertarZonaMuscular(dtoZonaMuscular));
			  db.close();
			 
        return null;
    }
 
    private static void readExcelFile(Context context, String filename) { 
    	 
        if (!isExternalStorageAvailable() || isExternalStorageReadOnly()) 
        { 
            Log.w("FileUtils", "Storage not available or read only"); 
            return; 
        } 
 
        try{
            // Creating Input Stream 
            File file = new File(context.getExternalFilesDir(null), filename); 
            FileInputStream myInput = new FileInputStream(file);
 
            // Create a POIFSFileSystem object 
            POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);
 
            // Create a workbook using the File System 
            HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);
 
            // Get the first sheet from workbook 
            HSSFSheet mySheet = myWorkBook.getSheetAt(0);
 
            /** We now need something to iterate through the cells.**/
            Iterator<Row> rowIter = mySheet.rowIterator();
 
            while(rowIter.hasNext()){
                HSSFRow myRow = (HSSFRow) rowIter.next();
                Iterator<Cell> cellIter = myRow.cellIterator();
                while(cellIter.hasNext()){
                    HSSFCell myCell = (HSSFCell) cellIter.next();
                    Log.w("FileUtils", "Cell Value: " +  myCell.toString());
                    Toast.makeText(context, "cell Value: " + myCell.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        }catch (Exception e){e.printStackTrace(); }
 
        return;
    }  
    public static boolean isExternalStorageReadOnly() { 
        String extStorageState = Environment.getExternalStorageState(); 
        if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(extStorageState)) { 
            return true; 
        } 
        return false; 
    } 
 
    public static boolean isExternalStorageAvailable() { 
        String extStorageState = Environment.getExternalStorageState(); 
        if (Environment.MEDIA_MOUNTED.equals(extStorageState)) { 
            return true; 
        } 
        return false; 
    } 
  }

     

