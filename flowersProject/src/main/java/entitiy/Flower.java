package entitiy;

public class Flower {

    private int id;
    private String  mark;
    private String color;
    private  int lengthSteak;
    private int freshness;
    private double price;
    private int quantity;

    private  String imgPath;

    public Flower(){}

    public Flower(String mark, String color, int lengthSteak, int freshness, double price, int quantity) {
        this.mark = mark;
        this.color = color;
        this.lengthSteak = lengthSteak;
        this.freshness = freshness;
        this.price = price;
        this.quantity = quantity;
        imgPath = (mark + color).toLowerCase().concat(".jpg");
    }

    public int getId() {  return id;   }

    public void setId(int id) {    this.id = id;   }

    public String getMark() {      return mark;    }

    public void setMark(String mark) {        this.mark = mark;    }

    public String getColor() {        return color;    }

    public void setColor(String color) {        this.color = color;    }

    public int getLengthSteak() {        return lengthSteak;    }

    public void setLengthSteak(int lengthSteak) {        this.lengthSteak = lengthSteak;    }

    public int getFreshness() {        return freshness;    }

    public void setFreshness(int freshness) {        this.freshness = freshness;    }

    public double getPrice() {        return price;    }

    public void setPrice(double price) {        this.price = price;    }

    public int getQuantity() {        return quantity;    }

    public void setQuantity(int quantity) {        this.quantity = quantity;    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return id == flower.id &&
                lengthSteak == flower.lengthSteak &&
                freshness == flower.freshness &&
                Double.compare(flower.price, price) == 0 ;
    }

    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + ((mark != null) ? mark.hashCode():0);
        result = 37 * result + new Double(price).hashCode();
        result = 37 * result + lengthSteak;
        result = 37* result + freshness;
        return result;
    }
}
