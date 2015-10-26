final class brc
  implements Thread.UncaughtExceptionHandler
{
  brc(brb parambrb) {}
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    paramThread = this.a.e;
    if (paramThread != null) {
      paramThread.e("Job execution failed", paramThrowable);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */