package com.ohgiraffers.common.section01.xmlconfig;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application01 {

    public static void main(String[] args) {
        //GenericXmlApplicationContext    xml 불러와서 context에 넣겟당
        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");
        MemberDTO member = (MemberDTO) context.getBean("member");
        System.out.println(member);


    }

}