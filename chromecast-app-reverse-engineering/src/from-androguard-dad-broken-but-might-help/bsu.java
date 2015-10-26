	
	    public bsu()
	    {
	        return;
	    }
	
	
	    public bwj a(com.google.android.gms.common.api.GoogleApiClient p2)
	    {
	        return p2.b(new bsy(this, p2));
	    }
	
	
	    public bwj a(com.google.android.gms.common.api.GoogleApiClient p2, String p3)
	    {
	        return p2.b(new bsw(this, p2, p3));
	    }
	
	
	    public bwj a(com.google.android.gms.common.api.GoogleApiClient p2, String p3, String p4)
	    {
	        return p2.b(new bsv(this, p2, p3, p4));
	    }
	
	
	    public void a(com.google.android.gms.common.api.GoogleApiClient p9, double p10)
	    {
	        try {
	            IllegalArgumentException v0_2 = ((bue) p9.a(but.a));
	        } catch (IllegalArgumentException v0) {
	            throw new java.io.IOException("service error");
	        }
	        if ((!Double.isInfinite(p10)) && (!Double.isNaN(p10))) {
	            ((buo) v0_2.o()).a(p10, v0_2.d, v0_2.c);
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("Volume cannot be ").append(p10).toString());
	        }
	    }
	
	
	    public void a(com.google.android.gms.common.api.GoogleApiClient p4, String p5, btd p6)
	    {
	        try {
	            buo v0_2 = ((bue) p4.a(but.a));
	            a.d(p5);
	            v0_2.a(p5);
	        } catch (buo v0) {
	            throw new java.io.IOException("service error");
	        }
	        if (p6 != null) {
	            v0_2.b.put(p5, p6);
	            ((buo) v0_2.o()).b(p5);
	        }
	        return;
	    }
	
	
	    public bwj b(com.google.android.gms.common.api.GoogleApiClient p2)
	    {
	        return p2.b(new bsz(this, p2));
	    }
	
	
	    public bwj b(com.google.android.gms.common.api.GoogleApiClient p2, String p3)
	    {
	        return p2.b(new bsx(this, p2, p3));
	    }
	
	
	    public double c(com.google.android.gms.common.api.GoogleApiClient p3)
	    {
	        double v0_2 = ((bue) p3.a(but.a));
	        v0_2.f();
	        return v0_2.d;
	    }
	
	
	    public void c(com.google.android.gms.common.api.GoogleApiClient p3, String p4)
	    {
	        try {
	            ((bue) p3.a(but.a)).a(p4);
	            return;
	        } catch (java.io.IOException v0) {
	            throw new java.io.IOException("service error");
	        }
	    }
	
	
	    public com.google.android.gms.cast.ApplicationMetadata d(com.google.android.gms.common.api.GoogleApiClient p2)
	    {
	        com.google.android.gms.cast.ApplicationMetadata v0_2 = ((bue) p2.a(but.a));
	        v0_2.f();
	        return v0_2.a;
	    }
	
