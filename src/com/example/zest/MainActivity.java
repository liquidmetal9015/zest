package com.example.zest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
	    switch (item.getItemId()) {
	 
	    case android.R.id.home:
	        NavUtils.navigateUpFromSameTask(this);
	        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	}


	
	int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    

        
        
        final TextView text = (TextView)findViewById(R.id.textView1);
        
     
        Button decrement = (Button)findViewById(R.id.button1); 
        
        Button reset = (Button)findViewById(R.id.button3);
        Button trans = (Button)findViewById(R.id.button4);
        
        
        Button rButton = (Button)findViewById(R.id.button2); 
        
        rButton.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View v){
        		ImageView cats = (ImageView)findViewById(R.id.imageView1);
        	 count++;
        		text.setText(Integer.toString(count));
        		cats.setImageResource(R.drawable.waffles);
        		
        	}
        	
        	
        });
        


        
decrement.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View v){
        	 count--;
        	 ImageView cats = (ImageView)findViewById(R.id.imageView1);
        		text.setText(Integer.toString(count));
        		cats.setImageResource(R.drawable.stick);
        	}
        	
        	
        });

reset.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v){
	 count = 0;
		text.setText(Integer.toString(count));
		
	}
	
	
});
      
trans.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v){
	Intent intent = new Intent(MainActivity.this, OtherActivity.class);
		startActivity(intent);
		overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
	

	}
	
	
});
       
    }


    
}
