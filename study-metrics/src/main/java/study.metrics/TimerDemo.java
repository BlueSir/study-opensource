package study.metrics;

import com.codahale.metrics.Histogram;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: jingxc
 * Date: 11/6/13
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimerDemo {

    public static void main(String[] args){
        Timer responses = MetricsHolder.metrics.timer(MetricRegistry.name(TimerDemo.class, "responses"));
        Random random = new Random();
        while(true){
            Timer.Context context = responses.time();
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            context.stop();
        }


    }
}
