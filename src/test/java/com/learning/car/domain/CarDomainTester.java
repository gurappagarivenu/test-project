package com.learning.car.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarDomainTester {

    @Test
    void givenCarNameExistsShouldReturnCarDetails() {
      Car car = new Car("prius","hibrid");
        assertThat(car.getName()).isEqualTo("prius");

    }
}
