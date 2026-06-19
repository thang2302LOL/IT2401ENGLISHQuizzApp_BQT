/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bqt.app.bqtenglishquizzapp;

/**
 *
 * @author admin
 */
public class MyAlertSingleton {
    private static MyAlertSingleton instances;
    private final Alert alert;
    
    private MyAlertSingleton(){
        this.alert = new Alert(Alert.AlertType.INFOMATION)
    }
    public static MyAlertSingleton getInstances(){
        if(instances == null)
            instances = new MyAlertSingleton();
        return instances;
    }
    public void showMs(String content){
        this.alert.setContentText(content);
        this.alert.show();
    }
     
    
}
