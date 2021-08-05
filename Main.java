class Main
{
   public static void main(String args[])
{
     System.out.println("Welcome");
     System.out.println("Is number prime ? "+isPrime(7));
}
public static int isPrime(int num)
 {
    for(int i=2;i<num/2;i++)
  {
        if(num%i==0)
         {
            return false;
            break;
              }
   }
    return true;
 }
}