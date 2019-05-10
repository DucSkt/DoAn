 package com.example.ducskt.hoclistviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ducskt.adapter.DanhBaAdapter;
import com.example.ducskt.model.DanhBa;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {

    ListView lvDanhBa;
     ArrayList<DanhBa>dsDanhBa;
     DanhBaAdapter danhBaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

     private void addEvents() {
     }

     private void addControls() {

         lvDanhBa= (ListView) findViewById(R.id.lvDanhBa);
         dsDanhBa=new ArrayList<>();
         dsDanhBa.add(new DanhBa(1,"hoang van duc","0123911060"));
         dsDanhBa.add(new DanhBa(2,"hoang van cuc","0123911061"));

         danhBaAdapter=new DanhBaAdapter(MainActivity.this,R.layout.item,dsDanhBa);
         lvDanhBa.setAdapter(danhBaAdapter);
     }
 }
