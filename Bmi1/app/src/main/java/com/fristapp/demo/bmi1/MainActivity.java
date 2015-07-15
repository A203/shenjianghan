package com.fristapp.demo.bmi1;

import android.app.Activity;
import android.os.Bundle;
import java.text.DecimalFormat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {



    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.submit);
        button.setOnClickListener(calcBMI);
    }
    private OnClickListener calcBMI=new OnClickListener(){
        public void onClick(View v){
            DecimalFormat nf=new DecimalFormat("0.00");
            EditText fieldheight=(EditText)findViewById(R.id.height);
            EditText fieldweight=(EditText)findViewById(R.id.weight);
            double height=Double.parseDouble(fieldheight.getText().toString())/100;
            double weight=Double.parseDouble(fieldweight.getText().toString());
            double BMI=weight/(height*height);

            TextView result=(TextView)findViewById(R.id.result);
            result.setText("BMI="+nf.format(BMI));

            TextView fieldsuggest=(TextView)findViewById(R.id.suggest);
            if(BMI<16){
                fieldsuggest.setText(R.string.suggest_light1);
            }
            else if(BMI<18.5){
                fieldsuggest.setText(R.string.suggest_light2);
            }
            else if (BMI<25) {
                fieldsuggest.setText(R.string.suggest_average);
            }
            else if (BMI<30) {

                fieldsuggest.setText(R.string.suggest_heavy1);
            }
            else if (BMI<35) {
                fieldsuggest.setText(R.string.suggest_heavy2);
            }
            else if (BMI<40) {
                fieldsuggest.setText(R.string.suggest_heavy3);
            }
            else{
                fieldsuggest.setText(R.string.suggest_heavy4);
            }

        }
    };
}