	public static final byb CREATOR
	public final  a
	public final Ljava.lang.String b
	public android.os.Bundle c
	public final Landroid.database.CursorWindow d
	public final  e
	public final android.os.Bundle f
	 I g
	public  h
	public java.lang.Object i
	private  j
	private  k
	
	    static DataHolder()
	    {
	        com.google.android.gms.common.data.DataHolder.CREATOR = new byb();
	        String[] v1_1 = new String[0];
	        new bxw(v1_1, 0);
	        return;
	    }
	
	
	    public DataHolder(int p2, String[] p3, android.database.CursorWindow[] p4, int p5, android.os.Bundle p6)
	    {
	        this.j = 0;
	        this.k = 1;
	        this.a = p2;
	        this.b = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        return;
	    }
	
	
	    public final int a(int p3)
	    {
	        int v0_1;
	        int v1 = 0;
	        if ((p3 < 0) || (p3 >= this.h)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        a.a(v0_1);
	        while (v1 < this.g.length) {
	            if (p3 >= this.g[v1]) {
	                v1++;
	            } else {
	                v1--;
	                break;
	            }
	        }
	        if (v1 == this.g.length) {
	            v1--;
	        }
	        return v1;
	    }
	
	
	    public final void a()
	    {
	        int v1 = 0;
	        this.c = new android.os.Bundle();
	        int v0_2 = 0;
	        while (v0_2 < this.b.length) {
	            this.c.putInt(this.b[v0_2], v0_2);
	            v0_2++;
	        }
	        int v0_5 = new int[this.d.length];
	        this.g = v0_5;
	        int v0_6 = 0;
	        while (v1 < this.d.length) {
	            this.g[v1] = v0_6;
	            v0_6 += (this.d[v1].getNumRows() - (v0_6 - this.d[v1].getStartPosition()));
	            v1++;
	        }
	        this.h = v0_6;
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        try {
	            return this.j;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public final void c()
	    {
	        try {
	            if (!this.j) {
	                this.j = 1;
	                int v0_2 = 0;
	                while (v0_2 < this.d.length) {
	                    this.d[v0_2].close();
	                    v0_2++;
	                }
	            }
	        } catch (int v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    protected final void finalize()
	    {
	        try {
	            if ((this.k) && ((this.d.length > 0) && (!this.b()))) {
	                String v0_6;
	                if (this.i != null) {
	                    v0_6 = this.i.toString();
	                } else {
	                    v0_6 = new StringBuilder("internal object: ").append(this.toString()).toString();
	                }
	                android.util.Log.e("DataBuffer", new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (").append(v0_6).append(")").toString());
	                this.c();
	            }
	        } catch (String v0_13) {
	            super.finalize();
	            throw v0_13;
	        }
	        super.finalize();
	        return;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        byb.a(this, p1, p2);
	        return;
	    }
	
