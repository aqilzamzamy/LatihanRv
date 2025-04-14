package com.example.latihanrv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailMakanan extends AppCompatActivity {
    TextView tvNamaMakananDetail;
    TextView tvLevelMakananDetail;
    TextView tvHargaMakananDetail;
    ImageView imgMakananDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_makanan);

        tvNamaMakananDetail = findViewById(R.id.tvNamaMakananDetail);
        tvLevelMakananDetail = findViewById(R.id.tvLevelMakananDetail);
        tvHargaMakananDetail = findViewById(R.id.tvHargaMakananDetail);
        imgMakananDetail = findViewById(R.id.imgMakananDetail);


        Intent intent = getIntent();
        String namaMakanan = intent.getStringExtra("namaMakanan");
        String levelMakanan = intent.getStringExtra("levelMakanan");
        String hargaMakanan= intent.getStringExtra("hargaMakanan");
        int imgMakanan= intent.getIntExtra("imgMakanan", 0);

        tvNamaMakananDetail.setText(namaMakanan);
        tvLevelMakananDetail.setText(levelMakanan);
        tvHargaMakananDetail.setText(hargaMakanan);
        imgMakananDetail.setImageResource(imgMakanan);


    }
}