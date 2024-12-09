package com.ps.CustomerMiyagi.data.mysql;

import com.ps.CustomerMiyagi.data.CustomerDao;
import com.ps.CustomerMiyagi.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.util.List;

public class MySqlCustomerDao implements CustomerDao {

    private DataSource dataSource;

    @Autowired
    public MySqlCustomerDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

}
