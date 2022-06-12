package fast.track;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price){
        this.price= price;
    }
    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCategory(String category){
        this.category=category;
    }

    public String getCategory() {

        return category;
    }
    public boolean hasShock(){
        if(quantity>0){
           return true;


        }else{
            return false;
        }
    }
    public boolean isCategory(String category){
        if(category.equals(getCategory())){
            return true;
        }else{
            return false;
        }
    }
}
