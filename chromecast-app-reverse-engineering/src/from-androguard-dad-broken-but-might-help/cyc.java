	private final java.lang.String a
	private final java.lang.String b
	private final  c
	private final  d
	private final  e
	private  f
	private synthetic cyb g
	
	    cyc(cyb p3, String p4, String p5, long p6, long p8)
	    {
	        this.g = p3;
	        this.a = p4;
	        this.b = p5;
	        this.c = p6;
	        this.d = p8;
	        this.e = System.currentTimeMillis();
	        return;
	    }
	
	
	    public final void run()
	    {
	        if ((this.d <= 0) || (this.f < this.d)) {
	            int v0_14;
	            this.f = (this.f + 1);
	            if (!cyb.d(this.g)) {
	                String v1_4 = ((android.app.KeyguardManager) cyb.f(this.g).getSystemService("keyguard"));
	                long v2_4 = ((android.os.PowerManager) cyb.f(this.g).getSystemService("power"));
	                Object[] v5_1 = ((android.app.ActivityManager) cyb.f(this.g).getSystemService("activity")).getRunningAppProcesses().iterator();
	                while (v5_1.hasNext()) {
	                    int v0_16 = ((android.app.ActivityManager$RunningAppProcessInfo) v5_1.next());
	                    if ((android.os.Process.myPid() == v0_16.pid) && ((v0_16.importance == 100) && ((!v1_4.inKeyguardRestrictedInputMode()) && (v2_4.isScreenOn())))) {
	                        v0_14 = 1;
	                    }
	                }
	                v0_14 = 0;
	            } else {
	                v0_14 = cyb.e(this.g);
	            }
	            if (v0_14 != 0) {
	                int v0_21 = System.currentTimeMillis();
	                long v2_6 = cyb.b(this.g);
	                Object[] v5_3 = new Object[16];
	                v5_3[0] = "event";
	                v5_3[1] = this.a;
	                v5_3[2] = "gtm.timerInterval";
	                v5_3[3] = String.valueOf(this.c);
	                v5_3[4] = "gtm.timerLimit";
	                v5_3[5] = String.valueOf(this.d);
	                v5_3[6] = "gtm.timerStartTime";
	                v5_3[7] = String.valueOf(this.e);
	                v5_3[8] = "gtm.timerCurrentTime";
	                v5_3[9] = String.valueOf(v0_21);
	                v5_3[10] = "gtm.timerElapsedTime";
	                v5_3[11] = String.valueOf((v0_21 - this.e));
	                v5_3[12] = "gtm.timerEventNumber";
	                v5_3[13] = String.valueOf(this.f);
	                v5_3[14] = "gtm.triggers";
	                v5_3[15] = this.b;
	                v2_6.a(ctw.a(v5_3));
	            }
	            cyb.c(this.g).postDelayed(this, this.c);
	        } else {
	            if (!"0".equals(this.b)) {
	                cyb.a(this.g).remove(this.b);
	            }
	        }
	        return;
	    }
	
