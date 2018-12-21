import java.util.List;

public class JavaCollectionsUtils {
    public static List<String> uppercaseAll(List<String> items){
        for (int i=0; i< items.size(); i++){
            items.set(i, items.get(i).toUpperCase());
        }
        return items;
    }
}
