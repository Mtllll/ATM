package ATM.COM;

public class card {
    private String cardno;
    private String name;
    private String password;
    private double  values;

    public String getCardno() {
        return cardno;
    }
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public double getValues() {
        return values;
    }
    public void setValues(double values) {
        this.values = values;
    }
    //存钱方法
    public void saveValues(double money){
        values+=money;
        System.out.println("存钱成功");
        System.out.println("余额是"+values);
    }
    //取钱方法
    public void takeValues(double value){
        if(value>values){
            System.out.println("余额不足");
        }
        else{
            values-=value;
            System.out.println("取款成功");
            System.out.println("余额是"+values);
        }

    }


}
