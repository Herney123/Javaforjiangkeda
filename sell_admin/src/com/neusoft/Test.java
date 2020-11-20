package com.neusoft;

import com.neusoft.dao.impl.BusinessDaoImpl;
import com.neusoft.domain.Business;

public class Test {
    public static void main(String[] args) {
        BusinessDaoImpl dao = new BusinessDaoImpl();
        //增
//        int businessid = dao.saveBusiness("江科大食堂");
//        System.out.println("id" + businessid);
        //删
//        int result = dao.removeBusiness(10014);
//        System.out.println("result:" + result);
        //改
//        Business business = new Business();
//        business.setBusinessName("真好吃");
//        business.setBusinessAddress("dasdas");
//        business.setBusinessExplain("dasdas");
//        business.setDeliveryPrice(5.);
//        business.setStartPrice(2.);
//        business.setBusinessId(10012);
//        dao.updateBusiness(business);
        //查
        Business b = dao.getBusinessById(10005);
        System.out.println(b);
    }
}