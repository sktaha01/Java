package com.Taha.CoreJava.Datatypes.Assignment;

import java.util.Scanner;

public class Star {

    public static void main(String[] args){

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Name:");
            String name = sc.nextLine().toLowerCase();
            System.out.println("Your Star com.Taha.CoreJava.Datatypes.Assignment.Pattern!");


            int i =0;
            while(i<name.length()) {
                char name1 = name.charAt(i);
                i=i+1;
                switch (name1) {
                    case 'a':
                        System.out.print(" " + "**\n");
                        System.out.println("*" + "  " + "*");
                        System.out.println("****");
                        System.out.println("*" + "  " + "*");
                        System.out.println("*" + "  " + "*");
                        break;

                    case 'b':
                        System.out.println("****");
                        System.out.println("*" + "   " + "*");
                        System.out.println("****");
                        System.out.println("*" + "   " + "*");
                        System.out.println("****");
                        break;

                    case 'c':
                        System.out.println(" " + "***");
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println(" " + "***");
                        break;

                    case 'd':
                        System.out.println("***");
                        System.out.println("*" + "   " + "*");
                        System.out.println("*" + "   " + "*");
                        System.out.println("*" + "   " + "*");
                        System.out.println("***");
                        break;

                    case 'e':
                        System.out.println("****");
                        System.out.println("*");
                        System.out.println("****");
                        System.out.println("*");
                        System.out.println("****");
                        break;

                    case 'f':
                        System.out.println("****");
                        System.out.println("*");
                        System.out.println("****");
                        System.out.println("*");
                        System.out.println("*");
                        break;

                    case 'g':
                        System.out.println(" " + "****");
                        System.out.println("*" + "    " + "*" + " ");
                        System.out.println("*");
                        System.out.println("*" + "   " + "*****");
                        System.out.println("*" + "    " + "*" + "  " + "*");
                        System.out.println(" " + "****");
                        break;

                    case 'h':
                        System.out.println("*" + "   " + "*");
                        System.out.println("*" + "   " + "*");
                        System.out.println("*****");
                        System.out.println("*" + "   " + "*");
                        System.out.println("*" + "   " + "*");
                        break;

                    case 'i':
                        System.out.println("*****");
                        System.out.println("  " + "*" + "  ");
                        System.out.println("  " + "*" + "  ");
                        System.out.println("  " + "*" + "  ");
                        System.out.println("*****");
                        break;

                    case 'j':
                        System.out.println("*******");
                        System.out.println("   " + "*" + "  ");
                        System.out.println("*  " + "*" + "  ");
                        System.out.println(" " + "*" + " " + "*");
                        break;

                    case 'k':
                        System.out.println("*" + "   " + "*");
                        System.out.println("*" + "  " + "*");
                        System.out.println("*" + " " + "*");
                        System.out.println("**");
                        System.out.println("*" + " " + "*");
                        System.out.println("*" + "  " + "*");
                        System.out.println("*" + "   " + "*");
                        break;

                    case 'l':
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("*****");
                        break;

                    case 'm':
                        System.out.println("**" + "     " + "**");
                        System.out.println("*" + " " + "*" + "   " + "*" + " " + "*");
                        System.out.println("*   " + "*" + "   *");
                        System.out.println("*" + "       " + "*");
                        System.out.println("*" + "       " + "*");
                        break;

                    case 'n':
                        System.out.println("*" + "      " + " *");
                        System.out.println("*" + " " + "*" + "    " + " " + "*");
                        System.out.println("*   " + "*" + "   *");
                        System.out.println("*" + "     " + "*" + " " + "*");
                        System.out.println("*" + "       " + "*");
                        break;

                    case 'o':
                        System.out.println(" " + "****");
                        System.out.println("*" + "    " + "*");
                        System.out.println("*" + "    " + "*");
                        System.out.println("*" + "    " + "*");
                        System.out.println(" " + "****");
                        break;

                    case 'p':
                        System.out.println("****");
                        System.out.println("*" + "   " + "*");
                        System.out.println("****");
                        System.out.println("*");
                        System.out.println("*");
                        break;

                    case 'q':
                        System.out.println("  " + "*****");
                        System.out.println("*" + "        " + "*");
                        System.out.println("*" + "   " + "*" + "    " + "*");
                        System.out.println("*" + "     " + "*" + "  *");
                        System.out.println("  " + "******");
                        System.out.println("        " + "*");
                        break;

                    case 'r':
                        System.out.println("****");
                        System.out.println("*" + "   " + "*");
                        System.out.println("****");
                        System.out.println("*" + "   " + "*");
                        System.out.println("*" + "    " + "*");
                        break;

                    case 's':
                        System.out.println(" " + "****");
                        System.out.println("*");
                        System.out.println(" " + "****");
                        System.out.println("     " + "*");
                        System.out.println(" ****" + " ");
                        break;

                    case 't':
                        System.out.println("*******");
                        System.out.println("   " + "*" + "  ");
                        System.out.println("   " + "*" + "  ");
                        System.out.println("   " + "*" + "  ");
                        System.out.println("   " + "*" + "  ");
                        break;

                    case 'u':
                        System.out.println("*" + "     " + "*");
                        System.out.println("*" + "     " + "*");
                        System.out.println("*" + "     " + "*");
                        System.out.println("*" + "     " + "*");
                        System.out.println(" " + "*****");
                        break;

                    case 'v':
                        System.out.println("*" + "       " + "*");
                        System.out.println(" *" + "     " + "* ");
                        System.out.println("  *" + "   " + "*  ");
                        System.out.println("   * *");
                        System.out.println("    *");
                        break;

                    case 'w':
                        System.out.println("*    *    *");
                        System.out.println("*   * *   *");
                        System.out.println("*  *   *  *");
                        System.out.println("* *     * *");
                        System.out.println("*         *");
                        break;

                    case 'x':
                        System.out.println("*     *");
                        System.out.println(" *   * ");
                        System.out.println("  * *  ");
                        System.out.println("   *");
                        System.out.println("  * *  ");
                        System.out.println(" *   * ");
                        System.out.println("*     *");
                        break;

                    case 'y':
                        System.out.println("*     *");
                        System.out.println(" *   * ");
                        System.out.println("  * *  ");
                        System.out.println("   *   ");
                        System.out.println("   *");
                        System.out.println("   *");
                        break;

                    case 'z':
                        System.out.println("******");
                        System.out.println("    *");
                        System.out.println("   *");
                        System.out.println(" *");
                        System.out.println("******");
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }
        }
    }

}
