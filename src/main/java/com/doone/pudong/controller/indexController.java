package com.doone.pudong.controller;

import com.doone.pudong.service.IndexService;
import com.doone.pudong.webScoket.MyWebSocket;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author : cdd
 * @ClassName :
 * @Description :
 * @date 2019/4/24 11:20
 */
@Controller
@RequestMapping("/")
public class indexController {
    @Resource
    private IndexService indexService;

    private MyWebSocket myWebSocket;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * @author ：cdd
     * @Description ：跳转到屏幕1
     * @date ：2019/4/30
     */
    @RequestMapping("/toScreen1")
    public String screen1() {
        return "screen1";
    }

    /**
     * @author ：cdd
     * @Description ：跳转到 WebScoket.jsp
     * @date ：2019/4/30
     */
    @RequestMapping("/toWebScoket")
    public String towebScoket() {
        return "webScoket";
    }

    /**
     * @author ：cdd
     * @Description ：查询主库
     * @date ：2019/4/30
     */
    @RequestMapping("/query")
    @ResponseBody
    public List<Map<String, Object>> query() {
        return indexService.query();
    }

    /**
     * @author ：cdd
     * @Description ：推送消息
     * @date ：2019/4/30
     */
    @RequestMapping("/push")
    @ResponseBody
    public void push(String index) throws IOException {
        myWebSocket.sendInfo(index);
    }

    /**
     * @author ：cdd
     * @Description ：多数据源查询 副库
     * @date ：2019/4/30
     */
    @RequestMapping("/queryIndexMapCount")
    @ResponseBody
    public List<Map<String, Object>> queryIndexMapCount() {
        return indexService.queryIndexMapCount();
    }

    /**
     * @author ：cdd
     * @Description ：自定义异常
     * @date ：2019/4/30
     */
    @RequestMapping("/exception")
    @ResponseBody
    public String exception() {
        int a = 1 / 0;

        /*try {
            int a = 1 / 0;
        } catch (Exception e) {
            System.out.println("发生异常");
        }*/
        return "这个是异常controller";
    }
}
