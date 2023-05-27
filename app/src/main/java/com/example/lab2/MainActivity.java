package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.constraintLayout);
        TextView firstText = findViewById(R.id.android_text);
        EditText theEdit = findViewById(R.id.edittext);
    final Button btn = findViewById(R.id.button);
     btn.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
         String edit = theEdit.getText().toString();
         firstText.setText(edit);
            Toast.makeText(MainActivity.this, getString(R.string.toast_msg), Toast.LENGTH_SHORT).show();;
        }




        });

}

    }
