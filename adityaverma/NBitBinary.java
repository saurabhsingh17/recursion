package adityaverma;

import java.util.ArrayList;

class NBitBinary {
    public static void main(String[] args) {
        NBitBinary nBitBinary = new NBitBinary();
        System.out.println(nBitBinary.nBitBinary(5));
    }
    ArrayList<String> result = new ArrayList<>();
    ArrayList<String> nBitBinary(int N) {
        result.clear();
       int ones = N;
       int zeroes = N;
       String output = "";
       return solve(ones,zeroes,N,output);
    }
    
    ArrayList<String> solve(int ones, int zeroes, int N,String output){
        if(N == 0){
            result.add(output);
            return result;
        }
        if(ones != 0){
            String out1 = output;
            out1+="1";
            solve(ones-1,zeroes,N-1,out1);
        }
        if(ones<zeroes){
            String out2 = output;
            out2+="0";
            solve(ones,zeroes-1,N-1,out2);
        }
        return result;
    }
}
