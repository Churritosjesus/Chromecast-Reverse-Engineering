	private synthetic android.support.v7.widget.ShareActionProvider a
	
	    public aak(android.support.v7.widget.ShareActionProvider p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final boolean onMenuItemClick(android.view.MenuItem p4)
	    {
	        int v0_3 = rl.a(android.support.v7.widget.ShareActionProvider.a(this.a), android.support.v7.widget.ShareActionProvider.b(this.a)).b(p4.getItemId());
	        if (v0_3 != 0) {
	            android.content.Context v1_3 = v0_3.getAction();
	            if (("android.intent.action.SEND".equals(v1_3)) || ("android.intent.action.SEND_MULTIPLE".equals(v1_3))) {
	                android.support.v7.widget.ShareActionProvider.a(this.a, v0_3);
	            }
	            android.support.v7.widget.ShareActionProvider.a(this.a).startActivity(v0_3);
	        }
	        return 1;
	    }
	
