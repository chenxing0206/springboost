package com.example.demo;

import com.example.demo.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);


		String name = Optional.ofNullable((Person) run.getBean("myperson-com.example.demo.bean.Person")).map(person -> person.getName()).orElse("");
    /**
     * 如果使用@EnableConfigurationProperties({DemoBean.class})将其注册为Bean，Bean的名字是 @ConfigurationProperties#prefix的值
     * + “-” + 注解类的全类名：
	 * 所以建议还是用class去取bean
     */
    Person myperson = (Person) run.getBean("myperson-com.example.demo.bean.Person");
    System.out.println(myperson);


	}

}
                                              