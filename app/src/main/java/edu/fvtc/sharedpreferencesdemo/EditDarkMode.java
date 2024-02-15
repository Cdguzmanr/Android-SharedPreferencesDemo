package edu.fvtc.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditDarkMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_dark_mode);

        initButton();
    }

    private void initButton() {
        Button btnNavigate = findViewById(R.id.btnNavigate);

        btnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the other screen
                startActivity(new Intent(v.getContext(), MainActivity.class));

            }
        });
    }
}