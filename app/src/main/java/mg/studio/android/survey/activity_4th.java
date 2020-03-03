package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class activity_4th extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);
        MainActivity.activityList.add(this);
    }

    public void btnClick(View v)
    {
        CheckBox ck1= (CheckBox) findViewById(R.id.cb1);
        CheckBox ck2= (CheckBox) findViewById(R.id.cb2);
        CheckBox ck3= (CheckBox) findViewById(R.id.cb3);
        CheckBox ck4= (CheckBox) findViewById(R.id.cb4);
        CheckBox ck5= (CheckBox) findViewById(R.id.cb5);
        CheckBox ck6= (CheckBox) findViewById(R.id.cb6);
        CheckBox ck7= (CheckBox) findViewById(R.id.cb7);
        CheckBox[] ck={ck1,ck2,ck3,ck4,ck5,ck6,ck7};
        String an4="";

        int num=0;
        for(int i=0;i<7;i++)
        {
            if(ck[i].isChecked())
            {
                if(an4.equals(""))
                    an4=an4+ck[i].getText().toString();
                else
                    an4=an4+"、"+ck[i].getText().toString();
                num=num+1;
            }
        }
        transam ta=(transam) getApplication();
        ta.str[3]=an4;
        if(num==0)
        {
            Toast ts = Toast.makeText(getBaseContext(),"please choose",Toast.LENGTH_LONG);
            ts.show();
        }
        else
        {
            Intent intent = new Intent();
            intent.setClass(activity_4th.this, activity_5th.class);
            startActivity(intent);;
        }
    }
}
