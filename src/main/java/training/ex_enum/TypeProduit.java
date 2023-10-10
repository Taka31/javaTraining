package training.ex_enum;

public enum TypeProduit {

    CHAISE(100.0f),
    TABLE(60.0f),
    MEUBLE_TV(90.0f),
    CANAPE(1000.0f);

    final float price;

    TypeProduit(float price){
        this.price=price;
    }

    public float getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "TypeProduit{" +
                "price=" + price +
                '}';
    }
}
