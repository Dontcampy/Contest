package com.dont39.contest.entity;

import java.io.Serializable;

public class SubjectEntity implements Serializable {
    public static final long serialVersionUID = 1L;
    private Integer subjectId;
    private Integer theme;
    private String content;
    private String choice;
    private String answer;
    private Boolean isParty;
    private Integer type;

    public SubjectEntity() {
        super();
    }

    public SubjectEntity(Integer subjectId, Integer theme, String content,
                         String choice, String answer, Boolean isParty, Integer type) {
        this.subjectId = subjectId;
        this.theme = theme;
        this.content = content;
        this.choice = choice;
        this.answer = answer;
        this.isParty = isParty;
        this.type = type;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getParty() {
        return isParty;
    }

    public void setParty(Boolean party) {
        isParty = party;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SubjectEntity{" +
                "subjectId=" + subjectId +
                ", theme=" + theme +
                ", content='" + content + '\'' +
                ", choice='" + choice + '\'' +
                ", answer='" + answer + '\'' +
                ", isParty=" + isParty +
                ", type=" + type +
                '}';
    }
}
