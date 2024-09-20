package CollectionFramework.SetInterface;

import java.util.EnumSet;
import java.util.Set;

public class LearnEnumSet {

    enum Color{
            RED, YELLOW, GREEN;
    }

    public static void main(String[] args) {
        EnumSet<Color> es = EnumSet.allOf(Color.class);
    }
}
