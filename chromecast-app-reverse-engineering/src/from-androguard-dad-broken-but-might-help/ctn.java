	 ctk a
	 ctk b
	 com.google.android.gms.common.api.Status c
	 cyy d
	  e
	 cuq f
	
	    public ctn(com.google.android.gms.common.api.Status p1)
	    {
	        this.c = p1;
	        return;
	    }
	
	
	    public ctn(cuq p3, android.os.Looper p4, ctk p5, bb p6)
	    {
	        this.f = p3;
	        if (p4 == null) {
	            android.os.Looper.getMainLooper();
	        }
	        this.a = p5;
	        this.c = com.google.android.gms.common.api.Status.a;
	        p3.c.put(this, Boolean.valueOf(1));
	        return;
	    }
	
	
	    public declared_synchronized void a()
	    {
	        try {
	            if (!this.e) {
	                this.e = 1;
	                // Both branches of the condition point to the same code.
	                // if (this.f.c.remove(this) == null) {
	                    this.a.a = 0;
	                    this.a = 0;
	                    this.b = 0;
	                    this.d = 0;
	                // }
	            } else {
	                cuh.a("Releasing a released ContainerHolder.");
	            }
	        } catch (int v0_10) {
	            throw v0_10;
	        }
	        return;
	    }
	
	
	    public declared_synchronized void a(ctk p2)
	    {
	        try {
	            if (!this.e) {
	                this.b = p2;
	                this.d();
	            }
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	        return;
	    }
	
	
	    public declared_synchronized void a(String p2)
	    {
	        try {
	            if (!this.e) {
	                this.a.a().a(p2);
	            }
	        } catch (cxi v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    public com.google.android.gms.common.api.Status b()
	    {
	        return this.c;
	    }
	
	
	    public declared_synchronized ctk c()
	    {
	        ctk v0_0 = 0;
	        try {
	            if (!this.e) {
	                if (this.b != null) {
	                    this.a = this.b;
	                    this.b = 0;
	                }
	                v0_0 = this.a;
	            } else {
	                cuh.a("ContainerHolder is released.");
	            }
	        } catch (ctk v0_4) {
	            throw v0_4;
	        }
	        return v0_0;
	    }
	
	
	    void d()
	    {
	        return;
	    }
	
