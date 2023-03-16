package ChineseDynasties;

import java.math.BigDecimal;

public class MyAttacks {
    public static void main(String[] args) {
        double soldierLi = 13;  // 11180 атак 860 воїнів
        double bowmanLi = 24;   //20640 атак 860 лучників
        double riderLi = 46;    //39560 атак 860 вершників
        double armyLi = 860 * 3;  // 2580 - вся армія Лі
        BigDecimal allAttackLi = BigDecimal.valueOf(860 * (soldierLi + bowmanLi + riderLi)); //сума атак Лі 71380
        System.out.println("All Attack of Li: " + allAttackLi);

        double soldierMyn = 9;  // 11610 атак 1290 воїнів
        double bowmanMyn = 35;  // 45150 атак 1290 лучників
        double riderMyn = 12;   //  15480 атак 1290 вершників
        double armyMyn = armyLi * 1.5 / 3; // 3870 - вся армія Мінь, тут вирахувано к-кість одного типу - 1290
        BigDecimal allAttackMyn = BigDecimal.valueOf(armyMyn * (soldierMyn + bowmanMyn + riderMyn)); //сума атак Мінь 72240
        System.out.println("All Attack of Myn: " + allAttackMyn);
    }
}