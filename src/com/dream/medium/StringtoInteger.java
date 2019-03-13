package com.dream.medium;

public class StringtoInteger {

    public static void main(String[] args) {
        String str = "    +1146905820n1";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str) {
        str = str.trim();
        if(str.equals("")){
            return 0;
        }
        char first = str.charAt(0);
        if(str.length()==1){
            if(!Character.isDigit(first)){
                return 0;
            }
        }else{
            char sec = str.charAt(1);
            if(!Character.isDigit(first)){ //首位不是数字
                if((first=='+' || first=='-')&&Character.isDigit(sec)){ //第一位是+- 第二位是数字
                }else{
                    return 0;
                }
            }
            char[] carr = str.toCharArray();
            int flag=0, end=0;
            if(carr[0]=='+' || carr[0]=='-'){
                flag=1;
            }
            for(int i=flag;i<carr.length;i++){
                if(!Character.isDigit(carr[i])){
                    end = i;
                    break;
                }
                end = i+1;
            }

            str = str.substring(0,end);
        }
        first = str.charAt(0);
        int middle = 0;
        if(first=='0'){
            for(int i=1;i<str.length();i++){
                if(str.charAt(i)!='0'){
                    middle=i;
                    break;
                }
            }
            if(middle==0){
                return 0;
            }
            str = str.substring(middle);
        }else if(first=='-'||first=='+'){
            str = str.substring(1);
            int firsts = str.charAt(0);
            if(firsts=='0'){
                for(int i=1;i<str.length();i++){
                    if(str.charAt(i)!='0'){
                        middle=i;
                        break;
                    }
                }
                if(middle==0){
                    return 0;
                }
                str = str.substring(middle);
            }
            str = first+str;
        }


        int len = String.valueOf(Integer.MAX_VALUE).length();
        long x = 0;
        if(first=='-'){
            if(str.length()>len+1){
                x = Integer.MIN_VALUE;
                return (int)x;
            }
        }else if(first=='+'){
            if(str.length()>len+1){
                x = Integer.MAX_VALUE;
                return (int)x;
            }
        }else{
            if(str.length()>len){
                x = Integer.MAX_VALUE;
                return (int)x;
            }
        }
        x = Long.parseLong(str);
        if(x>Integer.MAX_VALUE){
            x = Integer.MAX_VALUE;
        }
        if(x<Integer.MIN_VALUE){
            x = Integer.MIN_VALUE;
        }
        return (int)x;
    }
}
