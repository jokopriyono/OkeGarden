package com.okegarden.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.okegarden.R;
import com.okegarden.TanamanAdapter;
import com.okegarden.TanamanData;

import java.util.ArrayList;
import java.util.List;

public class TanamanActivity extends AppCompatActivity {
    private List<TanamanData> tanamanList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(null);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.v_back_arrow));
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        }

        TanamanAdapter adapter = new TanamanAdapter(tanamanList, getApplicationContext());
        RecyclerView recylerTanaman = (RecyclerView)findViewById(R.id.recycler_tanaman);
        recylerTanaman.setHasFixedSize(true);
        GridLayoutManager llm = new GridLayoutManager(getApplicationContext(), 2);
        recylerTanaman.setLayoutManager(llm);
        recylerTanaman.setAdapter(adapter);

        Spinner spinSort = (Spinner) findViewById(R.id.spin_sort);
        List<String> categories = new ArrayList<>();
        categories.add("Nama");
        categories.add("Termurah");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinSort.setAdapter(dataAdapter);

        Spinner spinFilter = (Spinner) findViewById(R.id.spin_filter);
        List<String> categories2 = new ArrayList<>();
        categories2.add("Semua Tanaman");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories2);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinFilter.setAdapter(dataAdapter2);

        loadDataBuatan();
    }

    private void loadDataBuatan() {
        TanamanData data = new TanamanData("Satu", "Rp. 15.000", "105", "30", R.drawable.rumput_gajah);
        tanamanList.add(data);
        data = new TanamanData("Dua", "Rp. 15.000", "115", "30", R.drawable.rumput_gajah_2);
        tanamanList.add(data);
        data = new TanamanData("Tiga", "Rp. 25.000", "205", "66", R.drawable.rumput_gajah_3);
        tanamanList.add(data);
        data = new TanamanData("Empat", "Rp. 23.000", "132", "12", R.drawable.rumput_gajah_4);
        tanamanList.add(data);
        data = new TanamanData("Lima", "Rp. 11.000", "90", "13", R.drawable.rumput_gajah_3);
        tanamanList.add(data);
        data = new TanamanData("Enam", "Rp. 50.000", "99", "63", R.drawable.rumput_gajah_4);
        tanamanList.add(data);
        data = new TanamanData("Tujuh", "Rp. 50.000", "99", "63", R.drawable.rumput_gajah);
        tanamanList.add(data);
        data = new TanamanData("Delapan", "Rp. 50.000", "99", "63", R.drawable.rumput_gajah);
        tanamanList.add(data);
        data = new TanamanData("Sembilan", "Rp. 50.000", "99", "63", R.drawable.rumput_gajah_2);
        tanamanList.add(data);
        data = new TanamanData("Sepuluh", "Rp. 50.000", "99", "63", R.drawable.rumput_gajah_4);
        tanamanList.add(data);
    }
}
