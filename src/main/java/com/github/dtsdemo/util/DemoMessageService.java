package com.github.dtsdemo.util;

import com.github.dts.util.AbstractMessageService;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;
import java.util.Objects;

public class DemoMessageService extends AbstractMessageService {
    @Value("${spring.profiles.active:}")
    private String env;

    @Override
    public Map send(String title, String content) {
        String token;
        String secret;
        if (Objects.equals(env, "prod")) {
            // 生产异常报警群
            token = "eb20cd9ecd4xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxbc1585";
            secret = "SEC481179336dxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx75aeacc87";
        } else {
            // 测试-异常报警群
            token = "0713e564365exxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxad78207e8";
            secret = "SEC452f93eedxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx230b4251e229";
        }
        return super.sendDingtalk(title, content, token, secret);
    }
}
