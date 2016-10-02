package android.kei1999.archery;

import android.content.Intent;
import android.support.v4.app.FragmentTransitionCompat21;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.kei1999.archery.R.id.textView;

public class TheTotalNumberOfMorphisms extends AppCompatActivity {

    int number1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_total_number_of_morphisms);

        Intent intent2 = getIntent();
        number1 = intent2.getIntExtra("num1",0);
        tv1 = (TextView)findViewById(R.id.textview2);
        tv1.setText(number1+"回");

    }

    public void pl10(View v) {

        number1=number1+10;
        tv1.setText(number1+"回");

    }

    public void pl1(View v){

        number1++;
        tv1.setText(number1+"回");

    }

    public void mi1(View v){

        number1--;
        tv1.setText(number1+"回");

    }

    public void decide(View v){

        Intent intent3 = new Intent(this, TodaysMenu.class);
        intent3.putExtra("num1",number1);
        startActivity(intent3);

    }

}
