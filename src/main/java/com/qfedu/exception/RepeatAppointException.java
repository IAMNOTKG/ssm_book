package com.qfedu.exception;

/**
 * 重复预约异常
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 15:50
 */
public class RepeatAppointException extends RuntimeException{

    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }

}
