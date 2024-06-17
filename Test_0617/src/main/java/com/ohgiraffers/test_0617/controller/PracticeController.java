package com.ohgiraffers.test_0617.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/*")
public class PracticeController {

    @GetMapping("/mission1")
    //pathValue라는 이름의 쿼리 파라미터를 받음 required = false로 설정하여 이 파라미터가 필수가 아님을 명시
    public ModelAndView mission1(ModelAndView mv, @RequestParam("pathValue") String value) {

            //만약 pathValue 파라미터가 있으면, message라는 이름으로 해당 값을 모델에 추가
            mv.addObject("message", value);

            mv.setViewName("mission1");
            return mv;
        }


}
