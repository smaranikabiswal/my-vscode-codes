public class kanp{
    public static void main(String args[]){
        int w[]={12,34,32,56};
        int v[]={12,54,78,90};
        int cap=50;
        double ratio[]=new double[w.length];
        for(int i=0;i<w.length;i++){
            ratio[i]=(double)v[i]/w[i];
            
        }
        for (int i = 0; i < ratio.length-1; i++) {
          for (int j = i+1; j < ratio.length; j++) {
              if (ratio[i]<ratio[j]) {
                double temp= ratio[i];
                 ratio[i]=ratio[j];
                 ratio[j]=temp;
                 int tempa=w[i];
                 w[i]=w[j];
                 w[j]=tempa; 
                 int tempb=v[i];
                 v[i]=v[j];
                 v[j]=tempb;
              }
          }  
        }
double maxval=0;
for (int i = 0; i < w.length; i++) {
 if (cap>=w[i]) {
    maxval+=v[i];
    cap-=w[i]; 
 } else {
    maxval+=ratio[i]*cap;
 }  
}
    
    System.out.println("max value is"+maxval);
}}