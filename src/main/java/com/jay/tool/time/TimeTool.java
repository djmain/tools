package com.jay.tool.time;

/**
 * created by Jay on 2019/7/29
 */
public class TimeTool
{
    public static void cost(String name, Task task)
    {
        long begin = System.currentTimeMillis();
        task.run();
        long end = System.currentTimeMillis();
        System.out.println(name + " cost: " + (end - begin) / 1000 + " s");
    }
}
