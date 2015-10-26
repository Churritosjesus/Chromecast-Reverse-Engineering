final class dip
{
  final dip[] a;
  final int b;
  final int c;
  
  dip()
  {
    this.a = new dip['Ā'];
    this.b = 0;
    this.c = 0;
  }
  
  dip(int paramInt1, int paramInt2)
  {
    this.a = null;
    this.b = paramInt1;
    paramInt2 &= 0x7;
    paramInt1 = paramInt2;
    if (paramInt2 == 0) {
      paramInt1 = 8;
    }
    this.c = paramInt1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */