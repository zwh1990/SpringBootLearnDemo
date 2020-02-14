package com.zwh;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：zwh
 * @date ：2020/2/12 15:13
 * @description:
 * @modified By：
 * @version: 1.0
 */
public final class SpringRunner extends SpringJUnit4ClassRunner {
    public SpringRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }
}
