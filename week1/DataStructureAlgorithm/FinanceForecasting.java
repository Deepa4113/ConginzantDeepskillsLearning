package week1.DataStructureAlgorithm;
public class FinanceForecasting {
    public static double calculatevalue(double value,double rate,int years)
    {
        if (years==0) {
            return value;
        }
        return calculatevalue(value*(1+rate), rate, years-1);
    }
    public static void main(String[] args) {
        double value = 1000;
        double rate = 0.05;
        int years = 5;

        double futureValue = calculatevalue(value, rate, years);
        System.out.println("Future Value: " + futureValue);
    }
}
