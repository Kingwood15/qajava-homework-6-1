import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test

    public void shouldSumYearSalesTest() {

        StatsService service = new StatsService();

        int actual, expected;
        int[] sales = {112, 211, 310, 49, 58, 67, 76, 85, 94, 103, 112, 121};

        actual = service.sumYearSales(sales);
        expected = 112 + 211 + 310 + 49 + 58 + 67 + 76 + 85 + 94 + 103 + 112 + 121;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldAverageMonthSalesTest() {

        StatsService service = new StatsService();

        int actual, expected;
        int[] sales = {112, 211, 310, 49, 58, 67, 76, 85, 94, 103, 112, 121};

        actual = service.averageMonthSales(sales);
        expected = (112 + 211 + 310 + 49 + 58 + 67 + 76 + 85 + 94 + 103 + 112 + 121) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMaxMonthSalesTest() {

        StatsService service = new StatsService();

        int actual, expected;
        int[] sales = {112, 211, 310, 49, 58, 67, 76, 85, 94, 103, 112, 121};

        actual = service.maxMonthSales(sales);
        expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMinMonthSalesTest() {

        StatsService service = new StatsService();

        int actual, expected;
        int[] sales = {112, 211, 310, 49, 58, 67, 76, 85, 94, 103, 112, 121};

        actual = service.minMonthSales(sales);
        expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCountMonthLowAverageSalesTest() {

        StatsService service = new StatsService();

        int actual, expected;
        int[] sales = {112, 211, 310, 49, 58, 67, 76, 85, 94, 103, 112, 121};

        actual = service.countMonthLowAverageSales(sales);
        expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCountMonthHighAverageSalesTest() {

        StatsService service = new StatsService();

        int actual, expected;
        int[] sales = {112, 211, 310, 49, 58, 67, 76, 85, 94, 103, 112, 121};

        actual = service.countMonthHighAverageSales(sales);
        expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}
