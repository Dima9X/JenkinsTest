/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTests {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }
    
    @Test
    void mul() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.mul(3, 5), "3 * 5 should equal 15");
    }
    @Test
    void sub() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sub(7, 2), "7 - 2 should equal 5");
    }
    @Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.div(7, 2), "7 / 2 should equal 3");//err test
    }

}
