package com.hongcd.cloud.bms.controller;

import com.hongcd.cloud.bms.service.BookTypeService;
import com.hongcd.cloud.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 图书控制器
 * @author HongD
 * @date 2018-10-15
 */
@RestController
@RequestMapping("/book")
public class BookController extends BaseController {
    @Autowired
    private BookTypeService bookTypeService;

    /**
     * 获取图书类型
     * @param bookName
     * @return
     */
    @GetMapping("/getBookType/{bookName}")
    public Result getBookType(@PathVariable String bookName) {
        return bookTypeService.getBookType(bookName);
    }
}