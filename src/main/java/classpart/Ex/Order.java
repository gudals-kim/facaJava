package classpart.Ex;

public class Order {
    int ordernum = 2110270001;
    String orderid;
    String orderday;
    String objectnum;
    Person kim;
    Person Lee;

    public  Order(String id,String day,String num){
        orderid = id;
        orderday = day;
        objectnum = num;

        kim = new Person();
        Lee = new Person();
    }
    public void setkimIn(String name, String address){
        kim.name = name;
        kim.address = address;
    }
    public void setleeIn(String name, String address){
        Lee.name = name;
        Lee.address = address;
    }




}
