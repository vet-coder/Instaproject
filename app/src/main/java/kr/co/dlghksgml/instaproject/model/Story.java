package kr.co.dlghksgml.instaproject.model;

/**
 * Created by bacehee on 2017-01-09.
 */

public class Story {

    private String title;
    private String contents;
    private String date;
    private String writer;

    public Story(String title, String contents, String date, String writer) {
        this.title=title;
        this.contents=contents;
        this.date=date;
        this.writer=writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
