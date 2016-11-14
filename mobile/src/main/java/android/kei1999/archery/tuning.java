package android.kei1999.archery;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class tuning extends AppCompatActivity {

    String sights1;
    String sights2;
    String sights3;
    String sights4;

    EditText textEdit1;
    EditText textEdit2;
    EditText textEdit3;
    EditText textEdit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuning);

        SharedPreferences pref = getSharedPreferences("dictionary2", MODE_PRIVATE);

        sights1 = pref.getString("編集1","");
        sights2 = pref.getString("編集2","");
        sights3 = pref.getString("編集3","");
        sights4 = pref.getString("編集4","");


        textEdit1 =(EditText)findViewById(R.id.editText2);
        textEdit1.setText("" + sights1);
        textEdit2 =(EditText)findViewById(R.id.editText3);
        textEdit2.setText("" + sights2);
        textEdit3 =(EditText)findViewById(R.id.editText4);
        textEdit3.setText("" + sights3);
        textEdit4 =(EditText)findViewById(R.id.editText5);
        textEdit4.setText("" + sights4);

    }

    public void changeComit1(View v){

        SharedPreferences pref = getSharedPreferences("dictionary2", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        sights1 = textEdit1.getText().toString();
        editor.putString("編集1",sights1);
        sights2 = textEdit2.getText().toString();
        editor.putString("編集2",sights2);
        sights3 = textEdit3.getText().toString();
        editor.putString("編集3",sights3);
        sights4 = textEdit4.getText().toString();
        editor.putString("編集4",sights4);
        editor.commit();

        Intent intent5 = new Intent(this, MainActivity.class);
        startActivity(intent5);
        //TODO:Intent5


    }


}
