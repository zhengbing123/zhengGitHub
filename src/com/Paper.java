package com;
/**
 * ¥Ê’€∏∫‘»°«Æ
 * @author Administrator
 *
 */
public class Paper implements Runnable{
    private String name;
    private Acount account = new Acount();
    
    public Paper(String name,Acount account) {
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
            account.subAcount(name,50);
        }
        
    }

}