package Company.OppO;

import java.util.Scanner;

class Main {
    private static int d[],min=Integer.MAX_VALUE,yn[];
    private Node head[],temp[];

    public void setHead(int n) {
        this.head = new Node[n];
    }

    public void setTemp(int n) {
        this.temp = new Node[n];
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n,m,i,x,y,a[];
        Node t;
        n=Integer.parseInt(sc.next());
        m=Integer.parseInt(sc.next());
        Main idc=new Main();
        idc.setHead(n);idc.setTemp(n);
        d=new int[n];
        yn=new int[n];
        for(i=0;i<n;i++)
        {
            idc.head[i]=idc.new Node();
            idc.temp[i]=idc.head[i];
        }
        for(i=0;i<m;i++)
        {
            x=Integer.parseInt(sc.next())-1;
            y=Integer.parseInt(sc.next())-1;
            d[x]++;d[y]++;
            t=idc.new Node();t.n=y;
            idc.temp[x].next=t;idc.temp[x]=t;
            t=idc.new Node();t.n=x;
            idc.temp[y].next=t;idc.temp[y]=t;
        }
        d[0]++;
        for(i=0;i<n;i++)d[i]--;
        yn[0]=1;
        a=new int[1];
        chuanran(a,idc,1);
        System.out.println(min);
    }

    private static void chuanran(int[] a, Main idc, int num) {
        // TODO Auto-generated method stub
        int n=a.length,i,newn=num,na[],t,m,j;
        Node te;
        for(i=0;i<n;i++)if(a[i]!=-1)newn+=d[a[i]];
        if(newn==num)
        {
            if(newn<min)min=newn;
            return;
        }
        newn--;
        if(newn>min)return;
        else
        {
            m=newn-num+1;
            na=new int[m];
            for(i=0,j=0;i<n;i++)
            {
                if(a[i]!=-1)
                {
                    for(te=idc.head[a[i]].next;te!=null;te=te.next)
                    {
                        if(yn[te.n]==1)continue;
                        else
                        {
                            na[j]=te.n;j++;
                            yn[te.n]=1;
                        }
                    }
                }
            }
            for(i=0;i<m;i++)
            {
                t=na[i];
                na[i]=-1;
                chuanran(na, idc, newn);
                na[i]=t;
            }
            for(i=0;i<m;i++)yn[na[i]]=0;
            return;
        }
    }

    class Node{
        int n;
        Node next;
    }
}


