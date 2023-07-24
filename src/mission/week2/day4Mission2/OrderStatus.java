package mission.week2.day4Mission2;

public enum OrderStatus {
    PAID("PAID","주문 완료"),
    SHIPPED("SHIPPED","배송 중"),
    DELIVERED("DELIVERED","배송 완료"),
    PROCESSING("PROCESSING","주문 처리 중");

    private String englishTerm;
    private String koreanTerm;

    OrderStatus(String englishTerm, String koreanTerm) {
        this.englishTerm = englishTerm;
        this.koreanTerm = koreanTerm;
    }

    public static OrderStatus valueOfOrderStatus(String str) {
        String statusStr = str.toUpperCase();
        for(OrderStatus orderStatus:values()  ){
            if (orderStatus.englishTerm.equals(statusStr) || orderStatus.koreanTerm.equals(statusStr)) {
                return orderStatus;
            }
        }
    return PROCESSING;
    }
}
