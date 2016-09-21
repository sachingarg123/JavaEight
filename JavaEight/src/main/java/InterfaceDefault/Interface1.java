//**********************************************************************
// Copyright (c) 2016 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************
package InterfaceDefault;

public interface Interface1
{
    void method1();

    //default method used to demonstrate default method output
    default void defaultMethod(String str)
    {
        System.out.println("Interface 1 defaultMethod: " + str);
    }

    //default method 1 used for diamond issue
    default void log(String str)
    {
        System.out.println("Interface 1 logging: " + str);
    }
    // cannot override methods available in Object class
    /* default String toString()
     {

     }*/
}
