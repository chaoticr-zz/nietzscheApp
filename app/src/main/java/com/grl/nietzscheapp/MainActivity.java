package com.grl.nietzscheapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.grl.nietzscheapp.fragments.aulasFragment;
import com.grl.nietzscheapp.fragments.calFragment;
import com.grl.nietzscheapp.fragments.obrasFragment;
import com.grl.nietzscheapp.fragments.vidaFragment;
import com.grl.nietzscheapp.fragments.videosFragment;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        android.app.FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame, new vidaFragment()).commit();
        navigationView.getMenu().getItem(0).setChecked(true);
        
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        android.app.FragmentManager fm = getFragmentManager();

        int id = item.getItemId();

        if (id == R.id.nav_obras) {
            fm.beginTransaction().replace(R.id.content_frame, new obrasFragment()).commit();
        } else if (id == R.id.nav_vida) {
            fm.beginTransaction().replace(R.id.content_frame, new vidaFragment()).commit();
        } else if (id == R.id.nav_videos) {
            fm.beginTransaction().replace(R.id.content_frame, new videosFragment()).commit();
        } else if (id == R.id.nav_cal) {
            fm.beginTransaction().replace(R.id.content_frame, new calFragment()).commit();
        } else if (id == R.id.nav_aulas) {
            fm.beginTransaction().replace(R.id.content_frame, new aulasFragment()).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void btn_Vid1(View v){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gHJzAAvISYU ")));
    }

    public void btn_au1(View v){
        Intent a = new Intent(MainActivity.this, aula1.class);
        startActivity(a);
    }

    public void btn_au2(View v){
        Intent a = new Intent(MainActivity.this, aula2.class);
        startActivity(a);
    }

    public void btn_au3(View v){
        Intent a = new Intent(MainActivity.this, aula3.class);
        startActivity(a);
    }

    public void btn_au4(View v){
        Intent a = new Intent(MainActivity.this, aula4.class);
        startActivity(a);
    }

    public void btn_au5(View v){
        Intent a = new Intent(MainActivity.this, aula5.class);
        startActivity(a);
    }

    public void btn_au6(View v){
        Intent a = new Intent(MainActivity.this, aula6.class);
        startActivity(a);
    }

    public void btn_au7(View v){
        Intent a = new Intent(MainActivity.this, aula7.class);
        startActivity(a);
    }

    public void btn_au8(View v){
        Intent a = new Intent(MainActivity.this, aula8.class);
        startActivity(a);
    }

    public void btn_au9(View v){
        Intent a = new Intent(MainActivity.this, aula9.class);
        startActivity(a);
    }

    public void btn_au10(View v){
        Intent a = new Intent(MainActivity.this, aula10.class);
        startActivity(a);
    }

    public void btn_au11(View v){
        Intent a = new Intent(MainActivity.this, aula11.class);
        startActivity(a);
    }
}
