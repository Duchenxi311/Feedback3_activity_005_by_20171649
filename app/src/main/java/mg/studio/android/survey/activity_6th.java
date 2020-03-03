package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class activity_6th extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);
        MainActivity.activityList.add(this);
    }

    public void btnClick(View v)
    {
        EditText text=(EditText)findViewById(R.id.tx);
        String c=text.getText().toString();

        if(c.equals(""))
        {
            Toast ts = Toast.makeText(getBaseContext(), "please enter", Toast.LENGTH_LONG);
            ts.show();
        }
        else {
            transam ta=(transam) getApplication();
            ta.str[5]=c;
            Intent intent = new Intent();
            intent.setClass(activity_6th.this, activity_7th.class);
            startActivity(intent);
        }
    }
}
