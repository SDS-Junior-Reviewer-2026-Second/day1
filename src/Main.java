

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    static void A(){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        coffeeFactory.create("Americano", "m").drink();

    }

    static void D(Coffee coffee){
        coffee.drink();
        //수정 사항
    }

    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        D(coffeeFactory.create("Americano", "m"));

    }
}