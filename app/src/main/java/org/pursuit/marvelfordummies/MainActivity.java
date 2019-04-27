package org.pursuit.marvelfordummies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.pursuit.marvelfordummies.recyclerview.HeroAdapter;

import java.util.Collections;

public final class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity.DATA";

    HeroAdapter heroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initHeroRecyclerView();
    }

    private void initHeroRecyclerView() {
        RecyclerView heroRecyclerView = findViewById(R.id.hero_recyclerview);
        heroAdapter = new HeroAdapter(Collections.emptyList());
        heroRecyclerView.setAdapter(heroAdapter);
        heroRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
