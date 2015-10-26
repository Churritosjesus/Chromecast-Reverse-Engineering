	private nh e
	
	    public nf()
	    {
	        return;
	    }
	
	
	    private boolean e()
	    {
	        IllegalStateException v0_1;
	        android.content.Intent v2_0 = 0;
	        IllegalStateException v0_0 = at.a(this);
	        if (v0_0 == null) {
	            v0_1 = 0;
	        } else {
	            if (!at.a(this, v0_0)) {
	                at.b(this, v0_0);
	            } else {
	                IllegalStateException v0_3;
	                az v5 = az.a(this);
	                if (!(this instanceof ba)) {
	                    v0_3 = 0;
	                } else {
	                    v0_3 = ((ba) this).b();
	                }
	                int v3_1;
	                if (v0_3 != null) {
	                    v3_1 = v0_3;
	                } else {
	                    v3_1 = at.a(this);
	                }
	                if (v3_1 != 0) {
	                    IllegalStateException v0_7 = v3_1.getComponent();
	                    if (v0_7 == null) {
	                        v0_7 = v3_1.resolveActivity(v5.b.getPackageManager());
	                    }
	                    v5.a(v0_7);
	                    v5.a.add(v3_1);
	                }
	                if (!v5.a.isEmpty()) {
	                    int v3_4 = new android.content.Intent[v5.a.size()];
	                    IllegalStateException v0_15 = ((android.content.Intent[]) v5.a.toArray(v3_4));
	                    v0_15[0] = new android.content.Intent(v0_15[0]).addFlags(268484608);
	                    int v3_8 = v5.b;
	                    int v6_2 = android.os.Build$VERSION.SDK_INT;
	                    if (v6_2 < 16) {
	                        if (v6_2 >= 11) {
	                            v3_8.startActivities(v0_15);
	                            v2_0 = 1;
	                        }
	                    } else {
	                        v3_8.startActivities(v0_15, 0);
	                        v2_0 = 1;
	                    }
	                    if (v2_0 == null) {
	                        android.content.Intent v2_2 = new android.content.Intent(v0_15[(v0_15.length - 1)]);
	                        v2_2.addFlags(268435456);
	                        v5.b.startActivity(v2_2);
	                    }
	                    try {
	                        if (android.os.Build$VERSION.SDK_INT < 16) {
	                            this.finish();
	                        } else {
	                            this.finishAffinity();
	                        }
	                    } catch (IllegalStateException v0) {
	                        this.finish();
	                    }
	                } else {
	                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
	                }
	            }
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final void a(android.support.v7.widget.Toolbar p2)
	    {
	        this.d().a(p2);
	        return;
	    }
	
	
	    public final void a_()
	    {
	        this.d().f();
	        return;
	    }
	
	
	    public void addContentView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
	    {
	        this.d().b(p2, p3);
	        return;
	    }
	
	
	    public final android.content.Intent b()
	    {
	        return at.a(this);
	    }
	
	
	    public final mo c()
	    {
	        return this.d().h();
	    }
	
	
	    public final nh d()
	    {
	        if (this.e == null) {
	            this.e = nh.a(this, this.getWindow(), this);
	        }
	        return this.e;
	    }
	
	
	    public android.view.MenuInflater getMenuInflater()
	    {
	        return this.d().b();
	    }
	
	
	    public void invalidateOptionsMenu()
	    {
	        this.d().f();
	        return;
	    }
	
	
	    public void onConfigurationChanged(android.content.res.Configuration p2)
	    {
	        super.onConfigurationChanged(p2);
	        this.d().a(p2);
	        return;
	    }
	
	
	    public void onContentChanged()
	    {
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p2)
	    {
	        this.d().i();
	        super.onCreate(p2);
	        this.d().a(p2);
	        return;
	    }
	
	
	    public void onDestroy()
	    {
	        super.onDestroy();
	        this.d().g();
	        return;
	    }
	
	
	    public final boolean onMenuItemSelected(int p4, android.view.MenuItem p5)
	    {
	        boolean v0_5;
	        if (!super.onMenuItemSelected(p4, p5)) {
	            boolean v0_2 = this.d().a();
	            if ((p5.getItemId() != 16908332) || ((!v0_2) || ((v0_2.b() & 4) == 0))) {
	                v0_5 = 0;
	            } else {
	                v0_5 = this.e();
	            }
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    public void onPostCreate(android.os.Bundle p2)
	    {
	        super.onPostCreate(p2);
	        this.d().c();
	        return;
	    }
	
	
	    public void onPostResume()
	    {
	        super.onPostResume();
	        this.d().e();
	        return;
	    }
	
	
	    public void onStop()
	    {
	        super.onStop();
	        this.d().d();
	        return;
	    }
	
	
	    protected void onTitleChanged(CharSequence p2, int p3)
	    {
	        super.onTitleChanged(p2, p3);
	        this.d().a(p2);
	        return;
	    }
	
	
	    public void setContentView(int p2)
	    {
	        this.d().a(p2);
	        return;
	    }
	
	
	    public void setContentView(android.view.View p2)
	    {
	        this.d().a(p2);
	        return;
	    }
	
	
	    public void setContentView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
	    {
	        this.d().a(p2, p3);
	        return;
	    }
	
