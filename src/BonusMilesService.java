
public class BonusMilesService {
    public int calculate(int cost) {
        int bonusScale = 100;
        int bonusMile = cost / bonusScale;
        return bonusMile; // возвращаем рассчитанное кол-во бонусных миль
    }
}

