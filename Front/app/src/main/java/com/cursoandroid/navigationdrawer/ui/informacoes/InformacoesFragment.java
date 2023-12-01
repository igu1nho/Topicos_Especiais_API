package com.cursoandroid.navigationdrawer.ui.informacoes;

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

public class InformacoesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_informacoes, container, false);

        Button botaoInformacoes1 = view.findViewById(R.id.botao_informacoes_1);
        Button botaoInformacoes2 = view.findViewById(R.id.botao_informacoes_2);
        Button botaoInformacoes3 = view.findViewById(R.id.botao_informacoes_3);
        Button botaoInformacoes4 = view.findViewById(R.id.botao_informacoes_4);
        Button botaoInformacoes5 = view.findViewById(R.id.botao_informacoes_5);
        Button botaoInformacoes6 = view.findViewById(R.id.botao_informacoes_6);

        botaoInformacoes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/global-search?categorytitle=Insights&newstypes=Mobility%20Insider")));
                }
            }
        });

        botaoInformacoes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/advanced-safety")));
                }
            }
        });

        botaoInformacoes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/autonomous-mobility")));
                }
            }
        });

        botaoInformacoes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/solutions/vehicle-electrification-systems")));
                }
            }
        });

        botaoInformacoes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aptiv.com/en/insights/search?categorytitle=Insights&newstypes=Articles")));
                }
            }
        });

        botaoInformacoes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://go.aptiv.com/subscribe-to-newsletter.html?_gl=1*yi7oqd*_ga*MjExOTQyNzQ5LjE2OTU2NzgxOTY.*_ga_8BB7EKY3SZ*MTY5NjU5NzgyNi4xMi4xLjE2OTY2MDQyNzEuMC4wLjA.")));
                }
            }
        });

        return view;
    }
}
