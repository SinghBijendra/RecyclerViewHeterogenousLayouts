package com.bijendra.recyclerviewheterogenouslayouts.recyclerviewheterogenouslayouts;

/**
 * Created by Newdream on 11-Jan-17.
 */

public class CStudent {
    private String name;
    private String age;
    private String course;
    public CStudent(String name,String age,String course)
    {
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}
