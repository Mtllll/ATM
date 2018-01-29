package ATM.COM;

public class test {
    public static void main(String[] args) {
        atm a=new atm();
        String strName = "陈赫、陈坤、邓超、杜淳、冯绍峰、"
                + "韩庚、胡歌、何炅、黄渤、黄晓明、贾乃亮、李晨"
                + "、李易峰、鹿晗、井柏然、"
                + "刘烨、陆毅、孙红雷、佟大为、"
                + "薛之谦、王宝强、汪峰、王俊凯、王凯、王源、"
                + "魏晨、文章、吴亦凡、小沈阳、"
                + "徐峥、杨洋、张翰、张杰、张艺兴、郑恺";
        String arr[]=strName.split("、");
        for(int i=0;i<arr.length;i++)
        {
            card c=new card();
            c.setCardno("00"+(i+1));
            c.setValues(100000+Math.random()*100000);
            c.setName(arr[i]);
            c.setPassword("123456");
            a.addcard(c);
        }

        a.inputCard();
    }
}
