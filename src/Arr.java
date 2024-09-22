public class Arr {

    public  static Boolean compareArrays (Object [] array1,Object [] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].getClass() != array2[i].getClass()) {
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }
}
