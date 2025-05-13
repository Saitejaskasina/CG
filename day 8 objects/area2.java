public class area2 {
   public static void a(){
        System.out.println(get(4));
    }
    int get(int f){
        if(f--<0)
    return 3;
int x = get(f--);
return x*f;    }
    
}
