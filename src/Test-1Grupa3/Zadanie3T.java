public class Zadanie3T {

    public static void main(String[] args) {

        System.out.println(delete("Cockroach", 'c'));

    }

    public static String delete(String str, char c){

        char[] srcArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < srcArr.length; i++) {
            char foundChar = isFound(srcArr[i], c);
            if (foundChar != '\0')
                sb.append(foundChar);
        }
        return sb.toString();
    }

    public static char isFound(char src, char c) {
        if (src == c) {
            return '\0';
        }
        return src;
    }

}