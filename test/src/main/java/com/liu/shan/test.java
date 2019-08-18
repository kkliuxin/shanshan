package com.liu.shan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BBF on 2016/11/17.
 */
public class test {


    public static void main(String[] args) {
        List<String>[] lsa = new List[10]; // Not really allowed.

        ArrayList<String> arrayList1=new ArrayList(); //第一种 情况
        ArrayList arrayList2=new ArrayList<String>();//第二种 情况
        arrayList2.add(23);
        arrayList2.add("234");

        arrayList1.add("");

    }

    private  <T> T showVaule(Generic<T> val) {
        System.out.println("val = " + val.getKey());
        System.out.println("val class = " + val.getClass());
        return val.getKey();
    }

    public static  <T> void printMsg( T... args){
        for(T t : args){
            System.out.println("泛型测试"+"t is " + t);
        }
    }


}



//此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型
class Generic<T> {
    //key这个成员变量的类型为T,T的类型由外部指定
    private T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey() { //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }

    public <T> T showName(Generic<T> generic) {
        T test = generic.getKey();
        return test;
    }

    public <T extends Number> T showKeyName1(Generic<T> container) {
        return container.getKey();
    }
    public <T extends Number> T showKeyName(Generic<T> container){
        System.out.println("container key :" + container.getKey());
        T test = container.getKey();
        return test;
    }
}
