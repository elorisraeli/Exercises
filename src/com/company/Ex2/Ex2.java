package com.company.Ex2;

public class Ex2 {

    public static int[][] rgb2gray(int[][][] img) {
        int[][] R = img[0];
        int[][] B = img[1];
        int[][] G = img[2];
        int[][] grey = new int[R.length][R[0].length];
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[0].length; j++) {
                grey[i][j] = ((int) ((0.3 * R[i][j]) + (0.59 * G[i][j]) + (0.11 * B[i][j]))) * 255;
            }
        }
        return grey;
    }

    public static int[][][] crop(int[][][] img, int i_1, int j_1, int i_2, int j_2) {
        int h_crop = i_2 - i_1;
        int w_crop = j_2 - j_1;
        int[][][] crop_img = new int[img.length][h_crop][w_crop];
        for (int x = 0; x < crop_img.length; x++) {
            for (int i = 0; i < h_crop; i++) {
                for (int j = 0; j < w_crop; j++) {
                    crop_img[x][i][j] = img[x][i_1 + i][j_1 + j];
                }
            }
        }
        return crop_img;
    }

    public static int[][][] Smooth(int[][][] img, int n) {
        int[][][] smooth_img = new int[img.length][img[0].length][img[0][0].length];
        for (int x = 0; x < img.length; x++) {
            for (int i = 0; i < img[x].length; i++) {
                for (int j = 0; j < img[x][0].length; j++) {
                    smooth_img[x][i][j] = crop_average(img[x], i - n, j - n, i + n, j + n);
                }
            }
        }
        return smooth_img;
    }

    public static int crop_average(int[][] mini_img, int i_start, int j_start, int i_end, int j_end) {
        if (i_start < 0) i_start = 0;
        if (j_start < 0) j_start = 0;
        if (i_end > mini_img.length) i_end = mini_img.length - 1;
        if (j_end > mini_img[0].length) j_end = mini_img[0].length - 1;
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < i_end - i_start; i++) {
            for (int j = 0; j < j_end - j_start; j++) {
                sum += mini_img[i_start + i][j_start + j];
                counter++;
            }
        }
        return sum / counter;
    }

    public static int[][][] rotate_alpha(int[][][] img, double alpha) {
        int[][][] rotate_img = new int[img.length][img[0].length][img[0][0].length];
        int i_new;
        int j_new;
        int middle_i = (img[0].length) / 2;
        int middle_j = (img[0][0].length) / 2;
        for (int x = 0; x < img.length; x++) {
            for (int i = 0; i < img[0].length; i++) {
                for (int j = 0; j < img[0][0].length; j++) {
                    i_new = (int) ((Math.cos(Math.toRadians(alpha)) * (i - middle_i)) - (Math.sin(Math.toRadians(alpha)) * (j - middle_j))) + middle_i;
                    j_new = (int) ((Math.sin(Math.toRadians(alpha)) * (i - middle_i)) + (Math.cos(Math.toRadians(alpha)) * (j - middle_j))) + middle_j;
                    if (0 < i_new && i_new < img[0].length - 1 && 0 < j_new && j_new < img[0][0].length - 1) {
                        rotate_img[x][i_new][j_new] = img[x][i][j];
                    }
                }
            }
        }
        return rotate_img;
    }

    public static int[][] scaleImg(double factor_h, double factor_w, int[][] im) {
        int h_new = (int) (im.length * factor_h);
        int w_new = (int) (im[0].length * factor_w);
        int[][] img_2d = new int[h_new][w_new];
        for (int i = 0; i < img_2d.length; i++) {
            for (int j = 0; j < img_2d[0].length; j++) {
                img_2d[i][j] = im[(int) (i / factor_h)][(int) (j / factor_w)];
            }
        }
        return img_2d;
    }

}
