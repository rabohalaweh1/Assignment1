package edu.cs.birzeit.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

import edu.cs.assingmentone.R;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerLang;
    private EditText nameEdt;
    private EditText emailEdt;
    private EditText addressEdt;
    private EditText edtPhone;
    private RadioButton maleBtn;
    private RadioButton femailBtn;
    private RadioButton selctAge1;
    private RadioButton slctAge2;
    private RadioButton scltAge3;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEdt = findViewById(R.id.nameEdt);
        emailEdt = findViewById(R.id.emailEdt);
        addressEdt = findViewById(R.id.addressEdt);
        edtPhone = findViewById(R.id.edtPhone);
        maleBtn = findViewById(R.id.maleBtn);
        femailBtn = findViewById(R.id.femailBtn);
        selctAge1 = findViewById(R.id.selctAge1);
        slctAge2 = findViewById(R.id.slctAge2);
        scltAge3 = findViewById(R.id.scltAge3);
        spinnerLang = (Spinner) findViewById(R.id.spinnerLang);
        PopulateSpinner();
    }

    private void PopulateSpinner() {
        ArrayList<String> data = new ArrayList<>();
        data.add("English");
        data.add("Arabic");
        data.add("Spanish");
        data.add("French");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, data  );


        spinnerLang.setAdapter(adapter);
    }

    public void btnSave_onClick(View view) {

        String name = nameEdt.getText().toString();
        String email = emailEdt.getText().toString();
        String address = addressEdt.getText().toString();
        String phone = edtPhone.getText().toString();
        String languages = spinnerLang.getSelectedItem().toString();

        Intent intent = new Intent(this, MainActivity2.class );
        intent.putExtra("Name" , name);
        intent.putExtra("Email" , email);
        intent.putExtra("Address" , address);
        intent.putExtra("Phone" , phone);
        intent.putExtra("Languages",languages);
        startActivity(intent);


    }
}