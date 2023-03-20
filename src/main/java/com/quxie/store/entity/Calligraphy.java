package com.quxie.store.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Calligraphy)实体类
 *
 * @author makejava
 * @since 2022-04-19 20:07:56
 */
@Data
public class Calligraphy extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -81877527803523669L;

    private Integer zid;
    /**
    * 标题
    */
    private String title;
    /**
    * 字体风格
    */
    private Object style;
    /**
    * 图片位置
    */
    private String pic;
    /**
    * 创建时间
    */
    private Date createdTime;


    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getStyle() {
        return style;
    }

    public void setStyle(Object style) {
        this.style = style;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

}
