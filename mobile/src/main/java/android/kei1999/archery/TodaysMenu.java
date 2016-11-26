package android.kei1999.archery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TodaysMenu extends AppCompatActivity {

    int number1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todays_menu);

        Intent intent3 = getIntent();
        number1 = intent3.getIntExtra("num1",0);

    }

    public void morphisms(View v){

        //TODO:Intent2
        Intent intent2 = new Intent(this, TheTotalNumberOfMorphisms.class);
        intent2.putExtra("num1",number1);
        startActivity(intent2);

    }

    public void point(View v){

        //TODO:Intent7
        Intent intent7 = new Intent(this, PointActivity.class);
        startActivity(intent7);

    }

    public void backHome(View v){

        //TODO:Intent6
        Intent intent6 = new Intent(this, MainActivity.class);
        startActivity(intent6);
    }

}
