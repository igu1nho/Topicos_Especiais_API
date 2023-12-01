package com.cursoandroid.navigationdrawer.ui.sobre;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_sobre, container, false);

        Button botaoSobre1 = view.findViewById(R.id.botao_sobre_1);
        Button botaoSobre2 = view.findViewById(R.id.botao_sobre_2);
        Button botaoSobre3 = view.findViewById(R.id.botao_sobre_3);
        Button botaoSobre4 = view.findViewById(R.id.botao_sobre_4);
        Button botaoSobre5 = view.findViewById(R.id.botao_sobre_5);
        Button botaoSobre6 = view.findViewById(R.id.botao_sobre_6);
        Button botaoSobre7 = view.findViewById(R.id.botao_sobre_7);
        Button botaoSobre8 = view.findViewById(R.id.botao_sobre_8);
        Button botaoSobre9 = view.findViewById(R.id.botao_sobre_9);
        Button botaoSobre10 = view.findViewById(R.id.botao_sobre_10);
        Button botaoSobre11 = view.findViewById(R.id.botao_sobre_11);
        Button botaoSobre12 = view.findViewById(R.id.botao_sobre_12);
        Button botaoSobre13 = view.findViewById(R.id.botao_sobre_13);

        botaoSobre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/about/our-mission")));
                }
            }
        });

        botaoSobre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/advanced-safety")));
                }
            }
        });

        botaoSobre3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/vehicle-electrification-systems")));
                }
            }
        });

        botaoSobre4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/connected-services")));
                }
            }
        });

        botaoSobre5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/about/sustainability")));
                }
            }
        });

        botaoSobre6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/about/our-businesses")));
                }
            }
        });

        botaoSobre7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions")));
                }
            }
        });

        botaoSobre8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions")));
                }
            }
        });

        botaoSobre9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/connected-services")));
                }
            }
        });

        botaoSobre10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hellermanntyton.com/")));
                }
            }
        });

        botaoSobre11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://motional.com/")));
                }
            }
        });

        botaoSobre12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.winconn.com/")));
                }
            }
        });

        botaoSobre13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://go.aptiv.com/subscribe-to-newsletter.html?_gl=1*hu8boi*_ga*MjExOTQyNzQ5LjE2OTU2NzgxOTY.*_ga_8BB7EKY3SZ*MTY5NjQ1MTg3OS4xMC4xLjE2OTY0NTI2NTcuMC4wLjA.")));
                }
            }
        });

        return view;
    }
}
