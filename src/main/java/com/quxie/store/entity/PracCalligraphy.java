package com.quxie.store.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (PracCalligraphy)实体类
 *
 * @author makejava
 * @since 2022-04-19 20:13:30
 */
@Data
public class PracCalligraphy extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 916297377566616866L;

    private Integer id;

    private Integer zid;

    private Integer uid;
    /**
    * 练习次数
    */
    private Integer pracNum;
    /**
    * 练习图片
    */
    private String writedPic;
    /**
    * 评判
    */
    private String judge;
    /**
    * 分数
    */
    private Integer score;
    /**
    * 书写建议
    */
    private String suggestion;
    /**
    * 是否加入重点练习
    */
    private Object addToKeypoint;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPracNum() {
        return pracNum;
    }

    public void setPracNum(Integer pracNum) {
        this.pracNum = pracNum;
    }

    public String getWritedPic() {
        return writedPic;
    }

    public void setWritedPic(String writedPic) {
        this.writedPic = writedPic;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public Object getAddToKeypoint() {
        return addToKeypoint;
    }

    public void setAddToKeypoint(Object addToKeypoint) {
        this.addToKeypoint = addToKeypoint;
    }

}
