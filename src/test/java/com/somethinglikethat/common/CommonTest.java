package com.somethinglikethat.common;

import com.somethinglikethat.common.model.APK;
import com.somethinglikethat.common.service.ApkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by blue on 2017-04-27.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonTest {

    @Autowired
    ApkService apkService;

    @Test
    public void getApk(){
        String APK_NAME = "asdf";
        String STORAGE_URL = "https://console.firebase.google.com";
        int APK_NO = 4;

        APK apk = apkService.get(APK_NO);

        assertThat(APK_NAME, is(apk.getAPK_NAME()));
        assertThat(STORAGE_URL, is(apk.getSTORAGE_URL()));
        assertThat(APK_NO, is(apk.getAPK_NO()));
    }

    @Test
    public void APKListget(){
        int APK1_NO = 3;
        int APK2_NO = 4;

        List<APK> APKs = apkService.list();

        assertThat(APK1_NO, is(APKs.get(0).getAPK_NO()));
        assertThat(APK2_NO, is(APKs.get(1).getAPK_NO()));

    }
}
