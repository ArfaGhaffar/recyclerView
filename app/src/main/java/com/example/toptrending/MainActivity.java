package com.example.toptrending;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyList[] myListData2 = new MyList[] {
                new MyList("Ali Ahmed", R.drawable.bnn,"0331 203457788"),
                new MyList("Sana Ali", R.drawable.bnn,"0331 203457788"),
                new MyList("Asif Khan", R.drawable.bnn,"0331 203457788 "),
                new MyList("Saba Ali", R.drawable.bnn,"0331 203457788"),
                new MyList("Zahid Ahmed", R.drawable.bnn,"0331 203457788"),
                new MyList("Amir Khan", R.drawable.bnn,"0331 203457788"),
                new MyList("Raza Ahmed", R.drawable.bnn,"0331 203457788"),
                new MyList("Hamid Ali", R.drawable.bnn,"0331 203457788"),


        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerAdapter adapter = new RecyclerAdapter(myListData2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
