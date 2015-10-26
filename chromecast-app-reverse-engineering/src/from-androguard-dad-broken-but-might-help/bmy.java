	private synthetic aow a
	private synthetic boc b
	private synthetic bmu c
	
	    bmy(bmu p1, aow p2, boc p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p5)
	    {
	        if (this.a.l()) {
	            this.c.a(this.a);
	            aui v0_3 = this.a;
	            atf v1_1 = v0_3.l;
	            aow v2_1 = (v0_3.n + 1);
	            v0_3.n = v2_1;
	            aui v0_5 = ((String) v1_1.get(v2_1));
	            atf v1_3 = new Object[2];
	            v1_3[0] = this.a.g();
	            v1_3[1] = v0_5;
	            this.b.y.setEnabled(this.a.k());
	            this.b.z.setEnabled(this.a.l());
	            this.c.b.a(this.c.b.a(v0_5, this.a));
	        }
	        return;
	    }
	
