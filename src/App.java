public class App {
    public static void main(String[] args) throws Exception {
        
        int[] dizi = {1,2,3,4};

        var toplam =0;

        for(var item :dizi){
            toplam+=item;
        }

        System.out.println((double)toplam/dizi.length);
    }
}
