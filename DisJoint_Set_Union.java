import java.util.*;
class Dsu{
     ArrayList<Integer>rank=new ArrayList<>();
    ArrayList<Integer>parent=new ArrayList<>(); 
    Dsu(int num){
     for(int i=0;i<=num;i++){
         rank.add(0);
         parent.add(i);
     }
    }
    public int findPar(int node){
        if(node==parent.get(node))return node;
        int ulp=findPar(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    
    public void union(int a,int b){
        int ulp_a=findPar(a);
        int ulp_b=findPar(b);
        if(ulp_a==ulp_b)return ;
        if(rank.get(ulp_a)<rank.get(ulp_b)){
            parent.set(ulp_a,ulp_b);
        }else if(rank.get(ulp_a)>rank.get(ulp_b)){
            parent.set(ulp_b,ulp_a);
        }else{
            parent.set(ulp_b,ulp_a);
            int r=rank.get(ulp_a);
            rank.set(ulp_a,r+1);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Dsu ds=new Dsu(7);
 		ds.union(1,2);
		ds.union(2,3);
		ds.union(4,5);
		ds.union(6,7);
		ds.union(5,6);
		ds.union(1,5);
		System.out.println(ds.findPar(3)==ds.findPar(7));
	}
}
