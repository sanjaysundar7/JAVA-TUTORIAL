public class garden {

    int apple_price = 20;
    int apple_count = 5;

    void total_money()
    {
        System.out.println("Total amount of apple is : " + (apple_price * apple_count));
    }

    public static void main(String args[])
    {
        garden g = new garden();

        System.out.println("Apple price is : " + g.apple_price);
        System.out.println("Apple count is : " + g.apple_count);
        g.total_money();
    }
}