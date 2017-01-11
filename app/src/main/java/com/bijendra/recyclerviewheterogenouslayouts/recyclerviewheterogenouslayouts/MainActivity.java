package com.bijendra.recyclerviewheterogenouslayouts.recyclerviewheterogenouslayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView= (RecyclerView) findViewById(R.id.rvHaterogeneous);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(new MyAdapter(getItemList()));
    }

    private ArrayList<Object> getItemList()
    {
        ArrayList<Object> list=new ArrayList<>();
        list.add(new CStudent("Name:Bijendra","Age:35","Course:M.C.M"));
        list.add(new CImage("http://i.imgur.com/DvpvklR.png"));
        list.add(new CStudent("Name:Rahul","Age:37","Course:M.C.A"));
        list.add(new CStudent("Name:Surendra","Age:36","Course:M.S.C"));
        list.add(new CImage("http://i.imgur.com/9gbQ7YR.png"));
        list.add(new CImage("http://i.imgur.com/P5JLfjk.png"));
        list.add(new CStudent("Name:Manoj","Age:39","Course:M.B.A"));
        list.add(new CStudent("Name:Dinesh","Age:34","Course:.I.I.T"));
        list.add(new CImage("http://i.imgur.com/yAdbrLp.png"));
        list.add(new CImage("http://i.imgur.com/glyvuXg.png"));
        list.add(new CImage("http://i.imgur.com/Q54zMKT.png"));


        return list;

    }
}
