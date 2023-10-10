package code_war.ip_adress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAdress {
    public static long ipsBetween(String start, String end){
        //getBytesIpAdress
        String BytesStart = getDecimalIpAdress(start);
        String BytesEnd = getDecimalIpAdress(end);
        //To decimal
        long decimalStart = Long.parseLong(BytesStart, 2);
        long decimalEnd = Long.parseLong(BytesEnd, 2);
        //to compare
        return decimalEnd - decimalStart;
    }

    static String getDecimalIpAdress(String value){
        InetAddress inetStart;
        StringBuilder result=new StringBuilder();
        try {
            inetStart = InetAddress.getByName(value);
            byte[] ipByteStart = inetStart.getAddress();

            for(byte b: ipByteStart){
                result.append(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return result.toString();

    }

    public static void main(String[] args) throws UnknownHostException {
        ipsBetween("0.0.0.0","255.255.255.255");
    }
}
