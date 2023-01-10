package br.com.flap.firebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference users = reference.child( "usuarios" );
        DatabaseReference products = reference.child( "produtos" );

        Usuario user = new Usuario();
        Produtos product = new Produtos();

        product.setDescricao("IOS");
        product.setMarca("Iphone 7");
        product.setPreco(3000.00);

        /*user.setNome("Maria");
        user.setSobrenome("Rodrigues");
        user.setIdade(30);*/

        products.child("001").setValue(product);
        //users.child("002").setValue(user);

    }
}