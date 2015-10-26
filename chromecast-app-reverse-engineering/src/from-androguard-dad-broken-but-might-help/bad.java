	private synthetic java.lang.String a
	private synthetic  b
	private synthetic bab c
	
	    bad(bab p1, String p2, boolean p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void onReceive(android.content.Context p10, android.content.Intent p11)
	    {
	        String v2_0 = 0;
	        if (this.c.c) {
	            int v0_16;
	            azv v1_0 = this.c.e;
	            this.c.e = 0;
	            this.c.g.b.removeCallbacks(this.c.b);
	            this.c.g.b.postDelayed(this.c.b, this.c.g.e);
	            int v0_12 = ((android.net.NetworkInfo) p11.getParcelableExtra("networkInfo"));
	            android.net.Network[] v4_4 = v0_12.getState();
	            int v5_2 = v0_12.getDetailedState();
	            if (android.os.Build$VERSION.SDK_INT >= 14) {
	                v0_16 = ((android.net.wifi.WifiInfo) p11.getParcelableExtra("wifiInfo"));
	                v1_0 = 0;
	            } else {
	                v0_16 = this.c.g.c.getConnectionInfo();
	            }
	            boolean v6_3 = new Object[3];
	            v6_3[0] = v4_4.toString();
	            v6_3[1] = v5_2.toString();
	            v6_3[2] = blr.a(v0_16);
	            boolean v6_5 = azv.a(this.a, v0_16);
	            if (v5_2 != android.net.NetworkInfo$DetailedState.FAILED) {
	                switch (azz.b[v4_4.ordinal()]) {
	                    case 1:
	                        if (v1_0 == null) {
	                            if (!v6_5) {
	                                if (!this.c.f) {
	                                    this.c.a();
	                                    azv v1_6 = new Object[2];
	                                    v1_6[0] = blr.a(v0_16);
	                                    v1_6[1] = this.a;
	                                    azv.a(this.c.a, 0);
	                                }
	                            } else {
	                                if ((azv.c()) && ((this.b) && (this.c.g.g == null))) {
	                                    azv v1_7 = this.c.g;
	                                    String v3_1 = this.a;
	                                    android.net.Network[] v4_7 = v1_7.d.getAllNetworks();
	                                    while (v2_0 < v4_7.length) {
	                                        int v0_42 = v4_7[v2_0];
	                                        if (!blr.a(v3_1, v1_7.d.getNetworkInfo(v0_42).getExtraInfo())) {
	                                            v2_0++;
	                                        }
	                                        if (v0_42 != 0) {
	                                            azv.a(this.c.g, v0_42, this.a);
	                                        }
	                                    }
	                                    v0_42 = 0;
	                                }
	                                this.c.a();
	                                if (this.c.g.k.a) {
	                                    blr.d(this.c.g.a);
	                                }
	                                this.c.g.i = android.os.SystemClock.elapsedRealtime();
	                                azv.a(this.c.a);
	                            }
	                        }
	                        break;
	                    case 2:
	                        this.c.f = 0;
	                        if (v6_5) {
	                            this.c.d = v5_2;
	                        }
	                        break;
	                    case 3:
	                        this.c.f = 0;
	                        if (this.c.d != null) {
	                            if ((android.os.Build$VERSION.SDK_INT >= 16) && (this.c.d == android.net.NetworkInfo$DetailedState.VERIFYING_POOR_LINK)) {
	                                v2_0 = 1;
	                            }
	                            if (v2_0 != null) {
	                                this.c.a();
	                                azv.a(this.c.a, 1);
	                            }
	                        }
	                        break;
	                    default:
	                        this.c.f = 0;
	                }
	            } else {
	                this.c.a();
	                azv.a(this.c.a, 0);
	            }
	        }
	        return;
	    }
	
