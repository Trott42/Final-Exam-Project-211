package com.khalidgrant;

import org.junit.Test;

import static com.khalidgrant.ch18_3.gcd;
import static org.junit.Assert.assertEquals;

class GCDTest {

  @Test
  public void gcdOfZeroAndNumberIsNumber() {
    assertEquals(42, gcd(0, 42));
    assertEquals(42, gcd(0, 42));
  }

  @Test
  public void shouldTestGcdOfTwoPositiveNumbers() {
    assertEquals(120, gcd(1080, 1920));
    assertEquals(120, gcd(1080, 1920));

    assertEquals(120, gcd(1920, 1080));
    assertEquals(120, gcd(1920, 1080));
  }

  @Test
  public void shouldTestForNegativeNumber() {
    assertEquals(3, gcd(21, -9));
    assertEquals(3, gcd(21, -9));

    assertEquals(3, gcd(-21, 9));
    assertEquals(3, gcd(-21, 9));

    assertEquals(3, gcd(-21, -9));
    assertEquals(3, gcd(-21, -9));
  }


}

