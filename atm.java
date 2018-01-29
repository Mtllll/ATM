package ATM.COM;

import java.util.Scanner;

/**
 * Created by ttc on 18-1-2.
 */
public class atm {
    card arr[]=new card[200];
 card  currentCard;


    //让ATM识别这张卡.
    int index=0;
    public  void addcard(card a){
        arr[index++]=a;
    }


    //插卡
    public void inputCard(){
        Scanner c=new Scanner(System.in);
        System.out.println("请输入你的卡号");
        String cardno=c.next();
        System.out.println("请输入你的密码");
        String password=c.next();
        card currentCard=check(cardno,password);
        if(currentCard!=null){
            print(currentCard);
        }
        else{
            System.out.println("账号密码错误");
        }
    }
    public card check(String cardno,String password)
    {
        for(int i=0;i<index;i++)
        {
            if(cardno.equals(arr[i].getCardno())
                    &&password.equals(arr[i].getPassword()))
            {
                return arr[i];
            }
        }
        return null;
    }
    public void print(card currentCard)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("----------------------");
            System.out.println("欢迎使用睿道java25出品的模拟ATM程序.");
            System.out.println("----------------------");


            System.out.println(" 1.>取款.");
            System.out.println(" 2.>存款.");
            System.out.println("3.>查询信息.");
            System.out.println("4.>退出系统.");
            int command = scanner.nextInt();
            switch (command)
            {
                case 1:
                {
                    System.out.println("请输入取款金额");
                    double value = scanner.nextDouble();
                    currentCard.takeValues(value);
                    break;
                }
                case 2:
                {
                    System.out.println("请输入存款金额");
                    double value = scanner.nextDouble();
                    currentCard.saveValues(value);
                    break;
                }
                case 3:
                {
                    System.out.println(currentCard.getCardno());
                    System.out.println(currentCard.getValues());
                    System.out.println(currentCard.getPassword());
                    System.out.println(currentCard.getName());
                    break;
                }
                case 4:
                {
                    System.out.println("程序退出");
                    return;
                }
                default:
                {
                    break;
                }

            }

        }


    }


}
