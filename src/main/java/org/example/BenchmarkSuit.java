package org.example;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;

import static org.example.PerformanceTestFunctions.*;

/**
 * created by Joseph Yacoub  on 24 May 2023
 */
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 5)
@Threads(15)
@Fork(3)
@State(Scope.Benchmark)

public class BenchmarkSuit {
    @Benchmark
    public void testBubbleSort(){
        int[] arr = {5, 2, 8, 12, 1, 6, 25, 100, 23, 3};
        myBubbleSort(arr);
    }
    @Benchmark
    public void testFibonacciIterative(){
        myFibonacciIterative(5000);
    }
    @Benchmark
    public void testStringGenerator(){
        StringGenerator stringGenerator= StringGenerator.builder()
                .stringList(new ArrayList<String>()).build();
        stringGenerator.generateList(1000, 1000);
    }
}
