package com.zjpl.edw.controller;

import com.zjpl.edw.constants.ESWebStatusEnum;
import com.zjpl.edw.constants.ResponseVo;

/**
 * 基础数据建设
 */
public class BaseController {
    /**
     * 生成统一的返回响应对象
     */
    public <T>ResponseVo generateResponseVo(ESWebStatusEnum webStatusEnum,T data){
        return new ResponseVo(webStatusEnum.getCode(),webStatusEnum.getDesc(),data);
    }
}
