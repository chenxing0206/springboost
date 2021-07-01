package com.example.demo.config;

import com.example.demo.bean.Person;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *  所属项目：
 *  类名称：MyConfig
 *  类作用：
 *  类作者：chenxing                                                        
 *  创建日期：2021/6/30
 *  审核人：  
 *  审核日期：            
 *  更新记录：                                        
 *  其它备注：
 *  @author:chenxing
 */

@Configuration
@EnableConfigurationProperties({Person.class})
public class MyConfig {

//    @Bean
    public Person person()
    {
        return new Person("cx",28,1);
    }
}
