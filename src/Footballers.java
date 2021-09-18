import java.util.ArrayList;

public class Footballers extends ArrayList<Footballer> {

    public Footballers(){
        super();
    }

    public Footballers(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean add(Footballer footballer) {
        return super.add(footballer);
    }

    @Override
    public int size() {
        return super.size();
    }
}
