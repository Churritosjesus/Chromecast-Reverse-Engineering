import android.view.View;

final class il
  implements iu
{
  private ih a;
  
  il(ih paramih)
  {
    this.a = paramih;
  }
  
  public final void a(View paramView)
  {
    if (ih.c(this.a) >= 0) {
      gt.a(paramView, 2, null);
    }
    if (ih.a(this.a) != null) {
      ih.a(this.a).run();
    }
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof iu)) {}
    for (localObject = (iu)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((iu)localObject).a(paramView);
      }
      return;
    }
  }
  
  public final void b(View paramView)
  {
    if (ih.c(this.a) >= 0)
    {
      gt.a(paramView, ih.c(this.a), null);
      ih.a(this.a, -1);
    }
    if (ih.b(this.a) != null) {
      ih.b(this.a).run();
    }
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof iu)) {}
    for (localObject = (iu)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((iu)localObject).b(paramView);
      }
      return;
    }
  }
  
  public final void c(View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof iu)) {}
    for (localObject = (iu)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((iu)localObject).c(paramView);
      }
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\il.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */