package com.amumu.ashe.common.resp;

import com.amumu.ashe.common.constants.Constants;
import lombok.Data;

@Data
public class ApiResult<T> {
    private int code = Constants.RESP_STATUS_OK;

    private String message;

    private T data;

}
