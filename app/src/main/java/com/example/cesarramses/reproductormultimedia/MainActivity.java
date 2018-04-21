package com.example.cesarramses.reproductormultimedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vdvReproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vdvReproductor= findViewById(R.id.vdvReproductor);
        //asignamos la ruta del archivo al VideoView
        vdvReproductor.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.publicidad_ionic);
        vdvReproductor.start();

        //creamos las opciones de reproduccion
        MediaController opcionesReproduccion = new MediaController(this);
        opcionesReproduccion.setAnchorView(vdvReproductor);

        vdvReproductor.setMediaController(opcionesReproduccion);

    }
}
