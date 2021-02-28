package com.example.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainState extends AppCompatActivity {
    Button btnAandhra,btnArunachal,btnAssam,btnBihar,btnChandigarh,btnChhattisgarh,btnDadra;
    Button btnDelhi,btnGoa,btnGujarat,btnHaryana,btnHimachal,btnJammu,btnJharkhand,btnKarnataka,btnKerala,
            btnManali,btnLadakh,btnLakshadweep,btnMadhyapradesh,btnManipur,btnMeghalaya,btnOrrisa,btnPondicherry,btnPunjab,
            btnRajasthan,btnSikkim,btnTamilnadu,btnUttrakhand,btnUttarpradesh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_state);
        btnAandhra = findViewById(R.id.btnAndhra);
        btnArunachal = findViewById(R.id.btnArunachal);
        btnAssam = findViewById(R.id.btnAssam);
        btnBihar = findViewById(R.id.btnBihar);
        btnChandigarh = findViewById(R.id.btnChandigarh);
        btnChhattisgarh = findViewById(R.id.btnChattisgarh);
        btnDadra = findViewById(R.id.btnDadra);
        btnDelhi = findViewById(R.id.btnDelhi);
        btnGoa = findViewById(R.id.btnGoa);
        btnGujarat = findViewById(R.id.btnGujarat);
        btnHaryana = findViewById(R.id.btnHaryana);
        btnHimachal = findViewById(R.id.btnHimachal);
        btnJammu = findViewById(R.id.btnJammu);
        btnJharkhand = findViewById(R.id.btnJharkhand);
        btnKarnataka = findViewById(R.id.btnKarnataka);
        btnKerala = findViewById(R.id.btnKerala);
        btnManali = findViewById(R.id.btnManali);
        btnLadakh = findViewById(R.id.btnLadakh);
        btnLakshadweep = findViewById(R.id.btnLakshadweep);
        btnMadhyapradesh = findViewById(R.id.btnMadhyapradesh);
        btnManipur = findViewById(R.id.btnManipur);
        btnMeghalaya = findViewById(R.id.btnMeghalaya);
        btnOrrisa = findViewById(R.id.btnOrrisa);
        btnPondicherry = findViewById(R.id.btnPondicherry);
        btnPunjab = findViewById(R.id.btnPunjab);
        btnRajasthan = findViewById(R.id.btnRajasthan);
        btnSikkim = findViewById(R.id.btnSikkim);
        btnTamilnadu = findViewById(R.id.btnTamilnadu);
        btnUttrakhand = findViewById(R.id.btnUttraKhand);
        btnUttarpradesh = findViewById(R.id.btnUP);
        btnChandigarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Chandigarh");
                startActivity(intent);
            }
        });
        btnChhattisgarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Chhattisgarh");
                startActivity(intent);
            }
        });
        btnAssam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Assam");
                startActivity(intent);
            }
        });
        btnBihar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Bihar");
                startActivity(intent);
            }
        });
        btnArunachal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Arunachal Pradesh");
                startActivity(intent);
            }
        });
        btnAandhra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Andhra Pradesh");
                startActivity(intent);
            }
        });
        btnDadra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Dadra and Nagar Haveli");
                startActivity(intent);
            }
        });
        btnDelhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Delhi");
                startActivity(intent);
            }
        });
        btnGoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Goa");
                startActivity(intent);
            }
        });
        btnGujarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Gujarat");
                startActivity(intent);
            }
        });
        btnHaryana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Haryana");
                startActivity(intent);
            }
        });
        btnHimachal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Himachal Pradesh");
                startActivity(intent);
            }
        });
        btnJammu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Jammu and Kashmir");
                startActivity(intent);
            }
        });
        btnJharkhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Jharkhand");
                startActivity(intent);
            }
        });
        btnKarnataka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Karnataka");
                startActivity(intent);
            }
        });
        //
       btnKerala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Kerala");
                startActivity(intent);
            }
        });
        btnManali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Kullu and Manali");
                startActivity(intent);
            }
        });
        btnLadakh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Ladakh");
                startActivity(intent);
            }
        });
        btnLakshadweep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Lakshadweep");
                startActivity(intent);
            }
        });
        btnMadhyapradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Madhya Pradesh");
                startActivity(intent);
            }
        });
        btnManipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Manipur");
                startActivity(intent);
            }
        });
        btnMeghalaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Meghalaya");
                startActivity(intent);
            }
        });
        btnOrrisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Odisha");
                startActivity(intent);
            }
        });
        btnPondicherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Puducherry");
                startActivity(intent);
            }
        });
        btnPunjab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Punjab");
                startActivity(intent);
            }
        });
        btnRajasthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Rajasthan");
                startActivity(intent);
            }
        });
        btnSikkim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Sikkim");
                startActivity(intent);
            }
        });
        btnTamilnadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Tamil Nadu");
                startActivity(intent);
            }
        });
        btnUttrakhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Uttrakhand");
                startActivity(intent);
            }
        });
        btnUttarpradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainState.this,City.class);
                intent.putExtra("state","Uttar Pradesh");
                startActivity(intent);
            }
        });

      }
}
