package br.com.flap.components;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText inputName;
    private TextInputEditText inputEmail;
    private TextView infoResult, infoResult2, infoResult3;
    //Checkbox
    private CheckBox checkBoxGreen, checkBoxBlue, checkBoxRed;
    //RadioButton
    private RadioButton radioButton01, radioButton02;
    private RadioGroup radioGroup;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        inputName       = findViewById(R.id.infoName);      //COMPONENT
        inputEmail      = findViewById(R.id.infoEmail);
        infoResult      = findViewById(R.id.infoResult);
        infoResult2     = findViewById(R.id.infoResult2);
        infoResult3     = findViewById(R.id.infoResult3);

        //checkBox
        checkBoxGreen   = findViewById(R.id.checkBoxGreen);
        checkBoxBlue    = findViewById(R.id.checkBoxBlue);
        checkBoxRed     = findViewById(R.id.checkBoxRed);

        //RadioButton
        radioButton01   = findViewById(R.id.radioButton01);
        radioButton02   = findViewById(R.id.radioButton02);
        radioGroup      = findViewById(R.id.radioGroup);

        radioButton();
    }

    public void radioButton () {
        //Maneira submit

        if (radioButton01.isChecked()){
            infoResult2.setText("Masculino");
        }else if (radioButton02.isChecked()){
            infoResult2.setText("Feminino");
        }else {}

        //Maneira auto

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton01){
                    infoResult2.setText("Masculino");
                }else if (checkedId == R.id.radioButton02) {
                    infoResult2.setText("Feminino");
                }
            }
        });
    }

    public void checkBoxEvent (){

        //Opção mais longa.

        /*if ( checkBoxGreen.isChecked() ) {
            infoResult3.setText(checkBoxGreen.getText().toString());
        }
        if (checkBoxBlue.isChecked()){
            infoResult3.setText(checkBoxGreen.getText().toString() + checkBoxBlue.getText().toString());
        }
        if (checkBoxRed.isChecked()){
            infoResult3.setText(checkBoxGreen.getText().toString() + checkBoxBlue.getText().toString() + checkBoxRed.getText().toString());
        }*/

        //Opção mais curta

        String resultCheckBox = "";

        if ( checkBoxGreen.isChecked() ) {
            resultCheckBox = "Green ";
        }
        if (checkBoxBlue.isChecked()){
            resultCheckBox = resultCheckBox + "Blue ";
        }
        if (checkBoxRed.isChecked()){
            resultCheckBox = resultCheckBox + "Red";
        }

        infoResult3.setText(resultCheckBox);
    }

    public void inputInfos () {

        String email = inputEmail.getText().toString();     //COMPONENT VALUE
        String name = inputName.getText().toString();

        if (email.isEmpty() & name.isEmpty() ){
            infoResult.setText("Name and Email is empty");
        }else if (email.isEmpty()){
            infoResult.setText("Email is empty");
        }else if (name.isEmpty()){
            infoResult.setText("Name is empty");
        }else{
            infoResult.setText("Hello, " + name + "! " + "Your email is " + email + "!");

            inputEmail.setText("");
            inputName.setText("");
        }
    }

    public void submitInfo (View view) {

        checkBoxEvent();
        inputInfos();
        radioButton();

    }
}