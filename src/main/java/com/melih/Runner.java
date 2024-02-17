package com.melih;

public class Runner {
    public static void main(String[] args) {
        EsnekSayiDizisi yenidizi = new EsnekSayiDizisi();

        yenidizi.Add(5);
        yenidizi.Add(10);
        yenidizi.Add(11);

        System.out.println(yenidizi.Listele());

        yenidizi.Remove(5);
        System.out.println(yenidizi.Listele());

        yenidizi.AddAraya(1,100);
        System.out.println(yenidizi.Listele());


    }
}
