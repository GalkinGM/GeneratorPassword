package sample;

import java.util.Random;

public class MyPassword {

    public StringBuilder MyPassword(Integer length, boolean wordBig, boolean wordSmall, boolean numbers, boolean characters){
        Random random = new Random();
        String charWordBig = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String charWordSmall = "abcdefghijklmnopqrstuvwxyz";
        String number = "1234567890";
        String character = "!@#$%^&";
        StringBuilder sb = new StringBuilder(length);
        StringBuilder passWord = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            if (wordBig)        {sb.append(charWordBig.charAt(random.nextInt(charWordBig.length())));}
            if (wordSmall)      {sb.append(charWordSmall.charAt(random.nextInt(charWordSmall.length())));}
            if (numbers)        {sb.append(number.charAt(random.nextInt(number.length())));}
            if (characters)     {sb.append(character.charAt(random.nextInt(character.length())));}
        }

        for (int i = 0; i < length; i++) {
            passWord.append(sb.charAt(random.nextInt(sb.length())));
        }

        System.out.printf("YOUR PASSWORD: %s", passWord);

        return passWord;

    }

}




