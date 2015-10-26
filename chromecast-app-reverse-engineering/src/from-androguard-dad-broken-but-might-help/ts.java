	private synthetic tq a
	
	    ts(tq p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p4)
	    {
	        switch (p4.what) {
	            case 1:
	                tq v0_2 = this.a;
	                v0_2.h = 0;
	                if (v0_2.d == null) {
	                } else {
	                    v0_2.d.a(v0_2, v0_2.g);
	                }
	                break;
	            case 2:
	                tq v0_1 = this.a;
	                v0_1.f = 0;
	                v0_1.b(v0_1.e);
	                break;
	        }
	        return;
	    }
	
