public class ScaledVector implements Vector
{
    Vector vector;
    FloatAcceptor scale;
    public ScaledVector(Vector vector, FloatAcceptor scale)
    {
        this.vector = vector;
        this.scale = scale;
    }
    @Override
    public void accept(VectorConsumer consumer)
    {
            vector.accept((x, y) ->
                scale.accept(s ->
                    consumer.consume(s * x,s * y)));
    }
        
}
