package com.chl.dao.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
