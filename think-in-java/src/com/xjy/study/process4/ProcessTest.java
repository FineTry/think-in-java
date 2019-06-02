package com.xjy.study.process4;

/**
 * @Description 第四章流程控制语句
 * @Author xjy
 * @Date 2019/6/2
 */
public class ProcessTest {

    public static void main(String[] args) {
//        exercises8();
        exercises9(10);
    }

    /**
     * @Description 练习题 8
     *
     * @return : void
     **/
    public static void exercises8() {
        switch (3) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("其他");
        }
    }

    /**
     * @Description 练习题 9
     *
     * @param count :
     *              接收斐波那数列个数
     * @return : void
     **/
    public static void exercises9(int count) {
        int after = 1;
        int last = 1;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (i == 0 || i == 1){
                System.out.println(1);
                continue;
            }
            sum = after + last;
            after = last;
            last = sum;
            System.out.println(sum);
        }
    }
}
