package com.trainerapp;

import database.controladores.DataBaseAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentInicio extends Fragment {

	 // Store instance variables
	private String id;
	private String dia;
	@SuppressWarnings("unused")
	private DataBaseAdapter db;

    // newInstance constructor for creating fragment with arguments
    public static FragmentInicio newInstance(int page, String title, String id, String dia) {
    	FragmentInicio fragmentFirst = new FragmentInicio();
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
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel1);
        db = new DataBaseAdapter(getActivity());
        tvLabel.setText(id + " -- " + dia);
        return view;
    }
}