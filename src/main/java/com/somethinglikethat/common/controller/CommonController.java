package com.somethinglikethat.common.controller;

import com.somethinglikethat.common.model.APK;
import com.somethinglikethat.common.service.ApkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by replay on 2017. 4. 29..
 */

@Controller
public class CommonController {

    @Autowired
    ApkService apkService;

    @RequestMapping("/")
    public String category(ModelMap modelMap){
        List<APK> apks = apkService.list();

        modelMap.addAttribute("apklist", apks);
        return "category";
    }

    @RequestMapping("content")
    public String content(ModelMap modelMap, @RequestParam("APK_NO") Integer APK_NO){
        APK apk = apkService.get(APK_NO);

        modelMap.addAttribute("apk", apk);

        return "contentdetails";
    }
}
