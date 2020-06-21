package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author leizhen
 * @create 2020-06-05 21:44
 */

@SpringBootTest
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testMailClient() {
        mailClient.sendMail("1518201179@qq.com", "激活邮件", "您好，欢迎注册！");
    }

    @Test
    public void testHtmlMail() {
        Context context = new Context();
        context.setVariable("username", "李世民");

        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        mailClient.sendMail("1518201179@qq.com", "激活邮件", content);
    }
}
