package br.com.flap.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

                //instanciar objeto
                Usuario usuario = new Usuario("MACACO2",300);

                //passar dados
                intent.putExtra("name","MACACO");
                intent.putExtra("years",30);
                intent.putExtra("objeto", usuario);

                startActivity(intent);
            }
        });

    }
}