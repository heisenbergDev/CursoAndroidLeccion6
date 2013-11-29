package es.aiiscyl.cursoandroidleccion6;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	static final private int MENU_PREFERENCES = Menu.FIRST+1;
	private static final int SHOW_PREFERENCES = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		menu.add(0, MENU_PREFERENCES, Menu.NONE, R.string.menu_preferences);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){ 
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case (MENU_PREFERENCES): { 
			Intent i = new Intent(this,	PreferencesActivity.class); 
			startActivityForResult(i, SHOW_PREFERENCES); 
			return true;
		} }
		return false; }

}
