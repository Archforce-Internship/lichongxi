public class test2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        A a=new A();
        int ret = a.sumInt(i, j);
        System.out.println(ret);


    }
}
    class A {
        public int sumInt(int i, int j) {
            int c = i + j;
            int b = 15;
            int res = divide(c, b);
            return res;
        }

        public int divide(int c, int b) {
            int a = c / b;
            return a;
        }
    }

