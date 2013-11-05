package com.exampl.androidgames2;

import android.R.string;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AndroidBasicStarter extends ListActivity {
	String tests[] = { "LifeCycleTest", "SingleTouchTest", "MultiTouchTest",
			"KeyTest", "AccelerometerTest", "AssetsTest",
			"ExternalStorageTest", "SoundPoolTest", "mediaPlayerTest",
			"FullScreenTest", "RenderViewTest", "ShapeTest", "BitmapTest",
			"FontTest", "SurfaceViewTest","HelloWorld" };
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_android_basic_starter);
        setListAdapter(new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1, tests));
    }


    @Override
    protected void onListItemClick(ListView list, View view, int position, long id){
    	super.onListItemClick(list, view, position, id);
    	String testName = tests[position];
    	
    	try {
    		Class clazz = Class.forName("com.badlogic.amdroidgame." + testName);
    		Intent intent = new Intent(this, clazz);
    		startActivity(intent);
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    }
    
}
