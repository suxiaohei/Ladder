package com.study.ladder.example;

import junit.framework.TestCase;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by suxin on 17-4-11.
 */
public class ConcurrentHashMapTest extends TestCase {

    private ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

    public ConcurrentHashMapTest(String testName) {
        super(testName);
    }

    public void testRemove(){
        map.remove("111");
        assertTrue(true);
    }
}
