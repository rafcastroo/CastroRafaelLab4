package com.castro.rafael;

import android.nfc.Tag;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("CastroRafaelLab4", "debug");
        Log.v("CastroRafaelLab4", "verbose");
        Log.i("CastroRafaelLab4", "information");
        Log.w("CastroRafaelLab4", "warning");
        Log.e("CastroRafaelLab4", "error");
        Button toastButton = (Button) this.findViewById(R.id.toast);
        Button snackButton = (Button) this.findViewById(R.id.snack);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "This is Toast", Toast.LENGTH_LONG).show();
            }
        });

        snackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"This is Snackbar", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
