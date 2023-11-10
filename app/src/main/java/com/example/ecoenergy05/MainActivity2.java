package com.example.ecoenergy05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Declaración de variables y enlace con el diseño
        //EditText
        EditText eT1 = findViewById(R.id.eT1);
        EditText eT2 = findViewById(R.id.eT2);
        EditText eT3 = findViewById(R.id.eT3);
        EditText eT4 = findViewById(R.id.eT4);

        //RadioButton
        RadioButton rB1 = findViewById(R.id.rB1);
        RadioButton rB2 = findViewById(R.id.rB2);
        RadioButton rB3 = findViewById(R.id.rB3);

        //CheckBox
        CheckBox cB1 = findViewById(R.id.cB1);
        CheckBox cB2 = findViewById(R.id.cB2);
        CheckBox cB3 = findViewById(R.id.cB3);

        //Button
        Button btn_enviar = findViewById(R.id.btn_enviar);

        //Vamos a poner a escuchar al boton
        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Vamos a crear un mensaje con la información digitada por el user
                /*String msj = "Nombre: " + eT1.getText().toString() +
                        "\nDirección: " + eT2.getText().toString() +
                        "\nTeléfono: " + eT3.getText().toString() +
                        "\nCorreo: " + eT4.getText().toString();

                //Vamos a mostrarlo
                Toast.makeText(getApplicationContext(),msj,Toast.LENGTH_SHORT).show();*/

                //----------------------------------------------------------------------------//
                //Vamos a crear las condiciones para que me muestre de acuerdo al RadioButton
                /*if (rB1.isChecked()) {
                    Toast.makeText(getApplicationContext(),"Usted vive en una casa",Toast.LENGTH_SHORT).show();
                }
                if (rB2.isChecked()) {
                    Toast.makeText(getApplicationContext(),"Usted vive en un apartamento",Toast.LENGTH_SHORT).show();
                }
                if (rB3.isChecked()) {
                    Toast.makeText(getApplicationContext(),"Usted vive en zona rural",Toast.LENGTH_SHORT).show();
                }*/

                //----------------------------------------------------------------------------//
                //Vamos a crear las condiciones para que me muestre de acuerdo al CheckBox
                if (cB1.isChecked()) {
                    Toast.makeText(getApplicationContext(),"Paneles Solares",Toast.LENGTH_SHORT).show();
                }
                if (cB2.isChecked()) {
                    Toast.makeText(getApplicationContext(),"Aerogeneradores",Toast.LENGTH_SHORT).show();
                }
                if (cB3.isChecked()) {
                    Toast.makeText(getApplicationContext(),"Otros",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}