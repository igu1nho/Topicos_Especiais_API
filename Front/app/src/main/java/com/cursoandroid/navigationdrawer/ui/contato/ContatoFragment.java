package com.cursoandroid.navigationdrawer.ui.contato;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContatoFragment extends Fragment {


    public ContatoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "ENTRE EM CONTATO COM A APTIV";

        Element versao = new Element();
        versao.setTitle( "Versão 1.0" );

        return new AboutPage( getActivity() )
                //.setImage( R.drawable.logo )
                .setDescription( descricao )

                .addGroup("Contato")
                .addEmail("inatel@inatel.br", "Envie um e-mail")
                .addWebsite("https://www.aptiv.com/", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("https://www.facebook.com/Aptiv/", "Facebook")
                .addInstagram("https://www.instagram.com/aptiv/", "Instagram")
                .addYoutube("https://www.youtube.com/aptiv", "Youtube")
                .addGitHub("thalitaDomingos", "GitHub")

                .addItem( versao )
                .create();
        }
}
