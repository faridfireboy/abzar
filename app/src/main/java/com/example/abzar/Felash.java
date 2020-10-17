package com.example.abzar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Felash extends AppCompatActivity {
    ImageButton btnSwitch;

    Camera camera;
    Camera.Parameters params;
    boolean isFlashon;
    boolean hasFlash;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felash);
        btnSwitch = (ImageButton) findViewById(R.id.btn_Switch);
        hasFlash = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        if (!hasFlash) {
            AlertDialog alert = new AlertDialog.Builder(Felash.this).create();
            alert.setTitle("Error");
            alert.setMessage("دستگاه شما از فلش پشتیبانی نمیکند!:(");
            alert.setButton(AlertDialog.BUTTON_POSITIVE, "ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alert.show();
            return;
        }

        if (camera == null) {
            try {
                Camera camera = Camera.open();
                params = camera.getParameters();

            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFlashon) {// flash is on

                    turnOnFlash();
                    btnSwitch.setImageResource(R.drawable.btn_switch_on);
                    isFlashon = !isFlashon;

                    mp = MediaPlayer.create(Felash.this, R.raw.switch_off);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.release();
                        }
                    });
                    mp.start();

                } else {// flash is off

                    turnOffFlash();
                    btnSwitch.setImageResource(R.drawable.btn_switch_off);
                    isFlashon = !isFlashon;

                    mp = MediaPlayer.create(Felash.this, R.raw.switch_on);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.release();
                        }
                    });
                    mp.start();
                }
            }
        });
    }

    public void turnOnFlash() {
        if (camera == null || params == null) {
            return;
        }
        params = camera.getParameters();
        params.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
        camera.setParameters(params);
        camera.startPreview();
    }

    public void turnOffFlash() {
        if (camera == null || params == null) {
            return;
        }
        params = camera.getParameters();
        params.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
        camera.setParameters(params);
        camera.stopPreview();
    }
}

