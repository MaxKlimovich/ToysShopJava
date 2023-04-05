abstract class Toys {

    int id;
    String toyName;
    int countOfToy;
    int weigthChance;

    public Toys(int id, String toyName, int countOfToy, int weigthChance) {
        this.id = id;
        this.toyName = toyName;
        this.countOfToy = countOfToy;
        this.weigthChance = weigthChance;
    }

    public String getToyName() {
        return toyName;
    }

    public int getCountOfToy() {
        return countOfToy;
    }

    public int getId() {
        return id;
    }

    public int getWeigthChance() {
        return weigthChance;
    }

    public String getAllInfo() {
        return id+";"+toyName+";"+countOfToy+";"+ weigthChance;
    }

    public void setWeigthChance(int weigthChance) {
        this.weigthChance = weigthChance;
    }

    public void setCountOfToy(int countOfToy) {
        this.countOfToy = countOfToy;
    }
}
