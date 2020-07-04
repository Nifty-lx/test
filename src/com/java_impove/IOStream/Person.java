package com.java_impove.IOStream;

import java.io.Serializable;

/**1、如果需要将对象通过IO流进行传输，那么需要实现序列化接口。
 * 2、当前类必须声明一个seialVersionUID的值，值为多少都可以，但必须要有。
 * 3、transient：使用此关键字进行修饰的变量，在进行序列化时，不会被序列化。 *
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String email;
    transient private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
