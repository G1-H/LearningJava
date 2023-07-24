package mission.week1;

public class OrderSneakersSituation {

    public static void main(String[] args){
        // 변수 변경 가능
        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.

        boolean isCustomerLikeDelivery = true; // 고객의 배송 주문 선호 여부

        String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        long nikeSneakersPrice = 50_000;
        boolean havingNikeSneakersInStore = false; // 매장 Nike sneakers 재고 여부

        int daysForDeliver = 3;
        int costForDeliver = 15_000;

        Sneaker sneaker = new Sneaker("nike", havingNikeSneakersInStore,nikeSneakersFeature,nikeSneakersPrice);
        Customer customer = new Customer(100_000, "쇼핑하러 나와서 기분 좋음", isCustomerLikeDelivery);
        Staff staff = new Staff("Lilly",100_000);
        DeliveryManager deliveryManager = new DeliveryManager("Tom",100_000);
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");



        customer.askSneakers(staff, sneaker); //고객 신발에 대해 물어봄
        long price = staff.sayAboutSneakerAndReturnPrice(sneaker); // 스태프 신발가격 확인
        customer.checkCash(price); // 고객 신발 살 수 있는지 확인.
        boolean havingStock = staff.checkStockOfSneaker(sneaker); // 스태프 신발 재고 확인
        if(havingStock){ // 재고 있을 경우,
            staff.saySneakerIsPossible(sneaker); // 스태프 구매 가능하다고 알림.
            customer.sayPurchase();  // 고객 구매하겠다고 알림.
            staff.sayPaymentGoing(sneaker);  // 스태프 결제 진행 알림
            customer.purchase(price);  // 고객 결제
            staff.addSalesAmount(price); // 스태프 결제 금액 추가
            customer.getItem(sneaker);  // 고객 신발 쇼핑리스트에 추가.
            customer.wearSneaker();  // 고객 신발 신어봄.
        }else{ // 재고 없을 경우,
            staff.announceDelivery(sneaker); // 스태프 배달 가능하다는 것 알림.
            if(customer.isLikeDelivery()){ // 배달 원하는 경우,
                customer.sayPurchase(); // 고객 구매하겠다고 알림.
                staff.sayPaymentGoing(sneaker); //스태프 결제 진행 알림.
                customer.purchase(price); // 고객 결제
                staff.addSalesAmount(price); // 스태프 결제 금액 추가.
                staff.askDelivery(deliveryManager, sneaker); // 스태프 배송기사에게 배달 알림.
                deliveryManager.sayDeliveryDetail(daysForDeliver,costForDeliver); // 배송기사 배송 관련 정보 알림.
                boolean deliverOrNot = customer.checkCashForDelivery(costForDeliver); // 고객 배송 여부 결정
                if(!deliverOrNot){ // 고객 배송 가능 여부 확인 -> 불가능 ,
                    staff.substractSalesAmount(price); // 스태프 결제 금액 차감
                    customer.refund(price); // 고객 환불 받음
                }else{
                    deliveryManager.deliverGoing(daysForDeliver, costForDeliver); // 배송기사 배송 알림.
                    customer.purchase(costForDeliver); // 고객 배송비 결제.
                    deliveryManager.addSalesAmount(costForDeliver);  // 배송기사 배송 금액 추가
                    System.out.println("["+daysForDeliver+"일 뒤]"); // 며칠뒤(배송일 기준)
                    customer.getItem(sneaker);  // 고객 신발 받음.
                    customer.wearSneaker();  // 고객 신발 신음.
                }
            }else{
                customer.sayNextTime();  // 배달 원치 않는 경우, 고객 다음에 오겠다 알림.
            }

        }
    }
}