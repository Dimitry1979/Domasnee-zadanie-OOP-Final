package Operations;

public class Summarize extends Model{
    
    @Override
    public Double result() {
        return x + y;
    }

    @Override
    public void setX(Double value) {
        super.x = value;
    }

    @Override
    public void setY(Double value) {
        super.y = value;
    }
}