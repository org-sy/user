package com.sy.interestingvideo.user.baiduyun;

import com.baidubce.services.bos.BosClient;
import com.baidubce.services.bos.model.BosObject;
import com.baidubce.services.bos.model.ObjectMetadata;
import com.baidubce.services.bos.model.PutObjectResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Author: 刘炜程
 * @Date: 2019-04-18 11:39
 */
@SuppressWarnings("all")
@Slf4j
public class BosFile {

    /**
     * 上传文件
     * @param client
     * @param bucketName
     * @param objectKey
     * @param inputStream
     */
    public static void PutObject(BosClient client, String bucketName, String objectKey,InputStream inputStream){

        PutObjectResponse putObjectResponseFromInputStream = client.putObject(bucketName, objectKey, inputStream);
        // 打印ETag
        log.info(putObjectResponseFromInputStream.getETag());
    }

    /**
     * 删除文件
     * @param client
     * @param bucketName
     * @param objectKey
     */
    public static void deleteObject(BosClient client, String bucketName, String objectKey) {

        // 删除Object
        client.deleteObject(bucketName, objectKey);           //指定要删除的Object所在Bucket名称和该Object名称
    }

    public static void  getObject(BosClient client, String bucketName, String objectKey)
            throws IOException {

        // 获取Object，返回结果为BosObject对象
        BosObject object = client.getObject(bucketName, objectKey);

        // 获取ObjectMeta
        ObjectMetadata meta = object.getObjectMetadata();

        // 获取Object的输入流
        InputStream objectContent = object.getObjectContent();

        // 关闭流
        objectContent.close();
    }
}
