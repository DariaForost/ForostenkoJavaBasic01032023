package ChineseDynasties;
public class MyAttacks {
    public static void main(String[] args) {
        int soldierLi = 13;  // 11180 атак 860 воїнів
        int bowmanLi = 24;   //20640 атак 860 лучників
        int riderLi = 46;    //39560 атак 860 вершників
        double armyLi = 860 * 3;  // 2580 - вся армія Лі
        double allAttackLi = 860 * (soldierLi + bowmanLi + riderLi);  //сума атак Лі 71380
        System.out.println(allAttackLi);


        int soldierMyn = 9;  // 11610 атак 1290 воїнів
        int bowmanMyn = 35;  // 45150 атак 1290 лучників
        int riderMyn = 12;   //  15480 атак 1290 вершників
        double armyMyn = armyLi * 1.5 / 3; // 3870 - вся армія Мінь, тут вирахувано к-кість одного типу - 1290
        double allAttackMyn = armyMyn * (soldierMyn + bowmanMyn + riderMyn); //сума атак Мінь 72240
        System.out.println(allAttackMyn);
    }
}