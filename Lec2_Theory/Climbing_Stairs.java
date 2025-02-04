package T.Lec2_Theory;

public class Climbing_Stairs {
    public int climbStairs(int n) {
        if(n <= 1)return 1;
        int x = climbStairs(n-1);
        int y = climbStairs(n-2);
        return x + y;
    }
}
