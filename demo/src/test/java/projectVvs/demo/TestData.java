package projectVvs.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestData {



    @Test
    public void testSetNull(){
        CollectedData data = new CollectedData();
        data.setAllNull();

        Assertions.assertEquals(0,data.getProtein());
        Assertions.assertEquals(0,data.getCarb());
        Assertions.assertEquals(0,data.getFat());
    }

    @Test
    public void testSetters(){
        CollectedData data = new CollectedData();
        data.setAll(22,197,98,"Male");

        Assertions.assertEquals(22,data.getAge());
        Assertions.assertEquals(197,data.getHeight());
        Assertions.assertEquals(98,data.getWeight());
        Assertions.assertEquals("Male",data.getGender());
    }

    @Test
    public void testKcal(){
        CollectedData data = new CollectedData();
        data.setAll(22,197,98,"Male");

        Assertions.assertEquals(2306.25,data.getKcal());
    }



}