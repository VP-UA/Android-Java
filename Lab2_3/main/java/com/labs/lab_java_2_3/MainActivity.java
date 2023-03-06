package com.labs.lab_java_2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RadioGroup radioGroup;
    RadioButton radioButton;

    EditText ap;

    Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn2);
        ap = findViewById(R.id.edtAP);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (ap.getText().toString().length()==0){
                ap.setError("Enter your part");
            } else if (ap.getText().toString().length()==0) {
                ap.setError("Enter full name part");
            }
            }
        });

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this, R.array.AutoParts, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(2);

        radioGroup=findViewById(R.id.radioGroup);

        Button buttonBtn1 = findViewById(R.id.btn_1);
        buttonBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

            }
        });

        }
        public void checkButton(View v){
           int radioId = radioGroup.getCheckedRadioButtonId();

           radioButton = findViewById(radioId);

            Toast.makeText(this, "Selected Radio Button" + radioButton.getText(), Toast.LENGTH_SHORT).show();
        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
