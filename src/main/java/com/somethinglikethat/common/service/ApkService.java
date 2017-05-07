package com.somethinglikethat.common.service;

import com.somethinglikethat.common.dao.ApkDao;
import com.somethinglikethat.common.model.APK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by blue on 2017-04-27.
 */

@Service
public class ApkService {
    @Autowired
    ApkDao apkDao;

    public List<APK> list() {
        return apkDao.findAll();
    }

    public APK get(Integer id) {
        return apkDao.findOne(id);
    }

    public void save(APK user) {
        apkDao.save(user);
    }

    public void remove(Integer id) {
        apkDao.delete(id);
    }
}
