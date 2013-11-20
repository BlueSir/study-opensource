package study.metrics;

import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: jingxc
 * Date: 11/6/13
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class GaugeDemo {

    public static void main(String args[]){
        MetricsHolder.metrics.register(MetricRegistry.name(GaugeDemo.class, "gauge", "size"),
                new Gauge<Integer>() {
                    Random random = new Random();

                    @Override
                    public Integer getValue() {
                        return random.nextInt(1000);
                    }
                });
    }
}