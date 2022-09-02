package OCA_Soruları;

public class OCA_23062022 {


        public static void countEgg(int numOfEgg){

            try {

                if(numOfEgg<0) {

                    throw new IllegalArgumentException();

                }else {

                    System.out.println(numOfEgg);

                }

            }catch(IllegalArgumentException e) {

                System.out.println("Yumurta sayisi negatif olamaz");

            }

        }
    }

