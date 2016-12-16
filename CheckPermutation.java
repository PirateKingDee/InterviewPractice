/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author andyliang
 */
public class CheckPermutation {
    public static void main(String [] args){
        String str1 = "ttssee";
        String str2 = "estest";
        System.out.println(isPermutation2(str1, str2));
        
        
    }
    static String sortString(String str){
        char[] contents = str.toCharArray();
        java.util.Arrays.sort(contents);
        return new String(contents);
    }
    static boolean isPermutation(String str1, String str2){
        if(str1.equals(str2)){
            return true;
        }
        else return false;
    }
    //another way to check permutation

    static boolean isPermutation2(String str1, String str2){
    	if(str1.length()!=str2.length()) return false;

    	int val[] = new int[128];
    	for(int i=0; i<str1.length(); i++){
    		val[str1.charAt(i)]++;
    	}
    	for(int i=0; i<str2.length(); i++){
    		val[str2.charAt(i)]--;
    		if(val[str2.charAt(i)]<0) return false;
    	}
    	return true;
    }
}

