public class Subtract implements Operate {
    @Override
    public Double getResult(Double... numbers){
        Double result=numbers[0];
        for(int i=0;i<numbers.length;i++){
            result-=numbers[i];
        }
        return result;
    }
    
}
