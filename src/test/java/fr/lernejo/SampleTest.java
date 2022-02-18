package fr.lernejo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.lernejo.Sample.Operation;


class SampleTest {

    @Test
    void factTestWhenParameterIsPositif()
    {
        int n = 5;
        Sample sp = new Sample();
        int res = sp.fact(n);
        Assertions.assertThat(res).as("result of 5!").isEqualTo(120);
    }
    
    @Test
    void factTestWhenParameterIsNegatif()
    {
        int n = -5;
        Sample sp = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> sp.fact(n));
    }

    @Test
    void addTestOperation()
    {
        int a = 2;
        int b = 3;

        Sample sp = new Sample();
        Assertions.assertThat(sp.op(Operation.ADD, b, a)).as("result of 2 + 3").isEqualTo(5);
    }

    @Test
    void multTestOperation()
    {
        int a = 2;
        int b = 3;

        Sample sp = new Sample();
        Assertions.assertThat(sp.op(Operation.MULT, b, a)).as("result of 2 * 3").isEqualTo(6);
    }
}
