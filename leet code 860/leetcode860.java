public class leetcode860 {
    // Function Definition
    public static boolean lemonadeChange(int[] bills) {
        //Track the total number of notes of dollar 5,10 and 20
        int count5=0, count10=0;

        for(int dollar: bills){
            // case 1: customer give $5
            //we don't have to give change
            if(dollar == 5) count5++;

            // case 2: customer give $10
            else if(dollar == 10){
                //we look for note of $5 to give change
                if(count5==0) return false;
                count10++;
                count5--;
            }


            // case 3: customer give $20
            else{
                // here we use greedy algo as 15 can be break down to (5+5+5) and (10+5)
                // for optimal solution first we look for (10+5) combination of notes
                if(count10>0 && count5>0){
                    count10--;
                    count5--;
                }
                // here we look for (5+5+5) combinations
                else if(count5>=3){
                    count5-=3;
                }
                else return false;
            }
        }

        return true;
        
    }

    public static void main(String[] args) {
        int arr[] = {5,5,5,10,20,10,5};

        System.out.println(lemonadeChange(arr));
    }

}
