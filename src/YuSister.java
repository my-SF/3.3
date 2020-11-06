public class YuSister implements Shopper{
    private Consumer TaoSister;

    public YuSister() {
    }

    public Consumer getTaoSister() {
        return TaoSister;
    }

    public void setTaoSister(Consumer taoSister) {
        this.TaoSister = taoSister;
    }

    public YuSister(Consumer taoSister) {
        TaoSister = taoSister;
    }

    @Override
    public void ing() {
        Order order = new Order("B站大礼包");
        System.out.println("御姐准备好了"+order.name+"给涛姐姐");

        TaoSister.getpackge(order);
    }
}
