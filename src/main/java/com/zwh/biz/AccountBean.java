package com.zwh.biz;

/**
 * @author ：zwh
 * @date ：2020/2/12 10:29
 * @description:
 * @modified By：
 * @version: 1.0
 */
public class AccountBean {

    private Long id;
    private String name;
    private String score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "AccountBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
