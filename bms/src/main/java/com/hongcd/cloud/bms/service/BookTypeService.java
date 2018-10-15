package com.hongcd.cloud.bms.service;

import com.hongcd.cloud.common.utils.Result;

/**
 * 图书类别服务
 * @author HongD
 * @date 2018-10-15
 */
public interface BookTypeService {
    /**
     * 获取图书类别
     * @param bookName
     * @return
     */
    Result<String> getBookType(String bookName);
}