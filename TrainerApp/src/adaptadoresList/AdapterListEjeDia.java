package adaptadoresList;

import java.util.ArrayList;

import com.trainerapp.ActivityDiaEntrenamiento;
import com.trainerapp.R;

import database.controladores.DataBaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

public class AdapterListEjeDia extends BaseAdapter{
	 
	   private ArrayList<MenuItem> listadoitemsMenu;
	   private LayoutInflater lInflater;
	   private DataBaseAdapter db;
	   private ActivityDiaEntrenamiento activity ;
	   public AdapterListEjeDia(Context context, ArrayList<MenuItem> itemsMenu, ActivityDiaEntrenamiento activity) {
	      this.lInflater = LayoutInflater.from(context);
	      this.listadoitemsMenu = itemsMenu;
	      this.activity = activity;
	   }
	 
	   @Override
	   public int getCount() { return listadoitemsMenu.size(); }
	 
	   @Override
	   public Object getItem(int arg0) { return listadoitemsMenu.get(arg0); }
	 
	   @Override
	   public long getItemId(int arg0) { return arg0; }
	   public String getItemIdEjercicioUsu(int arg0) { return listadoitemsMenu.get(arg0).getId(); }
	 
	   public String getItemNomEjercicio(int arg0) { return listadoitemsMenu.get(arg0).getNombre(); }
	   @Override
	   public View getView(final int arg0, View arg1, ViewGroup arg2) {
	      ContenedorView contenedor = null;
	      db =new DataBaseAdapter(activity);
	      if (arg1 == null){
	         arg1 = lInflater.inflate(R.layout.list_item_ejercicios_dia, null);
	         contenedor = new ContenedorView();
	         contenedor.btnEliminar = (ImageButton) arg1.findViewById(R.id.ibtnEliminar);
	         contenedor.nombreVersion = (TextView) arg1.findViewById(R.id.titulo_zona);
	         contenedor.tiempo = (TextView) arg1.findViewById(R.id.tiempoList);
	         
	         //Eliminar Ejercicios
	         contenedor.btnEliminar.setOnClickListener(new OnClickListener() {
			     @Override
			        public void onClick(View v) {
			    	 	db.open();
			    	 	db.borrarEjercicioUsuario(getItemIdEjercicioUsu(arg0));
			    	 	activity.agregarListDias();
			    	 	activity.actualizarTiempo();
			    	 	db.close();
			    	 	
			     }
			    });
	 
	         arg1.setTag(contenedor);
	      } else
	         contenedor = (ContenedorView) arg1.getTag();
	 
	      MenuItem versiones = (MenuItem) getItem(arg0);
	      contenedor.nombreVersion.setText(versiones.getNombre());
	      contenedor.tiempo.setText(versiones.getTiempo());
	 
	      return arg1;
	   }
	 
	   class ContenedorView{
	      TextView nombreVersion;
	      TextView tiempo;
	      ImageButton btnEliminar;
	   }
	}