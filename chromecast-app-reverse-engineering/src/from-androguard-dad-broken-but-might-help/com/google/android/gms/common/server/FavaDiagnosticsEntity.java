	public static final bzu CREATOR
	public final  a
	public final java.lang.String b
	public final  c
	
	    static FavaDiagnosticsEntity()
	    {
	        com.google.android.gms.common.server.FavaDiagnosticsEntity.CREATOR = new bzu();
	        return;
	    }
	
	
	    public FavaDiagnosticsEntity(int p1, String p2, int p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bzu.a(this, p1);
	        return;
	    }
	
