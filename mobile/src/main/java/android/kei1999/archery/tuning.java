package android.kei1999.archery;

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

    EditText textEdit;
    SharedPreferences pref;
    SharedPreferences.Editor editer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuning);

        pref = getSharedPreferences("dictionary", MODE_PRIVATE);
        editer = pref.edit();

        sights1 = pref.getString("編集","");
        sights2 = pref.getString("編集","");
        sights3 = pref.getString("編集","");
        sights4 = pref.getString("編集","");


        textEdit =(EditText)findViewById(R.id.editText);
        textEdit.setText("" + sights1);
        textEdit.setText("" + sights2);
        textEdit.setText("" + sights3);
        textEdit.setText("" + sights4);

    }

    public void changeComit1(View v){

        sights1 = textEdit.getText().toString();
        editer.putString("編集",sights1);
        sights2 = textEdit.getText().toString();
        editer.putString("編集",sights2);
        sights3 = textEdit.getText().toString();
        editer.putString("編集",sights3);
        sights4 = textEdit.getText().toString();
        editer.putString("編集",sights4);
        editer.commit();

    }
    public void onDestroy(){

        sights1 = textEdit.getText().toString();
        editer.putString("編集",sights1);
        sights2 = textEdit.getText().toString();
        editer.putString("編集",sights2);
        sights3 = textEdit.getText().toString();
        editer.putString("編集",sights3);
        sights4 = textEdit.getText().toString();
        editer.putString("編集",sights4);
        editer.commit();

    }

}
