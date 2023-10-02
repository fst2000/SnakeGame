public class RotatedVector implements Vector
{
    Vector vector;
    FloatAcceptor angle;
    public RotatedVector(Vector vector, FloatAcceptor angle)
    {
        this.vector = vector;
        this.angle = angle;
    }
    @Override
    public void accept(VectorConsumer consumer) {
        vector.accept((x, y) ->
        {
            angle.accept(angle ->
            {
                float sin = (float)Math.sin(angle * (Math.PI / 180));
                float cos = (float)Math.cos(angle * (Math.PI / 180));
                Vector i = new ScaledVector(c -> c.consume(cos, sin), c -> c.consume(x));
                Vector j = new ScaledVector(c -> c.consume(-sin, cos), c -> c.consume(y));
                new SumVector(i, j).accept(consumer);
            });
        });
    }
    
}
