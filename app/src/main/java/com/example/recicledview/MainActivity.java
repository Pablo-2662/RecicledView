package com.example.recicledview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView reciclerBaloncesto;
    private Adaptador adaptador;
    private RecyclerView.LayoutManager layoutManagerBaloncesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Encapsulador>listadoDatos = new ArrayList<Encapsulador>();
        listadoDatos.add(new Encapsulador(R.drawable.androide,false,"Titulo1","Subtitulo1"));
        //Añadir mas

        adaptador = new Adaptador(listadoDatos, this, R.layout.elemento_lista);
        adaptador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int posicionClick = reciclerBaloncesto.getChildAdapterPosition(view);
                String mensaje = "Has seleccionado "+listadoDatos.get(posicionClick).getTitulo();
                View vistaGeneral = findViewById(R.id);
                Snackbar.make(vistaGeneral, mensaje,Snackbar.LENGTH_SHORT).show();
            }
        });

        reciclerBaloncesto = findViewById(R.id)

    }
}