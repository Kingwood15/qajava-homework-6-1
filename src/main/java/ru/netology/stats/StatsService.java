package ru.netology.stats;

public class StatsService {

    public int sumYearSales(int[] sales) {

        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonthSales(int[] sales) {

        int average;
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }

        average = sum / sales.length;

        return average;
    }

    public int maxMonthSales(int[] sales) {

        int maxMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }

        return maxMonth + 1;
    }

    public int minMonthSales(int[] sales) {

        int minMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }

        return minMonth + 1;
    }

    public int countMonthLowAverageSales(int[] sales) {

        StatsService service = new StatsService();

        int average, count = 0;

        average = service.averageMonthSales(sales);

        for (int sale : sales) {
            if (sale <= average) {
                count++;
            }
        }

        return count;
    }

    public int countMonthHighAverageSales(int[] sales) {

        StatsService service = new StatsService();

        int average, count = 0;

        average = service.averageMonthSales(sales);

        for (int sale : sales) {
            if (sale >= average) {
                count++;
            }
        }

        return count;
    }
}
