package baekjoon;

import java.util.Scanner;

public class q2941_secondcharat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // c= c- dz= d- lj nj s= z=
        String a = scan.next();
        int b = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == 'c') {
                if (i < a.length() - 1) {
                    if (a.charAt(i + 1) == '=') {
                        i++;
                    } else if (a.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (c == 'd') {
                if (i < a.length() - 1) {
                    if (a.charAt(i + 1) == 'z') {
                        if (i < a.length() - 2) {
                            if (a.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (a.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (c == 'l') {
                if (i < a.length() - 1) {
                    if (a.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (c == 'n') {
                if (i < a.length() - 1) {
                    if (a.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (c == 's') {
                if (i < a.length() - 1) {
                    if (a.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            } else if (c == 'z') {
                if (i < a.length() - 1) {
                    if (a.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            b++;
        }

        System.out.println(b);
    }
}
