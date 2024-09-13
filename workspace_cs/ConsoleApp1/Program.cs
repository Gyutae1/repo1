
class Program
{
    static void Main(string[] args)
    {
        // 한줄 주석
        /*
         * 범위 주석
         */

        Console.Write("Hello, World!");
        Console.WriteLine("Hello, c#!");

        int[] products = new int[3];

        int[] p = new int[3];
        p[0] = 10;
        test();

        int[] arr = new int[] {1,2,3,4,5};
        foreach (var el in arr)
        {
            Console.WriteLine(el + ",");
        }

    }
    static void test()
    {
        Console.WriteLine("test");
    }
}

