package com.gupao.day_0328.demo;

/**
 * 开闭原则（Open-Closed Principle, OCP）是指一个软件实体如类、模块和函数应该对
 * 扩展开放，对修改关闭。
 * 方便扩展
 * 例如某个地方做优惠，其他地方价格不变
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    public Double getOriginPrice(){
        return super.getPrice();
    }
    public Double getPrice(){
        return super.getPrice() * 0.61;
    }
}
