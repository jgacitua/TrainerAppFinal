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
    	      dtoEjercioM.setAll("Extensión de triceps en polea alta","De pie, utilizando un equipo con polea, se colocan las manos  en pronación (con las palmas hacia abajo), sosteniendo firmemente la barra recta que se utiliza para el  equipo de polea. Las manos estarán en línea recta  o ligeramente  por adentro de los hombros y se formará un ángulo de 90 grados entre el brazo y  el antebrazo. Luego se extenderán los brazos con el consiguiente  movimiento hacia abajo hasta casi tocarse los muslos con la barra. Finalmente, flexionas los  brazos hasta llevarlos a la posición inicial.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 2-----------------------------------------
    	      dtoEjercioM.setAll("Press Francés","Acostado, se sostiene una barra con pesos por arriba del  pecho colocando las manos aproximadamente en línea recta a los lados de la cara (agarre cerrado).  Luego se elevará la  barra  hasta   tener  ambos brazos extendidos y posteriormente se descenderá la barra a  su posición inicial. Se trabaja sobre todo la región lateral del tríceps.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 3-----------------------------------------
    	      dtoEjercioM.setAll("Extensión alternada de antebrazos con mancuernas","Primero coloca tu rodilla y tu mano sobre un banco y coge una mancuerna con tu otra mano, con la palma apuntando hacia tu cuerpo, y la parte superior de tu brazo paralela a tu cuerpo. Luego empuja la mancuerna hacia atrás mediante la extensión de tu codo y permítele retornar lentamente luego de una breve pausa. Es importante mantener firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 4-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps Acostado","Recuéstate de espalda sobre un banco y sujeta una mancuerna en cada mano, con las palmas apuntando hacia arriba, y las partes superiores de tus brazos apuntando al techo. Eleva las mancuernas mediante la extensión de tus codos y luego de una breve pausa, permíteles retornar al punto de partida.Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 5-----------------------------------------
    	      dtoEjercioM.setAll("Prensa en Banco para Tríceps","Recuéstate de espalda sobre un banco y sujeta las mancuernas a los costados de tu cuerpo, justo por encima de tu pecho, con las palmas apuntando una a otra. Empuja las mancuernas hacia arriba hasta que tus brazos estén casi totalmente extendidos y luego de una breve pausa bájalas. Exhala al empujar las mancuernas hacia arriba e inhala al bajarlas.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 6-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps Inclinado, A Un Brazo","Siéntate, agáchate hacia adelante y sujeta una mancuerna con una mano, con tu codo formando un ángulo de 90 grados y la palma apuntando hacia tu cuerpo. Eleva la mancuerna con una mano hasta que tu brazo esté paralelo al suelo y luego de una breve pausa lentamente bájala. Luego de cada serie ve alternando el brazo. Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 7-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps Sentado","Siéntate y sujeta una mancuerna con ambas manos, detrás de tu cabeza, con los codos formando ángulos de 90 grados y las partes superiores de los brazos hacia arriba en forma recta. Eleva la mancuerna con ambas manos hasta que tus brazos estén casi totalmente extendidos y luego de una breve pausa bájala lentamente. Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 8-----------------------------------------
    	      dtoEjercioM.setAll("Patada de Burro de Tríceps","Coloca tu rodilla y tu mano sobre un banco y coge una mancuerna con tu otra mano, con la palma apuntando hacia tu cuerpo, y la parte superior de tu brazo paralela a tu cuerpo. Empuja la mancuerna hacia atrás mediante la extensión de tu codo y permítele retornar lentamente luego de una breve pausa. Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 9-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps, A Un Brazo","Ponte de pie y sujeta una mancuerna con una mano, detrás de tu cabeza, con el codo formando un ángulo de 90 grados, y la parte superior del brazo apuntando hacia arriba en forma recta. Eleva la mancuerna con una mano hasta que tu brazo esté casi totalmente extendido y luego de una breve pausa bájala lentamente. Luego de cada serie ve alternando el brazo. Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 10-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps, A Dos Brazos","Ponte de pie y sujeta una mancuerna con ambas manos, detrás de tu cabeza, con las partes superiores de los brazos apuntando hacia arriba en forma recta.Eleva la mancuerna hacia arriba mediante la flexión de tus codos y luego de una breve pausa bájala lentamente.Las partes superiores de tus brazos deben permanecer firmes durante todo el movimiento.","imagen","4","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 11-----------------------------------------
    	      dtoEjercioM.setAll("Extensión de triceps en polea alta","De pie, utilizando un equipo con polea, se colocan las manos  en pronación (con las palmas hacia abajo), sosteniendo firmemente la barra recta que se utiliza para el  equipo de polea. Las manos estarán en línea recta  o ligeramente  por adentro de los hombros y se formará un ángulo de 90 grados entre el brazo y  el antebrazo. Luego se extenderán los brazos con el consiguiente  movimiento hacia abajo hasta casi tocarse los muslos con la barra. Finalmente, flexionas los  brazos hasta llevarlos a la posición inicial.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 12-----------------------------------------
    	      dtoEjercioM.setAll("Press Francés","Acostado, se sostiene una barra con pesos por arriba del  pecho colocando las manos aproximadamente en línea recta a los lados de la cara (agarre cerrado).  Luego se elevará la  barra  hasta   tener  ambos brazos extendidos y posteriormente se descenderá la barra a  su posición inicial. Se trabaja sobre todo la región lateral del tríceps.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 13-----------------------------------------
    	      dtoEjercioM.setAll("Extensión alternada de antebrazos con mancuernas","Primero coloca tu rodilla y tu mano sobre un banco y coge una mancuerna con tu otra mano, con la palma apuntando hacia tu cuerpo, y la parte superior de tu brazo paralela a tu cuerpo. Luego empuja la mancuerna hacia atrás mediante la extensión de tu codo y permítele retornar lentamente luego de una breve pausa. Es importante mantener firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 14-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps Acostado","Recuéstate de espalda sobre un banco y sujeta una mancuerna en cada mano, con las palmas apuntando hacia arriba, y las partes superiores de tus brazos apuntando al techo. Eleva las mancuernas mediante la extensión de tus codos y luego de una breve pausa, permíteles retornar al punto de partida. Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 15-----------------------------------------
    	      dtoEjercioM.setAll("Prensa en Banco para Tríceps","Recuéstate de espalda sobre un banco y sujeta las mancuernas a los costados de tu cuerpo, justo por encima de tu pecho, con las palmas apuntando una a otra. Empuja las mancuernas hacia arriba hasta que tus brazos estén casi totalmente extendidos y luego de una breve pausa bájalas. Exhala al empujar las mancuernas hacia arriba e inhala al bajarlas.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 16-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps Inclinado, A Un Brazo","Siéntate, agáchate hacia adelante y sujeta una mancuerna con una mano, con tu codo formando un ángulo de 90 grados y la palma apuntando hacia tu cuerpo. Eleva la mancuerna con una mano hasta que tu brazo esté paralelo al suelo y luego de una breve pausa lentamente bájala. Luego de cada serie ve alternando el brazo. Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 17-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps Sentado","Siéntate y sujeta una mancuerna con ambas manos, detrás de tu cabeza, con los codos formando ángulos de 90 grados y las partes superiores de los brazos hacia arriba en forma recta. Eleva la mancuerna con ambas manos hasta que tus brazos estén casi totalmente extendidos y luego de una breve pausa bájala lentamente. Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 18-----------------------------------------
    	      dtoEjercioM.setAll("Patada de Burro de Tríceps","Coloca tu rodilla y tu mano sobre un banco y coge una mancuerna con tu otra mano, con la palma apuntando hacia tu cuerpo, y la parte superior de tu brazo paralela a tu cuerpo. Empuja la mancuerna hacia atrás mediante la extensión de tu codo y permítele retornar lentamente luego de una breve pausa.  Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 19-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps, A Un Brazo","Ponte de pie y sujeta una mancuerna con una mano, detrás de tu cabeza, con el codo formando un ángulo de 90 grados, y la parte superior del brazo apuntando hacia arriba en forma recta. Eleva la mancuerna con una mano hasta que tu brazo esté casi totalmente extendido y luego de una breve pausa bájala lentamente. Luego de cada serie ve alternando el brazo. Mantén firmes las partes superiores de tus brazos durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 20-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Tríceps, A Dos Brazos","Ponte de pie y sujeta una mancuerna con ambas manos, detrás de tu cabeza, con las partes superiores de los brazos apuntando hacia arriba en forma recta. Eleva la mancuerna hacia arriba mediante la flexión de tus codos y luego de una breve pausa bájala lentamente. Las partes superiores de tus brazos deben permanecer firmes durante todo el movimiento.","imagen","4","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 21-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps, Una a la Vez","Sujeta una mancuerna en cada mano, con las palmas apuntando hacia adelante. Con un brazo a la vez, eleva una mancuerna mediante la flexión de tu codo y bájala luego de una breve pausa. Alterna las manos luego de que el movimiento esté finalizado","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 22-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Alternadas","Ponte de pie y sujeta una mancuerna con cada mano, a los costados de tu cuerpo, con las palmas apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 23-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones Martillo","Coge una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas apuntando hacia tu cuerpo.  Eleva ambas mancuernas mediante la flexión de tus codos y bájalas luego de una breve pausa. Mantén quieta la parte superior de tus brazos durante todo el movimiento.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 24-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Sentado, Alternadas","Siéntate sobre un banco y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 25-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Inclinado, Alternadas","Siéntate sobre un banco inclinado y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra.  Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 26-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Inclinado, Alternadas","Siéntate sobre un banco inclinado y sujeta una mancuerna con cada mano, con las palmas de tu mano apuntando una hacia otra.  Eleva ambas mancuernas hasta que alcancen la altura de tus hombros y luego de una breve pausa, bájalas lentamente.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 27-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Concentradas","Párate detrás de un banco inclinado y apoya un brazo sobre el respaldo, mientras sujetas una mancuerna, con la palma apuntando hacia adelante. Eleva la mancuerna hacia tu hombro y bájala luego de una breve pausa. Durante el ejercicio, sólo debes mover la parte inferior de tu brazo.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 28-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Interior, Sentado","Siéntate sobre un banco y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva ambas mancuernas hasta que alcancen la altura de tus hombros y luego de una breve pausa, bájalas lentamente.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 29-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones Concentradas, Sentado","Siéntate sobre un banco, apoya un brazo en tu muslo y sujeta por lo bajo una mancuerna con esa mano, entre tus piernas, con la palma apuntando hacia la otra pierna. Eleva la mancuerna hasta que alcance tu hombro y lentamente bájala luego de una breve pausa. Luego de finalizar la serie, cambia de brazo.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 30-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones con Mancuernas Aisladas, Sentado","Siéntate sobre uno de los extremos del banco, sujeta una mancuerna con tu mano y apoya el codo (extendido) de dicha mano sobre el frente de tu muslo.   Eleva una mancuerna hasta que alcance la altura de tus hombros y lentamente bájala luego de una breve pausa. Luego de finalizar la serie, cambia de brazo.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 31-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps – Scott (Empuñadura Supinadora)","Coloca la parte superior de uno de tus brazos sobre la almohadilla, la otra en un ángulo de 90 grados, y coge una mancuerna con cada mano, con las palmas apuntando hacia arriba.  Eleva las mancuernas alternadamente, hasta que tus antebrazos estén paralelos al suelo, y luego de una breve pausa, bájalas alternadamente.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 32-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Alternadas en Banco","Recuéstate boca abajo sobre un banco elevado, y sujeta una mancuerna con cada mano, en línea recta por debajo de tus hombros. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 33-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Supinadoras","Recuéstate de espalda sobre un banco y sujeta una mancuerna con cada mano hacia cada lado de tu cuerpo, por debajo de la altura del cuerpo, con las palmas apuntando hacia arriba.  Eleva las mancuernas hasta que alcancen la altura de tu cuerpo y lentamente bájalas luego de una breve pausa. Exhala en el momento de levantar las cargas e inhala al bajarlas.","imagen","5","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 34-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps, Una a la Vez","Sujeta una mancuerna en cada mano, con las palmas apuntando hacia adelante. Con un brazo a la vez, eleva una mancuerna mediante la flexión de tu codo y bájala luego de una breve pausa. Alterna las manos luego de que el movimiento esté finalizado","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 35-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Alternadas","Ponte de pie y sujeta una mancuerna con cada mano, a los costados de tu cuerpo, con las palmas apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 36-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones Martillo","Coge una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas apuntando hacia tu cuerpo. Eleva ambas mancuernas mediante la flexión de tus codos y bájalas luego de una breve pausa. Mantén quieta la parte superior de tus brazos durante todo el movimiento.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 37-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Sentado, Alternadas","Siéntate sobre un banco y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 38-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Inclinado, Alternadas","Siéntate sobre un banco inclinado y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 39-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Inclinado, Alternadas","Siéntate sobre un banco inclinado y sujeta una mancuerna con cada mano, con las palmas de tu mano apuntando una hacia otra. Eleva ambas mancuernas hasta que alcancen la altura de tus hombros y luego de una breve pausa, bájalas lentamente.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 40-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Concentradas","Párate detrás de un banco inclinado y apoya un brazo sobre el respaldo, mientras sujetas una mancuerna, con la palma apuntando hacia adelante.  Eleva la mancuerna hacia tu hombro y bájala luego de una breve pausa. Durante el ejercicio, sólo debes mover la parte inferior de tu brazo.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 41-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Interior, Sentado","Siéntate sobre un banco y sujeta una mancuerna con cada mano, hacia los costados de tu cuerpo, con las palmas de tu mano apuntando una hacia otra. Eleva ambas mancuernas hasta que alcancen la altura de tus hombros y luego de una breve pausa, bájalas lentamente.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 42-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones Concentradas, Sentado","Siéntate sobre un banco, apoya un brazo en tu muslo y sujeta por lo bajo una mancuerna con esa mano, entre tus piernas, con la palma apuntando hacia la otra pierna. Eleva la mancuerna hasta que alcance tu hombro y lentamente bájala luego de una breve pausa. Luego de finalizar la serie, cambia de brazo.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 43-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones con Mancuernas Aisladas, Sentado","Siéntate sobre uno de los extremos del banco, sujeta una mancuerna con tu mano y apoya el codo (extendido) de dicha mano sobre el frente de tu muslo. Eleva una mancuerna hasta que alcance la altura de tus hombros y lentamente bájala luego de una breve pausa. Luego de finalizar la serie, cambia de brazo.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 44-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps – Scott (Empuñadura Supinadora)","Coloca la parte superior de uno de tus brazos sobre la almohadilla, la otra en un ángulo de 90 grados, y coge una mancuerna con cada mano, con las palmas apuntando hacia arriba.  Eleva las mancuernas alternadamente, hasta que tus antebrazos estén paralelos al suelo, y luego de una breve pausa, bájalas alternadamente.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 45-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Alternadas en Banco","Recuéstate boca abajo sobre un banco elevado, y sujeta una mancuerna con cada mano, en línea recta por debajo de tus hombros. Eleva una mancuerna hasta que alcance la altura de tu hombro, y mientras la bajas lentamente, luego de una breve pausa, comienza a elevar la otra.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 46-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones de Bíceps Supinadoras","Recuéstate de espalda sobre un banco y sujeta una mancuerna con cada mano hacia cada lado de tu cuerpo, por debajo de la altura del cuerpo, con las palmas apuntando hacia arriba. Eleva las mancuernas hasta que alcancen la altura de tu cuerpo y lentamente bájalas luego de una breve pausa. Exhala en el momento de levantar las cargas e inhala al bajarlas.","imagen","5","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 47-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco","Recuéstate de espalda sobre un banco y sujeta 2 mancuernas al nivel del pecho, a los lados del cuerpo, con las palmas apuntando hacia tus pies. Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y bájalas lentamente luego de una breve pausa. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 48-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco (Empuñadura Neutral)","Recuéstate de espalda sobre un banco y sujeta 2 mancuernas al nivel del pecho, a los lados del cuerpo, con las palmas apuntando una hacia otra. Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y bájalas lentamente luego de una breve pausa.   Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 49-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco - Inclinada","Recuéstate de espalda sobre un banco inclinado y sujeta 2 mancuernas al nivel del pecho, a los lados del cuerpo, con las palmas apuntando hacia adelante. Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y bájalas lentamente luego de una breve pausa. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 50-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco - Inclinada (Empuñadura Neutral)","Recuéstate de espalda sobre un banco inclinado y sujeta dos mancuernas al nivel del pecho, a los lados del cuerpo, con las palmas apuntando una hacia otra.  Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y bájalas lentamente luego de una breve pausa.  Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 51-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de Pecho en Banco - Declinada","Recuéstate de espalda sobre un banco declinado y sujeta dos mancuernas al nivel del pecho, con las palmas apuntando hacia adelante.  Eleva las mancuernas en forma recta hacia arriba hasta que tus codos se encuentren cerca de trabarse y bájalas lentamente luego de una breve pausa. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 52-----------------------------------------
    	      dtoEjercioM.setAll("Apertura - Recostado","Recuéstate de espalda sobre el banco y coge una mancuerna con cada mano a la altura del cuerpo, con tus codos ligeramente arqueados. Eleva las mancuernas hasta que estén lado a lado por encima de tu cuerpo y luego de una breve pausa bájalas lentamente. Intenta mantener el mismo ángulo en tus codos durante todo el movimiento.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 53-----------------------------------------
    	      dtoEjercioM.setAll("Apertura - Inclinada","Recuéstate de espalda sobre un banco inclinado y coge una mancuerna con cada mano a la altura del cuerpo, con tus codos ligeramente arqueados. Eleva las mancuernas hasta que estén lado a lado por encima de tu cuerpo y luego de una breve pausa bájalas lentamente. Intenta mantener el mismo ángulo en tus codos durante todo el movimiento.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 54-----------------------------------------
    	      dtoEjercioM.setAll("Pullover – Brazos Rectos","Recuéstate de espalda sobre uno de los extremos del banco y sujeta una mancuerna con ambas manos por sobre el área de tu pecho, con los brazos extendidos. Eleva la mancuerna hacia arriba en forma recta, hasta que tus brazos estén perpendiculares al suelo y bájala nuevamente luego de una breve pausa. Mantén tus brazos extendidos a lo largo de todo el movimiento, conservando el ángulo de tus codos.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 55-----------------------------------------
    	      dtoEjercioM.setAll("Pullover – Brazos Flexionados","Recuéstate de espalda sobre uno de los extremos del banco y sujeta dos mancuernas por debajo del nivel de tu cabeza, con los codos formando un ángulo de 90 grados. Eleva ambas mancuernas hasta que estén próximas a tu pecho, mientras mantienes un ángulo de 90 grados en tus codos, y luego de una breve pausa bájalas nuevamente. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 56-----------------------------------------
    	      dtoEjercioM.setAll("Press de pecho plano con mancuernas","Túmbate boca arriba con las rodillas dobladas y una mancuerna en cada mano. Baja las mancuernas a la altura de los hombros con las palmas mirando hacia el frente. Extiende los brazos hacia el techo.  Baja las mancuernas hasta que toques el suelo con los codos. Vuelve a subir los brazos hasta la posición inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 57-----------------------------------------
    	      dtoEjercioM.setAll("Flexiones","Ponte de rodillas con las manos apoyadas en el suelo.  Las manos deben estar ligeramente más separadas que los hombros. Dobla los codos y baja el pecho hacia el suelo. Vuelve a extender los brazos sin estirar del todo los codos.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 58-----------------------------------------
    	      dtoEjercioM.setAll("Apertura con mancuernas plana  sobre balón de estabilidad","Coloca el balón de estabilidad contra la pared para que quede firme y apóyate encima.  Coge una mancuerna en cada mano con las palmas mirándose entre sí.  Sube los brazos hasta que se toquen las mancuernas pero no estires del todo los codos. Esta es la posición inicial. Abre los brazos hacia los lados hasta que las mancuernas queden a la altura de los hombros. Vuelve a la posición inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 59-----------------------------------------
    	      dtoEjercioM.setAll("Extensión en el balón de estabilidad","Recuéstate boca arriba en el balón de estabilidad con las rodillas en ángulo. Coge una mancuerna en cada mano y levanta los brazos hacia el techo con las palmas mirando hacia el frente. Esta es la posición inicial. Luego pasa los brazos sobre la cabeza manteniéndolos rectos. Vuelve a la posición inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 60-----------------------------------------
    	      dtoEjercioM.setAll("Press Francés con mancuernas  inclinadas en balón de estabilidad","Recuéstate boca arriba en el balón de estabilidad con las rodillas en ángulo.Coge una mancuerna en cada mano y levanta los brazos hacia el techo con las palmas mirando hacia el frente. Esta es la posición inicial. Luego pasa los brazos sobre la cabeza manteniéndolos rectos.Vuelve a la posición inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 61-----------------------------------------
    	      dtoEjercioM.setAll("Apertura con mancuernas inclinadas sobre el balón de estabilidad","Recuéstate en el balón de estabilidad apoyando la cabeza y los hombros, y coloca las rodillas en ángulo. Luego coge una mancuerna en cada mano y sube los brazos con las palmas mirándose entre sí. Esta es la posición inicial. Mantén los codos ligeramente doblados y abre los brazos hasta que las mancuernas te queden a la altura de los hombros. Finalmente vuelve a la posición inicial.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 62-----------------------------------------
    	      dtoEjercioM.setAll("Apertura - Inclinada","Recuéstate de espalda sobre un banco inclinado y coge una mancuerna con cada mano a la altura del cuerpo, con tus codos ligeramente arqueados. Eleva las mancuernas hasta que estén lado a lado por encima de tu cuerpo y luego de una breve pausa bájalas lentamente.  Intenta mantener el mismo ángulo en tus codos durante todo el movimiento.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 63-----------------------------------------
    	      dtoEjercioM.setAll("Pullover – Brazos Rectos","Recuéstate de espalda sobre uno de los extremos del banco y sujeta una mancuerna con ambas manos por sobre el área de tu pecho, con los brazos extendidos. Eleva la mancuerna hacia arriba en forma recta, hasta que tus brazos estén perpendiculares al suelo y bájala nuevamente luego de una breve pausa. Mantén tus brazos extendidos a lo largo de todo el movimiento, conservando el ángulo de tus codos.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 64-----------------------------------------
    	      dtoEjercioM.setAll("Pullover – Brazos Flexionados","Recuéstate de espalda sobre uno de los extremos del banco y sujeta dos mancuernas por debajo del nivel de tu cabeza, con los codos formando un ángulo de 90 grados.  Eleva ambas mancuernas hasta que estén próximas a tu pecho, mientras mantienes un ángulo de 90 grados en tus codos, y luego de una breve pausa bájalas nuevamente. Exhala al levantar las mancuernas e inhala al bajarlas.","imagen","3","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 65-----------------------------------------
    	      dtoEjercioM.setAll("Sentadilla con barra","Este ejercicio se realiza mejor dentro de una jaula de sentadillas con fines de seguridad. Para empezar, en primer lugar puesto el listón en un estante hasta justo por debajo del nivel del hombro. Una vez elegida la altura correcta y la barra se carga, paso bajo la barra y coloque la parte posterior de los hombros (ligeramente por debajo del cuello) a través de ella.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 66-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de pierna","Aferrarse a la barra utilizando ambos brazos a cada lado y levantarlo de la rejilla por primera empujando con las piernas y, al mismo tiempo de enderezar su torso.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 67-----------------------------------------
    	      dtoEjercioM.setAll("Peso muerto Rumano","Aléjese de la cremallera y la posición de sus piernas usando un ancho de hombros posición media con los dedos de los pies ligeramente señaló. Mantenga la cabeza en alto en todo momento y también mantener la espalda recta. Esta será su posición inicial. ( Nota: A los efectos de este análisis, utilizaremos la postura medio descrito anteriormente que se enfoca en el desarrollo general, sin embargo se puede elegir cualquiera de las tres posiciones debatidas en el pie sección posturas).","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 68-----------------------------------------
    	      dtoEjercioM.setAll("Flexión de Pierna Sentada","Comienza a bajar lentamente la barra doblando las rodillas y las caderas como a mantener una postura erguida, con la cabeza hacia arriba. Continuar hacia abajo hasta que el ángulo entre la pata superior y los terneros se convierte en ligeramente menos de 90 grados. Inhale a medida que realiza esta parte del movimiento.Consejo: Si ha realizado el ejercicio correctamente, la parte delantera de las rodillas debe hacer una línea recta imaginaria con los dedos de los pies que es perpendicular a la parte delantera. Si sus rodillas están más allá de esa línea imaginaria (si están más allá de sus dedos del pie), entonces usted está poniendo la tensión indebida en la rodilla y el ejercicio se ha realizado de forma incorrecta.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 69-----------------------------------------
    	      dtoEjercioM.setAll("Flexión de pierna de pié","Comenzar a subir el listón a medida que exhala empujando el suelo con el talón de su pie mientras estira las piernas de nuevo y vuelve a la posición inicial.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 70-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Piernas","Repita el procedimiento para la cantidad recomendada de repeticiones","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 71-----------------------------------------
    	      dtoEjercioM.setAll("Elevación de pantorrilla sentada","Repita el procedimiento para la cantidad recomendada de repeticiones.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 72-----------------------------------------
    	      dtoEjercioM.setAll("Elevación de caderas","Un gran ejercicio para principiantes y expertos por igual. Los puentes, junto con las tablillas, son herramientas simples pero efectivas para aumentar y mantener la fuerza de los músculos centrales. Pasos: Recuéstese boca arriba con las rodillas flexionadas y los pies apoyados sobre el suelo. Levante las caderas del suelo mientras contrae abdomen y glúteos.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 73-----------------------------------------
    	      dtoEjercioM.setAll("Flexión de Pierna Sentada","Se trata de un ejercicio clásico para las piernas y para la parte inferior del cuerpo que presenta muchas variantes, esta es la versión básica. Pasos: Comience colocando una barra sobre la parte superior de su espalda, utilice un agarre ligeramente más abierto que el ancho de sus hombros. Póngase de pie con los pies separados aproximadamente 20 cm., con los dedos hacia el frente. Dé un paso adelante (60-90 cm.), manteniendo el abdomen contraído y el torso recto. Lentamente, baje una rodilla como si se arrodillara, mientras mantiene la otra rodilla doblada a un ángulo de 90 grados. No deje que su rodilla toque el suelo. Baje su cuerpo hasta colocarlo por encima del suelo y sosténgalo por un momento antes de volver a la posición inicial. Consejos: No presione su cuerpo sobre su rodilla durante el ejercicio. La rodilla que inclina hacia adelante no debe rebasar la punta de ese pie.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 74-----------------------------------------
    	      dtoEjercioM.setAll("Flexión de pierna de pié","Es el ejercicio preferido para cualquiera que desee reafirmar sus gluteos. Pasos: De pie frente a un aparato de cable sujete una tobillera a una polea baja. De frente hacia la columna de pesos, flexionando ligeramente las rodillas y con el abdomen contraído, empuje su tobillo lentamente hacia atrás y arquéelo lo más alto que le sea posible. Vuelva a la posición inicial y cambie de tobillo.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 75-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Piernas","Este ejercicio trabaja y desarrolla los músculos internos del muslo. Pasos:Siéntese en el aparato y coloque sus rodillas contra las almohadillas. Contraiga su abdomen y aduzca o empuje sus muslos contra las almohadillas y júntelas. Vuelva lentamente a la posición inicial y repita. Consejos: Para mejores resultados, mantenga el mismo nivel de resistencia a lo largo del ejercicio.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 76-----------------------------------------
    	      dtoEjercioM.setAll("Elevación de pantorrilla sentada","Este ejercicio trabaja y desarrolla los músculos externos del muslo. Pasos: Siéntese en el aparato y coloque sus rodillas contra las almohadillas. Contraiga el abdomen y abduzca o separe sus muslos contra las almohadillas. Vuelva lentamente a la posición inicial y repita. Consejos: Para mejores resultados, mantenga el mismo nivel de resistencia a lo largo del ejercicio.","imagen","6","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 77-----------------------------------------
    	      dtoEjercioM.setAll("Sentadilla con barra","Las sentadillas con barra son uno de los ejercicios más potentes, usado para aumentar la masa muscular y fortalecer los cuádriceps. Pasos: A menos que esté haciendo sentadillas con muy poco peso, le recomendamos utilizar un soporte para sentadillas que le ayude con este ejercicio. Comience por establecer el peso deseado en la barra sobre el soporte para sentadillas. Coloque la barra de tal forma que descanse sobre su trapecio, luego levántela del soporte. Mantenga su cabeza mirando ligeramente hacia arriba. Ahora flexione sus rodillas y empuje hacia atrás sus caderas. Mantenga su espalda recta mientras baja su cuerpo. Continúe hasta que sus cuádriceps queden paralelos al suelo. Mantenga la posición baja por un momento, después levante su cuerpo otra vez. Una repetición termina cuando se pone de pie nuevamente. Consejos: Mantenga su cabeza mirando ligeramente hacia arriba. Esto le ayudará a evitar arquear su espalda. Mantenga su abdomen contraído para aliviar la presión de su espalda. Antes de comenzar a usar un peso mayor, asegúrese de que su espalda sea lo suficientemente fuerte para resistir la presión. Realice pesos muertos y supermans. Si siente dolor en su espalda después de hacer sentadillas, deje de hacerlas inmediatamente. Después de que su espalda se haya recuperado, utilice un peso menor. No olvide respirar.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 78-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de pierna","Junto con las sentadillas, este ejercicio es crucial para desarrollar y fortalecer las piernas. Pasos: Ajuste el asiento de la máquina de tal forma que sus pies alcancen cómodamente el travesaño, con las rodillas ligeramente flexionadas. Para comenzar, presione sus pies hacia adelante a la distancia del ancho de sus hombros y suelte los seguros. Baje lentamente el peso hacia su cuerpo, manteniendo su abdomen contraído y mueva sus rodillas en la misma dirección que sus pies a un ángulo de 90 grados. Consejos: No trabe sus rodillas ni rebote el peso.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 79-----------------------------------------
    	      dtoEjercioM.setAll("Peso muerto Rumano","Este ejercicio es similar al peso muerto normal, pero en este caso las piernas se mantienen rectas y la barra se lleva hasta el suelo en cada repetición. Pasos: Coloque la barra en el suelo frente a sus pies. Sujete la barra con un agarre un poco más abierto que el ancho de sus hombros. Flexione las rodillas ligeramente, manteniendo las caderas y la espalda rectas. Levante la barra hacia arriba y concéntrese en usar sus caderas al ponerse de pie. Cuando se encuentre de pie, la barra debe descansar contra sus muslos. Baje la barra al suelo con una ligera flexión en sus rodillas y flexione sus caderas hacia atrás para tener estabilidad. Consejos: Use poco peso para acostumbrarse a este ejercicio. Mantenga sus brazos rectos durante todo el ejercicio.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 80-----------------------------------------
    	      dtoEjercioM.setAll("Flexión de Pierna Sentada","Esta es otra alternativa a las flexiones de pierna acostadas para fortalecer los tendones de la corva (los músculos en la parte posterior de los muslos). Pasos: Ajuste el aparato de forma que la almohadilla quede apenas sobre sus talones. Siéntese con la espalda recta, el abdomen contraído y las piernas al frente. Flexione lentamente sus piernas hacia usted y sosténgalas por un momento. Regrese a la posición inicial con un movimiento controlado. Consejos: No balancee el peso, ni lo mueva demasiado rápido durante el ejercicio.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 81-----------------------------------------
    	      dtoEjercioM.setAll("Flexión de pierna de pié","Este ejercicio trabaja los tendones de la corva, los músculos en la parte posterior del muslo. Pasos: De pie en un aparato para flexión de pierna, ajuste la almohadilla posterior de forma que quede apenas sobre su tobillo. Tome los mangos del aparato como soporte y contraiga su abdomen. Lentamente levante su pie hacia su espalda. Regrese a la posición inicial y cambie de pierna. Consejos: Mantenga su espalda recta a lo largo de este ejercicio. Realice este ejercicio con un movimiento lento y controlado.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 82-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Piernas","Este ejercicio es básico para lograr piernas fuertes. Pasos: Ajuste el asiento de tal forma que sus rodillas un rango completo de movimiento y la almohadilla se ajuste sobre sus piernas, justo sobre sus tobillos. Tome los mangos con sus manos para apoyarse, manteniendo su cadera y espalda contra el banco. Lentamente extienda las piernas hasta que sus rodillas estén rectas. No trabe sus rodillas. Sosténgalas por un momento y después, con movimientos controlados, regrese a la posición inicial. Consejos: Para este ejercicio, utilice movimientos controlados. No balancee el peso hacia arriba.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 83-----------------------------------------
    	      dtoEjercioM.setAll("Elevación de pantorrilla sentada","Este es uno de los ejercicios más simples y más efectivos para las pantorrillas. Pasos: Siéntese en un aparato de elevación de pantorrillas. Coloque las bolas de los pies en la almohadilla para pies. Coloque sus muslos bajo la almohadilla para piernas sobre sus rodillas. Tome la barra y lentamente suba los pies tanto como sea posible. Deténgase por un momento y luego regrese a la posición inicial. Consejos: Practique este ejercicio con movimientos lentos y precisos.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 84-----------------------------------------
    	      dtoEjercioM.setAll("Elevación de caderas","Un gran ejercicio para principiantes y expertos por igual. Los puentes, junto con las tablillas, son herramientas simples pero efectivas para aumentar y mantener la fuerza de los músculos centrales. Pasos: Recuéstese boca arriba con las rodillas flexionadas y los pies apoyados sobre el suelo. Levante las caderas del suelo mientras contrae abdomen y glúteos.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 85-----------------------------------------
    	      dtoEjercioM.setAll("Flexión de pierna sentada","Se trata de un ejercicio clásico para las piernas y para la parte inferior del cuerpo que presenta muchas variantes, esta es la versión básica. Pasos: Comience colocando una barra sobre la parte superior de su espalda, utilice un agarre ligeramente más abierto que el ancho de sus hombros. Póngase de pie con los pies separados aproximadamente 20 cm., con los dedos hacia el frente. Dé un paso adelante (60-90 cm.), manteniendo el abdomen contraído y el torso recto. Lentamente, baje una rodilla como si se arrodillara, mientras mantiene la otra rodilla doblada a un ángulo de 90 grados. No deje que su rodilla toque el suelo. Baje su cuerpo hasta colocarlo por encima del suelo y sosténgalo por un momento antes de volver a la posición inicial. Consejos: No presione su cuerpo sobre su rodilla durante el ejercicio. La rodilla que inclina hacia adelante no debe rebasar la punta de ese pie.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 86-----------------------------------------
    	      dtoEjercioM.setAll("Flexión de pierna de pié","Es el ejercicio preferido para cualquiera que desee reafirmar sus gluteos. Pasos: De pie frente a un aparato de cable sujete una tobillera a una polea baja. De frente hacia la columna de pesos, flexionando ligeramente las rodillas y con el abdomen contraído, empuje su tobillo lentamente hacia atrás y arquéelo lo más alto que le sea posible. Vuelva a la posición inicial y cambie de tobillo.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 87-----------------------------------------
    	      dtoEjercioM.setAll("Extensiones de Piernas","Este ejercicio trabaja y desarrolla los músculos internos del muslo. Pasos:Siéntese en el aparato y coloque sus rodillas contra las almohadillas. Contraiga su abdomen y aduzca o empuje sus muslos contra las almohadillas y júntelas. Vuelva lentamente a la posición inicial y repita. Consejos: Para mejores resultados, mantenga el mismo nivel de resistencia a lo largo del ejercicio.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 88-----------------------------------------
    	      dtoEjercioM.setAll("Elevación de pantorrilla sentada","Este ejercicio trabaja y desarrolla los músculos externos del muslo. Pasos: Siéntese en el aparato y coloque sus rodillas contra las almohadillas. Contraiga el abdomen y abduzca o separe sus muslos contra las almohadillas. Vuelva lentamente a la posición inicial y repita. Consejos: Para mejores resultados, mantenga el mismo nivel de resistencia a lo largo del ejercicio.","imagen","6","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 89-----------------------------------------
    	      dtoEjercioM.setAll("Elevación frontal con cable","La elevación frontal con cable trabaja los músculos frontales de los hombros para mejorar todo el movimiento de su brazo y ayudarle en la vida cotidiana. Se sentirá mejor con hombros desarrollados. Pasos: Primero ate una agarradera al aparato de cable. Sostenga la agarradera del cable con un agarre frontal. Mantenga su abdomen contraído. Con sus brazos relativamente rectos, con sólo una leve flexión en sus codos y las rodillas ligeramente flexionadas, levante el brazo a la altura de los hombros. Sostenga la posición brevemente, después baje de forma controlada. Consejos: Asegúrese de mantener su abdomen contraído para dar soporte a su espalda. Por más tentador que sea, no doble su espalda para ayudarse a levantar el peso. También tenga cuidado de no trabar sus codos.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 90-----------------------------------------
    	      dtoEjercioM.setAll("Elevación lateral","La elevación lateral con mancuernas le ayudará a lograr hombros fuertes y mejorar su definición. Pasos: De pie con los pies separados el ancho de sus hombros y el abdomen contraído, sostenga una mancuerna en cada mano con las palmas hacia el cuerpo. Mantenga las rodillas ligeramente flexionadas mientras levanta sus brazos hacia los lados hasta que sus palmas apunten al suelo. Sostenga esta posición brevemente, luego baje lentamente. Consejos: Trate de sentir que guía el movimiento con los codos y mantenga las muñecas debajo de los codos. Resista la tentación de balancear las mancuernas. Sus hombros deben hacer la elevación, no la inercia.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 91-----------------------------------------
    	      dtoEjercioM.setAll("Elevación lateral inclinada con polea baja","La elevación lateral inclinada con cable es un buen ejercicio para trabajar sus deltoides posteriores. El aparato de cable ofrece una resistencia más constante que la elevación inclinada con mancuerna. Pasos: En primer lugar, ajuste una agarradera al aparato de cable. Póngase de pie frente al aparato. Doble sus rodillas y cadera para lograr la posición inclinada. No flexione su espalda. De lado, usted debe verse como el símbolo de un rayo. Sostenga la agarradera del cable con el brazo más alejado del aparato. Su brazo debe cruzar frente a su cuerpo. Levante su brazo frente a su cuerpo y hacia el lado. Continúe hasta nivelar su brazo con el suelo. Mantenga la posición más alta por un segundo y luego baje su brazo otra vez y vuelva a la posición inicial.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 92-----------------------------------------
    	      dtoEjercioM.setAll("Elevación lateral sentada con cable","Esta es una variante interesante de la elevación lateral estándar. Pasos: Coloque un banco entre 2 aparatos de cable. Sujete la agarradera de los aparatos de cable de forma que los brazos se crucen detrás de su espalda. Sostenga la agarradera de la polea izquierda con su mano derecha y viceversa. Siéntese en un banco con los pies al frente y sus brazos cruzados bajo los muslos. Inclínese hacia adelante hasta que su pecho toque sus rodillas o quede justo sobre ellas. Lentamente tire de sus brazos hacia los lados. Inicie el movimiento con sus codos y concéntrese en usar sus hombros para hacer la elevación. Levante los brazos hasta dejarlos paralelos al suelo. Mantenga esta posición por un momento, luego baje sus brazos a la posición inicial.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 93-----------------------------------------
    	      dtoEjercioM.setAll("Prensa Arnold con mancuerna","La prensa Arnold es una variante de una prensa militar estándar que permite trabajar el manguito rotador. Trabaja tanto sus deltoides frontales como los laterales. Pasos: Siéntese en un banco plano con los pies apuntando hacia el frente y su abdomen contraído. Con un agarre invertido, tome una mancuerna en cada mano con los codos flexionados y con las palmas una frente a la otra debajo del nivel de los hombros. Con un movimiento controlado y constante, levante las mancuernas mientras rota sus hombros y gira sus pulgares hasta que se encuentren uno frente al otro. Usando un movimiento controlado, baje las mancuernas en sentido contrario hasta volver a la posición inicial. Consejos: Evite hacer la prensa Arnold en caso de experimentar dolor en los hombros. Los principiantes deben hacer este ejercicio con poco peso hasta dominar la postura correcta. Para la mayoría de las personas, el manguito rotador es un conjunto subutilizado. Usar poco peso mientras domina la prensa Arnold le ayudará a evitar lesiones.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 94-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de hombro (militar) en aparato","El aparato de prensa de hombro trabaja principalmente los deltoides, pero también involucra a los músculos circundantes. Trabajar todos los músculos del hombro al mismo tiempo ayuda a prevenir lesiones causadas por una descompensación muscular. Pasos: Siéntese con la espalda recta y el abdomen contraído. Tome la barra con ambas manos. Con un movimiento suave, empuje la barra hacia arriba, extendiendo sus brazos. Deténgase brevemente en la parte superior, después baje sus brazos de la misma forma controlada. Consejos: Ajuste el asiento de forma que los mangos estén nivelados con sus hombros mientras al sentarse con la espalda recta. No olvide mantener una buena postura, a pesar de estar sentado.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 95-----------------------------------------
    	      dtoEjercioM.setAll("Prensa hombro con mancuernas","La prensa de hombro con mancuernas es una variación de la prensa militar estándar que se enfoca más en los músculos estabilizadores. Es bueno alternar entre las versiones con barra y mancuernas de este ejercicio. Pasos: Comience la prensa de hombro con mancuernas, sentado en un banco, con su abdomen contraído y una mancuerna en cada mano. Sus palmas deben estar hacia el frente y sus manos a la altura de sus hombros. Extienda sus brazos para levantar las mancuernas hasta que sus brazos estén derechos y el borde interno de cada mancuerna se encuentre por encima de su cabeza. Puede chocar las mancuernas si prefiere. Mantenga esta posición por un momento, luego baje y doble sus brazos lentamente. Continúe hasta que sus manos estén una vez más sobre el nivel de los hombros. Consejos: Asegúrese de no trabar los codos en la posición superior de la prensa de hombro. Trabar los codos, especialmente cuando se usa más peso, puede causar lesiones extremadamente graves. También puede realizar este ejercicio en una pelota de ejercicio.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 96-----------------------------------------
    	      dtoEjercioM.setAll("Prensa militar sentada con barra","Al igual que con la prensa de hombro sentada en aparato, este ejercicio trabaja principalmente los deltoides y también involucra a los músculos circundantes. Trabajar todos los músculos del hombro al mismo tiempo ayuda a prevenir lesiones causadas por la descompensación múscular. Pasos: Siéntese en el banco con los dedos de los pies apuntando al frente, la espalda recta y el abdomen contraído. Sostenga la barra con un agarre frontal (las palmas hacia fuera del cuerpo). Mantenga las manos separadas el ancho de sus hombros. La barra debe estar alineada con su barbilla. Empuje la barra hacia arriba extendiendo los brazos. Deténgase brevemente en la parte superior y baje la barra de manera lenta y controlada a la posición inicial. Consejos: No debe hacer este ejercicio en caso de sentir cualquier tipo de dolor en los hombros. Tenga cuidado de no sobrextender su espalda. Si no puede hacer este ejercicio sin inclinarse hacia atrás, entonces use menos peso. Este ejercicio también puede realizarse con mancuernas.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 97-----------------------------------------
    	      dtoEjercioM.setAll("Remo erguido con barra","El remo erguido con barra es un ejercicio de remo vertical estándar que trabaja sus trapecios y deltoides. Pasos: Póngase de pie con la espalda recta y los pies separados el ancho de sus hombros. Sostenga la barra con un agarre frontal (las palmas hacia su cuerpo). No deje caer sus hombros. Incluso en esta posición inicial, la barra debe estar alineada con la parte inferior de su cadera. A continuación, eleve la barra hacia su barbilla. Concéntrese en la contracción de sus hombros y trapecios. Levante la barra justo por encima de su clavícula. Mantenga esta posición durante un momento y luego baje la barra lentamente a su posición inicial. Consejos: Si es posible, realice el remo erguido con barra usando un soporte. Podrá descansar su barra en el soporte y tomarla desde una altura más cómoda al iniciar. Es más seguro que tomar la barra del suelo. Mantener su abdomen contraído le ayudará a proteger su espalda durante el remo erguido. Mantenga una buena postura y mantenga sus muñecas rectas. El agarre al ancho de los hombros es ideal. Un agarre más cerrado trabajará más los trapecios, pero lo hará más propenso a una lesión de hombro.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 98-----------------------------------------
    	      dtoEjercioM.setAll("Remo inclinado para deltoides posteriores","La ventaja de este ejercicio frente al remo para deltoides estándar, es que puede utilizar el banco para mantener el equilibrio y evitarse lesiones en la espalda. Pasos: Póngase de pie frente a un banco inclinado sosteniendo un par de mancuernas. Flexione ligeramente sus rodillas y mantenga su abdomen contraído. Agáchese lentamente hasta que su frente toque la parte superior del banco. Sus brazos deben estar colgados y sus palmas una frente a la otra. Levante sus brazos lentamente hacia los lados. Para este ejercicio, concéntrese en usar la parte posterior de sus deltoides. Levante las mancuernas hasta que sus brazos queden paralelos al suelo. Mantenga esta posición por un momento, luego baje lentamente las mancuernas.","imagen","1","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 99-----------------------------------------
    	      dtoEjercioM.setAll("Elevación frontal con cable","La elevación frontal con cable trabaja los músculos frontales de los hombros para mejorar todo el movimiento de su brazo y ayudarle en la vida cotidiana. Se sentirá mejor con hombros desarrollados. Pasos: Primero ate una agarradera al aparato de cable. Sostenga la agarradera del cable con un agarre frontal. Mantenga su abdomen contraído. Con sus brazos relativamente rectos, con sólo una leve flexión en sus codos y las rodillas ligeramente flexionadas, levante el brazo a la altura de los hombros. Sostenga la posición brevemente, después baje de forma controlada. Consejos: Asegúrese de mantener su abdomen contraído para dar soporte a su espalda. Por más tentador que sea, no doble su espalda para ayudarse a levantar el peso. También tenga cuidado de no trabar sus codos.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 100-----------------------------------------
    	      dtoEjercioM.setAll("Elevación lateral","La elevación lateral con mancuernas le ayudará a lograr hombros fuertes y mejorar su definición. Pasos: De pie con los pies separados el ancho de sus hombros y el abdomen contraído, sostenga una mancuerna en cada mano con las palmas hacia el cuerpo. Mantenga las rodillas ligeramente flexionadas mientras levanta sus brazos hacia los lados hasta que sus palmas apunten al suelo. Sostenga esta posición brevemente, luego baje lentamente. Consejos: Trate de sentir que guía el movimiento con los codos y mantenga las muñecas debajo de los codos. Resista la tentación de balancear las mancuernas. Sus hombros deben hacer la elevación, no la inercia.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 101-----------------------------------------
    	      dtoEjercioM.setAll("Elevación lateral inclinada con polea baja","La elevación lateral inclinada con cable es un buen ejercicio para trabajar sus deltoides posteriores. El aparato de cable ofrece una resistencia más constante que la elevación inclinada con mancuerna. Pasos: En primer lugar, ajuste una agarradera al aparato de cable. Póngase de pie frente al aparato. Doble sus rodillas y cadera para lograr la posición inclinada. No flexione su espalda. De lado, usted debe verse como el símbolo de un rayo. Sostenga la agarradera del cable con el brazo más alejado del aparato. Su brazo debe cruzar frente a su cuerpo. Levante su brazo frente a su cuerpo y hacia el lado. Continúe hasta nivelar su brazo con el suelo. Mantenga la posición más alta por un segundo y luego baje su brazo otra vez y vuelva a la posición inicial.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 102-----------------------------------------
    	      dtoEjercioM.setAll("Elevación lateral sentada con cable","Esta es una variante interesante de la elevación lateral estándar. Pasos: Coloque un banco entre 2 aparatos de cable. Sujete la agarradera de los aparatos de cable de forma que los brazos se crucen detrás de su espalda. Sostenga la agarradera de la polea izquierda con su mano derecha y viceversa. Siéntese en un banco con los pies al frente y sus brazos cruzados bajo los muslos. Inclínese hacia adelante hasta que su pecho toque sus rodillas o quede justo sobre ellas. Lentamente tire de sus brazos hacia los lados. Inicie el movimiento con sus codos y concéntrese en usar sus hombros para hacer la elevación. Levante los brazos hasta dejarlos paralelos al suelo. Mantenga esta posición por un momento, luego baje sus brazos a la posición inicial.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 103-----------------------------------------
    	      dtoEjercioM.setAll("Prensa Arnold con mancuerna","La prensa Arnold es una variante de una prensa militar estándar que permite trabajar el manguito rotador. Trabaja tanto sus deltoides frontales como los laterales. Pasos: Siéntese en un banco plano con los pies apuntando hacia el frente y su abdomen contraído. Con un agarre invertido, tome una mancuerna en cada mano con los codos flexionados y con las palmas una frente a la otra debajo del nivel de los hombros. Con un movimiento controlado y constante, levante las mancuernas mientras rota sus hombros y gira sus pulgares hasta que se encuentren uno frente al otro. Usando un movimiento controlado, baje las mancuernas en sentido contrario hasta volver a la posición inicial. Consejos: Evite hacer la prensa Arnold en caso de experimentar dolor en los hombros. Los principiantes deben hacer este ejercicio con poco peso hasta dominar la postura correcta. Para la mayoría de las personas, el manguito rotador es un conjunto subutilizado. Usar poco peso mientras domina la prensa Arnold le ayudará a evitar lesiones.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 104-----------------------------------------
    	      dtoEjercioM.setAll("Prensa de hombro (militar) en aparato","El aparato de prensa de hombro trabaja principalmente los deltoides, pero también involucra a los músculos circundantes. Trabajar todos los músculos del hombro al mismo tiempo ayuda a prevenir lesiones causadas por una descompensación muscular. Pasos: Siéntese con la espalda recta y el abdomen contraído. Tome la barra con ambas manos. Con un movimiento suave, empuje la barra hacia arriba, extendiendo sus brazos. Deténgase brevemente en la parte superior, después baje sus brazos de la misma forma controlada. Consejos: Ajuste el asiento de forma que los mangos estén nivelados con sus hombros mientras al sentarse con la espalda recta. No olvide mantener una buena postura, a pesar de estar sentado.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 105-----------------------------------------
    	      dtoEjercioM.setAll("Prensa hombro con mancuernas","La prensa de hombro con mancuernas es una variación de la prensa militar estándar que se enfoca más en los músculos estabilizadores. Es bueno alternar entre las versiones con barra y mancuernas de este ejercicio. Pasos: Comience la prensa de hombro con mancuernas, sentado en un banco, con su abdomen contraído y una mancuerna en cada mano. Sus palmas deben estar hacia el frente y sus manos a la altura de sus hombros. Extienda sus brazos para levantar las mancuernas hasta que sus brazos estén derechos y el borde interno de cada mancuerna se encuentre por encima de su cabeza. Puede chocar las mancuernas si prefiere. Mantenga esta posición por un momento, luego baje y doble sus brazos lentamente. Continúe hasta que sus manos estén una vez más sobre el nivel de los hombros. Consejos: Asegúrese de no trabar los codos en la posición superior de la prensa de hombro. Trabar los codos, especialmente cuando se usa más peso, puede causar lesiones extremadamente graves. También puede realizar este ejercicio en una pelota de ejercicio.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 106-----------------------------------------
    	      dtoEjercioM.setAll("Prensa militar sentada con barra","Al igual que con la prensa de hombro sentada en aparato, este ejercicio trabaja principalmente los deltoides y también involucra a los músculos circundantes. Trabajar todos los músculos del hombro al mismo tiempo ayuda a prevenir lesiones causadas por la descompensación múscular. Pasos: Siéntese en el banco con los dedos de los pies apuntando al frente, la espalda recta y el abdomen contraído. Sostenga la barra con un agarre frontal (las palmas hacia fuera del cuerpo). Mantenga las manos separadas el ancho de sus hombros. La barra debe estar alineada con su barbilla. Empuje la barra hacia arriba extendiendo los brazos. Deténgase brevemente en la parte superior y baje la barra de manera lenta y controlada a la posición inicial. Consejos: No debe hacer este ejercicio en caso de sentir cualquier tipo de dolor en los hombros. Tenga cuidado de no sobrextender su espalda. Si no puede hacer este ejercicio sin inclinarse hacia atrás, entonces use menos peso. Este ejercicio también puede realizarse con mancuernas.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 107-----------------------------------------
    	      dtoEjercioM.setAll("Remo erguido con barra","El remo erguido con barra es un ejercicio de remo vertical estándar que trabaja sus trapecios y deltoides. Pasos: Póngase de pie con la espalda recta y los pies separados el ancho de sus hombros. Sostenga la barra con un agarre frontal (las palmas hacia su cuerpo). No deje caer sus hombros. Incluso en esta posición inicial, la barra debe estar alineada con la parte inferior de su cadera. A continuación, eleve la barra hacia su barbilla. Concéntrese en la contracción de sus hombros y trapecios. Levante la barra justo por encima de su clavícula. Mantenga esta posición durante un momento y luego baje la barra lentamente a su posición inicial. Consejos: Si es posible, realice el remo erguido con barra usando un soporte. Podrá descansar su barra en el soporte y tomarla desde una altura más cómoda al iniciar. Es más seguro que tomar la barra del suelo. Mantener su abdomen contraído le ayudará a proteger su espalda durante el remo erguido. Mantenga una buena postura y mantenga sus muñecas rectas. El agarre al ancho de los hombros es ideal. Un agarre más cerrado trabajará más los trapecios, pero lo hará más propenso a una lesión de hombro.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 108-----------------------------------------
    	      dtoEjercioM.setAll("Remo inclinado para deltoides posteriores","La ventaja de este ejercicio frente al remo para deltoides estándar, es que puede utilizar el banco para mantener el equilibrio y evitarse lesiones en la espalda. Pasos: Póngase de pie frente a un banco inclinado sosteniendo un par de mancuernas. Flexione ligeramente sus rodillas y mantenga su abdomen contraído. Agáchese lentamente hasta que su frente toque la parte superior del banco. Sus brazos deben estar colgados y sus palmas una frente a la otra. Levante sus brazos lentamente hacia los lados. Para este ejercicio, concéntrese en usar la parte posterior de sus deltoides. Levante las mancuernas hasta que sus brazos queden paralelos al suelo. Mantenga esta posición por un momento, luego baje lentamente las mancuernas.","imagen","1","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 109-----------------------------------------
    	      dtoEjercioM.setAll("Arrastre con barra en V","Este es otro ejercicio para esculpir el músculo dorsal ancho (los músculos de la espalda). Pasos: Sujete una barra en V a la polea de arrastre en un aparato de cable. Sentado en posición vertical con su abdomen contraído, sostenga la barra con un agarre frontal. Tire de la barra desde abajo hasta la parte superior del pecho. Deténgase por un momento después de tocar el pecho y regrese lentamente la barra a la posición inicial. Consejos: Mantenga la espalda recta durante el ejercicio.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 110-----------------------------------------
    	      dtoEjercioM.setAll("Arrastre de dorsal ancho","Este es uno de los ejercicios clásicos del fisicoculturismo para construir y esculpir el dorsal ancho (músculos de la espalda). Pasos: Siéntese en un aparato de arrastre con cable, unido a una barra larga. Sostenga la barra con un agarre frontal. Con su abdomen contraído y la espalda recta, tire de la barra hacia su pecho superior. Deténgase un momento y regrese la barra a la posición inicial. Consejos: Durante este ejercicio utilice movimientos lentos y controlados. No balancee su espalda.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 111-----------------------------------------
    	      dtoEjercioM.setAll("Hiperextensiones","Este ejercicio no sólo aumenta la fuerza de la espalda y los músculos centrales, también brinda flexibilidad. Pasos: Ajuste el banco de hiperextensión de forma que sus tobillos queden debajo de las almohadillas para los pies y sus muslos estén firmes sobre la almohadilla superior. Con los brazos cruzados sobre su pecho y la espalda recta, flexione lentamente la cintura hacia el suelo. Despacio, regrese a la posición inicial. Consejos: No arquee la espalda en ningún momento durante el ejercicio.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 112-----------------------------------------
    	      dtoEjercioM.setAll("Mariposas para espalda con bandas de resistencia","Las mariposas para espalda fortalecerán su espalda superior y mejorarán su postura. Pasos: Coloque una banda de resistencia alrededor de un poste o un aparato de ejercicio, a la altura de su cintura. Manteniendo los pies juntos, su abdomen contraído y las rodillas ligeramente flexionadas, póngase de pie lo suficientemente lejos del poste para tensar la banda. Desde esa posición, lleve los brazos hacia atrás de forma controlada, hasta dejarlos paralelos a sus laterales. Lentamente regrese sus brazos a la posición inicial. Consejos: Tenga cuidado de no utilizar una banda que sea tan fuerte que no le permita usarla con buena postura.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 113-----------------------------------------
    	      dtoEjercioM.setAll("Remo con T-Bar","Si tiene un aparato T-Bar, este es un buen ejercicio para aumentar los principales músculos de su espalda. Pasos: Coloque los pies a ambos lados del aparato T-Bar. Con las rodillas ligeramente flexionadas y el abdomen contraído, sostenga los mangos con un agarre cerrado. Flexione su cuerpo por la cintura, de forma que su tronco quede casi paralelo al suelo. Desde esta posición de inicio, tire lentamente de la barra hacia arriba de su pecho. Tire de la barra tan arriba como le sea posible. Deténgase por un momento en la parte superior de este ejercicio, luego baje los mangos a la posición inicial. Consejos: Mantenga sus codos cerca de su cuerpo al realizar el remo T-Bar.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 114-----------------------------------------
    	      dtoEjercioM.setAll("Remo inclinado con agarre invertido","Este ejercicio es excelente para desarrollar fuerza en la espalda en general. Pasos: Manteniendo sus rodillas flexionadas y su espalda recta, levante la barra. Sostenga la barra con un agarre invertido o con las palmas hacia arriba. Lentamente tire de la barra hacia su abdomen. Mantenga los codos metidos a los costados. Deténgase en el punto máximo del ejercicio y baje la barra de forma controlada. Consejos: Debe mantener la espalda recta al realizar este ejercicio. Si la espalda comienza a arquearse, sólo doble sus rodillas un poco más para mantenerse derecho.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 115-----------------------------------------
    	      dtoEjercioM.setAll("Remo para deltoides posteriores","El remo para deltoides posteriores es un ejercicio simple, pero efectivo para trabajar su músculo dorsal ancho y sus deltoides posteriores. Pasos: Coloque su pie derecho sobre el suelo con la rodilla izquierda apoyada en un banco. Sostenga el peso de su cuerpo con su brazo izquierdo. Con la espalda recta, recoja la mancuerna con su mano derecha. Levante su brazo, levantándolo por el codo y manteniendo el brazo cerca de su pecho. Deténgase en la parte superior del ejercicio y luego baje de forma controlada. Cambie de lado y repita. Consejos: Mantenga su espalda recta y su cabeza alineada con su cuerpo durante el ejercicio.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 116-----------------------------------------
    	      dtoEjercioM.setAll("Remo sentado con cable","El remo sentado con cable trabaja los grandes músculos de su espalda. Pasos: Siéntese en un aparato de polea baja con sus pies apoyados sobre los descansapies y sus rodillas ligeramente flexionadas. Siéntese en posición recta, mantenga su abdomen contraído y su espalda erguida. Inclínese ligeramente hacia adelante y sujete las poleas, después regrese a su posición recta. Manteniendo sus codos cerca de su pecho, regréselos lentamente. Deténgase en el punto máximo de la contracción y vuelva lentamente a la posición inicial. Consejos: Mantenga la espalda recta durante todo el ejercicio.","imagen","2","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 117-----------------------------------------
    	      dtoEjercioM.setAll("Arrastre con barra en V","Este es otro ejercicio para esculpir el músculo dorsal ancho (los músculos de la espalda). Pasos: Sujete una barra en V a la polea de arrastre en un aparato de cable. Sentado en posición vertical con su abdomen contraído, sostenga la barra con un agarre frontal. Tire de la barra desde abajo hasta la parte superior del pecho. Deténgase por un momento después de tocar el pecho y regrese lentamente la barra a la posición inicial. Consejos: Mantenga la espalda recta durante el ejercicio.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 118-----------------------------------------
    	      dtoEjercioM.setAll("Arrastre de dorsal ancho","Este es uno de los ejercicios clásicos del fisicoculturismo para construir y esculpir el dorsal ancho (músculos de la espalda). Pasos: Siéntese en un aparato de arrastre con cable, unido a una barra larga. Sostenga la barra con un agarre frontal. Con su abdomen contraído y la espalda recta, tire de la barra hacia su pecho superior. Deténgase un momento y regrese la barra a la posición inicial. Consejos: Durante este ejercicio utilice movimientos lentos y controlados. No balancee su espalda.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 119-----------------------------------------
    	      dtoEjercioM.setAll("Hiperextensiones","Este ejercicio no sólo aumenta la fuerza de la espalda y los músculos centrales, también brinda flexibilidad. Pasos: Ajuste el banco de hiperextensión de forma que sus tobillos queden debajo de las almohadillas para los pies y sus muslos estén firmes sobre la almohadilla superior. Con los brazos cruzados sobre su pecho y la espalda recta, flexione lentamente la cintura hacia el suelo. Despacio, regrese a la posición inicial. Consejos: No arquee la espalda en ningún momento durante el ejercicio.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 120-----------------------------------------
    	      dtoEjercioM.setAll("Mariposas para espalda con bandas de resistencia","Las mariposas para espalda fortalecerán su espalda superior y mejorarán su postura. Pasos: Coloque una banda de resistencia alrededor de un poste o un aparato de ejercicio, a la altura de su cintura. Manteniendo los pies juntos, su abdomen contraído y las rodillas ligeramente flexionadas, póngase de pie lo suficientemente lejos del poste para tensar la banda. Desde esa posición, lleve los brazos hacia atrás de forma controlada, hasta dejarlos paralelos a sus laterales. Lentamente regrese sus brazos a la posición inicial. Consejos: Tenga cuidado de no utilizar una banda que sea tan fuerte que no le permita usarla con buena postura.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 121-----------------------------------------
    	      dtoEjercioM.setAll("Remo con T-Bar","Si tiene un aparato T-Bar, este es un buen ejercicio para aumentar los principales músculos de su espalda. Pasos: Coloque los pies a ambos lados del aparato T-Bar. Con las rodillas ligeramente flexionadas y el abdomen contraído, sostenga los mangos con un agarre cerrado. Flexione su cuerpo por la cintura, de forma que su tronco quede casi paralelo al suelo. Desde esta posición de inicio, tire lentamente de la barra hacia arriba de su pecho. Tire de la barra tan arriba como le sea posible. Deténgase por un momento en la parte superior de este ejercicio, luego baje los mangos a la posición inicial. Consejos: Mantenga sus codos cerca de su cuerpo al realizar el remo T-Bar.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 122-----------------------------------------
    	      dtoEjercioM.setAll("Remo inclinado con agarre invertido","Este ejercicio es excelente para desarrollar fuerza en la espalda en general. Pasos: Manteniendo sus rodillas flexionadas y su espalda recta, levante la barra. Sostenga la barra con un agarre invertido o con las palmas hacia arriba. Lentamente tire de la barra hacia su abdomen. Mantenga los codos metidos a los costados. Deténgase en el punto máximo del ejercicio y baje la barra de forma controlada. Consejos: Debe mantener la espalda recta al realizar este ejercicio. Si la espalda comienza a arquearse, sólo doble sus rodillas un poco más para mantenerse derecho.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 123-----------------------------------------
    	      dtoEjercioM.setAll("Remo para deltoides posteriores","El remo para deltoides posteriores es un ejercicio simple, pero efectivo para trabajar su músculo dorsal ancho y sus deltoides posteriores. Pasos: Coloque su pie derecho sobre el suelo con la rodilla izquierda apoyada en un banco. Sostenga el peso de su cuerpo con su brazo izquierdo. Con la espalda recta, recoja la mancuerna con su mano derecha. Levante su brazo, levantándolo por el codo y manteniendo el brazo cerca de su pecho. Deténgase en la parte superior del ejercicio y luego baje de forma controlada. Cambie de lado y repita. Consejos: Mantenga su espalda recta y su cabeza alineada con su cuerpo durante el ejercicio.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 124-----------------------------------------
    	      dtoEjercioM.setAll("Remo sentado con cable","El remo sentado con cable trabaja los grandes músculos de su espalda. Pasos: Siéntese en un aparato de polea baja con sus pies apoyados sobre los descansapies y sus rodillas ligeramente flexionadas. Siéntese en posición recta, mantenga su abdomen contraído y su espalda erguida. Inclínese ligeramente hacia adelante y sujete las poleas, después regrese a su posición recta. Manteniendo sus codos cerca de su pecho, regréselos lentamente. Deténgase en el punto máximo de la contracción y vuelva lentamente a la posición inicial. Consejos: Mantenga la espalda recta durante todo el ejercicio.","imagen","2","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 125-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales","Este es el ejercicio abdominal más común y posiblemente el que con más frecuencia se realiza de forma incorrecta. Esta es la forma correcta de realizarlo. Pasos: Recuéstese sobre su espalda con los pies sobre un banco y sus rodillas dobladas a un ángulo de 90 grados. Ponga sus manos sobre su pecho o a ambos lados de la cabeza (sobre sus orejas). Levante su cabeza, hombros y pecho del piso y hacia sus rodillas, flexionando su abdomen. Mantenga la posición por un momento y luego descienda a la posición inicial. Consejos: Durante este ejercicio mantenga sus caderas rectas y la espalda baja contra el piso.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 126-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales cruzadas","Esta versión de abdominales trabajan la parte superior e inferior del abdomen. Pasos: Recuéstese sobre su espalda y levante las rodillas hasta en ángulo de 60 grados, mantenga los pies apoyados en el piso. Coloque las manos a ambos lados de la cabeza (sobre sus orejas). Flexiónese levantando su codo derecho y su rodilla izquierda de tal forma que se toquen sobre su pecho. Regrese a la posición inicial y repítalo alternando brazos y piernas. Consejos: Contraiga su abdomen al flexionarse durante el ejercicio.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 127-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales inclinadas","Usar abdominales inclinadas le permite mantener sus piernas firmes y aislar todos los músculos abdominales. Paso: Recuéstese boca arriba sobre un banco inclinado. Apoye sus pies con firmeza bajo las almohadillas. Ponga sus manos sobre su pecho o a ambos lados de la cabeza (sobre sus orejas). Recuéstese completamente sobre su espalda y luego levántese lentamente, flexionando su abdomen. Deténgase un momento y luego regrese a la posición inicial. Consejos: Use todo el rango de movimiento en este ejercicio para lograr resultados óptimos.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 128-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales sentadas","Este ejercicio utiliza el peso de un aparato de cable para ayudar en las abdominales. Pasos: Sujete una cuerda a una polea de cable alta. Coloque un banco delante de la columna de peso del cable. Tome la cuerda sobre sus hombros y siéntese con la espalda hacia el soporte. Con los pies firmes sobre el suelo y manteniendo sus caderas fijas flexione la cintura llevando los codos hacia sus rodillas. Regrese a la posición inicial. Consejos: Realice este ejercicio de forma lenta y controlada.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 129-----------------------------------------
    	      dtoEjercioM.setAll("Bent Knee Hip Raise","Este es un buen ejercicio para desarrollar los músculos centrales. Pasos: Recuéstese boca arriba con los brazos extendidos a los lados. Doble las rodillas a un ángulo de 60 grados y levante los pies a cierta distancia del piso. Manteniendo su espalda y brazos hacia abajo, levante las caderas del piso de tal forma que sus rodillas queden sobre su pecho. Contraiga su abdomen por un momento y luego regrese a la posición inicial.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 130-----------------------------------------
    	      dtoEjercioM.setAll("Elevación de piernas","La elevación de piernas trabaja su abdomen inferior, que suele ser de difícil alcance. Pasos: Recuéstese sobre un banco plano, si tiene uno. Si no lo tiene, entonces simplemente recuéstese sobre el suelo. Mantenga sus manos bajo sus caderas para dar soporte a su espalda. Sus piernas deben colgar fuera del banco de las rodillas hacia abajo. Con los pies juntos hacia el frente, levante sus piernas rectas en dirección del techo. Mantenga las piernas rectas pero no flexione las rodillas. Sosténgalas arriba y después baje sus piernas a la posición de inicial de forma lenta y controlada. Consejos: El rango del movimiento no debe ser muy amplio para que el ejercicio sea efectivo.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 131-----------------------------------------
    	      dtoEjercioM.setAll("Side Bend","Este ejercicio trabaja los oblicuos, los músculos a ambos lados de su abdomen. Pasos: Póngase de pie con los pies separados el ancho de sus hombros, sus rodillas ligeramente flexionadas y su abdomen contraído. Sostenga una mancuerna en una mano y parándose derecho flexione la cintura hacia un lado lo más lejos posible. Lentamente vuelva a levantarse a la posición inicial. Cambie la mancuerna a la otra mano y repita el ejercicio. Consejos: Tenga cuidado de flexionar únicamente la cintura y no las caderas o las rodillas.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 132-----------------------------------------
    	      dtoEjercioM.setAll("Tablilla lateral","Es un ejercicio simple para fortalecer y acondicionar los músculos centrales. Pasos: Recuéstese sobre un lado de su cuerpo con las piernas rectas y el antebrazo perpendicular a su cuerpo, frente a usted. Contrayendo su abdomen, levántese lentamente de manera que se equilibre entre sus pies y su antebrazo. Mantenga esta posición y lentamente regrese a la posición inicial.","imagen","7","00:10:20","Masculino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 133-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales","Este es el ejercicio abdominal más común y posiblemente el que con más frecuencia se realiza de forma incorrecta. Esta es la forma correcta de realizarlo. Pasos: Recuéstese sobre su espalda con los pies sobre un banco y sus rodillas dobladas a un ángulo de 90 grados. Ponga sus manos sobre su pecho o a ambos lados de la cabeza (sobre sus orejas). Levante su cabeza, hombros y pecho del piso y hacia sus rodillas, flexionando su abdomen. Mantenga la posición por un momento y luego descienda a la posición inicial. Consejos: Durante este ejercicio mantenga sus caderas rectas y la espalda baja contra el piso.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 134-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales cruzadas","Esta versión de abdominales trabajan la parte superior e inferior del abdomen. Pasos: Recuéstese sobre su espalda y levante las rodillas hasta en ángulo de 60 grados, mantenga los pies apoyados en el piso. Coloque las manos a ambos lados de la cabeza (sobre sus orejas). Flexiónese levantando su codo derecho y su rodilla izquierda de tal forma que se toquen sobre su pecho. Regrese a la posición inicial y repítalo alternando brazos y piernas. Consejos: Contraiga su abdomen al flexionarse durante el ejercicio.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 135-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales inclinadas","Usar abdominales inclinadas le permite mantener sus piernas firmes y aislar todos los músculos abdominales. Paso: Recuéstese boca arriba sobre un banco inclinado. Apoye sus pies con firmeza bajo las almohadillas. Ponga sus manos sobre su pecho o a ambos lados de la cabeza (sobre sus orejas). Recuéstese completamente sobre su espalda y luego levántese lentamente, flexionando su abdomen. Deténgase un momento y luego regrese a la posición inicial. Consejos: Use todo el rango de movimiento en este ejercicio para lograr resultados óptimos.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 136-----------------------------------------
    	      dtoEjercioM.setAll("Abdominales sentadas","Este ejercicio utiliza el peso de un aparato de cable para ayudar en las abdominales. Pasos: Sujete una cuerda a una polea de cable alta. Coloque un banco delante de la columna de peso del cable. Tome la cuerda sobre sus hombros y siéntese con la espalda hacia el soporte. Con los pies firmes sobre el suelo y manteniendo sus caderas fijas flexione la cintura llevando los codos hacia sus rodillas. Regrese a la posición inicial. Consejos: Realice este ejercicio de forma lenta y controlada.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 137-----------------------------------------
    	      dtoEjercioM.setAll("Bent Knee Hip Raise","Este es un buen ejercicio para desarrollar los músculos centrales. Pasos: Recuéstese boca arriba con los brazos extendidos a los lados. Doble las rodillas a un ángulo de 60 grados y levante los pies a cierta distancia del piso. Manteniendo su espalda y brazos hacia abajo, levante las caderas del piso de tal forma que sus rodillas queden sobre su pecho. Contraiga su abdomen por un momento y luego regrese a la posición inicial.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 138-----------------------------------------
    	      dtoEjercioM.setAll("Elevación de piernas","La elevación de piernas trabaja su abdomen inferior, que suele ser de difícil alcance. Pasos: Recuéstese sobre un banco plano, si tiene uno. Si no lo tiene, entonces simplemente recuéstese sobre el suelo. Mantenga sus manos bajo sus caderas para dar soporte a su espalda. Sus piernas deben colgar fuera del banco de las rodillas hacia abajo. Con los pies juntos hacia el frente, levante sus piernas rectas en dirección del techo. Mantenga las piernas rectas pero no flexione las rodillas. Sosténgalas arriba y después baje sus piernas a la posición de inicial de forma lenta y controlada. Consejos: El rango del movimiento no debe ser muy amplio para que el ejercicio sea efectivo.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 139-----------------------------------------
    	      dtoEjercioM.setAll("Side Bend","Este ejercicio trabaja los oblicuos, los músculos a ambos lados de su abdomen. Pasos: Póngase de pie con los pies separados el ancho de sus hombros, sus rodillas ligeramente flexionadas y su abdomen contraído. Sostenga una mancuerna en una mano y parándose derecho flexione la cintura hacia un lado lo más lejos posible. Lentamente vuelva a levantarse a la posición inicial. Cambie la mancuerna a la otra mano y repita el ejercicio. Consejos: Tenga cuidado de flexionar únicamente la cintura y no las caderas o las rodillas.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);

    	      //fila 140-----------------------------------------
    	      dtoEjercioM.setAll("Tablilla lateral","Es un ejercicio simple para fortalecer y acondicionar los músculos centrales. Pasos: Recuéstese sobre un lado de su cuerpo con las piernas rectas y el antebrazo perpendicular a su cuerpo, frente a usted. Contrayendo su abdomen, levántese lentamente de manera que se equilibre entre sus pies y su antebrazo. Mantenga esta posición y lentamente regrese a la posición inicial.","imagen","7","00:10:20","Femenino","Avanzado");db.insertarEjercicio(dtoEjercioM);
    	    
    	      
    	      
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

     

