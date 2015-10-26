import android.view.MotionEvent;

class gh
{
  public int a(MotionEvent paramMotionEvent)
  {
    return 1;
  }
  
  public int a(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {}
    for (paramInt = 0;; paramInt = -1) {
      return paramInt;
    }
  }
  
  public int b(MotionEvent paramMotionEvent)
  {
    return 0;
  }
  
  public int b(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
  }
  
  public float c(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return paramMotionEvent.getX();
    }
    throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
  }
  
  public float d(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return paramMotionEvent.getY();
    }
    throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
  }
  
  public float e(MotionEvent paramMotionEvent, int paramInt)
  {
    return 0.0F;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\gh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */