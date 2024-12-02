package Recursion.BackTracking.MazeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingPaths {

    public static void main(String[] args) {

        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };


        //print number of paths for right and down..
        System.out.println("Number of path in maze to reach from point A to B -> " + NumberOfPaths(3,3));


        //print paths with right and down...
        System.out.println("Path with direction right and down --> ");
        printPath("",3,3);
        System.out.println();

        System.out.println("Path with direction right and down --> ");
        System.out.println(printPath1("",3,3));
        System.out.println();



        //print paths for direction right,down and diagonally....
        System.out.println("Including diagonal path too --> ");
        System.out.println(printDiagonalPath("",3,3));
        System.out.println();



        //path with obstacles...
        System.out.println("Path with obstacles --> ");
        printPathWithObstacles("",maze,3,3);
        System.out.println();

        System.out.println("Path with obstacles --> ");
        printPathWithObstacles1("",maze,0,0);
        System.out.println();



        //print all paths...
        System.out.println("All paths --> ");
        printAllPath("",maze,0,0);
        System.out.println();



        //printing path matrix....
        System.out.println("All path matrix print -->");
        int[][] path = new int[maze.length][maze[0].length];
        AllPathMatrixPrint("",maze,0,0,path,1);
    }

    static int NumberOfPaths(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = NumberOfPaths(r-1,c);
        int right = NumberOfPaths(r,c-1);

        return left+right;
    }

    static void printPath(String p, int r ,int c){

        if(r==1 && c==1){
            System.out.print(p+", ");
            return;
        }

        if(r>1){
            printPath(p+'V',r-1,c);
        }

        if(c>1){
            printPath(p+'H',r,c-1);
        }
    }

    static ArrayList<String> printPath1(String p,int r , int c){

        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(printPath1(p+'V',r-1,c));
        }

        if(c>1){
            ans.addAll(printPath1(p+'H',r,c-1));
        }

        return ans;
    }


    //Including diagonal path...
    static ArrayList<String> printDiagonalPath(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1 && c>1){
            ans.addAll(printDiagonalPath(p+'D',r-1,c-1));
        }

        if(r>1){
            ans.addAll(printDiagonalPath(p+'V',r-1,c));
        }

        if(c>1){
            ans.addAll(printDiagonalPath(p+'H',r,c-1));
        }

        return ans;
    }


    //path with obstacles....
    static void printPathWithObstacles(String p, boolean[][] maze, int r , int c){

        if(r==1 && c==1){
            System.out.print(p+", ");
            return;
        }

        if(!maze[r - 1][c - 1]){    //checks at the index 1,1 of boolean maze,
                                    // because when we reach at r=2 ans c=2,
                                    //maze will check for r=1 and c=1 which is false.

            return;
        }

        if(r>1){
            printPathWithObstacles(p+'V',maze,r-1,c);
        }

        if(c>1){
            printPathWithObstacles(p+'H',maze,r,c-1);
        }

    }


    //path with obstacles, if index 0,0 is consider except 3,3
    static void printPathWithObstacles1(String p, boolean[][] maze, int r , int c){

        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.print(p+", ");
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            printPathWithObstacles1(p+'V',maze,r+1,c);
        }

        if(c< maze[0].length-1){
            printPathWithObstacles1(p+'H',maze,r,c+1);
        }

    }



    //including all paths,means all direction left,right,top and bottom
    static void printAllPath(String p, boolean[][] maze, int r , int c){


        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.print(p+", ");
            return;
        }

        if(!maze[r][c]){
            return;
        }

        //I'm considering this block in my path...
        maze[r][c] = false;

        if(r<maze.length-1){
            printAllPath(p+'B',maze,r+1,c);
        }

        if(c< maze[0].length-1){
            printAllPath(p+'R',maze,r,c+1);
        }

        if(r>0){
            printAllPath(p+'T',maze,r-1,c);
        }

        if(c>0){
            printAllPath(p+'L',maze,r,c-1);
        }

        //this is line where the function will be over...
        //so before the function gets removed, also removes the changes that were made by that function..
        maze[r][c] = true;

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
