package university.innopolis.production;

class Glass extends Material {

    private int width;

    private int height;

    Glass(int width, int height, int cost) {
        super(cost);
        this.width = width;
        this.height = height;
    }

    @Override
    int getCost() {
        return super.getCost() * height * width;
    }
}
