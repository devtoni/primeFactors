package com.primeFactors;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsShould {
  private Matcher<List<Integer>> isListOf(Integer ...ints) {
      return is(asList(ints));
  }

  @Test
    public void factors() throws Exception {
      assertThat(primeFactorsOf(1), isListOf());
      assertThat(primeFactorsOf(2), isListOf(2));
  }

    private List<Integer> primeFactorsOf(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (n > 1)
            factors.add(2);
        return factors;
    }
}

//1st null to constant
// Generalize to a variable (constant to variable)