package com.motor.teste;

/**
 * Created by 15dcc on 2018/6/28.
 */

public enum SeasonEnum {
    SPRING("春天","a"),SUMMER("夏天","b"),FALL("秋天","c"),WINTER("冬天","b");

    private String name;
    private String des;
    private SeasonEnum(String name,String des){
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }


}

class EnumClass{
    public static void main(String[] args) {
        for(SeasonEnum s :SeasonEnum.values()){
            System.out.println(s.getName()+" "+s.getDes());
        }

        SeasonEnum.FALL.getDes();

        judge(SeasonEnum.FALL);

    }

    public static void judge(SeasonEnum s)
    {
        switch(s)
        {
            case SPRING:
                System.out.println("春天适合踏青。");
                break;
            case SUMMER:
                System.out.println("夏天要去游泳啦。");
                break;
            case FALL:
                System.out.println("秋天一定要去旅游哦。");
                break;
            case WINTER:
                System.out.println("冬天要是下雪就好啦。");
                break;
        }
    }
}