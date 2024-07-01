package stqa.exam.preparation;

import org.junit.Assert;
import org.junit.Test;

public class BusPlusTest {

    // uslov kaze da ce za brojeve koji nisu 1-12 biti izbacen izuzetak
    // sto znaci da uslov definise ilegalnu klasu a ne legalnu

    // KLASE EKVIVALENCIJE

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceLEC1(){
        int numMonths = 1;
        double expected = 0.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceLEC2(){
        int numMonths = 4;
        double expected = 5.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceLEC3(){
        int numMonths = 7;
        double expected = 10.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceIEC1(){
        int numMonths = 13;
        BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceIEC2(){
        int numMonths = -5;
        BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
    }

    // GRANICNE VREDNOSTI

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBVMinus1(){
        int numMonths = -1;
        BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV0(){
        int numMonths = 0;
        double expected = 0.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }


    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV1(){
        int numMonths = 1;
        double expected = 0.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV2(){
        int numMonths = 2;
        double expected = 0.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    // greska, uslovom nije definisao da se za 3 meseca dobija popust od 5%
    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV3(){
        int numMonths = 3;
        double expected = 5.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV4(){
        int numMonths = 4;
        double expected = 5.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV5(){
        int numMonths = 5;
        double expected = 5.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    // greska, uslovom nije definisao da se za 6 meseci dobija popust od 10%
    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV6(){
        int numMonths = 6;
        double expected = 10.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV7(){
        int numMonths = 7;
        double expected = 10.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV8(){
        int numMonths = 11;
        double expected = 10.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV9(){
        int numMonths = 12;
        double expected = 10.0;
        double actual = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV10(){
        int numMonths = 13;
        BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
    }

    // STATEMENT COVERAGE TESTOVI
    // STATEMENTI SU price *= 0.5; i price *= 0.3; i price *= 0.1; i price = 0;

    @Test
    public void testCalculateBusPlusSC1() {
        int age = 20;
        BusPlus.Status status = BusPlus.Status.EMPLOYED;
        boolean specialNeeds = true;
        BusPlus.Gender gender = BusPlus.Gender.FEMALE;
        double expected = 0;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateBusPlusSC2() {
        int age = 70;
        BusPlus.Status status = BusPlus.Status.PREGNANT;
        boolean specialNeeds = false;
        BusPlus.Gender gender = BusPlus.Gender.FEMALE;
        double expected = 160;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateBusPlusSC3() {
        int age = 60;
        BusPlus.Status status = BusPlus.Status.STUDENT;
        boolean specialNeeds = false;
        BusPlus.Gender gender = BusPlus.Gender.FEMALE;
        double expected = 960;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
        Assert.assertEquals(expected, actual, 0.0);
    }

    // DECISION COVERAGE TESTOVI
    // TESTOVI USLOVA npr. if (status != status.EMPLOYED) i if(specialNeeds)
    @Test
    public void testCalculateBusPlusDC4() {
        int age = 20;
        BusPlus.Status status = BusPlus.Status.EMPLOYED;
        boolean specialNeeds = false;
        BusPlus.Gender gender = BusPlus.Gender.FEMALE;
        double expected = 3200;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
        Assert.assertEquals(expected, actual, 0.0);
    }

    // PATH COVERAGE TESTOVI
    @Test
    public void testCalculateBusPlusPC5() {
        int age = 20;
        BusPlus.Status status = BusPlus.Status.PREGNANT;
        boolean specialNeeds = false;
        BusPlus.Gender gender = BusPlus.Gender.MALE;
        double expected = 3200;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
        Assert.assertEquals(expected, actual, 0.0);
    }

}
