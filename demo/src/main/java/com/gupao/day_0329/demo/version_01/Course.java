package com.gupao.day_0329.demo.version_01;

/**
 * 单一职责原则
 *
 */
public class Course {
    public void study(String courseName){
        /**两个逻辑*/
        if("直播课".equals(courseName)){
            System.out.println(courseName + "不能快进");
        }else{
            System.out.println(courseName + "可以反复回看");
        }
    }

    public static void main(String[] args) {
        Course course = new Course();
        course.study("直播课");
        course.study("录播课");
    }
}
