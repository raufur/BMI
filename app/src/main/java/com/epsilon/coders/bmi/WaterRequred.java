package com.epsilon.coders.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WaterRequred extends AppCompatActivity {
    Button cheak;
    EditText editText;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_requred);
        cheak=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.et1);
        result=(TextView)findViewById(R.id.water);

        cheak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float weihgt=Float.parseFloat(editText.getText().toString());
                Double reuureWater=weihgt/24.0384615384;

                result.setText("Rrqured Water "+String.format("%.2f", reuureWater ));
                //result.setTextColor(255);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_water_requred, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
