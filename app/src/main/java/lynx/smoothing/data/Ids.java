package lynx.smoothing.data;

import java.util.ArrayList;

/**
 * Created by tridarid on 29/11/16.
 */

public class Ids {
    private static ArrayList<Integer> ids = new ArrayList<Integer>();

    public void generateIds(int x){
        for(int i = 0; i < x; i ++){
            ids.add(i);
        }
    }

    public ArrayList<Integer> getIds(){
        return ids;
    }

    public int getId(int x){
        return ids.get(x);
    }
}
