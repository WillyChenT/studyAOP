package org.ming.sp.aop;

import java.time.LocalDateTime;

//橫向關注
public class TimeHandler {
    public void printBefore(){
        System.out.println("printBefore Log time"+ LocalDateTime.now().toString());
    }
    public void printAfter(){
        System.out.println("printAfter Log time"+ LocalDateTime.now().toString());
    }
}
