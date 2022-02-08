package com.alex.server.exception;

import com.alex.server.pojo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 * @author 旋木頵頵
 * @date 2021/10/22 19:22
 * @email 1020626977@qq.com
 */
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(SQLException.class)
    public RespBean mySqlException(SQLException e) {
        if(e instanceof SQLIntegrityConstraintViolationException) {
            return RespBean.error("该数据有外键关联，操作失败！");
        }
        return RespBean.error("数据库异常，操作失败！"+"错误信息:" + e);
    }
}
