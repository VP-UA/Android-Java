package com.labs.lab_java_2_4;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4_var2);

        String[] strArray = new String[250];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "Число №" + (i + 1);
        }

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, strArray);
        ListView BaseLV = ((ListView)findViewById(R.id.BaseLV));
        BaseLV.setAdapter(adapter);

        BaseLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, (String) parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}