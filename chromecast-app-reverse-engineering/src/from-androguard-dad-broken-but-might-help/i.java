	private  Z
	public  a
	private  aa
	private  ab
	private  ac
	private  ad
	public  b
	public  c
	public android.app.Dialog d
	
	    public i()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.Z = 1;
	        this.c = 1;
	        this.aa = -1;
	        return;
	    }
	
	
	    public void a()
	    {
	        super.a();
	        if ((!this.ad) && (!this.ac)) {
	            this.ac = 1;
	        }
	        return;
	    }
	
	
	    public void a(android.app.Activity p2)
	    {
	        super.a(p2);
	        if (!this.ad) {
	            this.ac = 0;
	        }
	        return;
	    }
	
	
	    public void a(android.os.Bundle p4)
	    {
	        int v0_1;
	        super.a(p4);
	        if (this.C != 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        this.c = v0_1;
	        if (p4 != null) {
	            this.a = p4.getInt("android:style", 0);
	            this.b = p4.getInt("android:theme", 0);
	            this.Z = p4.getBoolean("android:cancelable", 1);
	            this.c = p4.getBoolean("android:showsDialog", this.c);
	            this.aa = p4.getInt("android:backStackId", -1);
	        }
	        return;
	    }
	
	
	    public void a(r p2, String p3)
	    {
	        this.ac = 0;
	        this.ad = 1;
	        af v0_2 = p2.a();
	        v0_2.a(this, p3);
	        v0_2.b();
	        return;
	    }
	
	
	    public final void a(boolean p4)
	    {
	        if (!this.ac) {
	            this.ac = 1;
	            this.ad = 0;
	            if (this.d != null) {
	                this.d.dismiss();
	                this.d = 0;
	            }
	            this.ab = 1;
	            if (this.aa < 0) {
	                af v0_7 = this.x.a();
	                v0_7.a(this);
	                if (!p4) {
	                    v0_7.b();
	                } else {
	                    v0_7.c();
	                }
	            } else {
	                this.x.a(this.aa, 1);
	                this.aa = -1;
	            }
	        }
	        return;
	    }
	
	
	    public final android.view.LayoutInflater b(android.os.Bundle p3)
	    {
	        android.view.LayoutInflater v0_9;
	        if (this.c) {
	            this.d = this.c(p3);
	            switch (this.a) {
	                case 1:
	                case 2:
	                    this.d.requestWindowFeature(1);
	                    break;
	                case 3:
	                    this.d.getWindow().addFlags(24);
	                    break;
	            }
	            if (this.d == null) {
	                v0_9 = ((android.view.LayoutInflater) this.y.getSystemService("layout_inflater"));
	            } else {
	                v0_9 = ((android.view.LayoutInflater) this.d.getContext().getSystemService("layout_inflater"));
	            }
	        } else {
	            v0_9 = super.b(p3);
	        }
	        return v0_9;
	    }
	
	
	    public final void b(boolean p2)
	    {
	        this.Z = p2;
	        if (this.d != null) {
	            this.d.setCancelable(p2);
	        }
	        return;
	    }
	
	
	    public android.app.Dialog c(android.os.Bundle p4)
	    {
	        return new android.app.Dialog(this.y, this.b);
	    }
	
	
	    public void d()
	    {
	        super.d();
	        if (this.d != null) {
	            this.ab = 1;
	            this.d.dismiss();
	            this.d = 0;
	        }
	        return;
	    }
	
	
	    public final void d(android.os.Bundle p3)
	    {
	        super.d(p3);
	        if (this.c) {
	            android.os.Bundle v0_1 = this.N;
	            if (v0_1 != null) {
	                if (v0_1.getParent() == null) {
	                    this.d.setContentView(v0_1);
	                } else {
	                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
	                }
	            }
	            this.d.setOwnerActivity(this.y);
	            this.d.setCancelable(this.Z);
	            this.d.setOnCancelListener(this);
	            this.d.setOnDismissListener(this);
	            if (p3 != null) {
	                android.os.Bundle v0_7 = p3.getBundle("android:savedDialogState");
	                if (v0_7 != null) {
	                    this.d.onRestoreInstanceState(v0_7);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        if (this.d != null) {
	            String v0_2 = this.d.onSaveInstanceState();
	            if (v0_2 != null) {
	                p3.putBundle("android:savedDialogState", v0_2);
	            }
	        }
	        if (this.a != 0) {
	            p3.putInt("android:style", this.a);
	        }
	        if (this.b != 0) {
	            p3.putInt("android:theme", this.b);
	        }
	        if (!this.Z) {
	            p3.putBoolean("android:cancelable", this.Z);
	        }
	        if (!this.c) {
	            p3.putBoolean("android:showsDialog", this.c);
	        }
	        if (this.aa != -1) {
	            p3.putInt("android:backStackId", this.aa);
	        }
	        return;
	    }
	
	
	    public final void g_()
	    {
	        super.g_();
	        if (this.d != null) {
	            this.ab = 0;
	            this.d.show();
	        }
	        return;
	    }
	
	
	    public final void h_()
	    {
	        super.h_();
	        if (this.d != null) {
	            this.d.hide();
	        }
	        return;
	    }
	
	
	    public void onCancel(android.content.DialogInterface p1)
	    {
	        return;
	    }
	
	
	    public void onDismiss(android.content.DialogInterface p2)
	    {
	        if (!this.ab) {
	            this.a(1);
	        }
	        return;
	    }
	
