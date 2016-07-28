package com.example.switchactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity implements OnClickListener{
	
	Bundle bund;
	TextView text;
	private EditText edit;
	private Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondlayout);
		
		text = (TextView)findViewById(R.id.mob);
		bund = getIntent().getExtras();
		text.setText(bund.getString("EDITTEXTVAL"));
		
        edit = (EditText)findViewById(R.id.editText2);
        btn = (Button)findViewById(R.id.signin);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
				intent2.putExtra("EDITTEXT", edit.getText().toString());
				startActivity(intent2);
				finish();
			}
		});		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
