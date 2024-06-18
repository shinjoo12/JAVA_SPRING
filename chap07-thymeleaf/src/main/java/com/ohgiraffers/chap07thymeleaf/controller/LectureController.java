package com.ohgiraffers.chap07thymeleaf.controller;


import com.ohgiraffers.chap07thymeleaf.model.dto.MemberDTO;
import com.ohgiraffers.chap07thymeleaf.model.dto.SelectCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
//사용자요청이 lecture로 들어오면
@RequestMapping("lecture")
public class LectureController {
    //RequestMethod get요청이 들어오면

    @GetMapping("expression") // get 방식으로 요청이 들어올때
    public ModelAndView expression(ModelAndView mv) {
        mv.addObject("member", new MemberDTO(20,"홍길동",'남',"서울시 서초구"));
        mv.addObject("hello", mv.addObject("hello", "hello!<h3>Thymeleaf</h3>"));
        mv.setViewName("lecture/expression");
        return mv;
    }

    @GetMapping("conditional")
    public ModelAndView conditional(ModelAndView mv){
       mv.addObject("num", 1);
        mv.addObject("str", "사과");
        List<MemberDTO> memberDTOList = new ArrayList<>();
        memberDTOList.add(new MemberDTO(20, "홍길동", '남', "서초구"));
        memberDTOList.add(new MemberDTO(19, "홍길순", '여', "강남구"));
        memberDTOList.add(new MemberDTO(19, "홍동길", '남', "관악구"));
        memberDTOList.add(new MemberDTO(22, "홍길똥", '남', "노원구"));
        memberDTOList.add(new MemberDTO(24, "홍낄동", '남', "중구"));
        memberDTOList.add(new MemberDTO(20, "홍길도", '남', "서초구"));
        mv.addObject("memberList",memberDTOList);


       mv.setViewName("/lecture/conditional");
        return mv;
    }

    @GetMapping("etc")
    public ModelAndView etc(ModelAndView mv){
        SelectCriteria selectCriteria = new SelectCriteria(1, 10, 3);
        mv.addObject(selectCriteria);


        mv.setViewName("/lecture/etc");
        return mv;


    }
}

