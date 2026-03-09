class Arm{
    public static void main(String[] args) {
        int n = 153;
        System.out.println("Given no:"+n);
	int temp = n;
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }

        if (sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
