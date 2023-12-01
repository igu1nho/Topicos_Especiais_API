package com.cursoandroid.navigationdrawer.ui.solucoes;

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


public class SolucoesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_solucoes, container, false);

        Button botaoSolucoes1 = view.findViewById(R.id.botao_solucoes_1);
        Button botaoSolucoes2 = view.findViewById(R.id.botao_solucoes_2);
        Button botaoSolucoes3 = view.findViewById(R.id.botao_solucoes_3);
        Button botaoSolucoes4 = view.findViewById(R.id.botao_solucoes_4);
        Button botaoSolucoes5 = view.findViewById(R.id.botao_solucoes_5);
        Button botaoSolucoes6 = view.findViewById(R.id.botao_solucoes_6);
        Button botaoSolucoes7 = view.findViewById(R.id.botao_solucoes_7);
        Button botaoSolucoes8 = view.findViewById(R.id.botao_solucoes_8);
        Button botaoSolucoes9 = view.findViewById(R.id.botao_solucoes_9);
        Button botaoSolucoes10 = view.findViewById(R.id.botao_solucoes_10);
        Button botaoSolucoes11 = view.findViewById(R.id.botao_solucoes_11);
        Button botaoSolucoes12 = view.findViewById(R.id.botao_solucoes_12);
        Button botaoSolucoes13 = view.findViewById(R.id.botao_solucoes_13);
        Button botaoSolucoes14 = view.findViewById(R.id.botao_solucoes_14);
        Button botaoSolucoes15 = view.findViewById(R.id.botao_solucoes_15);
        Button botaoSolucoes16 = view.findViewById(R.id.botao_solucoes_16);

        botaoSolucoes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/advanced-safety")));
                }
            }
        });

        botaoSolucoes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/connected-services")));
                }
            }
        });

        botaoSolucoes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/connection-systems")));
                }
            }
        });

        botaoSolucoes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/connectivity-and-security")));
                }
            }
        });

        botaoSolucoes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/electrical-distribution-systems")));
                }
            }
        });

        botaoSolucoes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/middleware-devops")));
                }
            }
        });

        botaoSolucoes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/aptiv-services")));
                }
            }
        });

        botaoSolucoes8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/smart-vehicle-architecture")));
                }
            }
        });

        botaoSolucoes9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/user-experience")));
                }
            }
        });

        botaoSolucoes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/vehicle-electrification-systems")));
                }
            }
        });

        botaoSolucoes11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hellermanntyton.com/")));
                }
            }
        });

        botaoSolucoes12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.intercable-as.com/")));
                }
            }
        });

        botaoSolucoes13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://motional.com/")));
                }
            }
        });

        botaoSolucoes14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.winconn.com/")));
                }
            }
        });

        botaoSolucoes15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.windriver.com/")));
                }
            }
        });

        botaoSolucoes16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/innovation-in-motion/video-series")));
                }
            }
        });

        return view;
    }

}
