package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        MainActivity.activityList.add(this);

    }

    public void clickWel(View v)
    {

        CheckBox ckOK= (CheckBox) findViewById(R.id.cb);
        if(ckOK.isChecked())
        {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, activity_1st.class);
            startActivity(intent);

        }
        else
        {
            Toast ts = Toast.makeText(getBaseContext(),"please accept",Toast.LENGTH_LONG);
            ts.show();
        }
    }

    public static List<Activity> activityList = new LinkedList();

    public static void exit()
    {

        for(Activity act:activityList)
        {
            act.finish();
        }

        System.exit(0);

    }
}
