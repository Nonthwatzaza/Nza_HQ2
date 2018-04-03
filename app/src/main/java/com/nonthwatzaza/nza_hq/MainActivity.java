package com.nonthwatzaza.nza_hq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView profilebunton,camerabunton,bluetoothbunton,cortrolbunton,aboutbunton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // defincard
        profilebunton = (CardView) findViewById(R.id.profile_bunton);
        camerabunton = (CardView) findViewById(R.id.camera_bunton);
        bluetoothbunton = (CardView) findViewById(R.id.bluetooth_bunton);
        cortrolbunton = (CardView) findViewById(R.id.cortrol_bunton);
        aboutbunton = (CardView) findViewById(R.id.about_bunton);
        // add Click lisetner to the card
        profilebunton.setOnClickListener(this);
        camerabunton.setOnClickListener(this);
        bluetoothbunton.setOnClickListener(this);
        cortrolbunton.setOnClickListener(this);
        aboutbunton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.profile_bunton: i = new Intent(this,profile_page.class);startActivity(i);break;
            case R.id.camera_bunton: i = new Intent(this,camera_page.class);startActivity(i);break;
            case R.id.bluetooth_bunton: i = new Intent(this,bluetooth_page.class);startActivity(i);break;
            case R.id.cortrol_bunton: i = new Intent(this,cortrol_page.class);startActivity(i);break;
            case R.id.about_bunton: i = new Intent(this,about_page.class);startActivity(i);break;
            default:break;


        }
    }
}
