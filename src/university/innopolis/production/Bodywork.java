package university.innopolis.production;

public class Bodywork {

    private Material[] materials;

    public Bodywork() {
        materials = new Material[3];
        materials[0] = new Material(1000);
        materials[1] = new Glass(2, 2,100);
        materials[2] = new Metal(2, 2,10);
    }

    private int getPrice() { // стоимость материалов
        int sum = 0;
        for (Material m : materials) {
            sum += m.getCost();
        }
        return sum;
    }

    public int getCastomerPrice() { // стоимость с нашей наценкой
        return getPrice() * 2;
    }

}