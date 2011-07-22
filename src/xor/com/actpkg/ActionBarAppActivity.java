package xor.com.actpkg;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public abstract class ActionBarAppActivity extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
    }
    
    public void onAbout(View v)
    {
    	Toast.makeText (getApplicationContext(),"This is a Sample App that displays use of Action Bar" , Toast.LENGTH_LONG).show ();
    }
    
    public void onSearch(View v)
    {
    	startActivity (new Intent(getApplicationContext(), SearchActivity.class));
    }
    
    public void onHome (View v)
    {
    	return2Home(this);
    }
    
    public void return2Home(Context context)
    {
        final Intent intent = new Intent(context, HomeActivity.class);
        intent.setFlags (Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity (intent);
    }
}