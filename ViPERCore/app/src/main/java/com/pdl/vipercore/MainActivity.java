package com.pdl.vipercore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.pdl.vipercore.selinux.SELinux_MainActivity;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button go_fx = (Button) findViewById(R.id.btn_go_fx);
        final Button go_xhifi = (Button) findViewById(R.id.btn_go_xhifi);
        final Button go_help = (Button) findViewById(R.id.btn_go_help);

        go_fx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go_fx =new Intent("call.pdl.fx");
                startActivity(go_fx);
                finish(); //액티비티 종료
            }
        });

        go_xhifi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go_xhifi = new Intent("call.pdl.xhifi");
                startActivity(go_xhifi);
                finish(); //액티비티 종료
            }
        });

        go_help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go_help = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(go_help);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SELinux_MainActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
