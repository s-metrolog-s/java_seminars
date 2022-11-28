package FinalTask;

public class CreateGoods {
    Goods temp;

    public CreateGoods() {
        temp = new Goods();
        temp.id = CONST.LAST_ID + 1;
        temp.count = CONST.NIL_VALUE;
        temp.name = CONST.EMPTY;
        temp.description = CONST.EMPTY;
        temp.status = CONST.EMPTY;

    }
    public CreateGoods setId(int id) {
        temp.id = id;
        return this;
    }
    public CreateGoods setCount(int count) {
        temp.count = count;
        return this;
    }
    public CreateGoods setPrice(int price) {
        temp.price = price;
        return this;
    }
    public CreateGoods setName(String name) {
        temp.name = name;
        return this;
    }
    public CreateGoods setDescription(String description) {
        temp.description = description;
        return this;
    }
    public CreateGoods setStatus(String status) {
        temp.status = status;
        return this;
    }
    public Goods Create() {
        CONST.LAST_ID += 1;
        return temp;
    }
}
