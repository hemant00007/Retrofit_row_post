package com.example.retrofit_row_post.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassModel {
    @SerializedName("StatusCode")
    @Expose
    private String statusCode;
    @SerializedName("ClassId")
    @Expose
    private String classId;
    @SerializedName("ClassName")
    @Expose
    private String className;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
