
    int[] a = {8,6,7,3,0};//6,7,3,0,8
    int b = 0;
    while(b < a.length){
        for( int i = 0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1]=tmp;
            }
         }
      b++;
     }
     for(int i = 0;i<a.length;i++){
         System.out.print(a[i]);
     }
    
