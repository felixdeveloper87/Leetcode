public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // criar ponteiros para ler arquivo uma vez soh, assim lendo um ponteiro com o
        // outro, removendo dados invalidos e comparando
        int left = 0; // inicio da String
        int right = s.length() - 1; // final da String
        char last = s.charAt(right);
        char initial = s.charAt(left);
        System.out.println(last);
        System.out.println(initial);

        while (left < right) {
            System.out.println("letra: " + s.charAt(left) + " | letra: " + s.charAt(right));
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                System.out.print("invalid left: " + s.charAt(left));
                left++;
                System.out.println(" avanca o left ");
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                System.out.print("invalid right: " + s.charAt(right));
                right--;
                System.out.println(" avanca o right ");
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            System.out.println("Deu match:" + s.charAt(left) + " com  " + s.charAt(right));
            left++;
            right--;

        }

        return true;

    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        // System.out.println(solution.isPalindrome("Race a car! :"));
        System.out.println(solution.isPalindrome("socorram me subi no onibus em marrocos"));

    }

}
