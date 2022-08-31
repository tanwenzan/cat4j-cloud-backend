package cn.zeroable.cat4j;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 简介
 * <br/> 类功能说明
 *
 * @author zeroable
 * @version 2022/8/31 22:11
 * @see
 * @since 0.0.1
 */
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
@MapperScan(value = "cn.zeroable.cat4j.dao")
public class Cat4jMultipleDataSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Cat4jMultipleDataSourceApplication.class, args);
    }
}
