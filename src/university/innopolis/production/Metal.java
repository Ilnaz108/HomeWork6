package university.innopolis.production;

class Metal extends Material {

    private int width;

    private int height;

    Metal(int width, int height, int cost) {
        super(cost);
        this.width = width;
        this.height = height;
    }

    @Override
    int getCost() {
        return super.getCost() * height * width;
    }
}
