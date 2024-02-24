public class Main {
    public static void main(String[] args) {
       // BonusMilesService service = new BonusMilesService();
       // int price = 12_000;
       // int miles = service.calculate(price);
       // System.out.println("Начислено миль за покупку: " + miles);

        BonusMilesService service = new BonusMilesService();

        System.out.println();
        System.out.println("Начислено миль за покупку: ");
        System.out.println(service.calculate( 12_000));

        System.out.println();
        System.out.println("Начислено миль за покупку: ");
        System.out.println(service.calculate( 15_000));

        System.out.println();
        System.out.println("Начислено миль за покупку: ");
        System.out.println(service.calculate( 10_000));
    }
}
