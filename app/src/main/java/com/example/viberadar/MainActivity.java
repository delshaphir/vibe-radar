package com.example.viberadar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.WidgetContainer;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.palette.graphics.Palette;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //Initialize Variable
    ImageView imageView;
    Button btOpen;
    Palette p;
    Button color1button, color2button, color3button;
    boolean x;
    int color1, color2, color3;

    MusicManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize MusicManager and thread
        manager = new MusicManager(this);

        //Assign Variable
        imageView = findViewById(R.id.image_view);
        btOpen = findViewById(R.id.bt_open);
        color1button = findViewById(R.id.color1);
        color2button = findViewById(R.id.color2);
        color3button = findViewById(R.id.color3);

        //Get Camera Permission
        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{
                            Manifest.permission.CAMERA
                    },
                    100);
        }

        btOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open Camera
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 100);
            }
        });
    }

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 100) {
            //Get Capture Image
            Bitmap captureImage = (Bitmap) data.getExtras().get("data");
            //Set Capture Image to ImageView
            imageView.setImageBitmap(captureImage);
            p = Palette.from(captureImage).generate();
            onActivityResult2(x);
        }
    }

    private boolean isWarm(int r, int g, int b) {
        if (r - g > g - b) return true;
        return false;
    };

        public void onActivityResult2(boolean yeet) {
        int warmth = 0;

        if (p.getVibrantSwatch() != null) {
            color1button.setBackgroundColor(p.getVibrantSwatch().getRgb());
            color1 = p.getVibrantSwatch().getRgb();
            yeet = true;
        }
        else {
            color1button.setText("Surprise Color");
            color1button.setBackgroundColor(Color.BLUE);
            color1 = Color.BLUE;
            yeet = false;
        }
        int color1Red = (color1 >> 16) & 0xFF;
        int color1Green = (color1 >> 8) & 0xFF;
        int color1Blue = color1 & 0xFF;
        warmth += isWarm(color1Red, color1Green, color1Blue) ? 1 : -1;

        if (p.getMutedSwatch() != null) {
            color2button.setBackgroundColor(p.getMutedSwatch().getRgb());
            color2 = p.getMutedSwatch().getRgb();
            yeet = true;
        }
        else {
            color2button.setText("Surprise Color");
            color2button.setBackgroundColor(Color.MAGENTA);
            color2 = Color.MAGENTA;
            yeet = false;
        }
        int color2Red = (color2 >> 16) & 0xFF;
        int color2Green = (color2 >> 8) & 0xFF;
        int color2Blue = color2 & 0xFF;
        warmth += isWarm(color2Red, color2Green, color2Blue) ? 1 : -1;

        if (p.getDarkVibrantSwatch() != null) {
            color3button.setBackgroundColor(p.getDarkVibrantSwatch().getRgb());
            color3 = p.getDarkVibrantSwatch().getRgb();
            yeet = true;

        }
        else {
            color3button.setText("Surprise Color");
            color3button.setBackgroundColor(Color.YELLOW);
            color3 = Color.YELLOW;
            yeet = false;
        }
        int color3Red = (color3 >> 16) & 0xFF;
        int color3Green = (color3 >> 8) & 0xFF;
        int color3Blue = color3 & 0xFF;
        warmth += isWarm(color3Red, color3Green, color3Blue) ? 1 : -1;

        manager.changeVibe(warmth);

        final Thread manThread = new Thread(manager);
        manThread.start();
    }

    }