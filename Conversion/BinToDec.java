class BinToDec
{
   int b_d(String B)
    {
        if(B.length()==0) return 0;
        else
          {
            int l=B.length()-1;
            int v=(B.charAt(0)-48)*(int)Math.pow(2,l);
            return v+b_d(B.substring(1));
        }
  }
}