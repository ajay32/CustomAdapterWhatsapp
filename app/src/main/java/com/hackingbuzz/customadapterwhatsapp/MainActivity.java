package com.hackingbuzz.customadapterwhatsapp;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       int[] images = {R.drawable.a,R.drawable.amitab,R.drawable.b,R.drawable.lavery,R.drawable.lillie,R.drawable.vl,
               R.drawable.a,R.drawable.amitab,R.drawable.b,R.drawable.lavery,R.drawable.lillie,R.drawable.vl,
               R.drawable.a,R.drawable.amitab,R.drawable.b,R.drawable.lavery,R.drawable.lillie,R.drawable.vl,
               R.drawable.a,R.drawable.amitab,R.drawable.b,R.drawable.lavery,R.drawable.lillie,R.drawable.vl
       };


        String[] array = getResources().getStringArray(R.array.users);

        ListView people = (ListView)findViewById(R.id.myList);

        CustomAdapter adapter = new CustomAdapter(getLayoutInflater(),array,images);

        people.setAdapter(adapter);



        people.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(view.getContext(), String.valueOf(parent.getAdapter().getItem(position)) ,Toast.LENGTH_SHORT).show();
            }
        });



    }

    // always set scaleType of image ...if image is samller set to centercrop it will look bigger n fit the screen
}


















/*
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/
