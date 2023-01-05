package br.com.flap.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textName, textYears, textName2, textYears2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textName = findViewById(R.id.textName);
        textYears = findViewById(R.id.textYears);


        textName2 = findViewById(R.id.textName2);
        textYears2 = findViewById(R.id.textYears2);

        //rescuperar os dados enviados pela mainActivity

        Bundle dados = getIntent().getExtras();
        String name = dados.getString("name");
        int years = dados.getInt("years");

        //Recuperar dados de um objeto setado na mainActivity
        Usuario usuario = (Usuario) dados.getSerializable("objeto");


        //Configurar valores recuperados
        textName.setText(name);
        textYears.setText(String.valueOf(years));

        textName2.setText(usuario.getName1());
        textYears2.setText(String.valueOf(usuario.getYears2()));

    }
}