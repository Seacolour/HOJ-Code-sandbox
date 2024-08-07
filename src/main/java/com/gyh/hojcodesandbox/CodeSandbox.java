package com.gyh.hojcodesandbox;


import com.gyh.hojcodesandbox.model.ExecuteCodeRequest;
import com.gyh.hojcodesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
