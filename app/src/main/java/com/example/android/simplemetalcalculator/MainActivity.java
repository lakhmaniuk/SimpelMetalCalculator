package com.example.android.simplemetalcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnImgRoundPipe;
    ImageButton btnImgProfilePipe;
    ImageButton btnImgRoundRod;
    ImageButton btnImgProfileRod;
    ImageButton btnImgHexagonRod;
    ImageButton btnImgSheetMetal;
    ImageButton btnImgCorner;
    ImageButton btnImgStripe;
    ImageButton btnImgChannel;
    ImageButton btnImgGirders;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImgChannel = (ImageButton)findViewById(R.id.btn_img_channel);
        btnImgRoundPipe = (ImageButton)findViewById(R.id.btn_img_round_pipe);
        btnImgCorner = (ImageButton)findViewById(R.id.btn_img_corner);
        btnImgGirders = (ImageButton)findViewById(R.id.btn_img_girders);
        btnImgHexagonRod = (ImageButton)findViewById(R.id.btn_img_hexagon_rod);
        btnImgProfilePipe = (ImageButton)findViewById(R.id.btn_img_profile_pipe);
        btnImgProfileRod = (ImageButton)findViewById(R.id.btn_img_profile_rod);
        btnImgSheetMetal = (ImageButton)findViewById(R.id.btn_img_sheet_metal);
        btnImgRoundRod = (ImageButton)findViewById(R.id.btn_img_round_rod);
        btnImgStripe = (ImageButton)findViewById(R.id.btn_img_stripe);

        btnImgChannel.setOnClickListener(MainActivity.this);
        btnImgRoundPipe.setOnClickListener(MainActivity.this);
        btnImgCorner.setOnClickListener(MainActivity.this);
        btnImgGirders.setOnClickListener(MainActivity.this);
        btnImgHexagonRod.setOnClickListener(MainActivity.this);
        btnImgProfilePipe.setOnClickListener(MainActivity.this);
        btnImgProfileRod.setOnClickListener(MainActivity.this);
        btnImgSheetMetal.setOnClickListener(MainActivity.this);
        btnImgRoundRod.setOnClickListener(MainActivity.this);
        btnImgStripe.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId()){
            case R.id.btn_img_channel:
                intent = new Intent(MainActivity.this, ChannelActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_img_corner:
                intent = new Intent(MainActivity.this, CornerActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_img_girders:
                intent = new Intent(MainActivity.this, GirdersActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_img_hexagon_rod:
                intent = new Intent(MainActivity.this, HexagonRodActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_img_profile_pipe:
                intent = new Intent(MainActivity.this, ProfilePipeActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_img_profile_rod:
                intent = new Intent(MainActivity.this, ProfileRodActivity.class);
                startActivity(intent);

            case R.id.btn_img_round_pipe:
                intent = new Intent(MainActivity.this, RoundPipeActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_img_round_rod:
                intent = new Intent(MainActivity.this, RoundRodActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_img_sheet_metal:
                intent = new Intent(MainActivity.this, SheetMetalActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_img_stripe:
                intent = new Intent(MainActivity.this, StripeActivity.class);
                startActivity(intent);
                break;

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_item_info:
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
