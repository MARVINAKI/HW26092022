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

        /* ###############  Изначально уже выполнил задания через конструкцию else ############### */


        //Exercise 4
        int agePerson3=100;
        boolean kinder=agePerson3>=2&&agePerson3<7;
        boolean school=agePerson3>=7&&agePerson3<18;
        boolean university=agePerson3>=18&&agePerson3<24;
        boolean work=agePerson3>=24&&agePerson3<65;
        boolean relax=agePerson3>=65&&agePerson3<100;
            if (kinder) {
                System.out.println("Если возраст человека равен " + agePerson3 + ", то ему нужно ходить в детский сад");
            } else {
                if (school) {
                    System.out.println("Если возраст человека равен " + agePerson3 + ", то ему нужно ходить в школу");
                } else {
                    if (university) {
                        System.out.println("Если возраст человека равен " + agePerson3 + ", то ему нужно ходить в университет");
                    } else {
                        if (work) {
                            System.out.println("Если возраст человека равен " + agePerson3 + ", то ему нужно ходить на работу");
                        } else {
                            if (relax) {
                                System.out.println("Если возраст человека равен " + agePerson3 + ", то ему нужно отдыхать");
                            } else {
                                System.out.println("Возможно, вы ввели некорректный возраст");
                            }
                        }
                    }
                }
            }
        System.out.println();

        //Exercise 5
        int agePerson4=14;
        boolean child1=agePerson4>0&&agePerson4<5;
        boolean child2=agePerson4>=5&&agePerson4<14;
        boolean child3=agePerson4>=14&&agePerson4<18;
        boolean checkAge=agePerson4<=0||agePerson4>=18;
        System.out.println("Возраст ребёнка (лет): " + agePerson4);
            if (checkAge) {
                System.out.println("Введите возраст ребёнка в пределах от 1 до 17");
            } else {
                if (child1) {
                    System.out.println("Если ребёнку меньше 5 лет, то он не может кататься на атракционе.");
                } else {
                    if (child2) {
                        System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в" + "\n" +
                                "сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
                    } else {
                        if (child3) {
                            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");
                        }
                    }
                }
            }
        System.out.println();

        //Exercise 6
        int one=11, two=111, three=1;
        boolean checkIntAll=one==two&&one==three&&two==three;
        System.out.println("Введены три числа: " + "\n"+
                "1) " + one + "\n" +
                "2) " + two + "\n" +
                "3) " + three);
        if (checkIntAll) {
            System.out.println("НаибОльшего числа нет, все равны " + one);
        } else
            if (one>two&&two==three) {
                System.out.println("НаибОльшее число это: " + one);
            } else
                if (two>one&&one==three) {
                    System.out.println("НаибОльшее число это: " + two);
                } else
                    if (three>one&&one==two) {
                        System.out.println("НаибОльшее число это: " + three);
                    } else
                        if (one>two&&one>three) {
                            System.out.println("НаибОльшее число это: " + one);
                        } else
                            if (two>one&&two>three) {
                                System.out.println("НаибОльшее число это: " + two);
                            } else
                                if (three>one&&three>two) {
                                    System.out.println("НаибОльшее число это: " + three);
                                } else
                                    if (one<two&&two==three) {
                                        System.out.println("НаибОльших чисел два и оно равно: " + two);
                                    } else
                                        if (two<one&&one==three) {
                                            System.out.println("НаибОльших чисел два и оно равно: " + one);
                                        } else
                                            System.out.println("НаибОльших чисел два и оно равно: " + one);
        System.out.println();
    }
}