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

public class FragmentFinal extends Fragment {

//    private String id;
//    private DataBaseAdapter db;
//	private String dia;
//	private CheckBox chkBox;
//	private String position;
//
//	@Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//            Bundle savedInstanceState) {
//        ViewGroup rootView = (ViewGroup) inflater.inflate(
//                R.layout.fragment_screen_slide_page, container, false);
//        chkBox = (CheckBox) rootView.findViewById(R.id.chkBox);
//        db = new DataBaseAdapter(getActivity());
//        Bundle args = getArguments();
//        id = args.getString("ID");
//        dia = args.getString("DIA");
//        position = args.getString("POSITION");
//        db.open();
//        chkBox.setChecked(db.existeEjercicioUsuario(id,dia));
//       db.close();
//       chkBox.setOnClickListener(new OnClickListener() {
//     	  public void onClick(View v) {
//                     db.open();
//     		if (((CheckBox) v).isChecked()) {
//     			if(!db.existeEjercicioUsuario(id,dia)){
//     				DtoEjercicioUsuario dtoEjerUs = new DtoEjercicioUsuario();
//     				dtoEjerUs.setAll(id, dia);
//     				db.insertarEjercicioUsuario(dtoEjerUs);
//     				
//     			}
//     		}else { db.borrarEjercicio(id);
//     			   
//     		}
//          db.close();
//     	  }
//     	 
//     	});
//
//        return rootView;
//    }
	 // Store instance variables
    private String title;
    private int page;
	private String id;
	private String dia;
	private DataBaseAdapter db;

    // newInstance constructor for creating fragment with arguments
    public static FragmentFinal newInstance(int page, String title, String id, String dia) {
    	FragmentFinal fragmentFirst = new FragmentFinal();
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
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
        id = getArguments().getString("ID");
        dia = getArguments().getString("DIA");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_final, container, false);
        db = new DataBaseAdapter(getActivity());
        return view;
    }
}