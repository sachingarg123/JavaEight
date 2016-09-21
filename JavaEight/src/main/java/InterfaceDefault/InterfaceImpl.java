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

public class InterfaceImpl implements Interface1, Interface2
{

    @Override
    public void method1()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void method2()
    {
        // TODO Auto-generated method stub

    }

    //Implement your version of log method to avoid diamond issue.

    @Override
    public void log(String str)
    {
        System.out.println("Logging of impl: " + str);
    }

    public static void main(String arg[])
    {

        //used lambda expression to call Interface1 method1
        Interface1 interface1 = () -> {
            System.out.println("Called method1 using lambda expression");
        };

        interface1.method1();

        interface1.defaultMethod("default Method with implementation");
        Interface2 interface2 = () -> {
            System.out.println("Called method2 using lambda expression");
        };

        interface2.method2();
        Interface2 interfaceImpl = new InterfaceImpl();
        interfaceImpl.log("called method log which is overriden in implemented class because of diamond issue ");

    }
}
