package com.hongcd.cloud.btms.controller;

import com.hongcd.cloud.common.utils.Result;
import com.hongcd.cloud.model.BookType;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 图书类型控制器
 * @author HongD
 * @date 2018-10-15
 */
@Controller
@RequestMapping("/bookType")
public class BookTypeController extends BaseController {
    /**
     * 获取默认类型
     * @return
     */
    @ResponseBody
    @GetMapping("/getDefaultType")
    public Result<String> getDefaultType() {
        LOG.info("getDefaultType");
        return Result.success("图书");
    }

    /**
     * 获取图书类型
     * @param bookName
     * @return
     */
    @ResponseBody
    @GetMapping("/getBookType/{bookName}")
    public Result<String> getBookType(@PathVariable String bookName) {
        Optional<BookType> anyBookType = getBookTypes().stream().filter(bookType -> StringUtils.contains(bookName, bookType.getName())).findAny();
        return Result.success(anyBookType.isPresent() ? anyBookType.get().getName() : "图书");
    }

    private List<BookType> getBookTypes() {
        return Arrays.asList(new BookType("1", "Java"), new BookType("2", "C#"));
    }
}