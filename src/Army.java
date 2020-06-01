public class Army {

    public static void main(String[] args) {
        Unit unit1 = new Unit("Sami");
        Unit unit2 = new Unit("Basti");
        Unit unit3 = new Unit("Matse");
        Unit unit4 = new Unit("Ferdi");
        Unit unit5 = new Unit("Alex");

        Knight knight1 = new Knight("Konsti");
        Knight knight2 = new Knight("Phillipp");
        Knight knight3 = new Knight("Sebi");

        General general = new General("Werner");

        Doctor doctor = new Doctor("Bear");
    }
}

class Unit {
    String nameUnit;

    public Unit(String name){
        nameUnit = name;
    }
}

class Knight {
    String nameKnight;

    public Knight(String name){
        nameKnight = name;
    }
}

class General {
    String nameGeneral;

    public General(String name){
        nameGeneral = name;
    }
}

class Doctor {
    String nameDoctor;

    public Doctor(String name){
        nameDoctor = name;
    }
}