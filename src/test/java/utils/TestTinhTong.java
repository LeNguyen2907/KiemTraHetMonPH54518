package utils;

import com.example.kiemtrahetmon_ph54518.utils.TinhTong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTinhTong {

    TinhTong tinhTong = new TinhTong();

    @Test
    public void testMang () {

        int exp = 114;
        int act = tinhTong.tinh(new int[] {1, 3, 6, 11, 99});

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testMangCoSoAm () {

        int exp = 90;
        int act = tinhTong.tinh(new int[] {-1, 3, 6, -11, 99});

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testMangCoSoLonHon100 () {

        int exp = 103;
        int act = tinhTong.tinh(new int[] {1, 3, 6, 101, 99});

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testMangTrong () {

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {tinhTong.tinh(null);});

        String exp = "Mang khong duoc de trong";
        String act = exception.getMessage();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testMangToanSoChan () {

        int exp = 0;
        int act = tinhTong.tinh(new int[] {2, 4, 6, 8});

        Assertions.assertEquals(exp, act);
    }
}
