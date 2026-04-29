class Solution {
    public double[] convertTemperature(double n) {
         double[] arr = new double[2];

        arr[0] = n + 273.15;      
        arr[1] = n * 1.80 + 32;   

        return arr;
    }
}