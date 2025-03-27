package Recursion.IntroductionToBacktracking;

import java.util.ArrayList;

public class MazeProblems {

    public static void main(String[] args) {

//        System.out.println("Number of Paths are -< " + countPaths(3,3));
//        System.out.println(printPaths("",3,3));
//        System.out.println(printPaths1("",3,3));

        boolean[][] pathBox = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        printPaths2("",pathBox,0,0);


    }


    //counting path, if maze moves right and down
    static int countPaths(int r, int c){

        if(r==1 || c==1){
            return 1;
        }

        return countPaths(r-1,c) + countPaths(r,c-1);
    }


    //printing paths, if maze moves right and down
    static ArrayList<String> printPaths(String p, int r , int c){

        if(r ==1 && c ==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> paths = new ArrayList<>();

        if(r>1){
            paths.addAll(printPaths(p+"V",r-1,c));
        }
        if(c>1){
            paths.addAll(printPaths(p+"H",r,c-1));
        }

        return paths;
    }


    //printing paths, if maze moves right and down with obstacle at (2,2)
    static void printPaths2(String p, boolean[][] pathBox, int r , int c){

        if(r == pathBox.length-1 && c ==pathBox[0].length-1){
            System.out.println(p);
            return;
        }

        if(!pathBox[r][c]){
            return;
        }

        if(r<pathBox.length-1){
            printPaths2(p+"V", pathBox,r+1,c);
        }
        if(c<pathBox[0].length-1){
            printPaths2(p+"H",pathBox, r,c+1);
        }

                                        //OR

        //considering from (3,3)

        /*

        if(r==1 && c==1){
            System.out.print(p+", ");
            return;
        }

        if(!pathBox[r - 1][c - 1]){     //checks at the index 1,1 of boolean maze,
                                        // because when we reach at r=2 ans c=2,
                                        //maze will check for r=1 and c=1 which is false.

            return;
        }

        if(r>1){
            printPaths2(p+'V',pathBox,r-1,c);
        }

        if(c>1){
            printPaths2(p+'H',pathBox,r,c-1);
        }


        */


    }


    //printing paths, if maze moves right,down and diagonal
    static ArrayList<String> printPaths1(String p, int r , int c){

        if(r ==1 && c ==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> paths = new ArrayList<>();

        if(r>1){
            paths.addAll(printPaths1(p+"V",r-1,c));
        }
        if(c>1){
            paths.addAll(printPaths1(p+"H",r,c-1));
        }
        if(r>1 && c>1){
            paths.addAll(printPaths1(p+"D",r-1,c-1));
        }

        return paths;
    }
}
