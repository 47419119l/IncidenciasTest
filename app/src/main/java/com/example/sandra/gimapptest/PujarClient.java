package com.example.sandra.gimapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebase.client.Firebase;

public class PujarClient extends AppCompatActivity {
    Firebase clientRef;
    Firebase ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pujar_client);



        Firebase.setAndroidContext(getBaseContext());
        ref = new Firebase("https://testgimmapp.firebaseio.com/");
        clientRef = ref.child("Clientes");
        Cliente cliente = new Cliente();

        cliente.setNombre("Sandra");
        cliente.setApellido("Altafaja");
        cliente.setUID("19dba67c-d8f0-4d7c-afc4-aebe236f84a4");
        cliente.setEmail("47419119l@iespoblenou.org");
        cliente.setnSocio("123-123-123");
        cliente.setDireccion("C/ Santa Eugenia 24 4rt 2n");
        cliente.setTelf("633 67 67 64");
        cliente.setSexo("Mujer");


        Firebase client = clientRef.push();
        client.setValue(cliente);


    }
}
