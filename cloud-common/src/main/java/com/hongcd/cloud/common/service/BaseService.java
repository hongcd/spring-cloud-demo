package com.hongcd.cloud.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * Service父类
 * @author HongD
 * @date 2018-10-15
 */
public abstract class BaseService {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    /**
     * 生成GUID
     * @return
     */
    protected String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}