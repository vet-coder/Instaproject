package kr.co.dlghksgml.instaproject.model;

/**
 * Created by bacehee on 2017-01-09.
 */

public class User {

    private String email;
    private String nickname;
    private String image;
    private String introduce;

    public User(String email, String nickname, String image, String introduce){
        this.email=email;
        this.nickname=nickname;
        this.image=image;
        this.introduce=introduce;

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
