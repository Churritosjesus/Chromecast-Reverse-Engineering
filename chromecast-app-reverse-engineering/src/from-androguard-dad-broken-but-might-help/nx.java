	private synthetic no a
	
	    nx(no p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(qa p6, boolean p7)
	    {
	        no v0_0;
	        qa v2 = p6.k();
	        if (v2 == p6) {
	            v0_0 = 0;
	        } else {
	            v0_0 = 1;
	        }
	        if (v0_0 != null) {
	            p6 = v2;
	        }
	        nw v3_1 = this.a.a(p6);
	        if (v3_1 != null) {
	            if (v0_0 == null) {
	                this.a.a(v3_1, p7);
	            } else {
	                this.a.a(v3_1.a, v3_1, v2);
	                this.a.a(v3_1, 1);
	            }
	        }
	        return;
	    }
	
	
	    public final boolean a_(qa p3)
	    {
	        if ((p3 == null) && (this.a.g)) {
	            android.view.Window$Callback v0_4 = this.a.b.getCallback();
	            if ((v0_4 != null) && (!this.a.m)) {
	                v0_4.onMenuOpened(8, p3);
	            }
	        }
	        return 1;
	    }
	
