package lynx.smoothing.data;

import java.util.ArrayList;

/**
 * Created by tridarid on 29/11/16.
 */

public class Data {
    private static int dtInsertMethod; // 0 for manual, 1 for default;
    private static int nInsertMethod; // 0 for manual, 1 for default;
    private static int dataSize; // 10 for default
    private static ArrayList<Integer> dt = new ArrayList<Integer>();

    public int getDtInsertMethod() {
        return dtInsertMethod;
    }

    public void setDtInsertMethod(int dtInsertMethod) {
        this.dtInsertMethod = dtInsertMethod;
    }

    public int getnInsertMethod() {
        return nInsertMethod;
    }

    public void setnInsertMethod(int nInsertMethod) {
        Data.nInsertMethod = nInsertMethod;
    }

    public static int getDataSize() {
        return dataSize;
    }

    public static void setDataSize(int dataSize) {
        Data.dataSize = dataSize;
    }

    //dt
    public ArrayList getAllDt(){
        return dt;
    }

    public void setDt(int x){
        dt.add(x);
    }

    public int getDtById(int x){
        return dt.get(x);
    }

    public void truncateDt(){
        dt.clear();
    }
}
