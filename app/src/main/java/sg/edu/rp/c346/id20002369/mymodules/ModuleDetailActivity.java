package sg.edu.rp.c346.id20002369.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String value1 = intentReceived.getStringExtra("Show1");
        String value2 = intentReceived.getStringExtra("Show2");

        if (value1 != null){
            tvDisplay.setText(value1);
        } else if (value2 != null){
            tvDisplay.setText(value2);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}