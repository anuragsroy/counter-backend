package com.example.counter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CounterService {

    private AtomicInteger counter = new AtomicInteger(0);

    // Runs every 60 seconds
    @Scheduled(fixedRate = 60000)
    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}
