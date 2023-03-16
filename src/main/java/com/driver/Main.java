package com.driver;

public class Main {
    public static void main(String[] args)
    {
        Product p =new Product();
        int ans = p.product(5,6);
        System.out.println(ans);

        int ans1 = p.product(5,6,7);
        System.out.println(ans1);

        double ans2 = p.product(6.9,8.9);
        System.out.println(ans2);


    }
    public static class Product{
        public int product(int x,int y)
        {
            return x*y;
        }
        public int product(int x,int y,int z)
        {
            return x*y*z;
        }
        public double product(double x,double y)
        {
            return x*y;
        }
    }

}