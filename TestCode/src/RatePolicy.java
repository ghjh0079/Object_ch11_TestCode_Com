public interface RatePolicy {
    Money calculateFee(Phone phone);
}