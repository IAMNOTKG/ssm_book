package com.qfedu.exception;

/**
 * 无库存异常
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 15:50
 */
public class NoNumberException extends RuntimeException{

    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }

}
