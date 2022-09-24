package br.teste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgDados;
    Button btnSortear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDados = findViewById(R.id.imgDados);
        btnSortear = findViewById(R.id.btnSortear);

        final int dado[] = {R.drawable.dado1, R.drawable.dado2, R.drawable.dado3,
                R.drawable.dado4, R.drawable.dado5, R.drawable.dado6};


        btnSortear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Random random = new Random();
               int num1 = random.nextInt(6);

               Random random2 = new Random();
               int num2 = random.nextInt(6);

               Random random3 = new Random();
               int num3 = random.nextInt(6);

               Random random4 = new Random();
               int num4 = random.nextInt(6);

               Random random5 = new Random();
               int num5 = random.nextInt(6);

               Random random6 = new Random();
               int num6 = random.nextInt(6);

               imgDados.setImageResource(dado[num1]);
               imgDados.setImageResource(dado[num2]);
               imgDados.setImageResource(dado[num3]);
               imgDados.setImageResource(dado[num4]);
               imgDados.setImageResource(dado[num5]);
               imgDados.setImageResource(dado[num6]);
           }
       });
    }
}