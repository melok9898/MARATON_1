package com.melih;

public class EsnekSayiDizisi {
    public int[] sayiDizisi;
    public int uzunluk;

    public EsnekSayiDizisi() {
        this.sayiDizisi = new int[100];
        this.uzunluk = 0;
    }

    public void Add(int eleman) {
        if (uzunluk == sayiDizisi.length) {
            genislet();
        }
        sayiDizisi[uzunluk++] = eleman;
    }

    public void Remove(int eleman) {
        int index = -1;
        for (int i = 0; i < uzunluk; i++) {
            if (sayiDizisi[i] == eleman) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < uzunluk - 1; i++) {
                sayiDizisi[i] = sayiDizisi[i + 1];
            }
            uzunluk--;
        }
    }

    public void AddAraya(int index, int eleman) {
        if (index >= 0 && index <= uzunluk) {
            if (uzunluk == sayiDizisi.length) {
                genislet();
            }
            for (int i = uzunluk; i > index; i--) {
                sayiDizisi[i] = sayiDizisi[i - 1];
            }
            sayiDizisi[index] = eleman;
            uzunluk++;
        } else {
            System.err.println("!!! INDEX ERROR !!!");
        }
    }

    public void genislet() {
        int yeniUzunluk = sayiDizisi.length + 1;
        int[] yeniDizi = new int[yeniUzunluk];
        for (int i = 0; i < uzunluk; i++) {
            yeniDizi[i] = sayiDizisi[i];
        }
        sayiDizisi = yeniDizi;
    }


    public String Listele() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < uzunluk; i++) {
            sb.append(sayiDizisi[i]);
            if (i < uzunluk - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
