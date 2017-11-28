package com.baidu.test;

import org.junit.Test;

/**
 * Created by dllo on 17/11/28.
 */
public class MainTest {

    @Test
    public void test(){
        byte a = 127;
        byte b = 127;

        b +=a;

        System.out.println(b);
    }
}
