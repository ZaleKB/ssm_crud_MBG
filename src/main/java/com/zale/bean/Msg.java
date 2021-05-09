package com.zale.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 用来返回json的数据的通用类
 */
public class Msg {

    private int code;
    private String msg;

    private Map<String, Object> extend = new HashMap<>();

    public static Msg success() {
        Msg res = new Msg();
        res.setCode(100);
        res.setMsg("success!");
        return res;
    }

    public static Msg fail() {
        Msg res = new Msg();
        res.setCode(200);
        res.setMsg("failed!");
        return res;
    }

    public Msg add(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
