package com.ztu.edu.ua.task3;

public class Main {
    public static void main(String[] args) {
        buildExample(4, 36, '+');
        System.out.println("\n-------------------\n");
        buildExample(4, 36, '-');
        System.out.println("\n-------------------\n");
        buildExample(4, 36, '*');
    }

    public static void buildExample(int n, int m, char operation) {
        StringBuilder sb = new StringBuilder();
        sb.append(n)
                .append(" ")
                .append(operation)
                .append(" ")
                .append(m)
                .append(" = ");

        int symbol;
        switch (operation) {
            case '+':
                symbol = n + m;
                break;
            case '-':
                symbol = n - m;
                break;
            case '*':
                symbol = n * m;
                break;
            default:
                sb.append("unknown symbol");
                System.out.println(sb);
                return;
        }
        sb.append(symbol);

        replaceWithInsert(sb);
        replaceWithReplace(sb);
        reverse(sb);


        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

    }

    public static void replaceWithInsert(StringBuilder original) {
        StringBuilder sb = new StringBuilder(original);
        StringBuilder sb2 = new StringBuilder();
        int index = sb.indexOf("=");
        if (index != -1) {
            sb2.append(original).append(" || ");
            sb.deleteCharAt(index).insert(index, "рівно");
            sb2.append(sb);
            System.out.println(sb2.toString());
        }
    }

    public static void replaceWithReplace(StringBuilder original) {
        StringBuilder sb = new StringBuilder(original);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(original).append(" || ");

        int index = sb.indexOf("=");
        if (index != -1) {
            sb.replace(index, index + 1, "рівно");
            sb2.append(sb);
            System.out.println(sb2.toString());
        }
    }

    public static void reverse(StringBuilder sb) {
        System.out.println(sb.reverse());
    }
}
