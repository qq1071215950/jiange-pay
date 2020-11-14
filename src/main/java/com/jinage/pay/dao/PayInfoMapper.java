package com.jinage.pay.dao;

import com.jinage.pay.pojo.PayInfo;

/**
 * @author jiange
 * @version 1.0
 * @date 2020/11/14 17:44
 */
public interface PayInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayInfo record);

    int insertSelective(PayInfo record);

    PayInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayInfo record);

    int updateByPrimaryKey(PayInfo record);
}
