public class Main {
    public static void main(String[] args) {
        String sentence = " IMmi ";
        System.out.println(checkString(sentence));
    }

    public static boolean checkString (String sentence){
    boolean polindrom = true;
        for (int i = 0; i <sentence.length(); i++) {
            if (Character.toLowerCase(sentence.charAt(i))!=sentence.charAt(sentence.length()-i-1)&&
            (Character.toUpperCase(sentence.charAt(i))!=sentence.charAt(sentence.length()-i-1))){
                    polindrom=false;
                }
                break;
            }
        return polindrom;
    }
}