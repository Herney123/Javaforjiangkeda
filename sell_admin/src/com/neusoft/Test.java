package com.neusoft;

import com.neusoft.dao.impl.BusinessDaoImpl;

public class Test {
    public static void main(String[] args) {
        BusinessDaoImpl dao = new BusinessDaoImpl();

//        int businessid = dao.saveBusiness("江科大食堂");
//        System.out.println("id" + businessid);

        int result = dao.removeBusiness(10014);
        System.out.println("result:" + result);
    }
}