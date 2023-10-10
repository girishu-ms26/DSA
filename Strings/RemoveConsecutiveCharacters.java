package Strings;

public class RemoveConsecutiveCharacters {
    public static void main(String[]args){
        String A = "lfoajnippckfilmebjffjdacopakmhfbfagnoekojnaieolalehfdonhlpomflkcjhbkmknnciaehfbgliklmjhfmpmjpgcghcnkjfgcmbhcinljcncbmmhedboffhnnogmhfehdcfhlidohlffppmjccafimiigngfbmcdphcdgghcalijlnhmhpkoaogodmpoofpfdbdnakhkdkmekioemmbnaifbjddcgeheoehfefcjjnjmhdpfapgeifgdelgnghkhcjlfbajbldlnnpciofpplkididngalglikambfgpbojioamkaflmecccbpffchepgahbfhnfmnhlkhkfllniacehdmpfdklokdphjgmcgpfaajlkieojhffipeegjodcmfcbnmgfpenhfembheleahdgfiplbobifeimamepfeclbokjpklanpaanaiidmnaiploieogbpdfnokpjflknhjfcbgcfojiokjfohmkjdbmcceanjanhbcdocglbkgjaefejaejimpkidejkihjiedhghmoilofcijfoabnkcbjjbbahlpnigppkoniccjlclhgnpfaobmkfclijllafie";
        int B = 1;
        System.out.println(solve(A,B));
    }

    public static String solve(String A,int B) {
        String consec = "";
        String ans ="";
        for(int i=0;i<A.length();i++){
            char c = A.charAt(i);
            if(consec.length() == 0) {
                consec += c;
            }
            else if(c == consec.charAt(0)) consec+=c;
            else {
                if(consec.length() == B){
                    consec = "";
                    consec =  String.valueOf(c);
                }
                else{
                    ans+= consec;
                    consec = "";
                    consec =  String.valueOf(c);
                }
            }
        }

        char c = A.charAt(A.length()-1);
        if(consec.length() == B){
            consec = "";
            consec =  String.valueOf(c);
        }
        else{
            ans+= consec;
            consec = "";
            consec =  String.valueOf(c);
        }

        return ans;
    }
}
