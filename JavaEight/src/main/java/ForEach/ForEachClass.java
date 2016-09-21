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
package ForEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//For each added in java 8
public class ForEachClass
{

    public static void main(String arg[])
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            list.add(i);
        }
        //With Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Iterated using iterator" + iterator.next());
        }

        //For-each. you can use consumer implementable class and use accept method in it.
        list.forEach(new Consumer<Integer>()
        {
            public void accept(Integer t)
            {
                System.out.println("Iterated using for each" + t);
            }
        });

        MyConsumer consumer = new MyConsumer();
        list.forEach(consumer);
    }
}
