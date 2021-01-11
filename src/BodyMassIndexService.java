public class BodyMassIndexService  {
    public float calculate(float weight, float height) {
        float bodyMassIndex = weight / height / height;
        return bodyMassIndex;
    }
}