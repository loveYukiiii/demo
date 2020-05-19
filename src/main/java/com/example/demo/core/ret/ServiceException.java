package com.example.demo.core.ret;

import java.io.Serializable;

/**
 * @program: demo
 * @description: 业务异常处理
 * @author: dennis
 * @create: 2018-11-29 11:38
 **/
public class ServiceException extends RuntimeException implements Serializable {
    public static final long serialVersionUID= -4570728133414793388L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}
