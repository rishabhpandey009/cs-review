package com.mmnaseri.cs.ds.clrs.ch11.s5;

import com.mmnaseri.cs.ds.clrs.ch11.HashTableProbe;
import com.mmnaseri.cs.ds.clrs.ch11.s3.DivisionHashCalculator;
import com.mmnaseri.cs.ds.clrs.ch11.s3.MultiplicationHashCalculator;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (7/15/15, 12:34 AM)
 */
public class DoubleHashingHashTableProbeTest extends BaseHashTableProbeTest {

    @Override
    protected HashTableProbe[] getProbes() {
        return new HashTableProbe[]{
            new DoubleHashingHashTableProbe(new DivisionHashCalculator(), new MultiplicationHashCalculator(Math.E))
        };
    }

}