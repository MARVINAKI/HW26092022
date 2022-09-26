public class Main {
    public static void main(String[] args) {

        //Exercise 1
        int agePerson1=25;
        if(agePerson1>=18){
            System.out.println("Поздравляю, Вам "+agePerson1+" лет и вы совершеннолетний. Вот вам повестка в военкомат.");
            System.out.println();
        }else{
            System.out.println("К сожалению Вам еще нет 18 лет");
            System.out.println();
        }

        //Exercise 2
        int agePerson2=188;
        System.out.println("Введеный возраст: " + agePerson2);
        if(Math.signum(agePerson2)!=-1) {
            if (agePerson2 >= 7 && agePerson2 < 18) {
                System.out.println("Ребёнок в возрасте " + agePerson2 + " лет, ходит в школу");
            }
            if (agePerson2 >= 18 && agePerson2 < 24) {
                System.out.println("В возрасте " + agePerson2 + " лет, можно отправляьбся учиться в университет");
            }
            if (agePerson2 >= 24 && agePerson2 < 65) {
                System.out.println("В возрасте " + agePerson2 + " лет, надо работать");
            }
            if (agePerson2 < 7 && agePerson2 > 0) {
                System.out.println("В возрасте " + agePerson2 + " лет, в садике или дома с родителями");
            }
            if (agePerson2>=65) {
                System.out.println("В этом возрасте, возможно, пора отдохнуть?");
            }
        }else {
            System.out.println("Введите корректный возраст, пожалуйста!");
        }
        System.out.println();

        //Exercise 3
        int placeTotal=102, placeSeat=60, placeStand=placeTotal-placeSeat;
        int pass=150, passOther=Math.abs(pass-placeTotal);
        System.out.println("Общая вместимость вагона: " + placeTotal + " чел." + "\n" +
                        "Сидячих мест: " + placeSeat + " чел. Стоячих: " + placeStand + " чел." + "\n" +
                        "Поток людей: " + pass + " чел.");
        if (pass < 0 || pass == 0){
            System.out.println("Введите корректное количество пассажиров");
        } else {
            if (pass > 0 && pass <= placeSeat) {
                System.out.println("В вагон поместятся все, сидя поедут: " + pass + " чел.");
            } else {
                if (pass > placeSeat && pass <= placeTotal) {
                    System.out.println("В вагон поместятся все, " + placeSeat + " поедут сидя, а стоя поедут " + (pass - placeSeat));
                } else { if(pass > placeTotal) {
                    System.out.println("В вагон поместится " + placeTotal + " пассажира" + "\n" +
                            "Сидя поедут " + placeSeat + ", а стоя поедут " + placeStand + "\n" +
                            "Остальные, " + passOther + " чел., поедут в других вагонах");
                }
                }
            }
        }
        System.out.println();

        //Exercise 4




    }
}