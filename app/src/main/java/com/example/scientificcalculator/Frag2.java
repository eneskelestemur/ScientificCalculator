package com.example.scientificcalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.example.scientificcalculator.ui.main.ChemistryFormulas;

public class Frag2 extends Fragment{

    ChemistryFormulas chem = new ChemistryFormulas();

    Button ig_btn;

    Button den_btn;

    EditText p_ig;
    EditText v_ig;
    EditText n_ig;
    EditText t_ig;

    EditText d_den;
    EditText m_den;
    EditText v_den;

    double pressure;
    double volume_ig;
    double moles;
    double temp;
    double igResult;

    double density;
    double mass;
    double volume_den;
    double denResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.frag2_layout,container,false);

        ig_btn = (Button) rootView.findViewById(R.id.ig_btn);
        den_btn = (Button) rootView.findViewById(R.id.den_btn);

        p_ig = (EditText) rootView.findViewById(R.id.pressure);
        v_ig = (EditText) rootView.findViewById(R.id.volume_gas);
        n_ig = (EditText) rootView.findViewById(R.id.moles);
        t_ig = (EditText) rootView.findViewById(R.id.temp_k);

        d_den = (EditText) rootView.findViewById(R.id.density);
        m_den = (EditText) rootView.findViewById(R.id.mass);
        v_den = (EditText) rootView.findViewById(R.id.volume_den);

        ig_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                pressure = Double.valueOf(p_ig.getText().toString());
                volume_ig = Double.valueOf(v_ig.getText().toString());
                moles = Double.valueOf(n_ig.getText().toString());
                temp = Double.valueOf(t_ig.getText().toString());
                igResult = chem.idealGasEq(pressure, volume_ig, moles, temp);
                if (igResult == 0.0) {
                    Toast.makeText(getActivity(), "Sorry Something Went Wrong. Try Again.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Value is:" + igResult,Toast.LENGTH_LONG).show();
                }
            }
        });

        den_btn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                density = Double.valueOf(d_den.getText().toString());
                mass = Double.valueOf(m_den.getText().toString());
                volume_den = Double.valueOf(v_den.getText().toString());
                denResult = chem.densityEq(density, mass, volume_den);
                if (denResult == 0.0) {
                    Toast.makeText(getActivity(), "Sorry Something Went Wrong. Try Again.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Value is:" + denResult,Toast.LENGTH_LONG).show();
                }
            }
        });

        return rootView;
    }


}
