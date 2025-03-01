package Arrays.Searching.LinearSearching.question;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        int[][] accounts = {
                {2,8,7},
                {7,1,3}
        };

        System.out.println(searchCustomer(accounts));
    }

    static int searchCustomer(int[][] accounts){

        int max=0;

        for(int i=0; i<accounts.length; i++){
            int sum=0;
            for(int j=0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];

                if(sum>max){
                    max = sum;
                }
            }
        }

        return max;   //richest wealth of customer
    }
}
