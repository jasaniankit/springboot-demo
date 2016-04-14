package com.ahj.retail.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ahj.retail.data.Product;

/**
 * The Interface ProductMapper.
 *
 * @author jasaniankit
 */
@Transactional
@Component
public interface ProductMapper 
{
	@Select("SELECT price.price,product.* FROM Product" 
			+" join price on Product.id = price.id where product.id = #{id} ")
	Product getProductById(@Param("id") final int id);
	
	@Select("SELECT price.price,product.* FROM Product" 
			+" join price on Product.id = price.id ")
	List<Product> getAllProducts();

}
