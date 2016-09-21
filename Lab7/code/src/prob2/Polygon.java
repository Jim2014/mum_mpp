package prob2;

/**
 * Created by Administrator on 2016/9/21 0021.
 */
public interface Polygon extends ClosedCurve {
    default double[] getSides() throws Exception {
        throw new Exception("not supported.");
    }
    @Override
    public double computePerimeter();
}
