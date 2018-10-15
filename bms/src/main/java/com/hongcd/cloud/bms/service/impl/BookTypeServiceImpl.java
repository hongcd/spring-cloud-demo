package com.hongcd.cloud.bms.service.impl;

import com.hongcd.cloud.bms.service.BookTypeService;
import com.hongcd.cloud.common.service.BaseService;
import com.hongcd.cloud.common.utils.Result;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 图书类别服务
 * @author HongD
 * @date 2018-10-15
 */
@Service("bookTypeService")
@SuppressWarnings("unchecked")
public class BookTypeServiceImpl extends BaseService implements BookTypeService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * FIXME 第一次启动，不管结果如何都会调用errorGetBookTypeFallback，原因待查
     * @param bookName
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "errorGetBookTypeFallback")
    public Result<String> getBookType(String bookName) {
        return restTemplate.getForObject("http://BTMS/bookType/getBookType/{1}", Result.class, bookName);
    }

    public Result<String> errorGetBookTypeFallback(String bookName) {
        return Result.fail(String.format("图书类别服务调用异常！bookName: %s", bookName));
    }

}