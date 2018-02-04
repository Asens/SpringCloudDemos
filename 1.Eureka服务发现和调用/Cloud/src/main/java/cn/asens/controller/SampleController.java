package cn.asens.controller;

import cn.asens.dao.UserDao;
import cn.asens.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Asens on 2017/7/13
 */

//@RestController
public class SampleController {
    private static Logger log= LogManager.getLogger(SampleController.class);

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("/aa")
    String home(ModelMap model) {
        return "welcome";
    }



}
