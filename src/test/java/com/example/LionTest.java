package com.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)

public class LionTest extends TestCase {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock

    Feline feline;


    private final String sex;
    private final boolean mane;

    public LionTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;

    }

    @Parameterized.Parameters

    public static Object[][] checkTest() {
        return new Object[][] {
                {"Самка", false},
                {"Самец",true},
        };
    }
    @Test
    public void doesHaveManeReturnTrue() throws Exception {

        Lion lion = new Lion(sex,  feline);
        assertEquals(mane, lion.doesHaveMane());
    }

    @Test
    public void getKittensReturn() throws Exception {
        Lion lion = new Lion(sex, feline);
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }



    @Test
    public void getFoodReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        var food = lion.getFood();
        var Expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(Expected, food);

    }
}