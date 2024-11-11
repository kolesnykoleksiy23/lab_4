package com.ztu.edu.ua.task2;

public class Main {
    public static void main(String[] args) {
        String text = "I learn Java!!!";

        displayLastCharacter(text);
        checkEndsWith(text, "!!!");
        checkStartsWith(text, "I learn");
        checkContains(text, "Java");
        replaceAWithO(text);
        findSubstringPosition(text, "Java");
        convertToUpperCase(text);
        convertToLowerCase(text);
        removeSubstring(text, "Java");
    }


    public static void displayLastCharacter(String string) {
        char lastCharacter = string.charAt(string.length() - 1);
        System.out.println("The last character is: " + lastCharacter);
    }

    public static void checkEndsWith(String string, String suffix) {
        if (string.endsWith(suffix)) {
            System.out.println("The string ends with \"" + suffix + "\"");
        } else {
            System.out.println("The string does NOT end with \"" + suffix + "\"");
        }
    }

    public static void checkStartsWith(String string, String prefix) {
        if (string.startsWith(prefix)) {
            System.out.println("The string starts with \"" + prefix + "\"");
        } else {
            System.out.println("The string does NOT start with \"" + prefix + "\"");
        }
    }

    public static void checkContains(String string, String substring) {
        if (string.contains(substring)) {
            System.out.println("The string contains \"" + substring + "\"");
        } else {
            System.out.println("The string does NOT contain \"" + substring + "\"");
        }
    }

    public static void replaceAWithO(String string) {
        String modifiedText = string.replace('a', 'o');
        System.out.println("Modified text: " + modifiedText);
    }

    public static void findSubstringPosition(String string, String substring) {
        int position = string.indexOf(substring);
        if (position != -1) {
            System.out.println("The position of \"" + substring + "\" in the string is: " + position);
        } else {
            System.out.println("The substring \"" + substring + "\" is not found in the string.");
        }
    }

    public static void convertToUpperCase(String string) {
        System.out.println(string.toUpperCase());
    }

    public static void convertToLowerCase(String string) {
        System.out.println(string.toLowerCase());
    }

    public static void removeSubstring(String string, String substring) {
        if (string.contains(substring)) {
            String modifiedText = string.replace(substring, "");
            System.out.println("Modified text: " + modifiedText);
        } else {
            System.out.println("The substring \"" + substring + "\" is not present in the string.");
        }
    }
}
