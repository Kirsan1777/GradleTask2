package by.nikita.gradle;

import by.nikita.jar.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str){
        int count = 0;
        for(String number : str){
            if(!StringUtils.isPositiveNumber(number)){
                count++;
            }
        }
        return count==0;
    }

}
