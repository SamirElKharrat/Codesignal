package dad.codesignal.intro;

public class Ocean1 {
	
int adjacentElementsProduct(int[] inputArray) {
	int max = Integer.MIN_VALUE;
	for(int i = 0; i < inputArray.length - 1; i++){
	max = Math.max(max, (inputArray[i] * inputArray[i + 1]));
    }
	return max;
}



int shapeArea(int n) {
    int tam = 1;
    return tam + (n*((n - 1)*2));

}



}