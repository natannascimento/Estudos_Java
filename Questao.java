public class Questao {
    static void main(String[] args) {
        // char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};

        // String str = new String(chars,1,3);
        // System.out.println(str);
        // char ch [] = {'T', 'e', 'l', 'u', 's', 'k', 'o'};

        // String str1 = new String(ch);
        // String str2 = new String(str1);

        // System.out.println(str1);
        // System.out.println(str2);
        StringBuffer sb = new StringBuffer("Java Code");

        System.out.println(sb.capacity());

        sb.trimToSize();

        System.out.println(sb.capacity());

    }
}
