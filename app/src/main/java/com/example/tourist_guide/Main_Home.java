package com.example.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Main_Home extends AppCompatActivity {
    Button btnState,btnOla,btnUber,btnOyo,btnMakeMyTrip;
    Button btnGoogle,btnGoogleMap,btnWatsapp,btnYoutube;;
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__home);

        int images[]={R.drawable.any, R.drawable.avy, R.drawable.taj, R.drawable.arunachal1, R.drawable.mjh,R.drawable.testi,R.drawable.tempo,R.drawable.rajas,R.drawable.gate,R.drawable.dada };
        v_flipper = findViewById(R.id.v_flipper);

        btnState = findViewById(R.id.btnState);
        btnMakeMyTrip=findViewById(R.id.btnMakeMyTrip);
        btnGoogle = findViewById(R.id.btnGoogle);
        btnGoogleMap = findViewById(R.id.btnGoogleMap);
        btnWatsapp = findViewById(R.id.btnWatsapp);
        btnYoutube = findViewById(R.id.btnYoutube);
        btnOla=findViewById(R.id.btnOla);
        btnUber=findViewById(R.id.btnUber);
        btnOyo =findViewById(R.id.btnOyo);
        btnState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainState();
            }
        });

        btnGoogleMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(Main_Home.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnWatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(Main_Home.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(Main_Home.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(Main_Home.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnOyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.olacabs.customer");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(Main_Home.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnUber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.ubercab");
                //Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(Main_Home.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnOla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.olacabs.customer");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(Main_Home.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });

        for(int i=0;i<images.length;i++)
        {
            flipperImages(images[i]);
        }

        for (int image: images){
            flipperImages(image);
        }

    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(1500);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }

    public void openMainState()
    {
        Intent intent = new Intent(this,MainState.class);
        startActivity(intent);

    }
}


