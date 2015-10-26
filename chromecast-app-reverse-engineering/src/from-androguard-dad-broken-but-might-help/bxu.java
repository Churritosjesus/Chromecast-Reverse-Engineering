	public final com.google.android.gms.common.data.DataHolder a
	
	    public bxu(com.google.android.gms.common.data.DataHolder p2)
	    {
	        this.a = p2;
	        if (this.a != null) {
	            this.a.i = this;
	        }
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (this.a != null) {
	            this.a.c();
	        }
	        return;
	    }
	
	
	    public final int b()
	    {
	        int v0_2;
	        if (this.a != null) {
	            v0_2 = this.a.h;
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public java.util.Iterator iterator()
	    {
	        return new bxz(this);
	    }
	
