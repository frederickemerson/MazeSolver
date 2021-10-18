class FredMazeStack
{
    String a[];int top;
    FredMazeStack(int n)
    {
        this.a=new String[n];
        this.top=-1;
    }
    boolean isEmpty()
    {
        return (this.top==0)?true:false;
    }
    boolean isFull()
    {
        return (this.top==this.a.length-1)?true:false;
    }
    String pop()
    {
        if(this.isEmpty())
        {
            return "";
           // System.out.println("Stack is Empty");
        }
        String x = this.a[this.top-1];
        this.top-=1;
        return x;
    }
    void push(String x)
    {
        if(this.isFull())
        {
            return;
            //System.out.println("Stack is Empty");
        }
        this.top+=1;
        this.a[top]=x;
    }
    boolean search(String x)
    {
        for(int i=0;i<top;i++)
        {
            if(a[i].equals(x))
            {
                return true;
            }
        }
        return false;
    }
}