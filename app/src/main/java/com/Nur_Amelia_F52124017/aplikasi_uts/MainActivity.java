package com.Nur_Amelia_F52124017.aplikasi_uts;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] nama = {
            "Indah Cahyani",
            "Yolanda Rahma Ananda",
            "Risma",
            "Wulan Safitri"
    };

    String[] nim = {
            "A50124113",
            "E32124152",
            "G81124027",
            "A50124117"
    };

    String[] prodi = {
            "Bimbingan Dan Konseling",
            "Agribisnis",
            "Teknik Geofisika",
            "Bimbingan Dan Konseling"
    };

    String[] ttl = {
            "Wata, 14 September 2006",
            "Kolonodale 14 Desember 2005",
            "Umbele, 21 April 2006",
            "Wata 11 Oktober 2005"
    };

    int[] foto = {
            R.drawable.indah,
            R.drawable.yolan,
            R.drawable.risma,
            R.drawable.wulan
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(
                this,
                nama,
                nim,
                prodi,
                ttl,
                foto
        );

        listView.setAdapter(adapter);
    }
}