	private synthetic bdn a
	private synthetic ava b
	
	    avf(ava p1, android.os.Looper p2, bdn p3)
	    {
	        this.b = p1;
	        this.a = p3;
	        this(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p4)
	    {
	        switch (p4.what) {
	            case 0:
	                bdn v0_3 = ((bdf) p4.obj);
	                this.b.a(v0_3.a);
	                int v1_3 = this.b.b;
	                v0_3.h = v1_3.h;
	                v0_3.k = v1_3.k;
	                v0_3.i = v1_3.i;
	                v0_3.j = v1_3.j;
	                v0_3.l = v1_3.l;
	                this.a.a(v0_3);
	                break;
	            case 1:
	                this.a.b_(-1);
	                break;
	        }
	        return;
	    }
	
