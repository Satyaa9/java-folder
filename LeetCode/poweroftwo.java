class poweroftwo {
    public static void main(String[] args) {
        int n;
        poweroftwo powertwo = new poweroftwo();
        boolean result = powertwo.power(116);
        System.out.println(result);
    }

    public boolean power(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}
