package com.itheima.ssm.service;


import com.itheima.ssm.domain.Product;

import java.util.List;

public interface IproductService {
    public List<Product> findAll() throws Exception;

}
