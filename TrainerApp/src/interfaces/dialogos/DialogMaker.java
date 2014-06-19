package interfaces.dialogos;

import com.trainerapp.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class DialogMaker {

	
	/**
	 * Est� m�todo retorna un objeto DialogCustom (extiende Dialog) para mostrar una aviso o alerta. 
	 * A este dialog tambi�n se le pueden agregar botones con los m�todos <i>setPositiveButton(...)</i> y 
	 * <i>setNegativeButton(...)</i>
	 * El DialogCustom se debe mostrar con el m�todo <i>show()</i>.
	 * 
	 * @param act	La actividad que brindar� el contexto para mostrar el Dialog
	 * @param title	El t�tulo del dialog
	 * @param text	El texto que contiene el dialog
	 * @return		el objeto DialogCustom
	 */
	public static DialogCustom createAlertDialog(Activity act, String title, String text) {
		
		LayoutInflater inflater = (LayoutInflater) act.getSystemService(
				Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.dialog_alert,null);
		
		TextView tv_titulo = (TextView) v.findViewById(R.id.textViewDialogInfoTitulo);
		tv_titulo.setText(title);
		
		TextView tv_texto = (TextView) v.findViewById(R.id.textViewDialogInfoTexto);
		tv_texto.setText(text);
		
		DialogCustom dialogCustom = new DialogCustom(act,R.style.CustomDialog);
		dialogCustom.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialogCustom.setContentView(v);
		dialogCustom.setCanceledOnTouchOutside(true);
		
		return dialogCustom;
	}
	
	/**
	 * Est� m�todo retorna un objeto DialogListCustom (extiende Dialog) para mostrar un dialog con ListView. 
	 * Posterior a crear el dialog se le debe asignar el adapter con <i>setListAdapter(...)</i>. Tambi�n se le
	 * puede asignar una acci�n al presionar un elemento de la lista con <i>setOnListItemClickListener(...)</i>
	 * El DialogCustom se debe mostrar con el m�todo <i>show()</i>.
	 * 
	 * @param act	La actividad que brindar� el contexto para mostrar el Dialog
	 * @param title	El t�tulo del dialog
	 * @return		el objeto DialogListCustom
	 */
	public static DialogListCustom createListAlertDialog(Activity act, String title){
		
		LayoutInflater inflater =(LayoutInflater) act.getSystemService(
				Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.dialog_list_alert,null);
		
		TextView tv_titulo = (TextView) v.findViewById(R.id.textViewDialogListInfoTitulo);
		tv_titulo.setText(title);
		
		DialogListCustom dialogCustom = new DialogListCustom(act,R.style.CustomDialog);
		dialogCustom.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialogCustom.setContentView(v);
		dialogCustom.setCanceledOnTouchOutside(true);
		
		return dialogCustom;
		
	}
	
	public static DialogProgressCustom createProgressDialog(Activity act, String title,String texto){
	
		LayoutInflater inflater =(LayoutInflater) act.getSystemService(
				Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.dialog_progress_alert,null);
		
		TextView tv_titulo = (TextView) v.findViewById(R.id.textViewDialogProgressTitulo);
		tv_titulo.setText(title);
		
		TextView tv_texto  = (TextView) v.findViewById(R.id.textViewDialogProgressText);
		tv_texto.setText(texto);
		
		DialogProgressCustom dialogCustom = new DialogProgressCustom(act,R.style.CustomDialog);
		dialogCustom.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialogCustom.setContentView(v);
		dialogCustom.setCanceledOnTouchOutside(false);
		//dialogCustom.setCancelable(false);
		
		return dialogCustom;
		
	}

}
