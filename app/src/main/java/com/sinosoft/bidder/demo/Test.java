package com.sinosoft.bidder.demo;

/**
 * Created by Dell on 2018/1/20.
 */

public class Test {
    public  static  void main(String[] args){
        String str = "123456";
//        byte[] decode = Base64.decode(str,0);
//        System.out.println(decode.toString());
        String encode = Base64.encodeToString(str.getBytes(), 0);
        System.out.println("加密："+encode);
		 System.out.println("1111111");
		
    }
}
