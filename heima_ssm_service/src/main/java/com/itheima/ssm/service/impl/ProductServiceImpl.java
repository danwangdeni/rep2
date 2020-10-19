package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.IProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements IproductService {
    // merge the incoming changes into the current branch

    @Autowired
    private IProductDao producDao;

    @Override
    public List<Product> findAll() throws Exception {
        return producDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        producDao.save(product);
    }
}
