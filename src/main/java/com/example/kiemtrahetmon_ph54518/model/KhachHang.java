package com.example.kiemtrahetmon_ph54518.model;

public class KhachHang {

    private String maKH;
    private String tenKH;
    private int tuoi;
    private String email;
    private String soDienThoai;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, int tuoi, String email, String soDienThoai) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        if (tenKH == null || tenKH.isEmpty()) {
            throw new IllegalArgumentException("Ten nhap vao khong duoc de trong");
        }
        this.tenKH = tenKH;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
