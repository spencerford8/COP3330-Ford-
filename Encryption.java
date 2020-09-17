public class Encryption{
    // 4 digits
    public boolean verify(int value){
        return (Integer.toString(value).length() == 4) ? true : false;
    }
    
    //encrypt method: Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the new value by 10
    public int encrypt(int value){
        int arrayAmount[] = new int[4];

      
        for(int j = 3; j >= 0; j--){
            arrayAmount[j] = value % 10;
            value /= 10;
        }

        arrayAmount = switchNumbers(arrayAmount);

        for(int j = 0; j < 4; j++){
            arrayAmount[j] = (arrayAmount[j] + 7) % 10;
        }

       return toInt(arrayAmount);
    }
    
    //decrypt method
    public int decrypt(int value){
        int arrayAmount[] = new int[4];

       
        for(int j = 3; j>=0; j--){
            arrayAmount[j] = value % 10;
            value /= 10;
        }

        
        arrayAmount = switchNumbers(arrayAmount);

        
        for(int j = 0; j < 4; j++){
            arrayAmount[j] = (((arrayAmount[j] + 10) - 7) % 10);
        }

        return toInt(arrayAmount);
    }
    
    private int[] switchNumbers(int[] arrayAmount){
        
        int tempAmount = arrayAmount[0];
        arrayAmount[0] = arrayAmount[2];
        arrayAmount[2] = tempAmount;

       
        tempAmount = arrayAmount[1];
        arrayAmount[1] = arrayAmount[3];
        arrayAmount[3] = tempAmount;

        return arrayAmount;
    }
    
    private int toInt(int[] arrayAmount){
       
        StringBuilder temp = new StringBuilder();

        for(int j = 0; j < arrayAmount.length; j++){
            temp.append(arrayAmount[j]);
        }

        return Integer.parseInt(temp.toString());
    }
}