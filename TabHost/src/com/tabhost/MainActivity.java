package com.tabhost;
import com.tabhost.R;

import android.os.Bundle;
import android.annotation.SuppressLint;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class MainActivity extends FragmentActivity {

    private FragmentManager fragmentManager;  
    private RadioGroup radioGroup;
    private RadioButton rb1;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	    fragmentManager = getSupportFragmentManager();  
	   	    	    
	    radioGroup = (RadioGroup) findViewById(R.id.main_radio);  
	    rb1=(RadioButton) findViewById(R.id.rb_home);
	    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {  

	        @SuppressLint("NewApi")
			public void onCheckedChanged(RadioGroup group, int checkedId) { 
        	    rb1.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabhost_bg_selector));
	            FragmentTransaction transaction = fragmentManager.beginTransaction();  
	            ContentFrame fragment = null;
	            switch(checkedId)
	            {
	            	case 0:
	            		fragment= new ContentFrame();
	            		break;
	            	case 1:
	            		fragment= new ContentFrame();
	            		break;
	            	case 2:
	            		fragment= new ContentFrame();
	            		break;
	            	case 3:
	            		fragment= new ContentFrame();
	            		break;	
	            	default:
	   
	            		fragment= new ContentFrame();
	            		break;
	            }
	            transaction.replace(R.id.content, (Fragment)fragment);  
	            transaction.commit();  
	        }
	    });
	    //设置默认选中第一项
	    radioGroup.check(1);
	    radioGroup.check(0);
	    //rb1.setSelected(true);
	    rb1.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabhost_press));
	}
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
