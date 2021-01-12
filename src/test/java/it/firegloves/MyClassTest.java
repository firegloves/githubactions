package it.firegloves;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyClassTest {

    @Test
    void sayHello() {

        assertEquals("Hello", new MyClass().sayHello());
    }

    @Test
    void sayKobraKai() {
        assertEquals("Kobra Kai! ahi hiaa", new MyClass().sayKobraKai());
    }



}
