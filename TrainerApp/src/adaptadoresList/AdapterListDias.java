package adaptadoresList;

import java.util.ArrayList;
import clases.dominio.DtoEjercicio;
import com.trainerapp.R;
import database.controladores.DataBaseAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

@SuppressLint("InflateParams")
public class AdapterListDias extends BaseAdapter{
	 
	   private ArrayList<DtoEjercicio> listadoitemsMenu;
	   private LayoutInflater lInflater;
	   private Context context;
	   private DataBaseAdapter db;
	   private String dia;
	 
	   public AdapterListDias(Context context, ArrayList<DtoEjercicio> itemsMenu) {
	      this.lInflater = LayoutInflater.from(context);
	      this.listadoitemsMenu = itemsMenu;
	      this.context = context;
	      
	   }
	 
	   @Override
	   public int getCount() { return listadoitemsMenu.size(); }
	 
	   @Override
	   public Object getItem(int arg0) { return listadoitemsMenu.get(arg0); }
	 
	   @Override
	   public long getItemId(int arg0) { return arg0; }
	 
	   public String getItemNomEjercicio(int arg0) { return listadoitemsMenu.get(arg0).getNombre(); }
	   public String getItemIdEjer(int arg0) { return listadoitemsMenu.get(arg0).getId(); }
	   public String getItemIdEjer(int arg0, String dia) { return listadoitemsMenu.get(arg0).getId(); }
	   @SuppressLint("InflateParams")
	@Override
	   public View getView(int arg0, View arg1, ViewGroup arg2) {
	      ContenedorView contenedor = null;
	 
	      if (arg1 == null){
	         
	         if(estadoColorEjercicio(getItemIdEjer(arg0), dia)){
	        	 arg1 = lInflater.inflate(R.layout.list_item_menu_celeste, null);
	         }else{
	        	 arg1 = lInflater.inflate(R.layout.list_item_menu, null);
	         }
	         contenedor = new ContenedorView();
	         contenedor.nombreVersion = (TextView) arg1.findViewById(R.id.titulo_zona);
	         contenedor.tiempo = (TextView) arg1.findViewById(R.id.tiempoList);
	 
	         arg1.setTag(contenedor);
	      } else
	         contenedor = (ContenedorView) arg1.getTag();
	 
	      DtoEjercicio versiones = (DtoEjercicio) getItem(arg0);
	      contenedor.nombreVersion.setText(versiones.getNombre());
	      contenedor.tiempo.setText(versiones.getTiempo());
	 
	      return arg1;
	   }
	 
	   class ContenedorView{
	      TextView nombreVersion;
	      TextView tiempo;
	   }
	   private boolean estadoColorEjercicio(String id, String dia){
		   db = new DataBaseAdapter(context);
		   db.open();
		   boolean var = db.existeEjercicioUsuario(id,dia);
          db.close();
          return var;
	   }
	   public void setDia(String dia){
		   this.dia = dia;
		   
	   }
	}