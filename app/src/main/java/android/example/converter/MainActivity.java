package android.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     private Button button;
     private TextView textview;
     private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textview = findViewById(R.id.display);
        editText = findViewById(R.id.edit);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                final Double pound=2.205;
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                 Double kgtopound = kg*pound;
                 textview.setText(s + " Kg = " +kgtopound+ " Pounds");
            }
        });
    }
}