public class Main {

    public static boolean parenthesesCheck(String str){
        int a = 0;
        int b = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i, i+1).equals("(")){
                a++;
            }
            else if(str.substring(i, i+1).equals(")")){
                b++;
            }
        }
        if(a != b){
            return false;
        }

        return true;
    }


    // 2. reverseInteger
    public static String reverseInteger(int num) {
        String str = "" + num;
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }


    // 3. encryptThis
    public static String encryptThis(String text) {
        String[] words = text.split(" ");
        String encryptedMessage = "";

        for (String word : words) {
            String encryptedWord = Integer.toString((int) word.charAt(0));

            if (word.length() > 2) {
                encryptedWord += word.charAt(word.length() - 1);
                encryptedWord += word.substring(2, word.length() - 1);
                encryptedWord += word.charAt(1);
            } else if (word.length() == 2) {
                encryptedWord += word.charAt(1);
            }

            encryptedMessage += encryptedWord + " ";
        }

        return encryptedMessage.trim();
    }
    // 4. decipherThis
    public static String decipherThis(String text) {
        String[] words = text.split(" ");
        String decryptedMessage = "";

        for (String word : words) {
            int index = 0;
            while (index < word.length() && Character.isDigit(word.charAt(index))) {
                index++;
            }
            int asciiValue = Integer.parseInt(word.substring(0, index));
            char firstChar = (char) asciiValue;
            String decryptedWord = firstChar + word.substring(index);
            if (decryptedWord.length() > 2) {
                char secondChar = decryptedWord.charAt(1);
                char lastChar = decryptedWord.charAt(decryptedWord.length() - 1);
                decryptedWord = firstChar + "" + lastChar + decryptedWord.substring(2, decryptedWord.length() - 1) + secondChar;
            }
            decryptedMessage += decryptedWord + " ";
        }
        return decryptedMessage.trim();
    }

}