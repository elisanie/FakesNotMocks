public class FakeExchange implements Exchange {
    
    public float rate(String origin, String target) {
        if (origin.equals("USD") && target.equals("Euro")) {
            return 0.96f; 
        } else {
            return 1.0f; 
        }
    }

    public String toString() {
        return "Fake Exchange";
    }
}
