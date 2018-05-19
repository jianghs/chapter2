package org.smart4j.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.helper.DatabaseHelper;
import org.smart4j.model.Customer;

import java.util.List;
import java.util.Map;

public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     * */
    public List<Customer> getCustomerList() {
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     * */
    public Customer getCustomer(long id) {
        String sql = "select * from customer where id =" + id;
        return DatabaseHelper.queryEntity(Customer.class, sql);
    }

    /**
     * 创建客户
     * */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     * */
    public boolean updateCustomer(long id,Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     * */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
