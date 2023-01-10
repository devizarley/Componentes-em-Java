package br.com.flap.firebaseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference users = reference.child( "usuarios" ).child("001");
        DatabaseReference products = reference.child( "produtos" );

        /*
        Usuario user = new Usuario();
        Produtos product = new Produtos();

        users.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.i("Firebase", snapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        
        product.setDescricao("IOS");
        product.setMarca("Iphone 7");
        product.setPreco(3000.00);

        user.setNome("Maria");
        user.setSobrenome("Rodrigues");
        user.setIdade(30);*/

        //products.child("001").setValue(product);
        //users.child("002").setValue(user);

    }
}