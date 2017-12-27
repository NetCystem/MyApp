package com.example.macbook.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    Context context;//inchi hamara petq

    private List<Person> personList;

    public String[] names = {"Karen", "Vazgen", "Artak"};
    public String[] surnames = {"Babayan", "Gevorgyan", "Vardanyan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        listView.setAdapter(new myAdapter(this, names, surnames));//inchi enq stuc My adateri constructor@ sarqum
    }
}
