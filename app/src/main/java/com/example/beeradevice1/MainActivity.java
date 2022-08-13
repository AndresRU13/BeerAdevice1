package com.example.beeradevice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beertype = String.valueOf(color.getSelectedItem());

        List<String> brandslist = expert.getBrands(beertype);
        StringBuilder brandFor = new StringBuilder();
        for (String brand : brandslist){
            brandFor.append(brand).append('\n');
        }

        brands.setText(brandFor);
    }
}