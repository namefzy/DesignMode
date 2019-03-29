package com.gupao.day_0329.demo4.version_01;

/***
 * 合成复用原则
 * 合成复用原则（Composite/Aggregate Reuse Principle,CARP）是指尽量使用对象组
 * 合(has-a)/聚合(contanis-a)，而不是继承关系达到软件复用的目的。可以使系统更加灵
 * 活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响相对较少。
 * 继承我们叫做白箱复用，相当于把所有的实现细节暴露给子类。组合/聚合也称之为黑箱
 * 复用，对类以外的对象是无法获取到实现细节的。
 */
public class ProductDao {
    private DBConnection dbConnection;
    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
