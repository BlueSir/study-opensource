package study.metrics;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: jingxc
 * Date: 11/6/13
 * Time: 4:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class MeterDemo {
    public static void main(String[] args){
        Meter requests = MetricsHolder.metrics.meter(MetricRegistry.name(MeterDemo.class, "requests"));
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                requests.mark();
        }
    }
}
