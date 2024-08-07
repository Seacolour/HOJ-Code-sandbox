package com.gyh.hojcodesandbox.security;

import java.security.Permission;

/**
 * 默认安全管理器
 */
public class MySecurityManager extends SecurityManager {

    //检测所有的权限
    @Override
    public void checkPermission(Permission perm) {
//        super.checkPermission(perm);
    }

    //检测执行权限
    @Override
    public void checkExec(String cmd) {
        throw new SecurityException("checkExec权限异常：" + cmd);
    }

    //检测读取权限
    @Override
    public void checkRead(String file) {
        if(file.contains("hutool")){
            return;
        }
        throw new SecurityException("checkRead权限异常：" + file);
    }

    //检测写入权限
    @Override
    public void checkWrite(String file) {
        throw new SecurityException("checkWrite权限异常：" + file);
    }

    //检测删除权限
    @Override
    public void checkDelete(String file) {
        throw new SecurityException("checkDelete权限异常：" + file);
    }

    //检测网络权限
    @Override
    public void checkConnect(String host, int port) {
        throw new SecurityException("checkConnect权限异常：" + host + ":" + port);
    }
}
