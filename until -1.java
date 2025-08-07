public class until{
  public static void main(String[] args){
    int []num={7, -2, 9, -8, -6, -4, 10, -1};
    int psum=0,nsum=0,pc=0,nc=0;
    for(int i=0;num[i]!=-1;i++){
      if(num[i]>0){
        psum+=num[i];
        pc++;
      }
        else{
          nsum+=num[i];
          nc++;
        }
    }
    
    System.out.println("sum of positive"+(psum/pc));
    
    System.out.println("sum od negative"+(nsum/nc));
    
  }
}
        
      
