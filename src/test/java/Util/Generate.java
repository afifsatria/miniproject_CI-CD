package Util;

import java.util.Random;

public class Generate {
    Random rand = new Random();

    public String randomEmail(){
        return "tama" + + rand.nextInt(1000) + "@gmail.com";
    }
}
