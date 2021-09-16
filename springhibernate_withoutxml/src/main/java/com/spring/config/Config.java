package com.spring.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.spring.orm.dao.StudentDaoImp;
import com.spring.orm.pojo.Address;
import com.spring.orm.pojo.Student;



@Configuration
@ComponentScan(basePackages="com.spring.orm.dao")
public class Config {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3307/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Lufa@7917");
		return ds;
	}
	
	@Bean("hibernateProperties")
	public Properties getallprops() {
		Properties p = new Properties();
		p.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.show_sql","true");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		return p;
	}
	
	
	@Bean("annotatedClasses")
	public Class<?>[] getAnnotation(Class<?>...annotatedClasses ) {
		annotatedClasses.getClass().getClasses();
		return annotatedClasses;
	}
	
	@Bean("factory")
	public LocalSessionFactoryBean getlocalsessionfactbean() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setHibernateProperties(getallprops());
		sessionFactory.setAnnotatedClasses(getAnnotation());
		return sessionFactory;
	}
	
	
	
	@Bean("hibernateTemplate")
	public HibernateTemplate gethibernate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory((SessionFactory) getlocalsessionfactbean());
		return hibernateTemplate;
	}
	
	@Bean("studentdaoimp")
	public StudentDaoImp getstudentdao() {
		StudentDaoImp s = new StudentDaoImp();
		s.setHibernateTemplate(gethibernate());
		return s;
	}
	
	@Bean("transactionManager")
	public HibernateTransactionManager gethibernatetransaction() {
		HibernateTransactionManager h = new HibernateTransactionManager();
		h.setSessionFactory((SessionFactory) getlocalsessionfactbean());
		return h;
	}

	@Bean("student")
	public Student getstudent() {
		return new Student();
	}

	@Bean("add")
	public Address getadd() {
		return new Address();
	}
}