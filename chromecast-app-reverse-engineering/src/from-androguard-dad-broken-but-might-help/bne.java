	private synthetic ast a
	private synthetic bnd b
	
	    bne(bnd p1, ast p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p9)
	    {
	        android.app.AlertDialog$Builder v0_1 = this.b.a;
	        int v1_0 = this.a;
	        int v2_1 = new android.app.AlertDialog$Builder(v0_1.h);
	        int v3_1 = v0_1.h;
	        Object[] v5_1 = new Object[1];
	        v5_1[0] = v1_0.c;
	        v2_1.setMessage(v3_1.getString(b.am, v5_1)).setPositiveButton(b.L, new bnf(v0_1, v1_0)).setNegativeButton(b.H, 0).show();
	        return;
	    }
	
