package com.ahj.retail.data;



import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * The Class DatabaseConfig.
 *
 * @author jasaniankit
 */
@Configuration
@MapperScan(basePackages="com.ahj.retail.data.mapper")
public class DatabaseConfig 
{
		
	/** The Constant DB_PASSWORD. */
	private static final String DB_PASSWORD = "admin";
	
	/** The Constant DB_USER. */
	private static final String DB_USER = "root";
	
	/** The Constant DB_URL. */
	private static final String DB_URL = "jdbc:mysql://localhost:3306/MyRetailDB";
	
	/** The Constant MYSQL_DRIVER. */
	private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";

	@Bean
    public DataSource dataSource() 
    {
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName(MYSQL_DRIVER);
      dataSource.setUrl(DB_URL);
      dataSource.setUsername(DB_USER);
      dataSource.setPassword(DB_PASSWORD);
      return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
    }

}