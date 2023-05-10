package com.example.emc2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

import com.example.emc2.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.emc2.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    HashMap<Integer, String> tasks = new HashMap<>();


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        tasks.put(1, "Автомобиль проехал по шоссе расстояние 140 км за время 2 часа, затем автомобиль двигался по бездорожью и за время 3 часа он преодолел расстояние 70 км. Найти среднюю скорость на всем пути. Дать ответ в км/ч");
        tasks.put(2, "Поезд проехал первую половину пути со скоростью 80 км/ч, а вторую половину пути со скоростью 90 км/ч. Найти среднюю скорость поезда на всем пути.");
        tasks.put(3, "Мотоциклист ехал первую половину пути по скоростной автомагистрали со скоростью 120 км/ч, а вторую половину пути по проселочной дороге со скоростью 30 км/ч. Найти среднюю скорость мотоциклиста на всем пути.");
        tasks.put(4, "Половину расстояния турист летел на самолете со скоростью 700 км/ч, а потом сразу пересел на поезд и ехал на поезде со скоростью 100 км/ч. Найти среднюю скорость туриста на всем пути. Временем, затраченным на пересадку пренебречь.");
        tasks.put(5, "Третью часть расстояния до университета студент шел пешком со скоростью 7 км/ч, а остальное расстояние ехал на автобусе со скоростью 50 км/ч. Найти среднюю скорость студента на всем пути.");
        tasks.put(6, "Две трети пути катер двигался со скоростью 70 км/ч, а остальное расстояние он шел по мелководью со скоростью 6 км/ч. Найди среднюю скорость катера на всем пути.");
        tasks.put(7, "Третью часть пути вертолет летел со скоростью 384 км/ч,потом испортилась погода: пошел дождь, начался сильный ветер и еще треть пути он летел со скоростью 80 км/ч. Далее началась горная местность и остаток пути он летел со скоростью 20 км/ч. Найти среднюю скорость вертолета на всем пути");
        tasks.put(8, "Одну треть пути велосипедист ехал по полю со скоростью 5 км/ч, потом он выехал на асфальтированную дорогу и еще треть пути он ехал со скоростью 20 км/ч, потом он немного устал крутить педали и оставшееся расстояние он ехал со скоростью 12 км/ч. Найти среднюю скорость велосипедиста на всем пути.");
        tasks.put(9, "Средняя скорость велосипедиста на всем пути равна 40 км/ч. Первую половину пути он ехал со скоростью 60 км/ч. С какой скоростью велосипедист проехал остаток пути?");
        tasks.put(10, "Поезд прошел 25 км за 35 мин, причем первые 10 км он прошел в течение 18 мин, вторые 10 км в течение 12 мин, а последние 5 км за 5 мин. Определите среднюю скорость поезда на каждом участке и на всем пути.");
//        Set<Integer> keys = tasks.keySet();
//        ArrayList<String> values = new ArrayList<>(tasks.values());

        btn = findViewById(R.id.gen_task);
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        System.out.println();
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Coming soon!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}