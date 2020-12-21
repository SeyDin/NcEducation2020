package com.nc.autumn2020.databaseH2_v2;

import com.nc.autumn2020.databaseH2_v2.entity.Product;
import com.nc.autumn2020.databaseH2_v2.repository.ProductRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.nc.autumn2020.databaseH2_v2")
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Product employee = productRepository.addProduct(Product.builder().id(1).name("Ice-cream").price(20).build());
        System.out.println(employee);
    }
}
