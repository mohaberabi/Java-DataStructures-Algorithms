public class MergeKNodes {
    Node merge(Node a,Node b)
    {
        //base cases when either of two lists is null.
        if(a==null)
            return b;
        if(b==null)
            return a;

        //comparing data in both lists and storing the smaller in result and
        //recursively calling the merge function for next node in result.
        if(a.data<b.data)
        {
            a.next=merge(a.next,b);
            //returning the resultant list.
            return a;
        }
        else
        {
            b.next=merge(a,b.next);
            //returning the resultant list.
            return b;
        }
    }

    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        int N = K;

        int last=N-1;

        while(last!=0)
        {
            int i=0;int j=last;

            while(i<j)
            {
                //calling merge function to merge two different list into
                //one list which has sorted elements.
                arr[i]=merge(arr[i],arr[j]);

                //going for the next pair of lists.
                i++;j--;

                //if all pairs are merged, we update the last.
                if(i>=j)
                    last=j;
            }
        }
        //returning the merged list.
        return arr[0];
    }
}
