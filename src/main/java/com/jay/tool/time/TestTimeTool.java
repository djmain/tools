package com.jay.tool.time;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * created by Jay on 2019/7/29
 */
public class TestTimeTool
{
    @Test
    public void testCost()
    {
        TimeTool.cost("sleep", () -> {
            try
            {
                TimeUnit.SECONDS.sleep(2);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        });
    }
}
