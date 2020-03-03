package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class activity_3rd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_three);
        MainActivity.activityList.add(this);
    }

    public void btnClick(View v)
    {
        RadioGroup group= (RadioGroup) findViewById(R.id.rg);
        int selected = group.getCheckedRadioButtonId();
        Intent intent = new Intent();
        RadioButton an3=(RadioButton) findViewById(group.getCheckedRadioButtonId());
        transam ta=(transam) getApplication();

        switch(selected){
            case R.id.rbt1:
                ta.str[2]=an3.getText().toString();
                intent.setClass(activity_3rd.this, activity_4th.class);
                startActivity(intent);;
                break;
            case R.id.rbt2:
                ta.str[2]=an3.getText().toString();
                intent.setClass(activity_3rd.this, activity_4th.class);
                startActivity(intent);;
                break;
            case R.id.rbt3:
                ta.str[2]=an3.getText().toString();
                intent.setClass(activity_3rd.this, activity_4th.class);
                startActivity(intent);;
                break;
            case R.id.rbt4:
                ta.str[2]=an3.getText().toString();
                intent.setClass(activity_3rd.this, activity_4th.class);
                startActivity(intent);;
                break;
            default:
                Toast ts = Toast.makeText(getBaseContext(),"please choose",Toast.LENGTH_LONG);
                ts.show();
        }
    }
}
