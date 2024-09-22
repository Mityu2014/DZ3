public class Calc {

    public static <T extends Number,V extends Number> Double sum ( T t, V v){
        return  t.doubleValue() + v.doubleValue();
    }
    public static <T extends Number,V extends Number> Double multiply ( T t, V v){
        return  t.doubleValue() * v.doubleValue();
    }
    public static <T extends Number,V extends Number> Double divide ( T t, V v){
        if (v.doubleValue() == 0){
            System.out.println("на 0 делить нельзя");
            return null;
        }else {
            return t.doubleValue() / v.doubleValue();
        }
    }
    public static <T extends Number,V extends Number> Double subtract ( T t, V v){
        return  t.doubleValue() - v.doubleValue();
    }

}
