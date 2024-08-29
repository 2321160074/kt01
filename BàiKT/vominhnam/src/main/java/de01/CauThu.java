/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

/**
 *
 * @author ADMIN
 */

public class CauThu {
    public int soao;
    public String hoten;
    public int namsinh;
    public double luongcung;
    public double tienthuong;
    public double tienphat;

    public CauThu() {
        this.soao = 0;
        this.hoten = "";
        this.namsinh = 0;
        this.luongcung = 0.0;
        this.tienthuong = 0.0;
        this.tienphat = 0.0;
    }

    public CauThu(int soao, String hoten, int namsinh, double luongcung, double tienthuong, double tienphat) {
        this.soao = soao;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.luongcung = luongcung;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
    }


    public int getSoao() {
        return soao;
    }

    public void setSoao(int soao) {
        this.soao = soao;
    }


    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }


    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

  
    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }


    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

  
    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }


    public double tinhLuongThucLanh() {
        return luongcung + tienthuong - tienphat;
    }


    public void hienThiThongTin() {
        System.out.println("Số áo: " + soao);
        System.out.println("Họ tên: " + hoten);
        System.out.println("Năm sinh: " + namsinh);
        System.out.println("Lương cứng: " + luongcung);
        System.out.println("Tiền thưởng: " + tienthuong);
        System.out.println("Tiền phạt: " + tienphat);
        System.out.println("Lương thực lãnh: " + tinhLuongThucLanh());
    }
}

