package SimpleSbootproject.sprbootpro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class CounterController {

    private final AtomicInteger counter = new AtomicInteger();

    @GetMapping(path = "/count")
    public String getCount() {
        int currentCount = counter.incrementAndGet();
        return "This endpoint has been called " + currentCount + " times.";
    }
}
