package com.gyh.hojcodesandbox.security;

import java.security.Permission;

/**
 * 禁用所有安全管理器
 */
public class DenySecurityManager extends SecurityManager {

    //检测所有的权限
    @Override
    public void checkPermission(Permission perm) {

        super.checkPermission(perm);
        throw new SecurityException("权限被拒绝" + perm.getName());
    }
}
