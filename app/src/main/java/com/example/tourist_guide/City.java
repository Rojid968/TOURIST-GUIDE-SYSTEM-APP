package com.example.tourist_guide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Snapshot;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class City extends AppCompatActivity {

    ListView cityList;
    List<String> cities;
    DatabaseReference dbref;
    String state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        state = getIntent().getStringExtra("state");
        setContentView(R.layout.activity_city);
        cityList = findViewById(R.id.city_list);
        cities = new ArrayList<>();
        dbref = FirebaseDatabase.getInstance().getReference().child(state);

        getCities();
        cityList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),DescriptionActivity.class);
                intent.putExtra("state",state);
                intent.putExtra("city",cities.get(position));
                startActivity(intent);
            }
        });
    }
    public void getCities(){

        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            Log.d("test","testing");
            cities.clear();
                for(DataSnapshot data:dataSnapshot.getChildren() ){
                   cities.add(data.getKey());
                   Log.d("Data",data.getKey());
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,cities);
                cityList.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            Log.d("Error",databaseError.getDetails());
            }
        });

    }

}
