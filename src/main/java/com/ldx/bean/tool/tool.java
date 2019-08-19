package com.ldx.bean.tool;

import java.io.Serializable;

public class tool implements Serializable {
    private String id;
    private String text;
    private String canSkip;
    private String skipPath;
    private String skipType;
    private String subText;
    private String urlPath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCanSkip() {
        return canSkip;
    }

    public void setCanSkip(String canSkip) {
        this.canSkip = canSkip;
    }

    public String getSkipPath() {
        return skipPath;
    }

    public void setSkipPath(String skipPath) {
        this.skipPath = skipPath;
    }

    public String getSkipType() {
        return skipType;
    }

    public void setSkipType(String skipType) {
        this.skipType = skipType;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    @Override
    public String toString() {
        return "tool{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", canSkip='" + canSkip + '\'' +
                ", skipPath='" + skipPath + '\'' +
                ", skipType='" + skipType + '\'' +
                ", subText='" + subText + '\'' +
                ", urlPath='" + urlPath + '\'' +
                '}';
    }
}
