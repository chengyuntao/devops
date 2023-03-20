package com.quxie.store.controller;

import com.quxie.store.controller.ex.*;
import com.quxie.store.service.ex.*;
import com.quxie.store.controller.ex.*;
import com.quxie.store.service.ex.*;
import com.quxie.store.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

/** 控制器类的基类 */
public class BaseController {
    /** 操作成功的状态码 */
    public static final int OK = 200;

    /**
     * 从HttpSession对象中获取uid
     * @param session HttpSession对象
     * @return 当前登录的用户的id
     */
    protected final Integer getUidFromSession(HttpSession session) {
        return Integer.valueOf(session.getAttribute("uid").toString());
    }

    /**
     * 从HttpSession对象中获取用户名
     * @param session HttpSession对象
     * @return 当前登录的用户名
     */
    protected final String getUsernameFromSession(HttpSession session) {
        return session.getAttribute("username").toString();
    }

    /** @ExceptionHandler用于统一处理方法抛出的异常 */
    @ExceptionHandler({ServiceException.class, FileUploadException.class})
    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> result = new JsonResult<Void>(e);
        if (e instanceof UsernameDuplicateException) {
            result.setState(400);
        } else if (e instanceof UserNotFoundException) {
            result.setState(401);
        } else if (e instanceof PasswordNotMatchException) {
            result.setState(402);
        } else if (e instanceof AddressCountLimitException) {
            result.setState(403);
        } else if (e instanceof AddressNotFoundException) {
            result.setState(404);
        } else if (e instanceof AccessDeniedException) {
            result.setState(405);
        } else if (e instanceof ProductNotFoundException) {
            result.setState(406);
        } else if (e instanceof CartNotFoundException) {
            result.setState(407);
        }else if(e instanceof CartNotFoundException) {
            result.setState(408);
        }else if(e instanceof PracCalligraphyNotFoundException) {
            result.setState(409);
        } else if (e instanceof InsertException) {
            result.setState(500);
        } else if (e instanceof UpdateException) {
            result.setState(501);
        } else if (e instanceof DeleteException) {
            result.setState(502);
        } else if (e instanceof FileEmptyException) {
            result.setState(600);
        } else if (e instanceof FileSizeException) {
            result.setState(601);
        } else if (e instanceof FileTypeException) {
            result.setState(602);
        } else if (e instanceof FileStateException) {
            result.setState(603);
        } else if (e instanceof FileUploadIOException) {
            result.setState(604);
        }
        return result;
    }
}
