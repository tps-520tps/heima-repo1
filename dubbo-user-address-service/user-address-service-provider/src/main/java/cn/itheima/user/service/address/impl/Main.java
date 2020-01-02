package cn.itheima.user.service.address.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   //  while  ture 让当前进程一直执行，spring容器一直存在！模拟服务器端一直处于运行状态
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("applicationContext-user-address-service-provider.xml");
        while (true){}
    }
}
