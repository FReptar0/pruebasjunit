package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testSuma() {
        Operaciones op = new Operaciones();
        int resultado = op.suma(2, 3);
        assertTrue(resultado == 5);
    }

    @Test
    public void testResta() {
        Operaciones op = new Operaciones();
        int resultado = op.resta(2, 3);
        assertTrue(resultado == -1);
    }

    @Test
    public void testMultiplicacion() {
        Operaciones op = new Operaciones();
        int resultado = op.multiplicacion(2, 3);
        assertTrue(resultado == 6);
    }

    @Test
    public void testDivision() {
        Operaciones op = new Operaciones();
        //int resultado = op.division(2, 3);
       // assertTrue(resultado == 0);
        assertEquals(0, op.division(2, 3));
    }

    @Test
    public void testLogin() {
        Login login = new Login();
        boolean resultado = login.login("admin", "admin123");
        assertTrue(resultado);
    }

    @Test
    public void testLogin2() {
        Login login = new Login();
        boolean resultado = login.login("alumno", "alumno123");
        assertTrue(resultado);
    }

    @Test
    public void testLogin3() {
        Login login = new Login();
        boolean resultado = login.login("admin", "admin1234");
        assertFalse(resultado);
    }

    @Test
    public void testLogin4() {
        Login login = new Login();
        boolean resultado = login.login("alumno", "alumno1234");
        assertFalse(resultado);
    }

}
