	 qa a
	 nd b
	 py c
	
	    public qd(qa p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(qa p2, boolean p3)
	    {
	        if (((p3) || (p2 == this.a)) && (this.b != null)) {
	            this.b.dismiss();
	        }
	        return;
	    }
	
	
	    public final boolean a_(qa p2)
	    {
	        return 0;
	    }
	
	
	    public final void onClick(android.content.DialogInterface p5, int p6)
	    {
	        this.a.a(((qe) this.c.b().getItem(p6)), 0, 0);
	        return;
	    }
	
	
	    public final void onDismiss(android.content.DialogInterface p4)
	    {
	        this.c.a(this.a, 1);
	        return;
	    }
	
	
	    public final boolean onKey(android.content.DialogInterface p3, int p4, android.view.KeyEvent p5)
	    {
	        boolean v0_0 = 1;
	        if ((p4 != 82) && (p4 != 4)) {
	            v0_0 = this.a.performShortcut(p4, p5, 0);
	        } else {
	            if ((p5.getAction() != 0) || (p5.getRepeatCount() != 0)) {
	                if ((p5.getAction() != 1) || (p5.isCanceled())) {
	                } else {
	                    qa v1_7 = this.b.getWindow();
	                    if (v1_7 == null) {
	                    } else {
	                        qa v1_8 = v1_7.getDecorView();
	                        if (v1_8 == null) {
	                        } else {
	                            qa v1_9 = v1_8.getKeyDispatcherState();
	                            if ((v1_9 == null) || (!v1_9.isTracking(p5))) {
	                            } else {
	                                this.a.a(1);
	                                p3.dismiss();
	                            }
	                        }
	                    }
	                }
	            } else {
	                qa v1_13 = this.b.getWindow();
	                if (v1_13 == null) {
	                } else {
	                    qa v1_14 = v1_13.getDecorView();
	                    if (v1_14 == null) {
	                    } else {
	                        qa v1_15 = v1_14.getKeyDispatcherState();
	                        if (v1_15 == null) {
	                        } else {
	                            v1_15.startTracking(p5, this);
	                        }
	                    }
	                }
	            }
	        }
	        return v0_0;
	    }
	
