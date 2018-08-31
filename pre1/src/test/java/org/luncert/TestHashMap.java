package org.luncert;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.luncert.hashmap.HashMap;

@RunWith(JUnit4.class)
public class TestHashMap {
    
    @Test
    public void test() {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 16; i ++)
            map.put(new Integer(i), String.valueOf(i));
        for (int i = 0; i < 16; i ++)
            map.put(new Integer(i + 16), String.valueOf(i + 16));
        map.remove(16);
        System.out.println(map.get(16));
        System.out.println(map.containsKey(16));
        System.out.println(map.containsValue("16"));
    }
    
}