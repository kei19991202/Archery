package android.kei1999.archery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.kei1999.archery.R.id.textView;

public class PointActivity extends AppCompatActivity {


    @BindView(R.id.a1)
    TextView a1;
    @BindView(R.id.b1)
    TextView b1;
    @BindView(R.id.c1)
    TextView c1;
    @BindView(R.id.d1)
    TextView d1;
    @BindView(R.id.e1)
    TextView e1;
    @BindView(R.id.f1)
    TextView f1;
    @BindView(R.id.t1)
    TextView t1;
    @BindView(R.id.a2)
    TextView a2;
    @BindView(R.id.b2)
    TextView b2;
    @BindView(R.id.c2)
    TextView c2;
    @BindView(R.id.d2)
    TextView d2;
    @BindView(R.id.e2)
    TextView e2;
    @BindView(R.id.f2)
    TextView f2;
    @BindView(R.id.t2)
    TextView t2;
    @BindView(R.id.a3)
    TextView a3;
    @BindView(R.id.b3)
    TextView b3;
    @BindView(R.id.c3)
    TextView c3;
    @BindView(R.id.d3)
    TextView d3;
    @BindView(R.id.e3)
    TextView e3;
    @BindView(R.id.f3)
    TextView f3;
    @BindView(R.id.t3)
    TextView t3;
    @BindView(R.id.a4)
    TextView a4;
    @BindView(R.id.b4)
    TextView b4;
    @BindView(R.id.c4)
    TextView c4;
    @BindView(R.id.d4)
    TextView d4;
    @BindView(R.id.e4)
    TextView e4;
    @BindView(R.id.f4)
    TextView f4;
    @BindView(R.id.t4)
    TextView t4;
    @BindView(R.id.a5)
    TextView a5;
    @BindView(R.id.b5)
    TextView b5;
    @BindView(R.id.c5)
    TextView c5;
    @BindView(R.id.d5)
    TextView d5;
    @BindView(R.id.e5)
    TextView e5;
    @BindView(R.id.f5)
    TextView f5;
    @BindView(R.id.t5)
    TextView t5;
    @BindView(R.id.a6)
    TextView a6;
    @BindView(R.id.b6)
    TextView b6;
    @BindView(R.id.c6)
    TextView c6;
    @BindView(R.id.d6)
    TextView d6;
    @BindView(R.id.e6)
    TextView e6;
    @BindView(R.id.f6)
    TextView f6;
    @BindView(R.id.t6)
    TextView t6;
    @BindView(R.id.btX)
    Button btX;
    @BindView(R.id.bt10)
    Button bt10;
    @BindView(R.id.bt9)
    Button bt9;
    @BindView(R.id.bt8)
    Button bt8;
    @BindView(R.id.bt7)
    Button bt7;
    @BindView(R.id.bt6)
    Button bt6;
    @BindView(R.id.bt5)
    Button bt5;
    @BindView(R.id.bt4)
    Button bt4;
    @BindView(R.id.bt3)
    Button bt3;
    @BindView(R.id.bt2)
    Button bt2;
    @BindView(R.id.bt1)
    Button bt1;
    @BindView(R.id.btM)
    Button btM;
    @BindView(R.id.button24)
    Button button24;
    @BindView(R.id.button23)
    Button button23;
    @BindView(R.id.button22)
    Button button22;
    @BindView(R.id.button21)
    Button button21;

    int allTotal;
    int total1;
    int total2;
    int total3;
    int total4;
    int total5;
    int total6;
    int x;
    int y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);
        ButterKnife.bind(this);

        allTotal=0;
        total1=0;
        total2=0;
        total3=0;
        total4=0;
        total5=0;
        total6=0;
        x=1;
        y=1;

    }

    public void a1(View v){
        x=1;y=1;
    }
    public void a2(View v){
        x=1;y=2;
    }
    public void a3(View v){
        x=1;y=3;
    }
    public void a4(View v){
        x=1;y=4;
    }
    public void a5(View v){
        x=1;y=5;
    }
    public void a6(View v){
        x=1;y=6;
    }
    public void b1(View v){
        x=2;y=1;
    }
    public void b2(View v){
        x=2;y=2;
    }
    public void b3(View v){
        x=2;y=3;
    }
    public void b4(View v){
        x=2;y=4;
    }
    public void b5(View v){
        x=2;y=5;
    }
    public void b6(View v){
        x=2;y=6;
    }
    public void c1(View v){
        x=3;y=1;
    }
    public void c2(View v){
        x=3;y=2;
    }
    public void c3(View v){
        x=3;y=3;
    }
    public void c4(View v){
        x=3;y=4;
    }
    public void c5(View v){
        x=3;y=5;
    }
    public void c6(View v){
        x=3;y=6;
    }
    public void d1(View v){
        x=4;y=1;
    }
    public void d2(View v){
        x=4;y=2;
    }
    public void d3(View v){
        x=4;y=3;
    }
    public void d4(View v){
        x=4;y=4;
    }
    public void d5(View v){
        x=4;y=5;
    }
    public void d6(View v){
        x=4;y=6;
    }
    public void e1(View v){
        x=5;y=1;
    }
    public void e2(View v){
        x=5;y=2;
    }
    public void e3(View v){
        x=5;y=3;
    }
    public void e4(View v){
        x=5;y=4;
    }
    public void e5(View v){
        x=5;y=5;
    }
    public void e6(View v){
        x=5;y=6;
    }
    public void f1(View v){
        x=6;y=1;
    }
    public void f2(View v){
        x=6;y=1;
    }
    public void f3(View v){
        x=6;y=1;
    }
    public void f4(View v){
        x=6;y=1;
    }
    public void f5(View v){
        x=6;y=1;
    }
    public void f6(View v){
        x=6;y=1;
    }



    public void btX(View v) {
        allTotal = allTotal+10;
    }

//    int position(int a,int b){
//        int result = a+b*7;
//        textView.setText(String.valueOf(result));
//        return result;
//    }
//    func(10,20);

}