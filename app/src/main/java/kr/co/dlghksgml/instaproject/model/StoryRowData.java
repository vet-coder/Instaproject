package kr.co.dlghksgml.instaproject.model;

/**
 * Created by bacehee on 2017-01-09.
 */

public class StoryRowData {

    private Story story;
    private User user;

    public StoryRowData(Story story, User user){
        this.story=story;
        this.user=user;

    }
    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
