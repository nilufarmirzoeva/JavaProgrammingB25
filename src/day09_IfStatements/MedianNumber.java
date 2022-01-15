package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        boolean aIsMedian= (a>b&& a<c)||(a>c && a<b);
        boolean bIsMedian= (b>c && b<a)||(b>a && b<c);
        boolean cIsMedian= !aIsMedian && !bIsMedian;

        if (aIsMedian){//if a is the median number
            System.out.println(a+"is median number");

        }

        if (bIsMedian){// if b is the median number
            System.out.println(b+"is median number");

        }
        if (cIsMedian){// if c is the median number
            System.out.println(c+"is median number");

        }


















    }
}
