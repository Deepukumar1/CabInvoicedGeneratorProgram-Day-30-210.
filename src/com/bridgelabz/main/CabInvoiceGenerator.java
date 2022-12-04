package com.bridgelabz.main;

public class CabInvoiceGenerator {
	static final  double COST_PER_KM=10;
    static final  double COST_PER_MINUTE=1;
    static final  double MINIMUM_COST=5;
    public double calculateTotalFair(double distance, double time) {
        double cost =distance*COST_PER_KM+time*COST_PER_MINUTE;
        return cost<MINIMUM_COST ? MINIMUM_COST : cost;
    }
	public double calculateFarePREM(double d, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Invoice generateInvoice(Ride[] rides) {
		// TODO Auto-generated method stub
		return null;
	}
	public double calculateAggregateFair(Ride[] rides) {
		// TODO Auto-generated method stub
		return 0;
	}
}
