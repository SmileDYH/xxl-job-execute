package com.dyh.xxljob.demo;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 执行器demo
 * description: dyh
 * author: Administrator
 * date: 2021/3/11 0011 15:09
 */
@Component
public class ExampleXxlJob {

    private static Logger logger = LoggerFactory.getLogger(ExampleXxlJob.class);

    @Value("${server.port}")
    private int port;

    @XxlJob("demoHandler")
    public void testXxlJob() {
        logger.info("XXL-JOB, Hello World, port: {}.", port);
    }

}
