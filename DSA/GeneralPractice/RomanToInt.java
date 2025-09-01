class RomanToInt {
    public int romanToInt(String s) {
        int num =0;
        for(int i=0;i<s.length();i++){
            int currValue = value(s.charAt(i));
            int nextValue = (i+1<s.length()) ? value(s.charAt(i+1)) : 0;
            if(currValue<nextValue){
                num-=currValue;
            }else{
                num+=currValue;
            }
        }
        return num;
    }
    private int value ( char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInt converter = new RomanToInt();
        String romanNumeral = "MCMXCIV"; // Example input
        int result = converter.romanToInt(romanNumeral);
        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is: " + result);
    }
}