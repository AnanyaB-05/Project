class Largest {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
  	System.out.println("Given no1:"+a);
	System.out.println("Given no2:"+b);
	System.out.println("Given no3:"+c);
	int largest = a;

        if (b > largest)
            largest = b;

        if (c > largest)
            largest = c;

        System.out.println("Largest number: " + largest);
    }
}
