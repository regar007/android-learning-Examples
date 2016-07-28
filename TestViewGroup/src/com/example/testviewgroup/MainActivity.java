package com.example.testviewgroup;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends Activity implements OnItemClickListener, OnCheckedChangeListener, OnItemSelectedListener {

	private GridView grid;
	private ListView list;
	
	private ToggleButton toggle1;
	private ToggleButton toggle2;
	private CheckBox cb1;
	private CheckBox cb2;
	private RadioGroup rg;
	private RadioButton rb1;
	private RadioButton rb2;
	private RadioButton rb3;
	private LinearLayout linearParent;
	
	private Spinner spinn;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toggle_main);
//        grid = (GridView)findViewById(R.id.grid);
//        list = (ListView)findViewById(R.id.list);
        
        toggle1 = (ToggleButton)findViewById(R.id.toggleButton1);
        toggle2 = (ToggleButton)findViewById(R.id.toggleButton2);
        toggle1.setOnCheckedChangeListener(this);
        toggle2.setOnCheckedChangeListener(this);

        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setOnCheckedChangeListener(this);
        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setOnCheckedChangeListener(this);
        
        rg = (RadioGroup)findViewById(R.id.radioGroup1);
        rb1 = (RadioButton)findViewById(R.id.radio0);
        rb2 = (RadioButton)findViewById(R.id.radio1);
        rb3 = (RadioButton)findViewById(R.id.radio2);
        rb1.setOnCheckedChangeListener(this);
        rb2.setOnCheckedChangeListener(this);
        rb3.setOnCheckedChangeListener(this);
        
        spinn = (Spinner)findViewById(R.id.spinner1);
        
        linearParent = (LinearLayout)findViewById(R.id.toggle);
//        for(int i =0; i < 5; i++){
//        	CheckBox cb = new CheckBox(this);
//        	cb.setText("CheckBox" + i);
//        	cb.setId(i);
//        	linearParent.addView(cb);
//        }
        
        final String arr[] = {"Select Day", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, arr);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, arr);
        
        spinn.setAdapter(adapter);
//        grid.setAdapter(adapter);
////        list.setAdapter(adapter);
//        
//        grid.setOnItemClickListener(new OnItemClickListener(){
//        	
//		    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//		    	Toast.makeText(MainActivity.this, "The Item selected "+ arr[arg2], Toast.LENGTH_SHORT).show();
//		    }	
//        });
        
        spinn.setOnItemSelectedListener(new OnItemSelectedListener() {

        	@Override
        	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
        			long arg3) {
            	Toast.makeText(MainActivity.this, "The Item selected " + arr[arg2], Toast.LENGTH_SHORT).show();
        		
        	}

        	@Override
        	public void onNothingSelected(AdapterView<?> arg0) {
        		// TODO Auto-generated method stub
        		
        	}
		});
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
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		int id= buttonView.getId();
		
		switch (id) {
		case R.id.toggleButton1:
	    	Toast.makeText(MainActivity.this, "The Toggle Button 1 is "+ isChecked, Toast.LENGTH_SHORT).show();
			break;

		case R.id.toggleButton2:
	    	Toast.makeText(MainActivity.this, "The Toggle Button 2 is "+ isChecked, Toast.LENGTH_SHORT).show();
			break;

		case R.id.checkBox1:
	    	Toast.makeText(MainActivity.this, "The CheckBox 1 is "+ isChecked, Toast.LENGTH_SHORT).show();
			break;

		case R.id.checkBox2:
	    	Toast.makeText(MainActivity.this, "The CheckBox 2 is "+ isChecked, Toast.LENGTH_SHORT).show();
			break;

		case R.id.radio0:
	    	Toast.makeText(MainActivity.this, "The radio 1 is "+ isChecked, Toast.LENGTH_SHORT).show();
			break;

		case R.id.radio1:
	    	Toast.makeText(MainActivity.this, "The radio 2 is "+ isChecked, Toast.LENGTH_SHORT).show();
			break;

		case R.id.radio2:
	    	Toast.makeText(MainActivity.this, "The radio 3 is "+ isChecked, Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
