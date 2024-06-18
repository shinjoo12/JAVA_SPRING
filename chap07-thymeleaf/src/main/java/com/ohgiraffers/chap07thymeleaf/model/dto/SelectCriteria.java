package com.ohgiraffers.chap07thymeleaf.model.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SelectCriteria {

    private int startPage;
    private int endPage;
    private int pageNO;

    public SelectCriteria(int startPage, int endPage, int pageNO) {
        this.startPage = startPage;
        this.endPage = endPage;
        this.pageNO = pageNO;
    }
}
