package com.company.shiraEx;

public class Ex2 {
    public static int[][] rgb2gray(int[][][] img) {
        int[][] gray = new int[img[0].length - 1][img[0][0].length - 1];
        for (int i = 0; i < gray.length; i++) {
            for (int j = 0; j < gray[0].length; j++) {
                gray[i][j] = (int) ((0.3 * img[0][i][j]) + (0.59 * img[1][i][j]) + (0.11 * img[2][i][j])) * 255;
            }
        }
        return gray;
    }

    public static int[][][] crop(int[][][] img, int i_1, int j_1, int i_2, int j_2) {
        int[][][] arr = new int[3][(i_2) - (i_1) + 1][(j_2) - (j_1) + 1];
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < (i_2) - (i_1); i2++) {
                for (int i3 = 0; i3 < (j_2) - (j_1); i3++) {
                    arr[i][i2][i3] = img[i][i_1+i2][j_1+i3];
                }
            }
        }
        return arr;
    }

    public static int[][][] Smooth(int[][][] img, int n) {
        int [][][]arr = new int[3][img[0].length][img[0][0].length];
        for (int i1=0; i1<3; i1++){
            for (int i2=0; i2<arr[0].length; i2++){
                for (int i3=0; i3<arr[0][0].length; i3++){
                    arr[i1][i2][i3] = av(img[i1], i2, i3, n);
                }
            }
        }
        return arr;
    }
    public static int av(int[][]arr, int a, int b, int c){
        int sum1 = 0;
        int sum2 = 0;
        for (int i=Math.max(a-c, 0); i<Math.min(a+c, arr.length-1); i++){
            for (int j=Math.max(b-c, 0); j<Math.min(b+c, arr[i].length-1); j++){
                sum1 = sum1 + arr[i][j];
                sum2++;
            }
        }
        return sum1/sum2;
    }

    public static int[][][] rotate_alpha(int[][][] img, double alpha) {
        int[][][] arr = new int[img.length][img[0].length][img[0][0].length];
        int a1,a2;
        double cos, sin;
        int m1 = (img[0].length) / 2;
        int m2 = (img[0][0].length) / 2;
        for (int i1 = 0; i1 < img.length; i1++)
        {
            for (int i2 = 0; i2 < img[0].length; i2++)
            {
                for (int i3 = 0; i3 < img[0][0].length; i3++)
                {
                    cos = Math.cos(Math.toRadians(alpha));
                    sin = Math.sin(Math.toRadians(alpha));
                    a1 = (int) ((cos * (i2 - m1)) - (sin * (i3 - m2))) + m1;
                    a2 = (int) ((sin * (i2 - m1)) + (cos * (i3 - m2))) + m2;
                    if ((0 < a1) && (a1 < img[0].length - 1) && (0 < a2) && (a2 < img[0][0].length - 1))
                    {
                        arr[i1][a1][a2] = img[i1][i2][i3];
                    }
                }
            }
        }
        return arr;
    }

    public static int[][] scaleImg(double factor_h, double factor_w, int[][] im) {
        int a1 = (int) (im.length * factor_h);
        int a2 = (int) (im[0].length * factor_w);
        int[][] arr = new int[a1][a2];
        for (int i1 = 0; i1 < arr.length; i1++) {
            for (int i2 = 0; i2 < arr[0].length; i2++) {
                arr[i1][i2] = im[(int) (i1 / factor_h)][(int) (i2 / factor_w)];
            }
        }
        return arr;
    }

}
