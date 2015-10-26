public enum bdj
{
  public final int r;
  
  private bdj(int paramInt1)
  {
    this.r = paramInt1;
  }
  
  public static bdj a(int paramInt)
  {
    bdj[] arrayOfbdj = values();
    int i2 = arrayOfbdj.length;
    int i1 = 0;
    bdj localbdj;
    if (i1 < i2)
    {
      localbdj = arrayOfbdj[i1];
      if (localbdj.r != paramInt) {}
    }
    for (;;)
    {
      return localbdj;
      i1++;
      break;
      localbdj = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */