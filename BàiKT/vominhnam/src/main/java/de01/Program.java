/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package de01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        QLCauThu qlCauThu = new QLCauThu();
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("----- MENU -----");
            System.out.println("1. Xuất danh sách cầu thủ");
            System.out.println("2. Thêm cầu thủ mới");
            System.out.println("3. Tìm cầu thủ có lương thực lãnh cao nhất");
            System.out.println("4. Sắp xếp danh sách cầu thủ theo lương thực lãnh");
            System.out.println("5. Tính lương cứng trung bình");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng (1-6): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    qlCauThu.xuatDanhSachCauThu();
                    break;
                
                case 2:
                    
                    System.out.print("Nhập số áo: ");
                    int soao = sc.nextInt();
                    sc.nextLine(); // Đọc dòng còn lại
                    
                    System.out.print("Nhập họ tên: ");
                    String hoten = sc.nextLine();
                    
                    System.out.print("Nhập năm sinh: ");
                    int namsinh = sc.nextInt();
                    
                    System.out.print("Nhập lương cứng: ");
                    double luongcung = sc.nextDouble();
                    
                    System.out.print("Nhập tiền thưởng: ");
                    double tienthuong = sc.nextDouble();
                    
                    System.out.print("Nhập tiền phạt: ");
                    double tienphat = sc.nextDouble();
                    
                    CauThu newPlayer = new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat);
                    qlCauThu.themCauThu(newPlayer);
                    break;

                case 3:
                    qlCauThu.timCauThuLuongCaoNhat();
                    break;

                case 4:
                    qlCauThu.sapXepDanhSachTheoLuong();
                    break;

                case 5:
                    qlCauThu.tinhLuongCungTrungBinh();
                    break;

                case 6:
                    System.out.println("Thoát chương trình.");
                    continueRunning = false;
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
    }

