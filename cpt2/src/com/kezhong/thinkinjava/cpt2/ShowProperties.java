package com.kezhong.thinkinjava.cpt2;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:30
 */
public class ShowProperties {

    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }

}
