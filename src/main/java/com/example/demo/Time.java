package com.example.demo;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Time {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //首先设定日期时间格式,HH指使用24小时制,hh是使用12小时制

//        //获取当前时间，并转换为String
        Date date = new Date();//获取当前时间，Date型
        String dateStr = dateFormat.format(date);	// Date型转换成String型，可直接存储进数据库
        System.out.println("String ==>" + dateStr);

        //将当前时间转换为从1970年1月1日到现在所经历的毫秒数
        Long dateLong = date.getTime();				// Date型转换成Long型毫秒数，用于计算
        System.out.println("毫秒数dateLong ==>" + dateLong);

        Timestamp timestamp = new Timestamp(dateLong); //Long型毫秒数转为Timestamp型，可直接存储进数据库

        System.out.println("Timestamp ==>" + timestamp);


        Date date2 = new Date();
        Long dateLong2 = date.getTime();
        System.out.println("前面加0 ==>"+String.format("%015d",dateLong2));
        System.out.println(String.format("%09d",123));

    }
}
