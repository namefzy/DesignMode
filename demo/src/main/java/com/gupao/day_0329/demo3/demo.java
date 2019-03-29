package com.gupao.day_0329.demo3;

/**
 * 里氏替换原则
 * 引申含义：子类可以扩展父类的功能，但不能改变父类原有的功能。
 * 1、子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
 * 2、子类中可以增加自己特有的方法。
 * 3、当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类
 * 方法的输入参数更宽松。
 * 4、当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即
 * 方法的输出/返回值）要比父类更严格或相等。
 */
public class demo {
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() >= rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width:"+rectangle.getWidth() + ",height:"+rectangle.getHeight());
        }
        System.out.println("resize 方法结束" +
                "\nwidth:"+rectangle.getWidth() + ",height:"+rectangle.getHeight());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);
    }
}
