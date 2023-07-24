package exercise.chapter_41;

public class VIPCustomer extends Customer {
    static int serialNums = 1;

    private String agentID;
    private double discountRatio;

    @Override
    public int calculatePrice(int price) {
        super.calculatePrice(price);
        price -= price * discountRatio;
        return price;
    }

    public void callAgent() {
        System.out.println("담당직원" + this.agentID + "님 문의 드릴 게 있어요.");
    }

    public VIPCustomer(String name) {
        super();
        this.name = name;
        this.customerID = "VIP" + serialNums++;
        this.customerGrade = "VIP";
        this.bonusPointRatio = 0.05;
        this.bonusPoint = 0;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    public void printMyInfo() {
        System.out.print("VIP");
        super.printMyInfo();
    }
}
