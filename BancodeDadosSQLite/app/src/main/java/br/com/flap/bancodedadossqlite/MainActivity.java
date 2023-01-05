package br.com.flap.bancodedadossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            //COMANDO PARA CRIAR O BANCO DE DADOS
            SQLiteDatabase bancoDados = openOrCreateDatabase("app", MODE_PRIVATE, null);

            //CRIAR TABELA
            //bancoDados.execSQL("CREATE TABLE IF NOT EXISTS usuario( id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3) )");

            //bancoDados.execSQL("DROP TABLE usuario");

            //INSERINDO DADOS NA TABELA

                bancoDados.execSQL("INSERT INTO usuario(nome, idade) VALUES ('Mario', 18)");
                //bancoDados.execSQL("INSERT INTO usuario(nome, idade) VALUES ('Izarley', 20)");

            //ATUALIZANDO DADOS

                //bancoDados.execSQL("UPDATE usuario SET idade = 18 WHERE nome = 'Mario' ");
                bancoDados.execSQL("DELETE FROM usuario WHERE id = 2");

            //RECUPERAR DADOS DA TABELA

                //VARIAÇÕES (AND idade >= 20 OR idade) - (WHERE idade IN(30 , 20) )
                //          (WHERE idade BETWEEN 30 AND 35) - (WHERE nome LIKE 'Izarley')
                //          (WHERE 1=1 ORDER BY idade ASC LIMIT 3) "ASC - MENOR PARA O MAIOR"
                //                                         "DESC - MAIOR PARA O MENOR"
            Cursor cursor = bancoDados.rawQuery(
                    "SELECT id ,nome, idade FROM usuario ",null);

            //COLUNAS DA TABELA
            int colunaNome = cursor.getColumnIndex("nome");
            int colunaIdade = cursor.getColumnIndex("idade");
            int colunaId = cursor.getColumnIndex("id");

            cursor.moveToFirst();
            while(cursor != null) {
                String nome = cursor.getString(colunaNome);
                String idade = cursor.getString(colunaIdade);
                String id = cursor.getString(colunaId);

                Log.i("RESULTADO - ID: ",id + ": nome: " + nome + " / idade: " + idade);
                cursor.moveToNext();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}