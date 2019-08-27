package com.baizhi.dao;

import com.baizhi.entity.Admin;

public interface AdminDao {
    //根据账号查一个
    public Admin qureyOne(String username);
}
