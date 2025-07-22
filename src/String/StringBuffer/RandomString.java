package String.StringBuffer;

import java.util.Random;

public class RandomString {

    public static String generator(int size){

        StringBuffer sb = new StringBuffer(size);

        Random randomNum = new Random();

        for (int i=0; i<size; i++){
            int randomNumber = 97 + (int) (randomNum.nextFloat() * 26);
            sb.append((char) randomNumber);
        }

        return sb.toString();

    }

}
