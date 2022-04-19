package com.android.proyecto006imagebuttonyimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageButton iBtnVaso;
    private ImageView ivDado1;
    private ImageView ivDado2;
    private ImageView ivDado3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivDado1 = findViewById(R.id.id_iv_dado1);
        ivDado2 = findViewById(R.id.id_iv_dado2);
        ivDado3 = findViewById(R.id.id_iv_dado3);
    }

    public void onClickTirar(View view) {
        int valor1 = 1+(int)(Math.random()*6);
        int valor2 = 1+(int)(Math.random()*6);
        int valor3 = 1+(int)(Math.random()*6);

        switch (valor1){
            case 1: ivDado1.setImageResource(R.drawable.dado1);break;
            case 2: ivDado1.setImageResource(R.drawable.dado2);break;
            case 3: ivDado1.setImageResource(R.drawable.dado3);break;
            case 4: ivDado1.setImageResource(R.drawable.dado4);break;
            case 5: ivDado1.setImageResource(R.drawable.dado5);break;
            case 6: ivDado1.setImageResource(R.drawable.dado6);break;
        }
        switch (valor2){
            case 1: ivDado2.setImageResource(R.drawable.dado1);break;
            case 2: ivDado2.setImageResource(R.drawable.dado2);break;
            case 3: ivDado2.setImageResource(R.drawable.dado3);break;
            case 4: ivDado2.setImageResource(R.drawable.dado4);break;
            case 5: ivDado2.setImageResource(R.drawable.dado5);break;
            case 6: ivDado2.setImageResource(R.drawable.dado6);break;
        }
        switch (valor3){
            case 1: ivDado3.setImageResource(R.drawable.dado1);break;
            case 2: ivDado3.setImageResource(R.drawable.dado2);break;
            case 3: ivDado3.setImageResource(R.drawable.dado3);break;
            case 4: ivDado3.setImageResource(R.drawable.dado4);break;
            case 5: ivDado3.setImageResource(R.drawable.dado5);break;
            case 6: ivDado3.setImageResource(R.drawable.dado6);break;
        }
    }
}