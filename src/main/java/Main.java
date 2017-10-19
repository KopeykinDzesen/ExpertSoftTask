import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(5);
        a.add(10);

        ArrayList b = new ArrayList();
        b.add(2);
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(8);

        merge(a, b);

        System.out.println("A" + a);
        System.out.println("B" + b);

    }

    static void merge(ArrayList a, ArrayList b){

        ArrayList ab = new ArrayList(a.size()+b.size());
        int index = 0;

        for (int i = 0; i < a.size(); i++){

            int aVal = ((Integer)a.get(i)).intValue();
            if (index == b.size()){
                ab.add(aVal);
                continue;
            }
            int bVal = ((Integer)b.get(index)).intValue();

            if(i == a.size()-1 && aVal < bVal){
                ab.add(aVal);
                for(int j = index; j < b.size(); j++){
                    ab.add(b.get(j));
                }
                break;
            }
            else if(i == a.size()-1 && (aVal > bVal || aVal == bVal)){
                ab.add(bVal);
                index++;
                i--;
                continue;
            }

            if(aVal == bVal){
                ab.add(aVal);
                ab.add(bVal);
                index++;
                continue;
            }
            else if(aVal < bVal){
                ab.add(aVal);
                continue;
            }
            else if(aVal > bVal) {
                ab.add(bVal);
                index++;
                i--;
            }

        }

        a.clear();
        a.ensureCapacity(ab.size());
        for (int i = 0; i < ab.size(); i++){
            a.add(ab.get(i));
        }

    }

}
