package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KaryawanTest {

    @Test
    public void testHitungGajiTotalManager() {
        Karyawan manager = new Karyawan("Budi", "Manager", 10000000);
        double gajiTotal = manager.hitungGajiTotal();
        Assert.assertEquals(gajiTotal, 15000000.0, "Gaji total Manager harusnya gaji pokok + 5.000.000");
    }

    @Test
    public void testHitungGajiTotalStaff() {
        Karyawan staff = new Karyawan("Andi", "Staff", 5000000);
        double gajiTotal = staff.hitungGajiTotal();
        Assert.assertEquals(gajiTotal, 7000000.0, "Gaji total Staff harusnya gaji pokok + 2.000.000");
    }

    @Test
    public void testHitungGajiTotalLainnya() {
        Karyawan magang = new Karyawan("Citra", "Magang", 3000000);
        double gajiTotal = magang.hitungGajiTotal();
        Assert.assertEquals(gajiTotal, 3000000.0, "Gaji total selain Manager/Staff harusnya hanya gaji pokok");
    }

    @Test
    public void testUpdateGajiPositif() {
        Karyawan karyawan = new Karyawan("Dodi", "Staff", 5000000);
        karyawan.updateGaji(10); 
        Assert.assertEquals(karyawan.getGajiPokok(), 5500000.0, "Gaji pokok harus naik 10%");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateGajiNegatifException() {
        Karyawan karyawan = new Karyawan("Eka", "Staff", 5000000);
        karyawan.updateGaji(-5); 
    }
}
