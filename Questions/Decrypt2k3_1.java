//isc practical 2003 
class Decrypt2k3_1
  {
      String CT;
      byte shift;
      
      Decrypt2k3_1(String CT, byte shift)
        {
            this.CT=CT;
            if(shift<2 || shift>25)
                              System.out.println("invalid shift value");                 
           shift--;
           this.shift=shift;
            
        }
        
      void decryptNow()
        {
            int l=CT.length();
            String DT="";
            for(int i=0;i<l;i++)
             {
                 int x=CT.charAt(i);
                 if(x==32) continue;
                 x=x+shift;
                 if(x>90) x-=26;
                 DT=DT+(char)x;
             }
            System.out.println("Decrypted text is ");
            for(int i=0;i<DT.length();i++)
             {
                 if (DT.charAt(i)=='Q' && DT.charAt(i+1)=='Q')
                                                 {System.out.print(" ");
                                                   i++;}
                 else System.out.print(DT.charAt(i));
             }
           }
       }