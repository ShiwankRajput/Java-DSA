package Recursion.IntroductionToBacktracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblems {

    public static void main(String[] args) {

        boolean[][] pathBox = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };


        System.out.println("Number of Paths are -< " + countPaths(3,3));
        System.out.println(printPaths("",3,3));
        System.out.println(printPaths1("",3,3));
        printPaths2("",pathBox,0,0);
        printPaths3("",pathBox,0,0);


        System.out.println();

        //printing path matrix....
        System.out.println("All path matrix print -->");
        int[][] path = new int[pathBox.length][pathBox[0].length];
        AllPathMatrixPrint("",pathBox,0,0,path,1);


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
            paths.addAll(printPaths(p+"B",r-1,c));
        }
        if(c>1){
            paths.addAll(printPaths(p+"R",r,c-1));
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
            printPaths2(p+"B", pathBox,r+1,c);
        }
        if(c<pathBox[0].length-1){
            printPaths2(p+"R",pathBox, r,c+1);
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
            printPaths2(p+'B',pathBox,r-1,c);
        }

        if(c>1){
            printPaths2(p+'R',pathBox,r,c-1);
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
            paths.addAll(printPaths1(p+"B",r-1,c));
        }
        if(c>1){
            paths.addAll(printPaths1(p+"R",r,c-1));
        }
        if(r>1 && c>1){
            paths.addAll(printPaths1(p+"D",r-1,c-1));
        }

        return paths;
    }


    /*

    (BackTracking) ----->

    */

    //printing paths, if maze moves right and down with obstacle at (2,2)
    static void printPaths3(String p, boolean[][] pathBox, int r , int c){

        if(r == pathBox.length-1 && c ==pathBox[0].length-1){
            System.out.print(p+" ");
            return;
        }

        if(!pathBox[r][c]){
            return;
        }

        //I'm considering this block in my path...
        pathBox[r][c] = false;

        if(r<pathBox.length-1){
            printPaths3(p+"B", pathBox,r+1,c);
        }
        if(c<pathBox[0].length-1){
            printPaths3(p+'R',pathBox, r,c+1);
        }
        if(r>0){
            printPaths3(p+'T',pathBox,r-1,c);
        }
        if(c>0){
            printPaths3(p+'L',pathBox,r,c-1);
        }


        //this is line where the function will be over...
        //so before the function gets removed, also removes the changes that were made by that function..
        pathBox[r][c] = true;

    }


    static void AllPathMatrixPrint(String p, boolean[][] maze, int r , int c,int[][] path,int step){


        if(r==maze.length-1 && c==maze[0].length-1){
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.print(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        //I'm considering this block in my path...
        maze[r][c] = false;
        path[r][c] = step;

        if(r<maze.length-1){
            AllPathMatrixPrint(p+'B',maze,r+1,c,path,step+1);
        }

        if(c< maze[0].length-1){
            AllPathMatrixPrint(p+'R',maze,r,c+1,path,step+1);
        }

        if(r>0){
            AllPathMatrixPrint(p+'T',maze,r-1,c,path,step+1);
        }

        if(c>0){
            AllPathMatrixPrint(p+'L',maze,r,c-1,path,step+1);
        }

        //this is line where the function will be over...
        //so before the function gets removed, also removes the changes that were made by that function..
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
