class mazev3
{
    String[][] puzzle;int end1,end2;
    FredMazeStack fs = new FredMazeStack(100000);
    
    mazev3(String[][] mae,int e1,int e2)
    {
        this.puzzle=mae;
        this.end1=e1;
        this.end2=e2;
    }
    
    boolean right(String maze[][],int sr,int sc,int pr)
    {
        return ((sr+1)!=maze.length && (sr+1)!=pr) && (!(maze[sr+1][sc].equals("x")));
    }

    boolean down(String maze[][],int sr,int sc,int pc)
    {
        return ((sc+1)!=maze[0].length && (sc+1)!=pc) && (!(maze[sr][sc+1].equals("x")));
    }

    boolean left(String maze[][],int sr,int sc,int pr)
    {
        return ((sr-1)>=0 && (sr-1)!=pr) && (!(maze[sr-1][sc].equals("x")));
    }

    boolean up(String maze[][],int sr,int sc,int pc)
    {
        return ((sc-1)>=0 && (sc-1)!=pc) && (!(maze[sr][sc-1].equals("x")));
    }

    String move(String maze[][],int sr,int sc,int pr,int pc,int er,int ec)
    {
        if(sr==er && sc==ec)
        {
            maze[sr][sc]="#";return "#";
        }
        if(fs.search(sr+","+sc))
        {
            fs.pop();
            return ""; 
        }
        else
        {
            fs.push(sr+","+sc);
        }
        //System.out.println(sr+","+sc+","+pr+","+pc+","+er+","+ec);

        if(right(maze,sr,sc,pr))
        {
            String a = move(maze,sr+1,sc,sr,sc,er,ec);
            if(a.equals("#"))
            {
                maze[sr][sc]="|";
                return "#";
            }
        }

        if(down(maze,sr,sc,pc))
        {
            String a = move(maze,sr,sc+1,sr,sc,er,ec);
            maze[sr][sc]="-";
            if(a.equals("#"))
            {
                return "#";
            }
        }

        if(left(maze,sr,sc,pr))
        {
            String a = move(maze,sr-1,sc,sr,sc,er,ec);
            if(a.equals("#"))
            {
                maze[sr][sc]="|";
                return "#";
            }
        }

        if(up(maze,sr,sc,pc))
        {
            String a = move(maze,sr,sc-1,sr,sc,er,ec);
            if(a.equals("#"))
            {
                maze[sr][sc]="-";
                return "#";
            }
        }

        maze[sr][sc]="x";
        fs.pop();
        return "";
    }

    void main()
    {
   
        String a = move(this.puzzle,0,0,0,0,this.end1,this.end2);
        for(int r=0;r<this.puzzle.length;r++)
        {
            for(int c=0;c<this.puzzle[0].length;c++)
            {
                System.out.print(this.puzzle[r][c]+" ");
            } 
            System.out.println();
        }    
    }
}
