class Patterns
{
    public void triangle()
    {
        //right angled triangle
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void invertedHalfPyramid()
    {
        //inverted half pyramid
        for(int i=0; i<5; i++)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pyramid()
    {
        //pyramid
        for(int i=1; i<=5; i++)
        {
            for(int j=5; j>i-1; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void numberHalfPyramid()
    {
        //number half pyramid row start with 0
        for(int i=0; i<5; i++)
        {
            int num=1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public void characterPyramid()
    {
        //character pyramid
        char ch='A';
        for(int i=1; i<=5; i++)
        {
            for(int j=5; j>=i-1; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public void pascalTriangle()
    {
        //pascal triangle
        for(int i=0; i<5; i++)
        {
            
            for(int j=5; j>=i-1; j--)
            {
                System.out.print(" ");
            }
            int num=1;
            for(int k=0; k<=i; k++)
            {
                System.out.print(num+" ");
                num=num*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
    public void hollowRectangle()
    {
        //Hollow rectangle pattern
        int col=6, row=4;
        for(int i=0; i<row; i++)
        {
          
            for(int j=0; j<col; j++)
            {
                if(i==0||j==0||i==row-1||j==col-1)
                {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public void InvertedRotatedHalfPyramid()
    {

        //Inverted and rotated half pyramid
        int t=6;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5-i; j++)
            {
               System.out.print(" ");
            }
           for(int k=1; k<=i; k++)
           {
            System.out.print("*");
           }
            System.out.println();
        }
    }
    public void floydsTriangle()
    {
        //Floyd's Triangle
        int te=1;
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if(i==4) System.out.print(te+" ");
                else System.out.print(te+"  ");
                te++;
            }
            System.out.println();
        }
    }
    public void zeroOneTriangle()
    {
        //0 1 triangle (imagine as a matrix where i=rows and j= columns)
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
    }
    public void butterfly()
    {

        //Butterfly 

         int n=4;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
                 
            }
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=4; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
                 
            }
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


public void solidRhombus()
{
    //Solid rhombus
        for(int i=0; i<5; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

public void hollowRhombus()
{


        //Hollow rhombus
        for(int i=0; i<5; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<5; j++)
            {
                if(i==0||j==0||i==4||j==4) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
public void diamond()
{

        //Diamond Pattern
    int n;
       for(int i=1; i<=5; i++)
        {
            for(int j=5; j>i-1; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        n=1;
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<i; k++)
            {
                System.out.print("* ");
            }
            n++;
            System.out.println();
        }
    }
     public void palindromicNumbers()
     {

        // Palindromic Pattern with numbers
      
        for(int i=1; i<=5; i++)
        {    
            for(int j=1; j<=5-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
             
            }
            for(int k=2; k<=i; k++)
            {
                System.out.print(k);
            }
            
            System.out.println();
        }
    }
    }
