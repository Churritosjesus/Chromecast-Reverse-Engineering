	private com.google.android.gms.common.data.DataHolder a
	private  b
	private  c
	
	    public bya(com.google.android.gms.common.data.DataHolder p3, int p4)
	    {
	        int v0_4;
	        this.a = ((com.google.android.gms.common.data.DataHolder) a.c(p3));
	        if ((p4 < 0) || (p4 >= this.a.h)) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        a.a(v0_4);
	        this.b = p4;
	        this.c = this.a.a(this.b);
	        return;
	    }
	
	
	    public final String a(String p5)
	    {
	        String v0_0 = this.a;
	        String v1_0 = this.b;
	        if ((v0_0.c != null) && (v0_0.c.containsKey(p5))) {
	            if (!v0_0.b()) {
	                if ((v1_0 >= null) && (v1_0 < v0_0.h)) {
	                    return v0_0.d[this.c].getString(v1_0, v0_0.c.getInt(p5));
	                } else {
	                    throw new android.database.CursorIndexOutOfBoundsException(v1_0, v0_0.h);
	                }
	            } else {
	                throw new IllegalArgumentException("Buffer is closed.");
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("No such column: ").append(p5).toString());
	        }
	    }
	
	
	    public boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof bya)) && ((a.e(Integer.valueOf(((bya) p4).b), Integer.valueOf(this.b))) && ((a.e(Integer.valueOf(((bya) p4).c), Integer.valueOf(this.c))) && (((bya) p4).a == this.a)))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_1 = new Object[3];
	        v0_1[0] = Integer.valueOf(this.b);
	        v0_1[1] = Integer.valueOf(this.c);
	        v0_1[2] = this.a;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
