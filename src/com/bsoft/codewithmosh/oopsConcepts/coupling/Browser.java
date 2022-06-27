package com.bsoft.codewithmosh.oopsConcepts.coupling;

public class Browser {

    private String address;

    public void navigate(){
      
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip){
        return "<html><html>";
    }
    private String findIpAddress(String address){
        return "127.0.01";
    }
}
