import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> L1 = new ArrayList<>();
        L1.add(1);
        L1.add(2);
        L1.add(5);
        L1.add(7);
        L1.add(0,8);
        L1.add(3,9);


        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }


    }
}
