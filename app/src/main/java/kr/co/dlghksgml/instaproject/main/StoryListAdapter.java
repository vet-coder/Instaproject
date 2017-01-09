package kr.co.dlghksgml.instaproject.main;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import kr.co.dlghksgml.instaproject.R;
import kr.co.dlghksgml.instaproject.model.StoryRowData;

/**
 * Created by bacehee on 2017-01-09.
 */

public class StoryListAdapter extends BaseAdapter {
    private int layout;
    private StoryRowData story_row;
    ArrayList<StoryRowData> story_ArrayList;
    private LayoutInflater inflater;
    private Activity activity;

    private ImageView imageView;
    private ImageView user_ImageView;
    private TextView title_tv;
    private TextView contents_tv;
    private TextView id_tv;
    private TextView introduce_tv;

    private TextView date_tv;

    public StoryListAdapter(Activity activity, int layout, ArrayList<StoryRowData> story_ArrayList){
        this.layout=layout;
        this.story_ArrayList=story_ArrayList;
        this.inflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.activity=activity;
    }


    public int getCount() {
        // TODO Auto-generated method stub
        return story_ArrayList.size();
    }

    public StoryRowData getItem(int position) {
        // TODO Auto-generated method stub
        return story_ArrayList.get(position);
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        if(convertView == null) {
            convertView = inflater.inflate(layout, null);
        }
        story_row=story_ArrayList.get(position);

        imageView=(ImageView)convertView.findViewById(R.id.main_story_imageview);
        user_ImageView=(ImageView)convertView.findViewById(R.id.main_story_user_imageview);

        title_tv=(TextView)convertView.findViewById(R.id.main_story_title);
        contents_tv=(TextView)convertView.findViewById(R.id.main_story_contents);
        id_tv=(TextView)convertView.findViewById(R.id.main_story_id);
        introduce_tv=(TextView)convertView.findViewById(R.id.main_story_introduce);
        date_tv=(TextView)convertView.findViewById(R.id.main_story_date);

        title_tv.setText(story_row.getStory().getTitle());
        contents_tv.setText(story_row.getStory().getContents());
        id_tv.setText(story_row.getUser().getNickname());
        introduce_tv.setText(story_row.getUser().getIntroduce());

        date_tv.setText(story_row.getStory().getDate());

        return convertView;
    }

}

