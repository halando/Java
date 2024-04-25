

public class Konyvtar {
    public static void main(String[] args) {
        System.out.println(args.length);
        DatabaseController dbCtr = new DatabaseController(args[0], args[1]);
        int recordslender = dbCtr.setLendersTable();
        if(recordslender != 0){
            System.out.println("Sikeres írás, kiírt rekordok: " + recordslender);
        }
        else{
           System.out.println("Hiba az írás során");
        }
        int recordslending = dbCtr.setLendersTable();
        if(recordslending != 0){
            System.out.println("Sikeres írás, kiírt rekordok: " + recordslending);
        }
        else{
           System.out.println("Hiba az írás során");
        }
    }
    
}
