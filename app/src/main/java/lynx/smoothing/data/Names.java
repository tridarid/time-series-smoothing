package lynx.smoothing.data;

import java.util.ArrayList;

/**
 * Created by tridarid on 29/11/16.
 */

public class Names {
    private ArrayList<String> names = new ArrayList<String>();

    public void generateNames(int x){
        String prefix = "item";
        for(int i = 0; i < x; i++){
            prefix = prefix + i;
            names.add(prefix);
        }
    }

    public ArrayList getNames(){
        return names;
    }

    public String getName(int x){
        return names.get(x);
    }
}
