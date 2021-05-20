package sg.edu.rp.c346.id20002369.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Show1", "Module Code: C346\nModule Name: Android Programming\nAcademic  Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Show2", "Module Code: C349\nModule Name: Ipad Programming\nAcademic  Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: E67M");
                startActivity(intent);
            }
        });

    }
}