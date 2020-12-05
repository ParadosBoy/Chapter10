package com.dao;

import com.po.Customer;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author 10574
 */
public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
    @Override
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("com.po.CustomerMapper.findCustomerById",id);
    }
}
