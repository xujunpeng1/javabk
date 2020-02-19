package com.jabk.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jabk.pojo.User;

public interface HelloMapper extends BaseMapper<User> {
	List<User> findAll();
}
