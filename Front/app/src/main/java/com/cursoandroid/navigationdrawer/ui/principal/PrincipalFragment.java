package com.cursoandroid.navigationdrawer.ui.principal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cursoandroid.navigationdrawer.R;

import java.util.Random;

public class PrincipalFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_principal, container, false);

        Button buttonBradesco = view.findViewById(R.id.buttonBradesco);
        Button buttonAlelo = view.findViewById(R.id.buttonAlelo);
        Button buttonUnimed = view.findViewById(R.id.buttonUnimed);
        Button buttonUniodonto = view.findViewById(R.id.buttonUniodonto);
        Button buttonFarmacia = view.findViewById(R.id.buttonFarmacia);
        Button buttonMaps = view.findViewById(R.id.buttonMaps);
        Button buttonPortoSeguro = view.findViewById(R.id.buttonPortoSeguro);
        Button buttonCartao = view.findViewById(R.id.buttonCartao);
        Button buttonUber = view.findViewById(R.id.buttonUber);
        Button botaoVerBeneficios = view.findViewById(R.id.botaoVerBeneficios);
        TextView text_view_progress = view.findViewById(R.id.text_view_progress);
        TextView text_view_progress1 = view.findViewById(R.id.text_view_progress1);
        ProgressBar progress_bar = view.findViewById(R.id.progress_bar);

        buttonAlelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    //startActivity(new Intent(act, Class.class));
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=air.br.com.alelo.mobile.android&hl=pt_BR&gl=US")));
                }
            }
        });

        buttonBradesco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.bradesco")));
                }
            }
        });

        buttonUnimed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=br.com.app.centralnacionalunimed&hl=pt_BR&gl=US")));
                }
            }
        });

        buttonUniodonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.intuitiveappz.uniodonto&hl=pt_BR&gl=US")));
                }
            }
        });

        buttonFarmacia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=br.com.funcional.beneficiario&hl=pt")));
                }
            }
        });

        buttonMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/-22.2521434,-45.7041186/Rua+Jos%C3%A9+Monfardini,+3845+-+Distrito+Industrial+Waldemar+Pereira,+Esp%C3%ADrito+Santo+do+Pinhal+-+SP,+13990-000/@-22.1367601,-46.9123462,9z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x94c9ad3a9208759b:0xaebc1599868cef0a!2m2!1d-46.7892971!2d-22.2235618?entry=ttu")));
                }
            }
        });

        buttonPortoSeguro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=br.com.portoseguro.experienciacliente.mundoporto&hl=pt_BR&gl=US")));
                }
            }
        });

        buttonUber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ubercab&hl=pt_BR&gl=US")));
                }
            }
        });

        buttonCartao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, Holerite.class));
                }
            }
        });

        int progress = new Random().nextInt(100);
        progress_bar.setProgress(progress);
        text_view_progress.setText("" + progress);
        text_view_progress1.setText("" + "pontos");

        botaoVerBeneficios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, Beneficios.class));
                }
            }
        });
        return view;
    }
}