package study.metrics;

import com.codahale.metrics.Histogram;
import com.codahale.metrics.MetricRegistry;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: jingxc
 * Date: 11/6/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class HistogramsDemo {
    public static void main(String[] args){
        Histogram responseSizes = MetricsHolder.metrics.histogram(MetricRegistry.name(HistogramsDemo.class, "response-sizes"));
        Random random = new Random();
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            responseSizes.update(random.nextInt(1000));
        }


    }
}
