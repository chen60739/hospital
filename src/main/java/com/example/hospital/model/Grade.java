package com.example.hospital.model;

public class Grade {
    private Integer gId;

    private Integer gradeGid;

    private String gradeName;

    private String gradeUrl;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getGradeGid() {
        return gradeGid;
    }

    public void setGradeGid(Integer gradeGid) {
        this.gradeGid = gradeGid;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public String getGradeUrl() {
        return gradeUrl;
    }

    public void setGradeUrl(String gradeUrl) {
        this.gradeUrl = gradeUrl == null ? null : gradeUrl.trim();
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gId=" + gId +
                ", gradeGid=" + gradeGid +
                ", gradeName='" + gradeName + '\'' +
                ", gradeUrl='" + gradeUrl + '\'' +
                '}';
    }
}