package com.cursoandroid.navigationdrawer.ui.configuracoes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.cursoandroid.navigationdrawer.R;

import org.json.JSONException;
import org.json.JSONObject;

public class AlterarSenhaFragment extends Fragment {

    private EditText editSenhaAtual, editNovaSenha, editConfirmarSenha;
    private Button botaoConfirmar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alterar_senha, container, false);
        initializeViews(view);
        setupButtonClickListener();
        return view;
    }

    private void initializeViews(View view) {
        editSenhaAtual = view.findViewById(R.id.editSenhaAtual);
        editNovaSenha = view.findViewById(R.id.editNovaSenha);
        editConfirmarSenha = view.findViewById(R.id.editConfirmarSenha);
        botaoConfirmar = view.findViewById(R.id.botaoConfirmar);
    }

    private void setupButtonClickListener() {
        botaoConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptPasswordChange();
            }
        });
    }

    private void attemptPasswordChange() {
        FragmentActivity act = getActivity();
        if (act != null) {
            if (isAnyFieldEmpty()) {
                showAlert("Preencha todos os campos!");
            } else if (!editNovaSenha.getText().toString().equals(editConfirmarSenha.getText().toString())) {
                showAlert("A nova senha e a confirmação não coincidem!");
            } else if (!isCurrentPasswordCorrect()) {
                showAlert("Senha atual incorreta!");
            } else {
                // Implementando a lógica de alteração de senha
                showAlert("Senha alterada com sucesso!");
            }
        }
    }

    private boolean isAnyFieldEmpty() {
        return TextUtils.isEmpty(editSenhaAtual.getText()) ||
                TextUtils.isEmpty(editNovaSenha.getText()) ||
                TextUtils.isEmpty(editConfirmarSenha.getText());
    }

    private boolean isCurrentPasswordCorrect() {
        String currentPassword = editSenhaAtual.getText().toString();

        // URL de verificação de senha
        String url = "http://localhost:8000/verificarSenha";

        // Criando um objeto JSONObject para enviar no corpo da requisição
        JSONObject passwordObject = new JSONObject();
        try {
            passwordObject.put("senha", currentPassword);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Criando uma requisição POST para o servidor
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.POST, url, passwordObject, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        // Tratando a resposta do servidor
                        try {
                            boolean isPasswordCorrect = response.getBoolean("isPasswordCorrect");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                    }
                });

        // Adicionando a requisição à fila de requisições
        RequestQueue queue = Volley.newRequestQueue(getContext());
        queue.add(jsonObjectRequest);

        return false;
    }

    private void showAlert(String message) {
        new AlertDialog.Builder(getContext())
                .setMessage(message)
                .setNeutralButton("Ok", null)
                .show();
    }
}
