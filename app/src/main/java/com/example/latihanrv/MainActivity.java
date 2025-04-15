package com.example.latihanrv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterListMakanan.OnItemClickListener{

    RecyclerView rvlistMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rvlistMakanan = (RecyclerView) findViewById(R.id.rvlistMakanan);
        rvlistMakanan.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<MakananModel> dataMakanan = new ArrayList<>();
        dataMakanan.add(new MakananModel("Soto Ayam", "Rp 15.000", "Tidak Pedas", R.drawable.sotoayam));
        dataMakanan.add(new MakananModel("Soto Daging", "Rp 25.000", "Sedikit Pedas", R.drawable.sotodaging));
        dataMakanan.add(new MakananModel("Kornet", "Rp 10.000", "Pedas", R.drawable.kornet));
        dataMakanan.add(new MakananModel("Sate Ayam", "Rp 10.000", "Sangat Pedas", R.drawable.sateayam));
        dataMakanan.add(new MakananModel("Sate Daging", "Rp 15.000", "Pedas", R.drawable.satedaging));
        dataMakanan.add(new MakananModel("Martabak", "Rp 20.000", "Sedikit Pedas", R.drawable.martabak));
        dataMakanan.add(new MakananModel("Terang Bulan", "Rp 15.000", "Tidak Pedas", R.drawable.terangbulan));

        dataMakanan.add(new MakananModel("Terang Bulan", "Rp 15.000", "Tidak Pedas", R.drawable.terangbulan));

        //call adapter
        AdapterListMakanan adapterListMakanan = new AdapterListMakanan(dataMakanan, this);
        rvlistMakanan.setAdapter(adapterListMakanan);
    }

    public void onItemClick(MakananModel makananModel) {
        Toast.makeText(this, makananModel.getNamaMakanan() + ",  " + makananModel.getHargaMakanan(), Toast.LENGTH_SHORT).show();

        // dari MainActivity menuju ke DetailMakanan
        Intent in = new Intent (MainActivity.this, DetailMakanan.class);

        //memberikan data nya
        in.putExtra("namaMakanan", makananModel.getNamaMakanan());
        in.putExtra("levelMakanan", makananModel.getLevelMakanan());
        in.putExtra("hargaMakanan", makananModel.getHargaMakanan());
        in.putExtra("imgMakanan", makananModel.getImgMakanan());

        //menjalankan DetailMakanan activity
        startActivity(in);
    }
}