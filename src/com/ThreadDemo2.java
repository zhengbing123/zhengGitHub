package com;

public class ThreadDemo2 {
    public static void main(String[] args) {
        
        // ���������ʺ�
        Acount account = new Acount();
        // �������ʺ�֮�����и������п�
        Card card = new Card("card",account);
        // �������ʺ�֮�����и��Ŵ���
        Paper paper = new Paper("����",account);
        
        Thread thread1 = new Thread(card);
        Thread thread2 = new Thread(paper);
        
        thread1.start();
        thread2.start();            
    }
}