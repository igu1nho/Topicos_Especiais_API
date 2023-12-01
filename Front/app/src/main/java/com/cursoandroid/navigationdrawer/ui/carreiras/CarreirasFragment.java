package com.cursoandroid.navigationdrawer.ui.carreiras;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.cursoandroid.navigationdrawer.R;

public class CarreirasFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_carreiras, container, false);

        Button botaoCarreiras1 = view.findViewById(R.id.botao_carreiras_1);
        Button botaoCarreiras2 = view.findViewById(R.id.botao_carreiras_2);
        Button botaoCarreiras3 = view.findViewById(R.id.botao_carreiras_3);
        Button botaoCarreiras4 = view.findViewById(R.id.botao_carreiras_4);
        Button botaoCarreiras5 = view.findViewById(R.id.botao_carreiras_5);
        Button botaoCarreiras6 = view.findViewById(R.id.botao_carreiras_6);
        Button botaoCarreiras7 = view.findViewById(R.id.botao_carreiras_7);
        Button botaoCarreiras8 = view.findViewById(R.id.botao_carreiras_8);
        Button botaoCarreiras9 = view.findViewById(R.id.botao_carreiras_9);
        Button botaoCarreiras10 = view.findViewById(R.id.botao_carreiras_10);

        botaoCarreiras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/jobs/key-hiring-areas/software")));
                }
            }
        });

        botaoCarreiras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/jobs/key-hiring-areas/hardware")));
                }
            }
        });

        botaoCarreiras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/jobs/key-hiring-areas/manufacturing")));
                }
            }
        });

        botaoCarreiras4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/jobs/key-hiring-areas/systems-and-pm")));
                }
            }
        });

        botaoCarreiras5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/jobs/key-hiring-areas/agile")));
                }
            }
        });

        botaoCarreiras6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/jobs/key-hiring-areas/corporate-functions")));
                }
            }
        });

        botaoCarreiras7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/advanced-safety")));
                }
            }
        });

        botaoCarreiras8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/vehicle-electrification-systems")));
                }
            }
        });

        botaoCarreiras9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/connected-services")));
                }
            }
        });

        botaoCarreiras10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://go.aptiv.com/subscribe-to-newsletter.html?_gl=1*jb09bl*_ga*MjExOTQyNzQ5LjE2OTU2NzgxOTY.*_ga_8BB7EKY3SZ*MTY5NjU5NzgyNi4xMi4xLjE2OTY1OTk5OTUuMC4wLjA.")));
                }
            }
        });

        return view;
    }
}
