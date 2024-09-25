package storeMembers;

public class StoreMember {
    private String name;
    private int age;
    private int memberId;
    private double balance;
    private boolean pro;

    static private int newAccounts = 0;

    public StoreMember(String name, int age, boolean pro) {
        newAccounts++;
        this.name = name;
        this.age = age;
        this.memberId = memberId;
        this.balance = 0;
        this.pro = pro;

    }
    static public int getNumberOfAccounts() {
        return newAccounts;
    }
    private int getUniqueNumber() {
        return newAccounts;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getMemberId() {
        return memberId;
    }
    public double getBalance() {
        return balance;
    }
    public boolean isPro() {
        return pro;
    }

    @Override
    public String toString() {
        return "StoreMember [name="
                + name + ", age="
                + age + ", memberId="
                + newAccounts + ", balance="
                + balance + ", pro="
                + pro + "]";
    }
}
