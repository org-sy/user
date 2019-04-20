package com.sy.interestingvideo.user.baiduyun;

import com.baidubce.services.vca.VcaClient;
import com.baidubce.services.vca.model.QueryResultResponse;
import com.baidubce.services.vca.model.ResultItem;
import com.baidubce.services.vca.model.TagsResult;

import java.util.List;

/**
 * @Description:
 * @Author: 刘炜程
 * @Date: 2019-04-18 20:39
 */
@SuppressWarnings("all")
public class VcaVideo {

    /**
     * 根据bos地址分析视频
     * @param vcaClient
     * @param object
     */
    public static void analyzeBosMedia(VcaClient vcaClient, String object) {
        vcaClient.analyze("bos://lwc1234/" + object);
    }

    /**
     * 根据url分析视频
     * @param vcaClient
     * @param source
     */
    public static void analyzeUrlMedia(VcaClient vcaClient, String source) {
        vcaClient.analyze(source);
    }


    /**
     * 查询视频分析内容
     * @param vcaClient
     * @param source
     */
    public static void queryResult(VcaClient vcaClient, String source) {
        QueryResultResponse response = vcaClient.queryResult(source);
        String status = response.getStatus();
        if ("FINISHED".equals(status)) {
            for (TagsResult tagsResult: response.getResults()) {
                String type = tagsResult.getType();
                for (ResultItem item: tagsResult.getResult()) {
                    String attribute = item.getAttribute();
                    Double confidence = item.getConfidence();
                    String source1 = item.getSource();
                    List<ResultItem.TimeInSeconds> time = item.getTime();
                }
            }
        }
    }
}
