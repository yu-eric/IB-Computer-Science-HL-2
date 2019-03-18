package chapter11;

public class BondInfoTester {
    public static void main(String[] args) {

        BondInfo bond = new BondInfo();
        System.out.println(bond.readBondName("C||C"));
        System.out.println(bond.readBondEnergy(500));
        System.out.println(bond.readBondLength(0.15));

    }
}
