package br.com.flap.listcomponents.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import br.com.flap.listcomponents.R;

public class MainActivity extends AppCompatActivity {

    private ListView listLocal;
    private String[] items = {
            "Angra dos reis", "Caldas novas",
            "Campos do jordão", "Costa do Sauípe",
            "Ilheus", "Porto seguro", "Tiradentes",
            "Praga", "Santiago", "Zurique", "Caribe",
            "Buenos Aires", "Budapeste", "Cancun", "Aruba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocal = findViewById(R.id.listLocal);

        //Criar adaptador para a lista

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                items
        );
        //adiciona adaptador para a lista
        listLocal.setAdapter(adapter);

        //adicionar clique na lista
        listLocal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = listLocal.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, valorSelecionado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}