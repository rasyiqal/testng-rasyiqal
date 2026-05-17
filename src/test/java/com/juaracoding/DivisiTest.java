package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DivisiTest {

    private Divisi divisi;

    @BeforeMethod
    public void setUp() {
        divisi = new Divisi("IT");
    }

    @Test
    public void testTambahKaryawanDanGetJumlah() {
        Karyawan k1 = new Karyawan("Fajar", "Manager", 10000000);
        Karyawan k2 = new Karyawan("Gilang", "Staff", 5000000);
        
        divisi.tambahKaryawan(k1);
        divisi.tambahKaryawan(k2);
        
        Assert.assertEquals(divisi.getJumlahKaryawan(), 2, "Jumlah karyawan di divisi harusnya 2");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTambahKaryawanNullException() {
        divisi.tambahKaryawan(null); // Harus melempar exception
    }
}
