package com.example.lesson_7;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.lesson_7.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;




public class MainActivity extends AppCompatActivity {







    private ActivityMainBinding viewbinding;










    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        



        viewbinding = ActivityMainBinding.inflate(getLayoutInflater());
////////Объект со всеми ID в XML


        setContentView(viewbinding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(viewbinding.main, (v, insets) -> {

            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            return insets;
        });






        Picasso.get().load("https://bolhov-kur.ru/media/rss-b7db089fac63d54efb7ef85fe7a0eed2/rssimg-03239542ddfb0385f2e0f41f207f1e81.jpeg").into(viewbinding.kartina);

        viewbinding.kartina.setOnClickListener(v -> {

            startActivity(new Intent(this, MapsActivity.class));
        });
        }
    }