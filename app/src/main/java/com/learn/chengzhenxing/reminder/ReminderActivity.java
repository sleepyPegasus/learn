package com.learn.chengzhenxing.reminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ReminderActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        mListView = (ListView)findViewById(R.id.reminders_list_view);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                //context
                this,
                //layout
                R.layout.reminders_row,
                //row
                R.id.row_text,
                //data with bogus data to test our listview
                new String[]{
                        "first record","second record","third record","fourth record","fifth record"}
        );
        mListView.setAdapter(arrayAdapter);
    }
}
