package com.zwh.controller;

import com.zwh.biz.PictureBean;
import com.zwh.inter.AccountMapper;
import com.zwh.utils.JSONUitl;
import com.zwh.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author ：zwh
 * @date ：2020/2/11 14:15
 * @description:
 * @modified By：
 * @version: 1.0
 */

@Controller
@RequestMapping("/learn")
@ConfigurationProperties(prefix = "com")
public class learnTestController {

    private static final Logger logger = LoggerFactory.getLogger(learnTestController.class);

    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping(value = "queryAccountList", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String queryAccountList(@RequestBody Map map, HttpServletRequest request) {
        String session = request.getHeader("SESSION");
        logger.warn("warn session:" + session);
        String name = (String) map.get("name");
        String age = (String) map.get("age");
        logger.warn("warn name:" + name);
        logger.warn("warn age:" + age);
        return JSONUitl.obj2Json(Result.success(accountMapper.queryAccountList()));
    }


    /**
     * 提交图片
     * @param map
     * @param request
     * @return
     */
    @Autowired
    private MongoTemplate mongoTemplate;
    @RequestMapping(value = "commitPicture", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String commitPicture(@RequestBody Map map, HttpServletRequest request) {
        String picture = (String) map.get("picture");
        logger.warn("warn picture:" + picture);
        //将数据插入到mongoDb数据库中
        mongoTemplate.insert(new PictureBean(100L,"wangwu","djshfsdhfjshhasdf"));
        return JSONUitl.obj2Json(Result.success(""));
    }

    /**
     *  展示图片
     * @param map
     * @param request
     * @return
     */
    @RequestMapping(value = "showPicture", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String showPicture(@RequestBody Map map, HttpServletRequest request) {
        logger.warn("show picture --->");
        //将数据插入到mongoDb数据库中
        return JSONUitl.obj2Json(Result.success(""));
    }

}
