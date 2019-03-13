/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.methodoverriding2;

/**
 *
 * @author karthick
 */
public class MotorCycle extends BiCycle {

    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        String temp = super.define_me(); //Fix this line
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}
