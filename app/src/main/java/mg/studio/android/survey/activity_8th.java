package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class activity_8th extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);
        MainActivity.activityList.add(this);
    }

    public void btnClick(View v) {
        RadioGroup group = (RadioGroup) findViewById(R.id.rg);
        int selected = group.getCheckedRadioButtonId();
        Intent intent = new Intent();
        RadioButton an8=(RadioButton) findViewById(group.getCheckedRadioButtonId());
        transam ta=(transam) getApplication();

        switch (selected) {
            case R.id.rbt1:
                ta.str[7]=an8.getText().toString();
                intent.setClass(activity_8th.this, activity_9th.class);
                startActivity(intent);;
                break;
            case R.id.rbt2:
                ta.str[7]=an8.getText().toString();
                intent.setClass(activity_8th.this, activity_9th.class);
                startActivity(intent);;
                break;
            case R.id.rbt3:
                ta.str[7]=an8.getText().toString();
                intent.setClass(activity_8th.this, activity_9th.class);
                startActivity(intent);;
                break;
            case R.id.rbt4:
                ta.str[7]=an8.getText().toString();
                intent.setClass(activity_8th.this, activity_9th.class);
                startActivity(intent);;
                break;
            case R.id.rbt5:
                ta.str[7]=an8.getText().toString();
                intent.setClass(activity_8th.this, activity_9th.class);
                startActivity(intent);;
                break;
            case R.id.rbt6:
                ta.str[7]=an8.getText().toString();
                intent.setClass(activity_8th.this, activity_9th.class);
                startActivity(intent);;
                break;
            case R.id.rbt7:
                ta.str[7]=an8.getText().toString();
                intent.setClass(activity_8th.this, activity_9th.class);
                startActivity(intent);;
                break;
            default:
                Toast ts = Toast.makeText(getBaseContext(), "please choose", Toast.LENGTH_LONG);
                ts.show();
        }
    }
}
