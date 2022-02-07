public class CarpetCostCalculator {
    private Floor floor;
    private Carpet carpet;

    public CarpetCostCalculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
