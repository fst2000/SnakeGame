public class SumVector implements Vector
{
    Vector v1;
    Vector v2;
    public SumVector(Vector v1, Vector v2)
    {
        this.v1 = v1;
        this.v2 = v2;
    }
    @Override
    public void accept(VectorConsumer consumer)
    {
        v1.accept((x1, y1) -> v2.accept((x2, y2) -> consumer.consume(x1 + x2, y1 + y2)));
    }
    
}
