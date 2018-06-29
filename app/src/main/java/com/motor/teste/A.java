package com.motor.teste;

import android.content.SyncStatusObserver;
import android.os.Looper;
import android.support.annotation.NonNull;

import org.w3c.dom.Node;

import java.lang.ref.PhantomReference;
import java.security.spec.ECField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by 15dcc on 2018/5/9.
 */

public class A {

    private String a ="a";
    int i=1;
    Google google = new Google();
    int x = 1000;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a1 = (A) o;

        if (i != a1.i) return false;
        if (a != null ? !a.equals(a1.a) : a1.a != null) return false;
        return google != null ? google.equals(a1.google) : a1.google == null;

    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + i;
        result = 31 * result + (google != null ? google.hashCode() : 0);
        return result;
    }

    public static void main(String[] args){
//        HashMap<String, String> hashMap = new HashMap<String, String>(32);
//        hashMap.put("nihao","nihao");
//        hashMap.put("nihao","wo");
//        hashMap.put("nihao","g");
//        hashMap.put("nihao","ee");
//
//        System.out.println(hashMap.get("nihao"));;

//        Set<String > set = new HashSet<>();
//        set.add("nihao");
//        set.add("nihao");
//        set.add("hhd");
//
//        for (String value : set) {
//            System.out.println(value+" ");
//        }


//        A a = new A();
//        System.out.println(a);
//        System.out.println(a.toString());
//        System.out.println(a.getClass());
////        a=null;
//        System.out.println(a.equals(null));
//        System.out.println(a.hashCode());
//
//        A a1 = new A();
//        System.out.println(a1.hashCode());


//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("A","a");
//        map.put("B","b");
//        map.put("C","c");
//        map.put("D","d");
//        System.out.println(map.entrySet());
//
//        Iterator iter = map.entrySet().iterator();
//        while (iter.hasNext()){
//            Map.Entry entry = (Map.Entry) iter.next();
//            String key = (String) entry.getKey();
//            String val = (String)entry.getValue();
//            System.out.println(key+ " "+ val);
//        }

//        HashMap hashMap = new HashMap();
//        String a = "nihao";
//        hashMap.put("nihao","nihao");
//        hashMap.put("nihao","ni");
//        hashMap.put(a.hashCode(),"wo");
//
//
//        Iterator iter = hashMap.entrySet().iterator();
//        while (iter.hasNext()){
//            Map.Entry entry = (Map.Entry) iter.next();
//            Object key = (Object) entry.getKey();
//            String val = (String)entry.getValue();
//            System.out.println(key+ " "+ val);
//        }


//        try {
//            System.out.println("try");
//            try {
//                System.out.print(3 / 0);
//            }catch (Exception e){
//
//            }
//            System.out.println("try111111");
//            throw new Exception("hhh");
//
//        } catch (Exception e) {
////            e.printStackTrace();
//        }finally {
//            System.out.println("finally");
//        }

//        String a = null;
//        String b="";
//        System.out.println(a==b);


//        A h = new A();
//        h.gggg(h);
//        System.out.println(h.x);

        Date date = new Date();
        ;
        System.out.println(date.getYear());

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));

        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));
        try{
            // 使用format()方法将日期转换为指定格式的文本
            SimpleDateFormat sdf1 = new SimpleDateFormat("yydfdfefvyy-MM-dd HH:mm:ss");
            String a = sdf1.format(date);
            System.out.println(a);
        }catch (Exception e){
            System.out.println("hh");
        }




//
//        StringBuilder hobby=new StringBuilder("爱慕课");
//        hobby.append("nihao");
//        System.out.println(hobby);
//        System.out.println(hobby.hashCode());
//
//        hobby.append("我爱你");
//        System.out.println(hobby);
//        System.out.println(hobby.hashCode());


//                StringBuffer

    }


    int i3 = 9;
    public static final int INT1 = 9;
    private  void gggg(A a) {
        a.x=100;
        int d = 1000;

        System.out.println(x);
//        System.out.println(x==d);

//        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
//        System.out.println(f1 == f2);
//        System.out.println(f3 == f4);
    }
}

