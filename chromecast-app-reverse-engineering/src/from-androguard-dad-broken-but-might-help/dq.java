	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final  b
	private final  c
	private final  d
	private final  e
	private final java.lang.CharSequence f
	private final  g
	private java.util.List h
	private final  i
	private final android.os.Bundle j
	
	    static dq()
	    {
	        dq.CREATOR = new dr();
	        return;
	    }
	
	
	    private dq(int p3, long p4, long p6, float p8, long p9, CharSequence p11, long p12, java.util.List p14, long p15, android.os.Bundle p17)
	    {
	        this.a = p3;
	        this.c = p4;
	        this.d = p6;
	        this.e = p8;
	        this.b = p9;
	        this.f = p11;
	        this.g = p12;
	        this.h = new java.util.ArrayList(p14);
	        this.i = p15;
	        this.j = p17;
	        return;
	    }
	
	
	    dq(android.os.Parcel p3)
	    {
	        this.a = p3.readInt();
	        this.c = p3.readLong();
	        this.e = p3.readFloat();
	        this.g = p3.readLong();
	        this.d = p3.readLong();
	        this.b = p3.readLong();
	        this.f = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p3));
	        this.h = p3.createTypedArrayList(ds.CREATOR);
	        this.i = p3.readLong();
	        this.j = p3.readBundle();
	        return;
	    }
	
	
	    public static dq a(Object p16)
	    {
	        if ((p16 != null) && (android.os.Build$VERSION.SDK_INT >= 21)) {
	            dq v0_3 = ((android.media.session.PlaybackState) p16).getCustomActions();
	            java.util.ArrayList v12_0 = 0;
	            if (v0_3 != null) {
	                v12_0 = new java.util.ArrayList(v0_3.size());
	                dq v0_4 = v0_3.iterator();
	                while (v0_4.hasNext()) {
	                    v12_0.add(ds.a(v0_4.next()));
	                }
	            }
	            int v15;
	            if (android.os.Build$VERSION.SDK_INT < 22) {
	                v15 = 0;
	            } else {
	                v15 = ((android.media.session.PlaybackState) p16).getExtras();
	            }
	            dq v0_9 = new dq(((android.media.session.PlaybackState) p16).getState(), ((android.media.session.PlaybackState) p16).getPosition(), ((android.media.session.PlaybackState) p16).getBufferedPosition(), ((android.media.session.PlaybackState) p16).getPlaybackSpeed(), ((android.media.session.PlaybackState) p16).getActions(), ((android.media.session.PlaybackState) p16).getErrorMessage(), ((android.media.session.PlaybackState) p16).getLastPositionUpdateTime(), v12_0, ((android.media.session.PlaybackState) p16).getActiveQueueItemId(), v15);
	        } else {
	            v0_9 = 0;
	        }
	        return v0_9;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder("PlaybackState {");
	        v0_1.append("state=").append(this.a);
	        v0_1.append(", position=").append(this.c);
	        v0_1.append(", buffered position=").append(this.d);
	        v0_1.append(", speed=").append(this.e);
	        v0_1.append(", updated=").append(this.g);
	        v0_1.append(", actions=").append(this.b);
	        v0_1.append(", error=").append(this.f);
	        v0_1.append(", custom actions=").append(this.h);
	        v0_1.append(", active item id=").append(this.i);
	        v0_1.append("}");
	        return v0_1.toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p3, int p4)
	    {
	        p3.writeInt(this.a);
	        p3.writeLong(this.c);
	        p3.writeFloat(this.e);
	        p3.writeLong(this.g);
	        p3.writeLong(this.d);
	        p3.writeLong(this.b);
	        android.text.TextUtils.writeToParcel(this.f, p3, p4);
	        p3.writeTypedList(this.h);
	        p3.writeLong(this.i);
	        p3.writeBundle(this.j);
	        return;
	    }
	
