package com.example.springbootbasic.controller;

import com.example.springbootbasic.data.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample() {
        return "Hello POST API";
    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PostMapping(value = "/member2")
    public String postMember2(@RequestBody MemberDto memberDto) {

        return memberDto.toString();
    }
}
