package come.hspedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 */
public class SmallChangeSysOOP {

    boolean loop=true;
    Scanner scanner=new Scanner(System.in);
    String key="";
    String details="----------零钱通明细---------";
    double money=0;
    double balance=0;
    Date date=null;
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note="";


    public void mainMenu(){
        do{

            System.out.println("\n=========零钱通菜单=========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退   出");

            System.out.print("请选择（1-4）：");
            key=scanner.next();

            switch (key){
                case "1":
                    this.detial();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            };

        }while(loop);
    }

    public void detial(){
        System.out.println(details);
    }

    public void income(){
        System.out.print("收益入账金额：");
        money=scanner.nextDouble();
        if(money<=0){
            System.out.println("收益入账金额 需要 大于 0");
            return;
        }
        balance+=money;
        date=new Date();
        details+="\n收益入账\t"+money+"\t"+sdf.format(date)+"\t余额"+balance;
    }

    public void pay(){
        System.out.print("消费金额：");
        money=scanner.nextDouble();
        if(money<=0 || money>balance){
            System.out.println("消费金额 应该在0-"+balance);
        }
        System.out.print("消费说明：");
        note=scanner.next();
        balance-=money;
        date=new Date();
        details+="\n"+note+"\t-"+money+"\t"+sdf.format(date)+"\t余额"+balance;
    }

    public void exit(){
        String choice="";
        while(true){
            System.out.println("你确定要退出吗？y/n");
            choice=scanner.next();
            if("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        if(choice.equals("y")){
            loop=false;
        }
    }
}
