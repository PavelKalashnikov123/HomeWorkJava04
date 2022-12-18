import java.util.LinkedList;

/**
 * task01
 */
public class task01 {
    public static void main(String[] args) {
        int[] listMas = {1,2,3,4,5,6,7,8};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }

        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);
    }

    
}
