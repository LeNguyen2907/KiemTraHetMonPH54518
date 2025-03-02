package service;

import com.example.kiemtrahetmon_ph54518.model.KhachHang;
import com.example.kiemtrahetmon_ph54518.service.KhachHangService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestKhachHangService {

    KhachHangService service = new KhachHangService();

    @Test
    public void searchKhachHang () {

        KhachHang khachHang = new KhachHang("KH001", "Ten 1", 20, "khachhang1@gmail.com", "0123456789");
        service.add(khachHang);

        String exp = "KH001";
        String act = service.search(exp).getMaKH();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void searchKhachHangInvalidMa () {

        KhachHang khachHang = new KhachHang("KH001", "Ten 1", 20, "khachhang1@gmail.com", "0123456789");
        service.add(khachHang);

        KhachHang exp = null;
        KhachHang act = service.search("");

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void searchKhachHangInvalidList () {

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {KhachHang kh = service.search("KH001");});

        String exp = "Mang khach hang khong duoc de trong";
        String act = exception.getMessage();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void searchKhachHangInvalid () {

        KhachHang khachHang = new KhachHang("KH001", "Ten 1", 20, "khachhang1@gmail.com", "0123456789");
        service.add(khachHang);

        String exp = "KH001";
        String act = service.search(exp).getMaKH();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void searchKhachHangWithInvalidTen () {

        KhachHang khachHang = new KhachHang("KH001", "", 20, "khachhang1@gmail.com", "0123456789");
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {service.add(khachHang);});

        String exp = "Ten nhap vao khong duoc de trong";
        String act = exception.getMessage();

        Assertions.assertEquals(exp, act);
    }
}
