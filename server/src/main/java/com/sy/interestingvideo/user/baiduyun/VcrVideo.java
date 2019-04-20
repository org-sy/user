package com.sy.interestingvideo.user.baiduyun;

import com.baidubce.services.vcr.VcrClient;
import com.baidubce.services.vcr.model.CheckResult;
import com.baidubce.services.vcr.model.GetMediaResponse;
import com.baidubce.services.vcr.model.PutMediaResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: 刘炜程
 * @Date: 2019-04-18 14:37
 */
@SuppressWarnings("all")
@Slf4j
public class VcrVideo {

    /**
     * 发起视频审核
     * @param vcrClient
     * @param objectPath
     */
    public static void putBosMedia(VcrClient vcrClient,  String objectPath) {
        PutMediaResponse putMediaResponse = vcrClient.putMedia("bos://lwc1234/" + objectPath);

    }

    /**
     * 获取审核结果
     * @param vcrClient
     * @param source
     */

    public static void getMedia(VcrClient vcrClient, String source) {
        GetMediaResponse response = vcrClient.getMedia(source);
        String status = response.getStatus();
        log.info(status);
        String label = response.getLabel();
        log.info(label);
        for (CheckResult result : response.getResults()) {
            String type = result.getType();
            log.info(type);
        }
    }
}
