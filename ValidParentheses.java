import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        // Cria uma pilha para armazenar os caracteres de abertura
        Stack<Character> stack = new Stack<>();
        char[] stack2 = new char[s.length()];

        // Percorre cada caractere da string
        for (char c : s.toCharArray()) {

            // Se o caractere for um parêntese de abertura, empilha
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Ex: empilha '('
                System.out.println("Caractere de abertura: " + c);
                System.out.println("Pilha: " + stack);

            } else {
                System.out.println("Caractere de fechamento: " + c);
                // Aqui o caractere é de fechamento: ')', '}', ou ']'

                // Verifica se a pilha está vazia. Isso significa que
                // apareceu um fechamento sem nenhum caractere de abertura antes
                if (stack.isEmpty())
                    return false;

                // Pega o último caractere aberto (do topo da pilha)
                System.out.println("topo da pilha: " + stack.peek());
                char top = stack.pop();
                System.out.println(stack);

                // Verifica se o par está correto: ex: '(' deve casar com ')'
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false; // Fechamento não bate com abertura
                }
            }
        }

        // No final, a pilha deve estar vazia (todos os pares foram fechados
        // corretamente)
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParentheses solution = new ValidParentheses();

        // System.out.println(solution.isValid("()")); // true
        // System.out.println(solution.isValid("()[]{}")); // true
        // System.out.println(solution.isValid("(]")); // false
        System.out.println(solution.isValid("([])")); // true
        // System.out.println(solution.isValid("([{])(")); // false
        // System.out.println(solution.isValid("({[]})")); // true

    }
}
