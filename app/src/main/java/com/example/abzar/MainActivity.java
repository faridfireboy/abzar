package com.example.abzar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.Manifest;



public class MainActivity extends AppCompatActivity {


    private static final int CAMERA_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFelash = findViewById(R.id.btn_Felash);
        btnFelash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if peemision
                if ( ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    requestCameraPermission();

                } else {
                    Intent intent = new Intent(MainActivity.this, Felash.class);
                    startActivity(intent);
                }

            }
        });
        Button btnCalculator = findViewById(R.id.btn_Calculator);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cal.class);
                startActivity(intent);

            }
        });

        Button btn_City = findViewById(R.id.btn_City);
        btn_City.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, City.class);
                startActivity(intent);

            }
        });

    }




    private void requestCameraPermission() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this, Manifest.permission.CAMERA)) {

            new AlertDialog.Builder(this)
                .setTitle("درخواست مجوز")
                .setMessage("برای دسترسی به دوربین باید مجوز را تایید کنید")
                .setPositiveButton("موافقم", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        reqPermission();
                    }
                })
                .setNegativeButton("لغو", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();

                    }
                })
                .create()
                .show();

        } else {

            reqPermission();

        }

    }

    private void reqPermission() {
        ActivityCompat.requestPermissions(MainActivity.this, new String[] {Manifest.permission.CAMERA}, CAMERA_REQUEST_CODE);

    }
}

