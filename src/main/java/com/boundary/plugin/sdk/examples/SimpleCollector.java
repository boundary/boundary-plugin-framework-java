package com.boundary.plugin.sdk.examples;

import java.util.Random;

import com.boundary.plugin.sdk.Collector;
import com.boundary.plugin.sdk.Measurement;
import com.boundary.plugin.sdk.MeasurementSink;
import com.boundary.plugin.sdk.MeasurementSinkFactory;
import com.boundary.plugin.sdk.MeasurementSinkFactory.Type;

public class SimpleCollector implements Collector {

	private String name;
	
	public SimpleCollector(String name) {
		this.name = name;
	}

	@Override
	public Measurement[] getMeasures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		MeasurementSink output = MeasurementSinkFactory.getInstance(Type.STDOUT);
		Random rand = new Random();
		
		while(true) {
			try {
				Number  n = rand.nextInt(50) + 1;
				Measurement m = new Measurement("SIMPLE_METRIC",n);
				
				output.send(m);
				
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
