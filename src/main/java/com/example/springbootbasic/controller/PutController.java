package com.example.springbootbasic.controller;

import com.example.springbootbasic.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
    @PutMapping(value = "/member")
    public String putMember(@RequestBody Map<String, String> putData) {
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PutMapping(value = "/member1")
    public String putMember1(@RequestBody MemberDto memberDto) {

        return memberDto.toString();
    }

    @PutMapping(value = "/member2")
    public MemberDto putMember2(@RequestBody MemberDto memberDto) {

        return memberDto;
    }
}
