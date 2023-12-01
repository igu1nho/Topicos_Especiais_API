package com.cursoandroid.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class TelaLogin extends AppCompatActivity {

    private EditText editRegistro;
    private EditText editSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_tela);

        editRegistro = findViewById(R.id.editRegistro);
        editSenha = findViewById(R.id.editSenha);
        Button botaoEntrar = findViewById(R.id.botaoEntrar);

        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fazerLogin();
            }
        });
    }

    private void fazerLogin() {
        String registro = editRegistro.getText().toString().trim();
        String senha = editSenha.getText().toString().trim();

        if (registro.isEmpty() || senha.isEmpty()) {
            Toast.makeText(this, "Insira o registro e a senha", Toast.LENGTH_SHORT).show();
            return;
        }

        String url = "http://10.0.2.2:8000/users/login";  // Substitua pelo seu endereço correto
        final JSONObject postData = new JSONObject();
        try {
            postData.put("numero_registro", registro);
            postData.put("senha", senha);
            Log.d("Body res: ", postData.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, postData,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("Volley Response", response.toString());

                        try {
                            String status = response.getString("status_code");
                            String message = response.getString("detail");

                            Log.d("Volley Status", status);
                            Log.d("Volley Message", message);

                            if ("200".equals(status)) {
                                Toast.makeText(TelaLogin.this, message, Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(TelaLogin.this, "Erro ao logar" + message, Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(TelaLogin.this, "Erro ao processar a resposta", Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Adicione logs para informações detalhadas sobre o erro
                        Log.e("Volley Error", "Erro na requisição Volley", error);

                        if (error.networkResponse != null) {
                            int statusCode = error.networkResponse.statusCode;
                            Log.e("Volley Status Code", String.valueOf(statusCode));
                        }

                        Toast.makeText(TelaLogin.this, "Erro na requisição Volley", Toast.LENGTH_SHORT).show();
                    }
                }


        );

        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jsonObjectRequest);
    }
}

