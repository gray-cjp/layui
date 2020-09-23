package com.cjp.layui.dto;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuInvocationHandler<T> implements InvocationHandler {
    T target;
    public StuInvocationHandler(T target){
        this.target = target;
    }

    /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" +method.getName() + "方法");
        MonitorUtil.start();
        Object invoke = method.invoke(target, args);
        MonitorUtil.finish(method.getName());
        return invoke;
    }
}
