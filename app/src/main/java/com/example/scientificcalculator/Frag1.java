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

import com.example.scientificcalculator.ui.main.BiologyFormulas;

public class Frag1 extends Fragment{

    BiologyFormulas bio = new BiologyFormulas();

    Button conc_btn;

    Button hw_btn;

    EditText init_conc;
    EditText init_vol;
    EditText fin_conc;
    EditText fin_vol;

    EditText p;
    EditText q;

    double iconc;
    double ivol;
    double fconc;
    double fvol;
    double concResult;

    double pval;
    double qval;
    double hwResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.frag1_layout,container,false);

        conc_btn = (Button) rootView.findViewById(R.id.conc_btn);
        hw_btn = (Button) rootView.findViewById(R.id.hw_btn);

        init_conc = (EditText) rootView.findViewById(R.id.init_conc);
        init_vol = (EditText) rootView.findViewById(R.id.init_vol);
        fin_conc = (EditText) rootView.findViewById(R.id.fin_conc);
        fin_vol = (EditText) rootView.findViewById(R.id.fin_vol);

        p = (EditText) rootView.findViewById(R.id.p);
        q = (EditText) rootView.findViewById(R.id.q);

        conc_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                iconc = Double.valueOf(init_conc.getText().toString());
                ivol = Double.valueOf(init_vol.getText().toString());
                fconc = Double.valueOf(fin_conc.getText().toString());
                fvol = Double.valueOf(fin_vol.getText().toString());
                concResult = bio.concetrationEq(iconc, ivol, fconc, fvol);
                if (concResult == 0.0) {
                    Toast.makeText(getActivity(), "Sorry Something Went Wrong. Try Again.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Value is:" + concResult,Toast.LENGTH_LONG).show();
                }
            }
        });

        hw_btn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pval = Double.valueOf(p.getText().toString());
                qval = Double.valueOf(q.getText().toString());
                hwResult = bio.hardyWeinbergEq(pval, qval);
                if (hwResult == 0.0) {
                    Toast.makeText(getActivity(), "Sorry Something Went Wrong. Try Again.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Value is:" + hwResult,Toast.LENGTH_LONG).show();
                }
            }
        });

        return rootView;
    }


}
