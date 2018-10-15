package com.hongcd.cloud.bms.controller;

import com.hongcd.cloud.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


/**
 * 图书控制器
 * @author HongD
 * @date 2018-10-15
 */
@Controller
@RequestMapping("/book")
public class BookController extends BaseController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 获取图书类型
     * @param bookName
     * @return
     */
    @ResponseBody
    @RequestMapping("/getBookType/{bookName}")
    public Result getBookType(@PathVariable String bookName) {
        return restTemplate.getForObject("http://BTMS/bookType/getBookType/{1}", Result.class, bookName);
    }
}