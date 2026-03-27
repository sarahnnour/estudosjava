public class Arrays {
    public static void main(String[] args) {

        String[] names = new String[]{"Sarah","Nour"};
        int[][] data = new int[3][3];

        data[0][0]=1;
        data[0][1]=2;
//        for(int i=0;i<names.length;i++){
//            System.out.println(names[i]);
//        }

        for(String name: names){
            System.out.println(name);
        }

        for(int[] arrayBase: data){
            for(int dia: arrayBase){
                System.out.println(dia);
            }
        }
    }

}
