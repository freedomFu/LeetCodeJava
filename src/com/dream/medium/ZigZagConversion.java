package com.dream.medium;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String res = convert(s, numRows);
        System.out.println(res);
    }

    public static String convert(String s, int numRows) {
        List<List<String>> outList = new ArrayList<>();
        char[] cStr = s.toCharArray();
        int len=cStr.length;
        int rowNum=0, colNum=0; // 定义当前的行数和列数
        boolean flag = true; //true为行数向上发展，false为行数向下发展
        for(int i=0;i<numRows;i++){
            List<String> ltemp = new ArrayList<>();
            outList.add(ltemp);
        }
        int times = numRows+numRows-2;
        /**
         * 实际是 每 numRows+numRows-2 个循环一次
         * 每一次都要重新定义方向
         */
        for(int i=0;i<len;){
            for(int j=0;j<numRows&&i<len;j++,i++){
                outList.get(j).add(String.valueOf(cStr[i]));
            }
            int endLast = numRows-2;
            for(int j=endLast;j>0&&i<len;j--,i++){
                outList.get(j).add(String.valueOf(cStr[i]));
            }
        }
        String res = "";
        for(List<String> temp:outList){
            for(String tempStr:temp){
                res += tempStr;
            }
        }
        return res;
    }

}
