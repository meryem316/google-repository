package com.cybertek.utilities;

import javax.swing.*;

public class BrowerUtils {


    public static void wait(int secs){
        try{
            Thread.sleep(1000*secs);
        } catch (InterruptedException e) {

        }
    }
    public static void switchToWindow(String targetTile){
        String origin=Driver.getDriver().getWindowHand();
        for(String handle:Driver.getDriver().getWindowHandle()){
            Driver.getDriver().switchTo().window(handle);
            if(Driver.getDriver().getTitile().equals(targetTile)){
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }
    public static void  hover (WebElement element){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(element).perform;
    }
}
