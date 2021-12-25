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

        MyList[] myListData = new MyList[] {
                new MyList("Email", android.R.drawable.ic_dialog_email,"Open your emails"),
                new MyList("Info", android.R.drawable.ic_dialog_info,"Open this information"),
                new MyList("Delete", android.R.drawable.ic_delete,"Delete this "),
                new MyList("Dialer", android.R.drawable.ic_dialog_dialer,"Dial a number"),
                new MyList("Alert", android.R.drawable.ic_dialog_alert,"Create an alert"),
                new MyList("Map", android.R.drawable.ic_dialog_map,"Open your maps"),
                new MyList("Dialer", android.R.drawable.ic_dialog_dialer,"Dial a number"),
                new MyList("Alert", android.R.drawable.ic_dialog_alert,"Create an alert"),
                new MyList("Map", android.R.drawable.ic_dialog_map,"Open your maps"),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerAdapter adapter = new RecyclerAdapter(myListData2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recyclerView2);
        RecyclerAdapter adapter2 = new RecyclerAdapter(myListData);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setAdapter(adapter2);
    }
}
