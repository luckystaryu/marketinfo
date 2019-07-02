package com.zjpl.edw.dao;

import com.zjpl.edw.param.DeleteParam;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.rest.RestStatus;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ES的操作数据类
 */
@Component
public class ESDeleteRepository extends BaseRepository{
    private static Logger LOG = LoggerFactory.getLogger(ESDeleteRepository.class);

    @Autowired
    private TransportClient client;
    /**
     * 通过ID删除数据
     */
    public boolean delDataBy(DeleteParam esDeleteParam){
        String index = esDeleteParam.getIndex();
        String id = esDeleteParam.getId();
        String filed = esDeleteParam.getField();
        String keyWord = esDeleteParam.getKeyWord();
        String type = esDeleteParam.getType();

        Assert.assertNotNull(client);
        Assert.assertNotNull(index);
        Assert.assertNotNull(filed);
        Assert.assertNotNull(id);
        Assert.assertNotNull(type);

        //开始删除数据
        DeleteResponse response =client.prepareDelete()
                .execute().actionGet();
        RestStatus restStatus = response.status();
        LOG.info("删除数据状态,status-->>>>{},",response.status().getStatus());

        if(restStatus.getStatus() == RestStatus.OK.getStatus()){
            return true;
        }
        return false;
    }
}
