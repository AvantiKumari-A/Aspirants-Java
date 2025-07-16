public class IsValidParantheses {
    public static void main(String[] args) {
        String s = "({[]})";
        while (true) {
            boolean found = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if ((s.charAt(i) == '(' && s.charAt(i + 1) == ')') ||
                    (s.charAt(i) == '{' && s.charAt(i + 1) == '}') ||
                    (s.charAt(i) == '[' && s.charAt(i + 1) == ']')) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    found = true;
                    break;
                }
            }
            if (!found) break;
        }
        if (s.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
