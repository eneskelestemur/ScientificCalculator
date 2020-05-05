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

import com.example.scientificcalculator.ui.main.PhysicsFormulas;

public class Frag3 extends Fragment{

    PhysicsFormulas phys = new PhysicsFormulas();

    Button m_btn;

    Button g_btn;

    EditText force_m;
    EditText mass;
    EditText acceleration;

    EditText force_g;
    EditText fmass;
    EditText smass;
    EditText radius;


    double fm;
    double m;
    double a;
    double motionResult;

    double fg;
    double m1;
    double m2;
    double r;
    double gravResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.frag3_layout,container,false);

        m_btn = (Button) rootView.findViewById(R.id.motion_btn);
        g_btn = (Button) rootView.findViewById(R.id.grav_btn);

        force_m = (EditText) rootView.findViewById(R.id.force);
        mass = (EditText) rootView.findViewById(R.id.mass);
        acceleration = (EditText) rootView.findViewById(R.id.acceleration);

        force_g = (EditText) rootView.findViewById(R.id.grav_force);
        fmass = (EditText) rootView.findViewById(R.id.first_mass);
        smass = (EditText) rootView.findViewById(R.id.second_mass);
        radius = (EditText) rootView.findViewById(R.id.radius);

        m_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                fm = Double.valueOf(force_m.getText().toString());
                m = Double.valueOf(mass.getText().toString());
                a = Double.valueOf(acceleration.getText().toString());
                motionResult = phys.motionEq(fm, m, a);
                if (motionResult == 0.0) {
                    Toast.makeText(getActivity(), "Sorry Something Went Wrong. Try Again.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Value is:" + motionResult,Toast.LENGTH_LONG).show();
                }
            }
        });

        g_btn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                fg = Double.valueOf(force_g.getText().toString());
                m1 = Double.valueOf(fmass.getText().toString());
                m2 = Double.valueOf(smass.getText().toString());
                r = Double.valueOf(radius.getText().toString());
                gravResult = phys.gravitationEq(fg, m1, m2, r);
                if (gravResult == 0.0) {
                    Toast.makeText(getActivity(), "Sorry Something Went Wrong. Try Again.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Value is:" + gravResult,Toast.LENGTH_LONG).show();
                }
            }
        });

        return rootView;
    }


}
