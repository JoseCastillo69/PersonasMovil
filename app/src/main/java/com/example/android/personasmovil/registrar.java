package com.example.android.personasmovil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registrar extends Activity {

    private EditText txtCedula, txtNombre, txtApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        txtCedula = findViewById(R.id.txtCedula);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido= findViewById(R.id.txtApellido);

    }

    public void guardar (View v){
        String ced, nomb, apell;

        ced = txtCedula.getText().toString();
        nomb = txtNombre.getText().toString();
        apell = txtApellido.getText().toString();

        Persona p = new Persona(ced,nomb,apell);
        p.guardar();
        Toast.makeText(this, getResources().getString(R.string.mensaje),Toast.LENGTH_SHORT).show();
        borrar();
    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.requestFocus();

    }

}
