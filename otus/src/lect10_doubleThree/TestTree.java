package lect10_doubleThree;

public class TestTree {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        BinaryTree binaryTree2 = new BinaryTree();
        int length = 16000;

//        массивы для поиска
        int [] findItems = new int[length/10];
        int [] findItems2 = new int[length/10];

        int insertedValue;
        long t1 = System.currentTimeMillis();
        int k = 0;
        for (int i = 0; i < length; i++) {
            insertedValue = (int) ((Math.random() * (100 - 1)) + 1);
            binaryTree.insert(insertedValue);
            if(i%10==0){
                findItems[k++] = insertedValue;
            }
        }

        System.out.println(" timing of input random values: " + (System.currentTimeMillis()-t1));
        k=0;
        t1 = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            binaryTree2.insert(i*8);
            if(i%10 == 0){
                findItems2[k++] = i*8;
            }
        }
        System.out.println(" timing of input sort values : " + (System.currentTimeMillis()-t1));

        t1 = System.currentTimeMillis();
        for (int j: findItems){
           if(!binaryTree.search(j))
               System.out.println(false);
        }
        System.out.println(" timing of search random values : " + (System.currentTimeMillis()-t1));

        t1 = System.currentTimeMillis();
        for (int j: findItems2){
            if(!binaryTree2.search(j))
                System.out.println(false);
        }
        System.out.println(" timing of search sort values : " + (System.currentTimeMillis()-t1));


        t1 = System.currentTimeMillis();
        for (int j: findItems){
                binaryTree.remove(j);
        }
        System.out.println(" timing of remove random values : " + (System.currentTimeMillis()-t1));

        t1 = System.currentTimeMillis();
        for (int j: findItems2){
            binaryTree2.remove(j);
        }
        System.out.println(" timing of remove sort values : " + (System.currentTimeMillis()-t1));
    }
}
