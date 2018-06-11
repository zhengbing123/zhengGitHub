package com;
/**
 * 银行卡负责存钱
 * @author Administrator
 *
 */
public class Card implements Runnable{
    private String name;
    private Acount account = new Acount();
    
    public Card(String name,Acount account) {
        this.account = account;
        this.name = name;
    }
    
    @Override
    public void run() {
        
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.addAcount(name,100);         }
    }
    
}