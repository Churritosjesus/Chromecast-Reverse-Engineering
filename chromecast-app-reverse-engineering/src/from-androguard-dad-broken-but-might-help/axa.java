	private synthetic dbc a
	private synthetic awr b
	
	    axa(awr p1, dbc p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        android.content.Intent v0_1 = new android.content.Intent(this.a.b);
	        v0_1.addFlags(268435456);
	        this.b.y.startActivity(v0_1);
	        return;
	    }
	
