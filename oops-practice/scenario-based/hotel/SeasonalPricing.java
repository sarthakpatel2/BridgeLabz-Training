package hotel;

class SeasonalPricing implements PricingStrategy {
    public double calculate(double basePrice) {
        return basePrice * 1.2; // 20% seasonal hike
    }
}
