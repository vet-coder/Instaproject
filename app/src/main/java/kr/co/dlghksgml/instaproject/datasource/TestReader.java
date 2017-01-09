package kr.co.dlghksgml.instaproject.datasource;

import java.util.ArrayList;

import kr.co.dlghksgml.instaproject.model.Story;
import kr.co.dlghksgml.instaproject.model.StoryRowData;
import kr.co.dlghksgml.instaproject.model.User;

/**
 * Created by bacehee on 2017-01-09.
 */

public class TestReader implements StoryDataReader {
    public ArrayList<StoryRowData> getStoryData(){

        User user=new User("bacehee@gmail.com","이환희","test.jpg","안녕하세요. 이환희입니다.");
        Story story=new Story("축하해주세요","제 생일입니다","2017-01-09","bacehee@gmail.com");

        StoryRowData rowdata=new StoryRowData(story,user);

        ArrayList<StoryRowData> data_list=new ArrayList<StoryRowData>();

        data_list.add(rowdata);

        return data_list;
    }
}
