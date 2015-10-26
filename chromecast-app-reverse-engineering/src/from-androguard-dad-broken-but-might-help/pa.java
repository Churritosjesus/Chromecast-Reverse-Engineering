	private synthetic ou a
	
	    public pa(ou p1, android.view.Window$Callback p2)
	    {
	        this.a = p1;
	        this(p2);
	        return;
	    }
	
	
	    public final android.view.View onCreatePanelView(int p10)
	    {
	        int v0_12;
	        switch (p10) {
	            case 0:
	                android.view.ViewGroup v1_0 = this.a.a.o();
	                if ((!this.onPreparePanel(p10, 0, v1_0)) || (!this.onMenuOpened(p10, v1_0))) {
	                    v0_12 = super.onCreatePanelView(p10);
	                } else {
	                    ou v3 = this.a;
	                    if ((v3.d == null) && ((v1_0 instanceof qa))) {
	                        int v0_7 = ((qa) v1_0);
	                        py v4_1 = v3.a.b();
	                        oz v5_1 = new android.util.TypedValue();
	                        int v6_1 = v4_1.getResources().newTheme();
	                        v6_1.setTo(v4_1.getTheme());
	                        v6_1.resolveAttribute(a.g, v5_1, 1);
	                        if (v5_1.resourceId != 0) {
	                            v6_1.applyStyle(v5_1.resourceId, 1);
	                        }
	                        v6_1.resolveAttribute(a.K, v5_1, 1);
	                        if (v5_1.resourceId == 0) {
	                            v6_1.applyStyle(a.bZ, 1);
	                        } else {
	                            v6_1.applyStyle(v5_1.resourceId, 1);
	                        }
	                        oz v5_5 = new android.view.ContextThemeWrapper(v4_1, 0);
	                        v5_5.getTheme().setTo(v6_1);
	                        v3.d = new py(v5_5, a.bL);
	                        v3.d.d = new oz(v3);
	                        v0_7.a(v3.d);
	                    }
	                    if ((v1_0 != null) && (v3.d != null)) {
	                        if (v3.d.b().getCount() <= 0) {
	                            v0_12 = 0;
	                        } else {
	                            v0_12 = ((android.view.View) v3.d.a(v3.a.a()));
	                        }
	                    } else {
	                        v0_12 = 0;
	                    }
	                }
	                break;
	            default:
	        }
	        return v0_12;
	    }
	
	
	    public final boolean onPreparePanel(int p4, android.view.View p5, android.view.Menu p6)
	    {
	        boolean v0 = super.onPreparePanel(p4, p5, p6);
	        if ((v0) && (!this.a.b)) {
	            this.a.a.k();
	            this.a.b = 1;
	        }
	        return v0;
	    }
	
