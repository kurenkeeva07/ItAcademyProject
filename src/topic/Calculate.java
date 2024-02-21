package topic;

public class Calculate {
    public static void main(String[] args){
         int b = 2;
         int c = 4;
         int d = 6;
         double a = 100 - (((b + c) * 2 * 3 -10) / (2 * (4 + d))) * d;
         System.out.println(a);

         int var1 = 5;
         int var2 = 10;
         int var3 = 15;
         int var4 = 20;
         int var5 = 25;
         int var6 = 30;
         int var7 = 35;
         int var8 = 40;
         int var9 = 45;
         int var10 = 50;
         int var11 = 55;
         int var12 = 60;

         var1++;
         var2--;
         var3 +=var4;
         var5 -=var6;
         var7 *=var8;
         var9 /=var10;
         var11 %=var12;

         System.out.print(var1 + "\n" + var2 + "\n" + var3 + "\n" + var5 + "\n" + var7 + "\n" + var9 + "\n" + var11);

         float dd1 = 10 / 3.f;
         System.out.println(dd1);
         System.out.printf("%.2f \n", dd1);
         float dd2 = 27 / 4.f;
         System.out.println(dd1);
         float dd3 = 1 / 8.f;
         System.out.printf("%.3f \n", dd3);
         System.out.printf("%.2f \n", dd3);

         //double num1 = 13-2;
        //double num2 = 1 + 1;
         double sqrt = Math.sqrt(144);
         double pow = Math.pow(12, 2);
         System.out.println(sqrt);
         System.out.println(pow);
















    }
}