package entity;

public class UserAppnews {
    private Integer id;

    private String username;

    private String newsmsg;

    private Integer newsdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNewsmsg() {
        return newsmsg;
    }

    public void setNewsmsg(String newsmsg) {
        this.newsmsg = newsmsg == null ? null : newsmsg.trim();
    }

    public Integer getNewsdate() {
        return newsdate;
    }

    public void setNewsdate(Integer newsdate) {
        this.newsdate = newsdate;
    }
}