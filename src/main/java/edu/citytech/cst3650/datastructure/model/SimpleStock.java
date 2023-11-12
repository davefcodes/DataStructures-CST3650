package edu.citytech.cst3650.datastructure.model;

import com.jbbwebsolution.fileutility.SVColumn;


public class SimpleStock implements Comparable<SimpleStock> {
    @SVColumn(position = 1) private String symbol;
    @SVColumn(position = 7, searchFor = "N/A", replaceWith = "0" )private Float marketCapInBillions;
    @SVColumn(position = 14)private String growthGrade;


    public String getSymbol(){
        return symbol;
    }

    public float getMarketCapInBillions(){
        return marketCapInBillions;
    }

    public String getGrowthGrade(){
        return  growthGrade;
    }

    @Override
    public int compareTo(SimpleStock other) {
        return this.marketCapInBillions.compareTo(other.marketCapInBillions);
    }

    @Override
    public String toString() {
        return "SimpleStock{" +
                "symbol='" + symbol + '\'' +
                ", marketCapInBillions=" + marketCapInBillions +
                ", growthGrade='" + growthGrade + '\'' +
                '}';
    }
}

