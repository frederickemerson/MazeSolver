class mazeInp
{
    void main()throws Exception
    {
        String maze1[][]={
                {" "," ","x","x","x","x","x","x","x","x"},
                {"x"," "," "," "," "," "," "," "," ","x"},
                {"x"," ","x","x","x"," "," ","x"," ","x"},
                {"x"," ","x"," "," "," "," ","x"," ","x"},
                {"x"," ","x"," "," ","x"," ","x"," ","x"},
                {"x","x","x"," ","x","x","x","x","x","x"}
            };
        String maze2[][]={
                {"x"," ","x","x","x"},
                {"x"," "," ","x","x"},
                {"x","x"," ","x","x"},
                {"x"," "," "," "," "},
                {"x","x","x","x","x"}};
        String maze[][]={
                {" "," ","x","x","x","x","x"," ","x","x","x","x"},
                {"x"," "," "," ","x","x","x"," "," ","","x","x"},
                {"x"," "," ","x","x","x","x"," ","x","","x","x"},
                {"x"," "," "," ","x"," ","x"," ","x","x"," ","x"},
                {"x"," ","x"," "," ","x","x"," ","x","x","x","x"},
                {"x","x","x","x"," ","x","x","x"," "," "," "," "},
                {"x"," "," "," "," "," ","x","x"," ","x","x"," "},
                {"x"," ","x","x","x"," ","x","x"," "," ","x"," "},
                {"x"," ","x"," "," "," "," "," "," "," ","x"," "},
                {"x","x","x","x","x"," ","x"," ","x","x","x"," "}
            };
        for(int r=0;r<maze.length;r++)
        {
            for(int c=0;c<maze[0].length;c++)
            {
                System.out.print(maze[r][c]+" ");
            } 
            System.out.println();
        }
        System.out.println();
        //String a = move(maze,0,0,0,0,5,4);
        mazev3 mv = new mazev3(maze,9,11);
        mv.main();
    }
}