package com.example.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Atributos
    String[] frases = {
            "Frase 01",
            "Frase 02",
            "Frase 03",
    };
    public void gerarFrase(View view){
    }
    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textResultado);
        String textResultado = "";
        for (String frase : frases ){
            textResultado = textResultado + frase;
            System.out.println(textResultado);
        }
        texto.setText(textResultado);
    }
}