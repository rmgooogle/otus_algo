package lect26;

public class RleEncodeDecode {
    public String encode(String input) {
        if (input == null) return "";

        int count;

        String encode = "";
        for (int i = 0; i < input.length(); i++) {
            count = 1;
            while (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                i++;
                count++;
                if (count == 255) {
                    encode += String.valueOf(count) + input.charAt(i);

                    count = 0;
                }
            }
            encode += String.valueOf(count) + input.charAt(i);
        }
        return encode;
    }

    public String decode(String input) {
        int count = 0;
        StringBuilder decode = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                count = count * 10 + c - '0';
            } else {
                while (count > 0) {
                    decode.append(c);
                    count--;
                }
            }

        }
        return decode.toString();
    }
}
