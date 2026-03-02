import java.util.*;
 class UseCase8PalindromeCheckerApp{
    static class N{char d;N n;N(char d){this.d=d;}}
    static N r(N h){N p=null;while(h!=null){N t=h.n;h.n=p;p=h;h=t;}return p;}
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        String x=s.nextLine();
        N h=null,t=null;
        for(char c:x.toCharArray()){N n=new N(c);if(h==null)h=t=n;else{t.n=n;t=n;}}
        N f=h,sl=h;
        while(f!=null&&f.n!=null){sl=sl.n;f=f.n.n;}
        N sh=r(sl);
        while(sh!=null&&h.d==sh.d){h=h.n;sh=sh.n;}
        System.out.println(sh==null?"Palindrome":"Not Palindrome");
    }
}