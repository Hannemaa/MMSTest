package hannemann.ak.healthapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ViewFlipper;

public class TasksActivity extends AppCompatActivity {
    private int taskNumber = 0;
   // private TextView taskTextView;
    private ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        vf = (ViewFlipper)findViewById(R.id.vf);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                taskNumber++;
                if (taskNumber < 11) {
                    vf.setDisplayedChild(taskNumber);
                    Snackbar.make(view, "Number "+taskNumber, Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });

    }

}
