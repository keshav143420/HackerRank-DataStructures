import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int s=0,e=n-1; s<=e; s++){
            arr[s] = in.nextInt();
        }
        for(int s=n-1,e=0; s>=e; s--){
            System.out.print(arr[s] + " ");
        }
    }
}

/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        String s = "";
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            s =  Integer.toString(arr[arr_i]) + " " + s ;
        }
        System.out.println(s);
    }
}
*/