final class kf
{
  int a;
  int b;
  float c;
  float d;
  long e = Long.MIN_VALUE;
  long f = 0L;
  int g = 0;
  int h = 0;
  long i = -1L;
  float j;
  int k;
  
  float a(long paramLong)
  {
    float f1 = 0.0F;
    if (paramLong < this.e) {}
    for (;;)
    {
      return f1;
      if ((this.i < 0L) || (paramLong < this.i))
      {
        f1 = ke.a((float)(paramLong - this.e) / this.a, 0.0F, 1.0F) * 0.5F;
      }
      else
      {
        long l = this.i;
        float f2 = this.j;
        f1 = this.j;
        f1 = ke.a((float)(paramLong - l) / this.k, 0.0F, 1.0F) * f1 + (1.0F - f2);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\kf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */