package br.com.flap.sqlitewithrecyclerview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import br.com.flap.sqlitewithrecyclerview.Adapter.Adapter;
import br.com.flap.sqlitewithrecyclerview.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter adapter = new Adapter();

        recyclerView.setAdapter(adapter);
    }
}