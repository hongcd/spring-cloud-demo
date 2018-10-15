package com.hongcd.cloud.model;

import com.hongcd.cloud.common.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 图书类型
 * @author HongD
 * @date 2018-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BookType extends BaseEntity<String> {
    private String name;

    public BookType(String id, String name) {
        super.setId(id);
        this.name = name;
    }
}