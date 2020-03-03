package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class activity_2nd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);
        MainActivity.activityList.add(this);
    }

    public void btnClick(View v)
    {
        RadioGroup group= (RadioGroup) findViewById(R.id.rg);
        int selected = group.getCheckedRadioButtonId();
        Intent intent = new Intent();
        RadioButton an2=(RadioButton) findViewById(group.getCheckedRadioButtonId());
        transam ta=(transam) getApplication();

        switch(selected){
            case R.id.rbt1:
                ta.str[1]=an2.getText().toString();
                intent.setClass(activity_2nd.this, activity_3rd.class);
                startActivity(intent);;
                break;
            case R.id.rbt2:
                ta.str[1]=an2.getText().toString();
                intent.setClass(activity_2nd.this, activity_3rd.class);
                startActivity(intent);;
                break;
            case R.id.rbt3:
                ta.str[1]=an2.getText().toString();
                intent.setClass(activity_2nd.this, activity_3rd.class);
                startActivity(intent);;
                break;
            case R.id.rbt4:
                ta.str[1]=an2.getText().toString();
                intent.setClass(activity_2nd.this, activity_3rd.class);
                startActivity(intent);;
                break;
            case R.id.rbt5:
                ta.str[1]=an2.getText().toString();
                intent.setClass(activity_2nd.this, activity_3rd.class);
                startActivity(intent);;
                break;
            default:
                Toast ts = Toast.makeText(getBaseContext(),"please choose",Toast.LENGTH_LONG);
                ts.show();
        }
    }
}
