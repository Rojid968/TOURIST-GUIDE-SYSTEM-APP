package com.example.tourist_guide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class DescriptionActivity extends AppCompatActivity {

    DatabaseReference dbref;
    ImageView image;
    TextView desc;
    Button btmMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        String state = getIntent().getStringExtra("state");
        String city = getIntent().getStringExtra("city");
        dbref = FirebaseDatabase.getInstance().getReference().child(state).child(city);
        image = findViewById(R.id.image);
        desc = findViewById(R.id.desc);
        btmMap=findViewById(R.id.btnMap);
        getDetails();
    }
    public void getDetails(){

        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
             Log.d("data", dataSnapshot.toString());
                for(DataSnapshot data:dataSnapshot.getChildren() ){
                    Log.d("Data",data.getKey());
                    if(data.getKey().equals("desc"))
                        desc.setText(data.getValue().toString());
                    else if(data.getKey().equals("image")){
                        Picasso.get().load(data.getValue().toString()).into(image);
                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("Error",databaseError.getDetails());
            }
        });
        btmMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent=getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(DescriptionActivity.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
