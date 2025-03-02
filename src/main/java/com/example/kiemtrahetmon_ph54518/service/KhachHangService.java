package com.example.kiemtrahetmon_ph54518.service;

import com.example.kiemtrahetmon_ph54518.model.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class KhachHangService {

    List<KhachHang> list = new ArrayList<>();

    public void add (KhachHang khachHang) {
        if (khachHang.getTenKH() == null || khachHang.getTenKH().isEmpty()) {
            throw new IllegalArgumentException("Ten nhap vao khong duoc de trong");
        }
        list.add(khachHang);
    }

    public KhachHang search (String ma) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Mang khach hang khong duoc de trong");
        } else {
            for (KhachHang kh: list) {
                if (kh.getMaKH().equals(ma)) {
                    return kh;
                }
            }
            return null;
        }
    }

    public List<KhachHang> getAll () {
        return list;
    }
}
