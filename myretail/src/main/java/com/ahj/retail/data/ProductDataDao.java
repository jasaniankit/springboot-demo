package com.ahj.retail.data;

import java.util.List;

import javax.transaction.Transactional;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

/**
 * 
 * @author jasaniankit
 *
 */
@Transactional
@EnableAutoConfiguration
@Component
@MapperScan("com.ahj.retail.data.mapper")
public interface ProductDataDao
{

  public Product getProductById(String productId);
  
  public List<Product> getAllProducts();
}