package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class activity_11th extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);
        MainActivity.activityList.add(this);
    }

    public void btnClick(View v)
    {
        RadioGroup group= (RadioGroup) findViewById(R.id.rg);
        int selected = group.getCheckedRadioButtonId();
        Intent intent = new Intent();
        RadioButton an11=(RadioButton) findViewById(group.getCheckedRadioButtonId());
        transam ta=(transam) getApplication();

        switch(selected){
            case R.id.rbt1:
                ta.str[10]=an11.getText().toString();
                intent.setClass(activity_11th.this, activity_12th.class);
                startActivity(intent);;
                break;
            case R.id.rbt2:
                ta.str[10]=an11.getText().toString();
                intent.setClass(activity_11th.this, activity_12th.class);
                startActivity(intent);;
                break;
            default:
                Toast ts = Toast.makeText(getBaseContext(),"please choose",Toast.LENGTH_LONG);
                ts.show();
        }
    }
}
