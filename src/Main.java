public class Main {
    public static void main(String[] args) {
        TaoSister taoSister = new TaoSister();
        YuSister yuSister = new YuSister();

        yuSister.setTaoSister(taoSister);
        yuSister.ing();

    }
}
