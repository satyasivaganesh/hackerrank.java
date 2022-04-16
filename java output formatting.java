public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int l=s1.length();
                //System.out.print(s1);
                /*for(int j=0;j<(15-l);j++)
                {
                    System.out.print(" ");
                }*/
                System.out.printf("%-15s%03d\n",s1,x);
            }
            System.out.println("================================");

    }
}
