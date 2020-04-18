import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SearchRunningTimeRage {

    public int[] findTimeRange(List<int[]> timeCollection, int time) {
        Optional<int[]> rs = timeCollection.stream().filter(x -> x[0] <= time && x[1] >= time).findFirst();
        return rs.isPresent() ? rs.get() : new int[]{};
    }
}
