package com.example.mussabaheenmalik.navigation;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout dxd1;
    private ActionBarDrawerToggle axa1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         dxd1 = (DrawerLayout)findViewById(R.id.nav_bar);
         axa1=new ActionBarDrawerToggle(this,dxd1,R.string.open,R.string.close);
        dxd1.addDrawerListener(axa1);
        axa1.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_bar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        if(axa1.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);



    }


    public void toast(MenuItem item) {

        Toast.makeText(this,"SETTINGS CLICKED", Toast.LENGTH_SHORT).show();
    }

    public void shre(MenuItem item) {Toast.makeText(this,"SHARE CLICKED", Toast.LENGTH_SHORT).show();

    }

    public void del(MenuItem item) {
        Toast.makeText(this,"DELETE CLICKED", Toast.LENGTH_SHORT).show();
    }
}
