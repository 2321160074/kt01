/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ADMIN
 */
    public class QLCauThu {
    public List<CauThu> danhSachCauThu;

    
    public QLCauThu() {
        danhSachCauThu = new ArrayList<>();
        
        danhSachCauThu.add(new CauThu(1, "Nguyen Van A", 1990, 1500, 200, 50));
        danhSachCauThu.add(new CauThu(2, "Tran Thi B", 1992, 1600, 300, 100));
        danhSachCauThu.add(new CauThu(3, "Le Van C", 1988, 1400, 250, 70));
        danhSachCauThu.add(new CauThu(4, "Pham Thi D", 1995, 1550, 150, 30));
        danhSachCauThu.add(new CauThu(5, "Hoang Van E", 1991, 1650, 500, 200));
        danhSachCauThu.add(new CauThu(6, "Vu Thi F", 1993, 1700, 600, 250));
        danhSachCauThu.add(new CauThu(7, "Do Van G", 1987, 1450, 220, 80));
        danhSachCauThu.add(new CauThu(8, "Nguyen Thi H", 1994, 1600, 350, 90));
        danhSachCauThu.add(new CauThu(9, "Bui Van I", 1996, 1500, 400, 150));
        danhSachCauThu.add(new CauThu(10, "Duong Thi J", 1989, 1550, 300, 100));
        danhSachCauThu.add(new CauThu(11, "Truong Van K", 1990, 1400, 200, 60));
    }

    // 
    public void themCauThu(CauThu cauThu) {
       
        for (CauThu ct : danhSachCauThu) {
            if (ct.getSoao() == cauThu.getSoao()) {
                System.out.println("Số áo đã tồn tại trong danh sách.");
                return;
            }
        }
        danhSachCauThu.add(cauThu);
        System.out.println("Đã thêm cầu thủ mới vào danh sách.");
    }

   
    public void xuatDanhSachCauThu() {
        double tongLuong = 0;
        System.out.println("Danh sách cầu thủ:");
        for (CauThu ct : danhSachCauThu) {
            System.out.printf("Số áo: %d, Họ tên: %s, Tuổi: %d, Lương thực lãnh: %.2f\n",
                              ct.getSoao(), ct.getHoten(), 2024 - ct.getNamsinh(), ct.tinhLuongThucLanh());
            tongLuong += ct.tinhLuongThucLanh();
        }
        System.out.printf("Tổng tiền lương CLB phải trả: %.2f\n", tongLuong);
    }

   
    public void timCauThuLuongCaoNhat() {
        if (danhSachCauThu.isEmpty()) {
            System.out.println("Danh sách cầu thủ trống.");
            return;
        }
        CauThu cauThuMax = Collections.max(danhSachCauThu, Comparator.comparingDouble(CauThu::tinhLuongThucLanh));
        System.out.println("Cầu thủ có lương thực lãnh cao nhất:");
        cauThuMax.hienThiThongTin();
    }

    
    public void sapXepDanhSachTheoLuong() {
        danhSachCauThu.sort(Comparator.comparingDouble(CauThu::tinhLuongThucLanh));
        System.out.println("Danh sách cầu thủ sau khi sắp xếp theo lương thực lãnh tăng dần:");
        xuatDanhSachCauThu();
    }


    public void tinhLuongCungTrungBinh() {
        if (danhSachCauThu.isEmpty()) {
            System.out.println("Danh sách cầu thủ trống.");
            return;
        }
        double tongLuongCung = 0;
        for (CauThu ct : danhSachCauThu) {
            tongLuongCung += ct.getLuongcung();
        }
        double luongCungTrungBinh = tongLuongCung / danhSachCauThu.size();
        System.out.printf("Lương cứng trung bình của các cầu thủ: %.2f\n", luongCungTrungBinh);
    }


}

