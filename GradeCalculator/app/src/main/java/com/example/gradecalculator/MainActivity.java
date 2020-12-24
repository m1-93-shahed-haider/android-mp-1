package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //connecting variables to XML
        EditText x = findViewById(R.id.quize);
        EditText y = findViewById(R.id.hmw);
        EditText z = findViewById(R.id.mid);
        EditText a = findViewById(R.id.fin);
        Button c = findViewById(R.id.calc);
        TextView b = findViewById(R.id.result);


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quizeString = x.getText().toString();
               Double q = Double.parseDouble(quizeString) ;
                String hmwString = y.getText().toString();
                Double h = Double.parseDouble(hmwString) ;
                String midtString = z.getText().toString();
                Double m = Double.parseDouble(midtString);
                String finString = a.getText().toString();
                Double f = Double.parseDouble(finString ) ;



                Double total = q + h + m + f;
                //System.out.println("//////" + total);
                b.setText(total+"");

                if (total>=90){
                    System.out.println("your Grade is A" );
                    b.setText(total+"");
                }
                else if (total>=80){
                    System.out.println("your Grade is B" );
                    b.setText(total+"");
                }
                else if (total>=70){
                    System.out.println("your Grade is C" );
                    b.setText(total+"");
                }

                else if (total>=60){
                    System.out.println("your Grade is D" );
                    b.setText(total+"");
                }
                else if (total<60){
                    System.out.println("your Grade is F" );
                    b.setText(total+"");
                }
            }
        });
    }
}