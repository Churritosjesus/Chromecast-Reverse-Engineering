	private final bwz a
	
	    public bwr(bwz p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private void a(bxi p4)
	    {
	        this.a.a(p4);
	        com.google.android.gms.common.api.Status v0_2 = this.a.a(p4.e());
	        if ((v0_2.k()) || (!this.a.k.containsKey(p4.e()))) {
	            p4.b(v0_2);
	        } else {
	            p4.d(new com.google.android.gms.common.api.Status(17));
	        }
	        return;
	    }
	
	
	    public final bwp a(bwp p2)
	    {
	        return this.b(p2);
	    }
	
	
	    public final void a()
	    {
	        while (!this.a.f.isEmpty()) {
	            try {
	                this.a(((bxi) this.a.f.remove()));
	            } catch (android.os.DeadObjectException v0_7) {
	                android.util.Log.w("GoogleApiClientConnected", "Service died while flushing queue", v0_7);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(int p7)
	    {
	        int v1;
	        if (p7 != -1) {
	            v1 = 0;
	        } else {
	            v1 = 1;
	        }
	        if (v1 == 0) {
	            int v2_0 = this.a.q.iterator();
	            while (v2_0.hasNext()) {
	                ((bxi) v2_0.next()).c(new com.google.android.gms.common.api.Status(8, "The connection to Google Play services was lost"));
	            }
	        } else {
	            this.a.f();
	            this.a.k.clear();
	        }
	        this.a.a(0);
	        if (v1 == 0) {
	            this.a.c.a(p7);
	        }
	        this.a.c.a();
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p1)
	    {
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p1, bvz p2, int p3)
	    {
	        return;
	    }
	
	
	    public final bwp b(bwp p2)
	    {
	        try {
	            this.a(p2);
	        } catch (int v0) {
	            this.a(1);
	        }
	        return p2;
	    }
	
	
	    public final void b()
	    {
	        return;
	    }
	
	
	    public final String c()
	    {
	        return "CONNECTED";
	    }
	
