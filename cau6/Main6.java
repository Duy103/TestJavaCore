package cau6;

public class Main6 {
    public static void main(String[] args) {
        String file1 = "template.txt";
        String content = "My mother is a person I admire most. She devoted a lot of time and energy to the upbringing of my two brothers and 1. " +
                "Despite working hard, she always made time to teach us many useful things which are necessary and important in our later lives." +
                " Moreover, she is a good role model for me to follow." +
                " She always tries to get on well with people who live next door and help everyone when they are in difficulties, so most of them respect and love her. " +
                "I admire and look up to my mother because she not only brings me up well but also stands by me and gives some help if necessary. " +
                "For example, when I encounter some difficulties, she will give me some precious advice to help me solve those problems." +
                " She has a major influence on me and 1 hope that I will inherit some of her traits.\n";

        ReadAndWrite.writeFile(file1, content);
        System.out.println("Đã ghi nội dung vào tệp.");
    }
}
