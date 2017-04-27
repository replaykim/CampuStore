package com.somethinglikethat.common.dao;


import com.somethinglikethat.common.model.APK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by blue on 2017-04-12.
 */

@Repository
public class ApkDao {

    @Autowired
    JdbcTemplate jdbcTemplate;



    public APK getApk(int apk_no) {
        String SQL = "Select * from APK_INFO_TB Where APK_NO = ?";
        Object[] param  = new Object[]{apk_no};

        APK apk = null;

        apk = jdbcTemplate.queryForObject(SQL, param, (rs, rowNum) -> {
            APK apk1 =  new APK();
            apk1.setAPK_NAME(rs.getString("APK_NAME"));
            apk1.setAPK_NO(rs.getInt("APK_NO"));
            apk1.setSTORAGE_URL(rs.getString("STORAGE_URL"));
            apk1.setVIEW_CNT(rs.getString("VIEW_CNT"));
            apk1.setSCREEN_URL(rs.getString("SCREEN_URL"));
            apk1.setRECM_CNT(rs.getString("RECM_CNT"));

            return apk1;
        });
        return apk;
    }

    public List<APK> getApkList() {
        String SQL = "Select * from APK_INFO_TB";
        List<APK> apks = new ArrayList<APK>();

        List<Map<String, Object>> rows =jdbcTemplate.queryForList(SQL);
        for (Map row : rows) {
            APK apk = new APK();
            apk.setAPK_NO((Integer) (row.get("APK_NO")));
            apk.setAPK_NAME((String)row.get("APK_NAME"));
            apk.setSTORAGE_URL((String)row.get("STORAGE_URL"));
            apk.setVIEW_CNT((String)row.get("VIEW_CNT"));
            apk.setSCREEN_URL((String)row.get("SCREEN_URL"));
            apk.setRECM_CNT((String) row.get("RECM_CNT"));
            apks.add(apk);
        }

        return apks;
    }
}
