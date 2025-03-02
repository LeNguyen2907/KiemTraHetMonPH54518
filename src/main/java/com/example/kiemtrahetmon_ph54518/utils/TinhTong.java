package com.example.kiemtrahetmon_ph54518.utils;

public class TinhTong {

    public int tinh (int [] soNguyen) {
        if (soNguyen == null || soNguyen.length == 0) {
            throw new IllegalArgumentException("Mang khong duoc de trong");
        }
        int sum = 0;
        for (int i: soNguyen) {
            if (i <= 100) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
