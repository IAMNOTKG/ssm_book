package com.qfedu.exception;

/**
 * 预约业务异常
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 15:50
 */
public class AppointException extends RuntimeException{

    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
