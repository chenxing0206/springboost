package com.example.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *  所属项目：
 *  类名称：Person
 *  类作用：
 *  类作者：chenxing                                                        
 *  创建日期：2021/6/30
 *  审核人：  
 *  审核日期：            
 *  更新记录：                                        
 *  其它备注：
 *  @author:chenxing
 */
@ConfigurationProperties(prefix = "myperson")
public class Person {


    private String name;
    private int age;
    private int sex;

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + '}';
    }
}
