package com.somethinglikethat.common.dao;


import com.somethinglikethat.common.model.APK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by blue on 2017-04-12.
 */

@Repository
public interface ApkDao extends JpaRepository<APK , Integer> {}
