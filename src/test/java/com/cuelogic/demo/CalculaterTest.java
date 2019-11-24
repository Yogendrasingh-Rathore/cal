package com.cuelogic;

import static org.junit.Assert.*;

public class CalculaterTest
{

  @Test
  public void testCalculatorConstructor() {
        try {
            new Calculater();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

}
