package com.gupao.day_0328.demo1.version_01;

/**
 * 问题：
 *        当扩展功能时，例如tom想学其他课程，接口也需要扩展
 */
public class Tom implements ICourse {
    public void studyJavaCourse(){
        System.out.println("Tom 在学习 Java 的课程");
    }
    public void studyPythonCourse(){
        System.out.println("Tom 在学习 Python 的课程");
    }
}
