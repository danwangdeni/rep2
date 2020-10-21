package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IOrdersDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;
    @Override
    public List<Orders> findAll(int page, int size) throws Exception {

        //pageNum是页码值，pageSize是每页显示多少条
        PageHelper.startPage(page,size);
        List<Orders> orders = ordersDao.findAll();
        return orders;
    }

    @Override
    public Orders findById(String orderId) throws Exception{
        Orders orders=ordersDao.findById(orderId);
        return orders;
    }

}