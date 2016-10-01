package android.kei1999.archery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void todaysMenu(View v){

        Intent intent1 = new Intent(this, TodaysMenu.class);
        startActivity(intent1);

        //よろしく！

    }
}
