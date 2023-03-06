package lab1;


import java.util.Scanner;

public class Exercise1 {

    public static void Sum(int re1,int im1,int re2,int im2){
        int reNew;
        int imNew;

        reNew = re1+re2;
        imNew = im1+im2;
        if(imNew<0) {
            System.out.println(String.valueOf(reNew) + imNew + "i");
        }
        else{
            System.out.println(String.valueOf(reNew) + "+" + imNew + "i");
        }
    }

    public static void Product(int re1,int im1,int re2,int im2){
        int reNew;
        int imNew;
        reNew = re1*re2;
        imNew = im1*im2;
        if(imNew<0) {
            System.out.println(String.valueOf(reNew) + imNew + "i");
        }
        else{
            System.out.println(String.valueOf(reNew) + "+" + imNew + "i");
        }
    }




    public static void main(String[] args) {
        int re1;
        int im1;
        int re2;
        int im2;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the real part for the first number");
        re1 = in.nextInt();
        System.out.println("Insert the imaginary part for the first number");
        im1 = in.nextInt();
        System.out.println("Insert the real part for the second number");
        re2 = in.nextInt();
        System.out.println("Insert the imaginary part for the second number");
        im2 = in.nextInt();
        Sum(re1,im1,re2,im2);
        Product(re1,im1,re2,im2);
    }
}

