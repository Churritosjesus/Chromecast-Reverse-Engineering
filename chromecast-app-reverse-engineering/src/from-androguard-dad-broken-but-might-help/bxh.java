	private synthetic bwz a
	
	    public bxh(bwz p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p5)
	    {
	        bwz.b(this.a).lock();
	        try {
	            if (!(bwz.a(this.a) instanceof bwy)) {
	                switch (p5) {
	                    case 1:
	                        if (!this.a.g) {
	                            bwz.a(this.a, 1);
	                            if (this.a.i == null) {
	                                this.a.i = new bxf(this.a);
	                                bwz v0_14 = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
	                                v0_14.addDataScheme("package");
	                                bwz.c(this.a).getApplicationContext().registerReceiver(this.a.i, v0_14);
	                            }
	                            this.a.h.sendMessageDelayed(this.a.h.obtainMessage(1), bwz.d(this.a));
	                            this.a.h.sendMessageDelayed(this.a.h.obtainMessage(2), bwz.e(this.a));
	                            bwz.a(this.a, p5);
	                        } else {
	                            bwz.b(this.a).unlock();
	                        }
	                        break;
	                    case 2:
	                        bwz.a(this.a, p5);
	                        this.a.b();
	                        break;
	                }
	                bwz.b(this.a).unlock();
	            } else {
	                bwz.b(this.a).unlock();
	            }
	        } catch (bwz v0_15) {
	            bwz.b(this.a).unlock();
	            throw v0_15;
	        }
	        return;
	    }
	
