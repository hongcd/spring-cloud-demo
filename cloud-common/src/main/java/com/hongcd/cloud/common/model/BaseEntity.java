package com.hongcd.cloud.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 实体父类
 * @param <PK>
 * @author HongD
 * @date 2018-10-15
 */
@Data
public class BaseEntity<PK> implements Serializable {
    private PK id;
}