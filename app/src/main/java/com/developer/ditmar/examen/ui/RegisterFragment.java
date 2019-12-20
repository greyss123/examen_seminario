package com.developer.ditmar.examen.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.ditmar.examen.R;


public class RegisterFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    public RegisterFragment() {
        @SuppressWarnings("unused")
        public static RegisterFragment newInstance(int columnCount) {
            AFragment fragment = new RegisterFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_COLUMN_COUNT, columnCount);
            fragment.setArguments(args);
            return fragment;
        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_b, container, false);
        return inflater.inflate(R.layout.fragment_register, container, false);
    }
}
