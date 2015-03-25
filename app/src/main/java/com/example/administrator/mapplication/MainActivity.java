package com.example.administrator.mapplication;

import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddBirthday(View view)
    {
        ContentValues values = new ContentValues();

        //values.put("name", ((EditText)findViewById(R.id.name)).getText().toString());
        values.put("name", "BinhTC");
        //Uri birth = Uri.parse("content://com.android.administrator.BirthdayProv/friends");
       // Uri uri = getContentResolver().insert(birth,values);
        //Uri uri = getContentResolver().insert()
        //Toast.makeText(getBaseContext(),"Content Provider inserted" + uri.toString(),Toast.LENGTH_LONG ).show();
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
