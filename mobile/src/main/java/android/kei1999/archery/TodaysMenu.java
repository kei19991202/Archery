package android.kei1999.archery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TodaysMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todays_menu);
    }

    public void morphisms(View v){

        Intent intent2 = new Intent(this, TheTotalNumberOfMorphisms.class);
        startActivity(intent2);

    }

}
