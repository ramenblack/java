import java.math.BigInteger;
public class BigLong {
  public static void main (String[] a) {
      long n = Long.valueOf(a[0]);
      System.out.Println(n);
        BigInteger factor=new BigInteger("1");
        for(long i=2; i<=n;1++){
            factor=factor.multiply(BigInteger.valueOf(i));
          }
          System.out.println(factor);
          }
        }
