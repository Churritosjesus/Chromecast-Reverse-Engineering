	private synthetic acb a
	
	    ach(acb p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onItemClick(android.widget.AdapterView p5, android.view.View p6, int p7, long p8)
	    {
	        acb.c(this.a).setOnItemClickListener(0);
	        this.a.a(acb.d(this.a), ((aby) p5.getAdapter()).a(p7));
	        acb v0_8 = android.os.Message.obtain(acb.e(this.a), acb.h());
	        v0_8.obj = acb.c(this.a);
	        acb.e(this.a).sendMessageDelayed(v0_8, 300);
	        this.a.clearComposingText();
	        return;
	    }
	
