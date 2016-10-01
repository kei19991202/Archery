package android.kei1999.archery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText =(EditText)findViewById(R.id.editText);

    }

    public void todaysMenu(View v){

        Intent intent1 = new Intent(this, TodaysMenu.class);
        startActivity(intent1);

    }

    public void edit(View v){

    }

}
