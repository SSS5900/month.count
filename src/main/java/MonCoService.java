public class MonCoService {

    public long calcMonth(int income, int expense, int threshold) {
        int count = 0; // подсчет месяцев
        int remainder = 0; // остаток денег
        for (int month = 0; month < 12; month++) {
            if (remainder >= threshold) {
                count++;
                remainder = (remainder - expense) / 3;
            } else {
                remainder = remainder + income - expense;
            }
        }
        return count;
    }
}
