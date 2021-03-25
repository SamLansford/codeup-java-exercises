package prep.foods;

import java.util.Collection;
import java.util.Collections;

public interface Consumable {

    void consume();

    Collection<String> getFullConsumable();

}
