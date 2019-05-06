package com.doone.pudong.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : cdd
 * @ClassName :
 * @Description : 全局异常统一处理
 * @date 2019/4/30 10:26
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String returnException(){
        return "全局异常统一返回";
    }


}
