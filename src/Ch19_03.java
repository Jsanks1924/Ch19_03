import java.util.ArrayList;
 /*
 Write the following method that returns a new ArrayList.
  The new list contains the non-duplicate elements from the original list.

 public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)

 @JSanks
 */

public class Ch19_03 {




        public static void main(String[] args){

            ArrayList<String> reList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                reList.add("jonathan");
            }

            reList = removeDuplicates(reList);
            for (String s : reList) {
                System.out.println(s);
            }
        }

        public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

            ArrayList<E> newL = new ArrayList<>(list.size());
            for (E aList : list) {
                if (!newL.contains(aList)) {
                    newL.add(aList);
                }
            }
            return newL;
        }
    }

