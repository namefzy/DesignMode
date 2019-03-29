package com.gupao.day_0328.demo1.version_02;

/**
 * 依赖倒置原则：
 *          版本01 扩展功能需要修改上级类
 *          版本02 扩展功能只需新实现类 缺点：创建过多类
 *
 *
 *  设计原则：
 *          以抽象为基准比以细节为基准搭建起来的架构要稳定得多，因此大家在拿
 *           到需求之后，要面向接口编程，先顶层再细节来设计代码结构。
 */
public class Tom {
    private ICourse course;
    public void setCourse(ICourse course) {
        this.course = course;
    }
    public void study(){
        course.study();
    }
}
