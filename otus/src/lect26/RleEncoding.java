package lect26;

public class RleEncoding {

    public String encode(String input){

        if (input == null)
            return "";

        int count;

        String encode = "";

        for (int i = 0; i < input.length(); i++) {
            count = 1;
            while(i < input.length()-1 && input.charAt(i) == input.charAt(i+1)){
                i++;
                count++;
            }
            encode += String.valueOf(count) + input.charAt(i);
        }
        return encode;
    }
}
