package com.zwh.test;

import com.zwh.controller.DemoApplication;
import com.zwh.SpringRunner;
import com.zwh.biz.AccountBean;
import com.zwh.inter.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author ：zwh
 * @date ：2020/2/12 15:10
 * @description:
 * @modified By：
 * @version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void test() {
        List<AccountBean> users = accountMapper.queryAccountList();
        System.out.println(users);
    }

}
