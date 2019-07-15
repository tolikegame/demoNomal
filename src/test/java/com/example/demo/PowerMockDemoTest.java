package com.example.demo;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.ArgumentMatchers.anyString;

@RunWith(PowerMockRunner.class)
@PrepareForTest({PowerMockDemo.class})
public class PowerMockDemoTest {

    @Test
    public void testLowerCase() throws Exception {
        //定義mockStatic 的類別
        PowerMockito.mockStatic(PowerMockDemo.class);
        //進行Stub設置
        PowerMockito.when(PowerMockDemo.lowerCase(Mockito.anyString())).thenReturn("mockTest");

        //測試調用
        String result = PowerMockDemo.lowerCase("ABC");
        Assert.assertEquals(result, "mockTest");

        //設定調用次數
        PowerMockito.verifyStatic(PowerMockDemo.class, Mockito.times(1));
        PowerMockDemo.lowerCase("ABC");//觸發計算，本次調用不會計算在調用次數裡面
    }

    @Test
    public void nomal(){
        PowerMockDemo mock = Mockito.mock(PowerMockDemo.class);
        PowerMockito.when(mock.noaml()).thenReturn("AA");

        String result = mock.noaml();
        Assert.assertEquals(result,"AA");

        PowerMockito.verifyStatic(PowerMockDemo.class);
    }

    @Test
    public void testFinal() {
        PowerMockDemo tested = PowerMockito.mock(PowerMockDemo.class);
        Mockito.when(tested.testFinal()).thenReturn("isMock");
//        String result = tested.testFinal();
//        Assert.assertEquals(result, "isMock");

        //驗證次數與方法
        Mockito.verify(tested,Mockito.never()).testFinal();
    }

    @Test
    public void testNew() throws Exception {
        PowerMockDemo mockDemo = PowerMockito.mock(PowerMockDemo.class);
        PowerMockito.whenNew(PowerMockDemo.class).withNoArguments().thenReturn(mockDemo);
        PowerMockDemo result = new PowerMockDemo();
        Assert.assertEquals(mockDemo,result);
    }
}
