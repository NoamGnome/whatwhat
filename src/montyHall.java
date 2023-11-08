public class montyHall {




    private String goat1 = "";
    private String goat2 = "";
    private String car = "";




    public montyHall() {
        this.goat1 = goat1;
        this.goat2 = goat2;
        this.car = car;
    }


    public void doors() {
        int rand1 = (int) (Math.random() * 3) + 1;
        int rand2 = (int) (Math.random() * 2) + 1;
        if (rand1 == 1) {
            goat1 = "door 1";
        } else if (rand1 == 2) {
            goat1 = "door 2";
        } else {
            goat1 = "door 3";
        }
        if (goat1.equals("door 1")) {
            int rand = (int) (Math.random() * 2) + 1;
            if (rand == 1) {
                goat2 = "door 2";
                car = "door 3";
            }
            if (rand == 2) {
                goat2 = "door 3";
                car = "door 2";
            }
        }
        if (goat1.equals("door 2")) {
            int rand = (int) (Math.random() * 2) + 1;
            if (rand == 1) {
                goat2 = "door 1";
                car = "door 3";
            }
            if (rand == 2) {
                goat2 = "door 3";
                car = "door 1";
            }
        }
        if (goat1.equals("door 3")) {
            int rand = (int) (Math.random() * 2) + 1;
            if (rand == 1) {
                goat2 = "door 1";
                car = "door 2";
            }
            if (rand == 2) {
                goat2 = "door 2";
                car = "door 1";
            }
        }
    }
    public String getGoat1() {
        return goat1;
    }
    public String getGoat2() {
        return goat2;
    }
    public String car() {
        return car;
    }


}
