public class Main {

    public static void main(String[] args) {

        food[] bulk = new food[2];
        bulk[0] = new tuna();
        bulk[1] = new burger();

        for(int i=0;i< bulk.length;i++){
            bulk[i].eat();
        }
    }


}
