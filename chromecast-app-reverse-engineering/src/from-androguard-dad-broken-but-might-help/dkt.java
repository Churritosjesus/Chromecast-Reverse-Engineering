	private static dks a
	private static  b
	
	    private dkt()
	    {
	        return;
	    }
	
	
	    static dks a()
	    {
	        dks v0_2;
	        if (dkt.a == null) {
	            v0_2 = new dks();
	        } else {
	            v0_2 = dkt.a;
	            dkt.a = v0_2.f;
	            v0_2.f = 0;
	            dkt.b = (dkt.b - 2048);
	        }
	        return v0_2;
	    }
	
	
	    static void a(dks p8)
	    {
	        if ((p8.f == null) && (p8.g == null)) {
	            if (!p8.d) {
	                try {
	                    if ((dkt.b + 2048) <= 65536) {
	                        dkt.b = (dkt.b + 2048);
	                        p8.f = dkt.a;
	                        p8.c = 0;
	                        p8.b = 0;
	                        dkt.a = p8;
	                    } else {
	                    }
	                } catch (int v0_6) {
	                    throw v0_6;
	                }
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException();
	        }
	    }
	
