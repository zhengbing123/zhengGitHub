package com;

import java.util.concurrent.locks.ReentrantLock;

/**
 * �����˻�
 * @author Administrator
 *
 */
public class Acount {
    private int count;
    private ReentrantLock lock = new ReentrantLock();
    
    /**
     * ��Ǯ
     * @param money
     */
    public void addAcount(String name,int money) {
        lock.lock();
        try{
            // ��Ǯ
            count += money;
            System.out.println(name+"...���룺"+money);
        }finally {
            lock.unlock();
        }
    }
    
    /**
     * ȡǮ
     * @param money
     */
    public void subAcount(String name,int money) {
        lock.lock();
        try{
            // ���ж��˻����ڵ�����Ƿ�ȡǮ���
            if(count-money < 0){  
                System.out.println("�˻����㣡");  
                return;  
            } 
            // ȡǮ
            count -= money;
            System.out.println(name+"...ȡ����"+money);
        }finally {
            lock.unlock();
        }
    }
    
    /**
     * ��ѯ���
     */
    public void SelectAcount(String name) {
        System.out.println(name+"...��"+count);
    }
}