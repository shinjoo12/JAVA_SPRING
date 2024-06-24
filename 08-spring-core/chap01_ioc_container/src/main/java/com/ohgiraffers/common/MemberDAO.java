package com.ohgiraffers.common;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MemberDAO {

    private final Map<Integer,MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO("user01", 1, "pass01", "홍길동"));
        memberMap.put(2, new MemberDTO("user02", 2, "pass02", "유관순"));
    }

    public MemberDTO selectMember(int sequence) {
        return memberMap.get(sequence);
    }

    public boolean insertMember(MemberDTO member) {

        int before = memberMap.size();
        memberMap.put(member.getSequence(), member);
        int after = memberMap.size();
        return after > before ? true : false;
    }

}
