package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_thx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_survey);
        MainActivity.activityList.add(this);
    }

    public void clickThx(View v)
    {
        Intent intent = new Intent();
        intent.setClass(activity_thx.this, activity_report.class);
        startActivity(intent);
    }
}
