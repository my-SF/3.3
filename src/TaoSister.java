public class TaoSister implements Consumer{

    @Override
    public void getpackge(Order order) {

        System.out.println("涛姐姐拿到了"+order.name);
    }
}
