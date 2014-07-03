package com.trainerapp;

import clases.dominio.DtoEjercicioUsuario;
import database.controladores.DataBaseAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;

public class FragmentDescripcion extends Fragment {
	
	private String id;
	private String dia;
	private CheckBox chkBox;
	private DataBaseAdapter db;

    // newInstance constructor for creating fragment with arguments
    public static FragmentDescripcion newInstance(int page, String title, String id, String dia) {
    	FragmentDescripcion fragmentFirst = new FragmentDescripcion();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        args.putString("ID", id);
        args.putString("DIA", dia);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        id = getArguments().getString("ID");
        dia = getArguments().getString("DIA");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descripcion, container, false);
        @SuppressWarnings("unused")
		TextView descripcion = (TextView) view.findViewById(R.id.txtDescripcion);
        chkBox = (CheckBox) view.findViewById(R.id.chkBox);
        db = new DataBaseAdapter(getActivity());
        db.open();
      chkBox.setChecked(db.existeEjercicioUsuario(id,dia));
     db.close();
     chkBox.setOnClickListener(new OnClickListener() {
   	  public void onClick(View v) {
                   db.open();
   		if (((CheckBox) v).isChecked()) {
   			if(!db.existeEjercicioUsuario(id,dia)){
   				DtoEjercicioUsuario dtoEjerUs = new DtoEjercicioUsuario();
   				dtoEjerUs.setAll(id, dia);
   				db.insertarEjercicioUsuario(dtoEjerUs);
   				
   			}
   		}else { db.borrarEjercicio(id);
   			   
   		}
        db.close();
   	  }
   	 
   	});
        return view;
    }
}