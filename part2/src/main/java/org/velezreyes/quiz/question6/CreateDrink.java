public class CreateDrink implements Drink{
    private String name;
    private int price;
    private boolean fizzy;

    public CreateDrink(String name, int, price, boolean fizzy){
        this.name = name;
        this.price = price;
        this.fizzy = fizzy;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean isFizzy(){
        return fizzy;
    }

    @Override
    public int getPrice(){
        return price;
    }
    
}