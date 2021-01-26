import java.util.Scanner;

public class HomeWork1 {
    int year,month,day,r=0;
    int [] a = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        HomeWork1 a = new HomeWork1();
        a.date();
    }
       public void date(){
            System.out.println("输入年份");
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();
            System.out.println("输入月份");
            Scanner s = new Scanner(System.in);
            month = s.nextInt();
            System.out.println("输入日期");
            Scanner c = new Scanner(System.in);
            day = c.nextInt();
            r = (year-2000) * 365;
            for (int i = 2000; i <year; i++) {
                if(i%4 == 0 && i%100!=0 || i%400 == 0)
                    r++;
            }
            if(month>2) {
                for (int i = 0; i < (month - 1); i++) {
                    r = r + a[i];
                }
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    r++;
            }
            else if(month == 2)
                r = r + 31;
             r = r + day;
             switch ((r - 1)%7) {
                 case 0:
                     System.out.println("今天是星期六");
                     break;
                 case 1:
                     System.out.println("今天是星期日");
                     break;
                 case 2:
                     System.out.println("今天是星期一");
                     break;
                 case 3:
                     System.out.println("今天是星期二");
                     break;
                 case 4:
                     System.out.println("今天是星期三");
                     break;
                 case 5:
                     System.out.println("今天是星期四");
                     break;
                 case 6:
                     System.out.println("今天是星期五");
                     break;
             }
        }
    }