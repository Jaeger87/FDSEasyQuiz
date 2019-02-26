package net.jaegerbox.fdseasyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {


    @ViewById
    TextView testText;



    @ViewById
    RecyclerView questions;


    @AfterViews
    void initActivity() {
        testText.setText("hao");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        questions.setLayoutManager(layoutManager);

        /*
         * Use this setting to improve performance if you know that changes in content do not
         * change the child layout size in the RecyclerView
         */
        questions.setHasFixedSize(true);
    }

}
