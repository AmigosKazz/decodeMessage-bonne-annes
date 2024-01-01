public class Main {
    public static void main(String[] args) {
        System.out.println("Message décodé : " +
                decodeMessage("Erqqh#dqqìh#ã#wrxv#phv#dplv#hw#pd#idplooh1#Phufl#g*íwuh#wrxm" +
                        "rxuv#oã#srxu#prl#gdqv#ohv#prphqwv#gh#erqkhxu#hw#gh#pdokhxu1", 3));
    }

    public static String decodeMessage(String codedMessage, int shift) {
        StringBuilder decodedMessage = new StringBuilder();
        for (char c : codedMessage.toCharArray()) {
            decodedMessage.append((char) (c - shift));
        }
        return decodedMessage.toString();
    }
}