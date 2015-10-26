	private bah e
	private apa f
	
	    public WebViewActivity()
	    {
	        return;
	    }
	
	
	    public final java.util.ArrayList b_()
	    {
	        return 0;
	    }
	
	
	    public final void c_()
	    {
	        this.d().a().d();
	        return;
	    }
	
	
	    public final android.content.Intent e()
	    {
	        return 0;
	    }
	
	
	    public final void f()
	    {
	        this.d().a().c();
	        return;
	    }
	
	
	    public void onBackPressed()
	    {
	        if (!this.e.e()) {
	            if (!this.f.p()) {
	                super.onBackPressed();
	            } else {
	                this.f.q();
	            }
	        } else {
	            this.e.d();
	        }
	        return;
	    }
	
	
	    public void onConfigurationChanged(android.content.res.Configuration p2)
	    {
	        super.onConfigurationChanged(p2);
	        this.e.a(p2);
	        return;
	    }
	
	
	    protected void onCreate(android.os.Bundle p5)
	    {
	        super.onCreate(p5);
	        this.setContentView(a.gU);
	        this.a(((android.support.v7.widget.Toolbar) this.findViewById(f.eo)));
	        this.e = new bah(this, this, bat.c);
	        if (this.getIntent().getBooleanExtra("topLevelActivity", 0)) {
	            ((android.support.v4.widget.DrawerLayout) this.findViewById(f.aW)).a(1);
	            this.d().a().b(1);
	            af v0_14 = this.e.c;
	            if (0 != v0_14.d) {
	                v0_14.a(v0_14.c, 0);
	                v0_14.d = 0;
	            }
	        }
	        this.d().a().a(this.getIntent().getStringExtra("title"));
	        this.f = apa.a(this.getIntent().getStringExtra("url"));
	        this.b.a().a(f.ey, this.f).b();
	        return;
	    }
	
	
	    protected void onDestroy()
	    {
	        super.onDestroy();
	        this.e.c();
	        return;
	    }
	
	
	    public boolean onKeyDown(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2)) {
	            v0_1 = super.onKeyDown(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onKeyUp(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2, this)) {
	            v0_1 = super.onKeyUp(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onOptionsItemSelected(android.view.MenuItem p4)
	    {
	        boolean v0 = 1;
	        if (!this.e.a(p4)) {
	            if ((p4.getItemId() != 16908332) || (this.e.c.d)) {
	                v0 = super.onOptionsItemSelected(p4);
	            } else {
	                this.finish();
	            }
	        }
	        return v0;
	    }
	
	
	    protected void onPostCreate(android.os.Bundle p2)
	    {
	        super.onPostCreate(p2);
	        this.e.c.c();
	        return;
	    }
	
	
	    protected void onStart()
	    {
	        super.onStart();
	        this.e.a();
	        return;
	    }
	
	
	    protected void onStop()
	    {
	        super.onStop();
	        this.e.b();
	        return;
	    }
	
