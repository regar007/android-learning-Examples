package com.example.firstandroidclass;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class SecondActivity extends Activity implements OnClickListener{

	private Button btn1;
	private Button btn2;
	private Button btn3;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View v) {
		int id = v.getId();
		
		switch (id) {
		case R.id.button1:
			Toast.makeText(SecondActivity.this, "Clicked Button 1 ", Toast.LENGTH_SHORT).show();
			break;

		case R.id.button2:
			Toast.makeText(SecondActivity.this, "Clicked Button 2 ", Toast.LENGTH_SHORT).show();			
			break;

		case R.id.button3:
			Toast.makeText(SecondActivity.this, "Clicked Button 3 ", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
	}
}
