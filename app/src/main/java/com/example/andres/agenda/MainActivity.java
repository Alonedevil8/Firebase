package com.example.andres.agenda;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText eUsuario, eNickname, eCell,eTel,eEmail,eDire,eContrasena,eRcontrasena,eCategoria;
    String nombre,nickname,cell,tell,email,dire,contra,rcontra,cate;
    Button bInsertar,bBorrar,bLimpiar;

    private String FIREBASE_URL="https://agenda-firebase-914a3.firebaseio.com/";
    private Firebase firebasedatos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(this);
        firebasedatos = new Firebase(FIREBASE_URL);

        eUsuario = (EditText) findViewById(R.id.eUsuario);
        eNickname = (EditText) findViewById(R.id.eNickname);
        eCell = (EditText) findViewById(R.id.eCell);
        eTel = (EditText) findViewById(R.id.eTel);
        eEmail = (EditText) findViewById(R.id.eEmail);
        eDire = (EditText) findViewById(R.id.eDire);
        eContrasena = (EditText) findViewById(R.id.eContrasena);
        eRcontrasena = (EditText) findViewById(R.id.eRcontrasena);
        eCategoria = (EditText) findViewById(R.id.eCategoria);

        bInsertar = (Button) findViewById(R.id.bInsertar);
        bBorrar = (Button) findViewById(R.id.bBorrar);
        bLimpiar = (Button) findViewById(R.id.bLimpiar);

        bInsertar.setOnClickListener(this);
        bBorrar.setOnClickListener(this);
        bLimpiar.setOnClickListener(this);
    }


    public void onClick(View view) {
       int id = view.getId();

       nombre = eUsuario.getText().toString();
       nickname = eNickname.getText().toString();
       cell = eCell.getText().toString();
       tell = eTel.getText().toString();
       email = eEmail.getText().toString();
       dire = eDire.getText().toString();
       contra= eContrasena.getText().toString();
       rcontra= eRcontrasena.getText().toString();
       cate= eCategoria.getText().toString();

       Firebase firebd;

       switch (id){

           case R.id.bInsertar:
               Contactos contactos = new Contactos(nombre,nickname,cell,tell,email,dire,contra,rcontra,cate);
               firebd = firebasedatos.child("contactos"+id);
               firebd.setValue(contactos);
               id++;
           break;

           case R.id.bBorrar:
               firebd = firebasedatos.child("contactos"+nombre);
               firebd.removeValue();
           break;

           case R.id.bLimpiar:
           limpiar();
           break;}
                                    }
public void limpiar (){
   eUsuario.setText("");
   eNickname.setText("");
   eCell.setText("");
   eTel.setText("");
   eEmail.setText("");
   eDire.setText("");
   eContrasena.setText("");
   eRcontrasena.setText("");
   eCategoria.setText("");
}}

