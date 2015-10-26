	public static final android.os.Parcelable$Creator CREATOR
	private final java.lang.String a
	private final java.lang.CharSequence b
	private final  c
	private final android.os.Bundle d
	
	    static ds()
	    {
	        ds.CREATOR = new dt();
	        return;
	    }
	
	
	    ds(android.os.Parcel p2)
	    {
	        this.a = p2.readString();
	        this.b = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p2));
	        this.c = p2.readInt();
	        this.d = p2.readBundle();
	        return;
	    }
	
	
	    private ds(String p1, CharSequence p2, int p3, android.os.Bundle p4)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        return;
	    }
	
	
	    public static ds a(Object p5)
	    {
	        if ((p5 != null) && (android.os.Build$VERSION.SDK_INT >= 21)) {
	            ds v0_8 = new ds(((android.media.session.PlaybackState$CustomAction) p5).getAction(), ((android.media.session.PlaybackState$CustomAction) p5).getName(), ((android.media.session.PlaybackState$CustomAction) p5).getIcon(), ((android.media.session.PlaybackState$CustomAction) p5).getExtras());
	        } else {
	            v0_8 = 0;
	        }
	        return v0_8;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("Action:mName=\'").append(this.b).append(", mIcon=").append(this.c).append(", mExtras=").append(this.d).toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeString(this.a);
	        android.text.TextUtils.writeToParcel(this.b, p2, p3);
	        p2.writeInt(this.c);
	        p2.writeBundle(this.d);
	        return;
	    }
	
