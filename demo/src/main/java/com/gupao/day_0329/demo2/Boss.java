package com.gupao.day_0329.demo2;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
//模拟 Boss 一页一页往下翻页，TeamLeader 实时统计
        List<Course> courseList = new ArrayList<Course>();
        for (int i= 0; i < 20 ;i ++){
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }
}
