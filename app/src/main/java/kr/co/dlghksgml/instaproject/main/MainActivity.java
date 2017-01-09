package kr.co.dlghksgml.instaproject.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import kr.co.dlghksgml.instaproject.R;
import kr.co.dlghksgml.instaproject.datasource.TestReader;

public class MainActivity extends AppCompatActivity {

    private StoryListAdapter adapter;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=(ListView) findViewById(R.id.main_listview);
        adapter=new StoryListAdapter(this,R.layout.main_story_listrow,new TestReader().getStoryData());
        listview.setAdapter(adapter);


    }
}
