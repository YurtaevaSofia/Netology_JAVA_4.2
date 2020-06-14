public class BmiService {

    public float calculate (float height, int weight){
        float BMI = weight/(height*height);
        return BMI;
    }
}
