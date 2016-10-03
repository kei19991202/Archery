package android.kei1999.archery;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String destination;

    EditText textEdit;
    SharedPreferences pref;
    SharedPreferences.Editor editer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = getSharedPreferences("dictionary", MODE_PRIVATE);
        editer = pref.edit();

        destination = pref.getString("編集","");


        textEdit =(EditText)findViewById(R.id.editText);
        textEdit.setText("");


    }

    public void todaysMenu(View v){

        Intent intent1 = new Intent(this, TodaysMenu.class);
        startActivity(intent1);

    }

    public void edit(View v){
        destination = textEdit.getText().toString();
        editer.putString("編集",destination);
        editer.commit();
    }

}

