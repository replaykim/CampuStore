package com.somethinglikethat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by blue on 2017-04-27.
 *
 *
 * 지울꺼~ 돌가는지 확인용~~~
 * 지울꺼다~~~~~~~~~~~~~~~~
 * 지울꺼야~~~~~~~~~~~~~~~
 */

@Controller
public class controller {

    @RequestMapping("/")
    public String aaa(){
        return "index";
    }
}
