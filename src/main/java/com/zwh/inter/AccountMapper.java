package com.zwh.inter;

import com.zwh.biz.AccountBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：zwh
 * @date ：2020/2/12 10:31
 * @description:
 * @modified By：
 * @version: 1.0
 */
@Mapper
public interface AccountMapper {

     List<AccountBean> queryAccountList();

}
