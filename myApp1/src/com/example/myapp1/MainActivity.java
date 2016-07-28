package com.example.myapp1;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.usage.UsageEvents.Event;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.media.Image;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;

//try onTouch()-> onkeyUp...  && onKey -> key stroke enter,...
public class MainActivity extends Activity implements OnLongClickListener, OnClickListener, OnTouchListener, OnKeyListener{

	private Button btn1;
	private Button btn2;
	private Button btn3;
	private ImageView imageToShow;

	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn1.setOnLongClickListener(this);
        btn2.setOnLongClickListener(this);
        btn3.setOnLongClickListener(this);
        
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        imageToShow = (ImageView)findViewById(R.id.imageView1);

//        btn1.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				imageToShow.setBackgroundResource(R.drawable.download);
//				
//			}
//		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onClick(View v){
    	int id= v.getId();
    	
    	switch (id) {
		case R.id.button1:
			imageToShow.setBackgroundResource(R.drawable.download);
			break;
			
		case R.id.button2:
			imageToShow.setBackgroundResource(R.drawable.aaa);			
			break;
			
		case R.id.button3:
			imageToShow.setBackgroundResource(R.drawable.androidlogo);
			break;

		default:
			break;
		}
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
	public boolean onLongClick(View arg0) {
    	int id= arg0.getId();
    	
    	switch (id) {
		case R.id.button1:
			imageToShow.setBackgroundResource(R.drawable.download);
			break;
			
		case R.id.button2:
			imageToShow.setBackgroundResource(R.drawable.aaa);			
			break;
			
		case R.id.button3:
			imageToShow.setBackgroundResource(R.drawable.androidlogo);
			break;

		default:
			break;
		}

    	return false;
	}

	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		
		return false;
	}

	@Override
	public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return false;
	}
}
