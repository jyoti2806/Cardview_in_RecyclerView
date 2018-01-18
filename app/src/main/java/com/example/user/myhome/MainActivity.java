package com.example.user.myhome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import com.example.user.myhome.MyAdapter;
import com.example.user.myhome.ListItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpRecyclerView();

    }
    private void setUpRecyclerView() {

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter( ListItem.getData(),this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(this); // (Context context, int spanCount)
        mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerVertical);

        recyclerView.setItemAnimator(new DefaultItemAnimator()); // Even if we don't use it then also our items shows default animation. #Check Docs
    }


}
