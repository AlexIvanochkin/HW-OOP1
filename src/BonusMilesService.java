public class BonusMilesService {
    public int calculate(int price) {


        int miles;
        if (price > 0) {
            miles = (price / 100) * 5;
        } else {
            miles = 0;
        }
        return miles;

    }
}
