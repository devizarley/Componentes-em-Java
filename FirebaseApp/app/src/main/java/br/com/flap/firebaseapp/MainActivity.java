package br.com.flap.firebaseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
    private FirebaseAuth auth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference users = reference.child( "usuarios" );

        Usuario user = new Usuario();
        user.setNome("Izarley");
        user.setSobrenome("Rodrigues");
        user.setIdade(35);

        users.push().setValue(user);


        /*Deslogar usuario
        auth.signOut();
        */
        /*Logar o usuario
        auth.signInWithEmailAndPassword("izarley.oliveira2@hotmail.com", "izarley12345")
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Log.i("signIn", "Sucesso ao logar");
                        }else{
                            Log.i("signIn", "Erro ao logar");
                        }
                    }
                });
        */

        /*Verifica usuario logado
        if (auth.getCurrentUser() != null){
            Log.i("CurrentUser", "Usuario logado");
        }else {
            Log.i("CurrentUser", "Usuario não logado");
        }
        */

        /*Cadastro de usuario
        auth.createUserWithEmailAndPassword("izarley.oliveira2@hotmail.com", "izarley12345")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Log.i("CreatedUser", "Sucesso ao cadastrar usuario");
                        }else{
                            Log.i("CreatedUser", "Erro ao cadastrar usuario");
                        }
                    }
                });
        */
        /*Cria uma tabela e as referencias

        DatabaseReference users = reference.child( "usuarios" ).child("001");
        DatabaseReference products = reference.child( "produtos" );

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
        user.setIdade(30);

        products.child("001").setValue(product);
        users.child("002").setValue(user);
        */

    }
}