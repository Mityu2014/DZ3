public class Main {
    public static void main(String[] args) {
        System.out.println(Calc.sum(4,5.3));
        System.out.println(Calc.subtract(6,5.8));
        System.out.println(Calc.divide(9.3,5));
        System.out.println(Calc.multiply(4,2.8));

        Object [] ar1 = new Object[]{1,"smkfg",2};
        Object [] ar2 = new Object[]{5,"smkfg",100};
        System.out.println(Arr.compareArrays(ar1,ar2));

        Pair pair = new Pair(1,"df");
        System.out.println(pair.getSecond());
        System.out.println(pair.getFirst());
        System.out.println(pair.toString());
    }


}