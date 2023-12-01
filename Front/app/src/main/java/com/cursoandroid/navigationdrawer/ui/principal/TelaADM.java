package com.cursoandroid.navigationdrawer.ui.principal;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cursoandroid.navigationdrawer.R;
import java.util.ArrayList;
import java.util.List;

public class TelaADM extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SearchView searchView;
    private List<Item> itemList;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adm_tela);

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList = new ArrayList<>();

        itemList.add(new Item("Alessandra Aparecida Costa", R.drawable.avatar6_mulher, "876543"));
        itemList.add(new Item("Amanda Beatriz Oliveira", R.drawable.avatar7_mulher, "987321"));
        itemList.add(new Item("Bernardo Benício Martins", R.drawable.avatar1, "123789"));
        itemList.add(new Item("Bruno César Pereira", R.drawable.avatar2, "900011"));
        itemList.add(new Item("Camila Cristina Silva", R.drawable.avatar8_mulher, "889900"));
        itemList.add(new Item("Carolina da Silva Santos", R.drawable.avatar9_mulher, "778899"));
        itemList.add(new Item("Daniel de Oliveira Lima", R.drawable.avatar3, "667788"));
        itemList.add(new Item("Diego Eduardo Souza", R.drawable.avatar4, "556677"));
        itemList.add(new Item("Eduarda Elisa Pereira", R.drawable.avatar10_mulher, "445566"));
        itemList.add(new Item("Érica Fernanda Lima", R.drawable.avatar6_mulher, "334455"));
        itemList.add(new Item("Fabrício Fernando Santos", R.drawable.avatar5, "223344"));
        itemList.add(new Item("Francisco Eugênio dos Reis", R.drawable.avatar1, "678901"));
        itemList.add(new Item("Gabriela Inês", R.drawable.avatar7_mulher, "112233"));
        itemList.add(new Item("Giovana Gabriela Almeida", R.drawable.avatar8_mulher, "999000"));
        itemList.add(new Item("Henrique Humberto Rocha", R.drawable.avatar2, "888999"));
        itemList.add(new Item("Hugo José Oliveira", R.drawable.avatar3, "777888"));
        itemList.add(new Item("Isabela Karla Costa", R.drawable.avatar9_mulher, "555666"));
        itemList.add(new Item("Isabella Isadora Souza", R.drawable.avatar10_mulher, "062502"));
        itemList.add(new Item("João Luiz Pereira", R.drawable.avatar4, "952501"));
        itemList.add(new Item("Joaquim José Pereira", R.drawable.avatar5, "444555"));
        itemList.add(new Item("Karina Lopes Martins", R.drawable.avatar6_mulher, "333444"));
        itemList.add(new Item("Karla Karina Oliveira", R.drawable.avatar7_mulher, "222333"));
        itemList.add(new Item("Leandro Lucas Martins", R.drawable.avatar1, "111222"));
        itemList.add(new Item("Lucas Miguel Alves", R.drawable.avatar2, "900123"));
        itemList.add(new Item("Maria da Conceição", R.drawable.avatar8_mulher, "123456"));
        itemList.add(new Item("Mariana Michelle Costa", R.drawable.avatar9_mulher, "890012"));
        itemList.add(new Item("Nelson Oliveira Castro", R.drawable.avatar3, "789001"));
        itemList.add(new Item("Nícolas Natanael Silva", R.drawable.avatar4, "678890"));
        itemList.add(new Item("Olívia Otília Alves", R.drawable.avatar10_mulher, "567789"));
        itemList.add(new Item("Otávio Pereira Silva", R.drawable.avatar5, "456678"));
        itemList.add(new Item("Patrícia Regina Lima", R.drawable.avatar6_mulher, "345567"));
        itemList.add(new Item("Pedro Paulo Lima", R.drawable.avatar1,"234456"));
        itemList.add(new Item("Rafael Santos Costa", R.drawable.avatar2, "123345"));
        itemList.add(new Item("Raquel Roberta Silva", R.drawable.avatar7_mulher, "901234"));
        itemList.add(new Item("Samuel Sérgio Santos", R.drawable.avatar3, "890123"));
        itemList.add(new Item("Sara Teixeira Nunes", R.drawable.avatar8_mulher, "789012"));
        itemList.add(new Item("Thaís Talita Neves", R.drawable.avatar9_mulher, "567890"));
        itemList.add(new Item("Thalita Fortes Domingos", R.drawable.avatar10_mulher, "345678"));
        itemList.add(new Item("Vanessa Xavier Santos", R.drawable.avatar6_mulher, "234567"));
        itemList.add(new Item("Victor Vinícius Nunes", R.drawable.avatar4, "456789"));

        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);
    }

    private void filterList(String newText) {
        List<Item> filteredList = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getItemName().toLowerCase().contains(newText.toLowerCase()) ||
                    item.getRegistro().toLowerCase().contains(newText.toLowerCase())) {
                filteredList.add(item);
            }

            if (filteredList.isEmpty()) {
                // Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
            } else {
                itemAdapter.setFilteredList(filteredList);
            }
        }
    }
}