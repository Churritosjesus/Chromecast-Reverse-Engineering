import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class hz
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public int a;
  public Parcelable b;
  public ClassLoader c;
  
  static
  {
    Object localObject = new ia();
    if (Build.VERSION.SDK_INT >= 13) {}
    for (localObject = new dw((dv)localObject);; localObject = new du((dv)localObject))
    {
      CREATOR = (Parcelable.Creator)localObject;
      return;
    }
  }
  
  hz(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel);
    ClassLoader localClassLoader = paramClassLoader;
    if (paramClassLoader == null) {
      localClassLoader = getClass().getClassLoader();
    }
    this.a = paramParcel.readInt();
    this.b = paramParcel.readParcelable(localClassLoader);
    this.c = localClassLoader;
  }
  
  public hz(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final String toString()
  {
    return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
    paramParcel.writeParcelable(this.b, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\hz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */