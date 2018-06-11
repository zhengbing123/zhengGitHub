package com;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行账户
 * @author Administrator
 *
 */
public class Acount {
    private int count;
    private ReentrantLock lock = new ReentrantLock();
    
    /**
     * 存钱
     * @param money
     */
    public void addAcount(String name,int money) {
        lock.lock();
        try{
            // 存钱
            count += money;
            System.out.println(name+"...存入："+money);
        }finally {
            lock.unlock();
        }
    }
    
    /**
     * 取钱
     * @param money
     */
    public void subAcount(String name,int money) {
        lock.lock();
        try{
            // 先判断账户现在的余额是否够取钱金额
            if(count-money < 0){  
                System.out.println("账户余额不足！");  
                return;  
            } 
            // 取钱
            count -= money;
            System.out.println(name+"...取出："+money);
        }finally {
            lock.unlock();
        }
    }
    
    /**
     * 查询余额
     */
    public void SelectAcount(String name) {
        System.out.println(name+"...余额："+count);
    }
}