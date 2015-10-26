	final android.content.Context a
	final android.os.Handler b
	public final android.net.wifi.WifiManager c
	final android.net.ConnectivityManager d
	final  e
	 bab f
	 java.lang.String g
	public  h
	public  i
	public java.lang.String j
	final blp k
	private android.net.ConnectivityManager$NetworkCallback l
	
	    public azv(android.content.Context p3)
	    {
	        this.k = new blp("WifiConnectionManager");
	        this.a = p3;
	        this.b = new android.os.Handler();
	        this.e = ((long) p3.getResources().getInteger(a.fk));
	        this.c = ((android.net.wifi.WifiManager) this.a.getSystemService("wifi"));
	        this.d = ((android.net.ConnectivityManager) p3.getSystemService("connectivity"));
	        this.h = ((long) blf.Y(this.a));
	        return;
	    }
	
	
	    static synthetic void a(azv p3, android.net.Network p4, String p5)
	    {
	        if (!android.net.ConnectivityManager.setProcessDefaultNetwork(p4)) {
	            Object[] v0_1 = new Object[1];
	            v0_1[0] = p5;
	        } else {
	            Object[] v0_2 = new Object[1];
	            v0_2[0] = p5;
	            p3.g = p5;
	        }
	        return;
	    }
	
	
	    static void a(baa p0)
	    {
	        if (p0 != null) {
	            p0.a();
	        }
	        return;
	    }
	
	
	    static void a(baa p0, boolean p1)
	    {
	        if (p0 != null) {
	            p0.a(p1);
	        }
	        return;
	    }
	
	
	    static boolean a(String p2, android.net.wifi.WifiInfo p3)
	    {
	        int v0 = 0;
	        if ((p2 != null) && ((p3 != null) && (p2.equals(blr.a(p3))))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    private static String b(String p3)
	    {
	        if (!android.text.TextUtils.isEmpty(p3)) {
	            char v0_2 = (p3.length() - 1);
	            if ((v0_2 <= 0) || ((p3.charAt(0) != 34) || (p3.charAt(v0_2) != 34))) {
	                p3 = new StringBuilder((String.valueOf(p3).length() + 2)).append("\"").append(p3).append("\"").toString();
	            }
	        } else {
	            p3 = "";
	        }
	        return p3;
	    }
	
	
	    static boolean c()
	    {
	        int v0_1;
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    private int e()
	    {
	        int v0_0 = 0;
	        java.util.List v3 = this.c.getConfiguredNetworks();
	        if (v3 != null) {
	            java.util.Collections.sort(v3, new azx());
	            int v1_3 = v3.size();
	            int v2 = 0;
	            while (v2 < v1_3) {
	                int v0_3 = ((android.net.wifi.WifiConfiguration) v3.get(v2));
	                v0_3.priority = v2;
	                this.c.updateNetwork(v0_3);
	                v2++;
	            }
	            this.c.saveConfiguration();
	            v0_0 = v1_3;
	        }
	        return v0_0;
	    }
	
	
	    private int f()
	    {
	        int v1_2;
	        int v1_1 = this.c.getConfiguredNetworks();
	        if (v1_1 == 0) {
	            v1_2 = 0;
	        } else {
	            java.util.Iterator v2 = v1_1.iterator();
	            v1_2 = 0;
	            while (v2.hasNext()) {
	                int v0_4;
	                int v0_3 = ((android.net.wifi.WifiConfiguration) v2.next());
	                if (v0_3.priority <= v1_2) {
	                    v0_4 = v1_2;
	                } else {
	                    v0_4 = v0_3.priority;
	                }
	                v1_2 = v0_4;
	            }
	        }
	        return v1_2;
	    }
	
	
	    public final android.net.wifi.WifiConfiguration a(bfs p10)
	    {
	        String[] v0_2;
	        switch (azz.a[p10.b.ordinal()]) {
	            case 1:
	            case 2:
	            case 3:
	            case 4:
	                v0_2 = 1;
	                break;
	            default:
	                String[] v0_3 = this.k;
	                String v5_0 = new Object[1];
	                v5_0[0] = p10.b;
	                v0_3.a("authType %s not supported", v5_0);
	                v0_2 = 0;
	        }
	        String[] v0_5;
	        if (v0_2 != null) {
	            v0_5 = this.a(p10.a);
	            if (v0_5 == null) {
	                android.net.wifi.WifiConfiguration v4_4 = new android.net.wifi.WifiConfiguration();
	                v4_4.SSID = azv.b(p10.a);
	                if (!android.text.TextUtils.isEmpty(p10.i)) {
	                    v4_4.BSSID = p10.i;
	                }
	                String[] v0_11;
	                String v5_1 = p10.e;
	                if (v5_1 != null) {
	                    v0_11 = v5_1.length();
	                } else {
	                    v0_11 = 0;
	                }
	                switch (azz.a[p10.b.ordinal()]) {
	                    case 1:
	                        v4_4.allowedKeyManagement.set(0);
	                        break;
	                    case 2:
	                        v4_4.allowedKeyManagement.set(0);
	                        v4_4.allowedProtocols.set(1);
	                        v4_4.allowedProtocols.set(0);
	                        v4_4.allowedAuthAlgorithms.set(0);
	                        v4_4.allowedAuthAlgorithms.set(1);
	                        v4_4.allowedPairwiseCiphers.set(2);
	                        v4_4.allowedPairwiseCiphers.set(1);
	                        v4_4.allowedGroupCiphers.set(0);
	                        v4_4.allowedGroupCiphers.set(1);
	                        if ((v5_1 == null) || (v0_11 <= null)) {
	                        } else {
	                            if (((v0_11 != 10) && ((v0_11 != 26) && (v0_11 != 58))) || (!v5_1.matches("[0-9A-Fa-f]*"))) {
	                                v4_4.wepKeys[0] = azv.b(v5_1);
	                            } else {
	                                v4_4.wepKeys[0] = v5_1;
	                            }
	                            v4_4.wepTxKeyIndex = 0;
	                        }
	                        break;
	                    case 3:
	                    case 4:
	                        v4_4.allowedKeyManagement.set(1);
	                        v4_4.allowedProtocols.set(1);
	                        v4_4.allowedProtocols.set(0);
	                        v4_4.allowedPairwiseCiphers.set(1);
	                        v4_4.allowedPairwiseCiphers.set(2);
	                        v4_4.allowedGroupCiphers.set(0);
	                        v4_4.allowedGroupCiphers.set(1);
	                        v4_4.allowedGroupCiphers.set(2);
	                        v4_4.allowedGroupCiphers.set(3);
	                        if ((v5_1 == null) || (v0_11 <= null)) {
	                        } else {
	                            if (!v5_1.matches("[0-9A-Fa-f]{64}")) {
	                                v4_4.preSharedKey = azv.b(v5_1);
	                            } else {
	                                v4_4.preSharedKey = v5_1;
	                            }
	                        }
	                        break;
	                }
	                v4_4.hiddenSSID = p10.g;
	                if ((this.c.addNetwork(v4_4) != -1) && (this.c.saveConfiguration())) {
	                    v0_5 = this.a(p10.a);
	                } else {
	                    v0_5 = 0;
	                }
	            }
	        } else {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    public android.net.wifi.WifiConfiguration a(String p6)
	    {
	        android.net.wifi.WifiConfiguration v0_4;
	        if (!android.text.TextUtils.isEmpty(p6)) {
	            String v2 = azv.b(p6);
	            android.net.wifi.WifiConfiguration v0_2 = this.c.getConfiguredNetworks();
	            if (v0_2 != null) {
	                java.util.Iterator v3 = v0_2.iterator();
	                while (v3.hasNext()) {
	                    v0_4 = ((android.net.wifi.WifiConfiguration) v3.next());
	                    if (android.text.TextUtils.equals(v2, v0_4.SSID)) {
	                        return v0_4;
	                    }
	                }
	            }
	            v0_4 = 0;
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public final void a()
	    {
	        if (this.f != null) {
	            this.f.a();
	            this.f = 0;
	        }
	        return;
	    }
	
	
	    public final boolean a(String p8, baa p9, boolean p10)
	    {
	        int v0_18;
	        int v0_0 = new Object[1];
	        v0_0[0] = p8;
	        this.a();
	        if (!this.a(p8, 1)) {
	            this.b();
	            android.net.wifi.WifiConfiguration v1_0 = this.a(p8);
	            if (v1_0 != null) {
	                this.f = new bab(this, p8, p10, new azw(this, p9));
	                if ((p10) && (azv.c())) {
	                    this.l = new azy(this, p8);
	                    this.d.registerNetworkCallback(new android.net.NetworkRequest$Builder().addTransportType(1).build(), this.l);
	                }
	                int v0_17;
	                if (android.os.Build$VERSION.SDK_INT >= 22) {
	                    int v0_15 = new Object[2];
	                    v0_15[0] = v1_0.SSID;
	                    v0_15[1] = Integer.valueOf(v1_0.networkId);
	                    v0_17 = this.c.enableNetwork(v1_0.networkId, 1);
	                } else {
	                    int v0_12 = new Object[1];
	                    v0_12[0] = p8;
	                    int v0_13 = v1_0.priority;
	                    boolean v4_4 = this.f();
	                    if (v4_4 < 100000) {
	                        v1_0.priority = (v4_4 + 1);
	                    } else {
	                        boolean v4_6 = this.e();
	                        v1_0 = this.a(p8);
	                        if (v1_0 != null) {
	                            v0_13 = v1_0.priority;
	                            v1_0.priority = v4_6;
	                        } else {
	                            v0_17 = 0;
	                            if (v0_17 != 0) {
	                                v0_18 = 1;
	                            } else {
	                                this.a();
	                                azv.a(p9, 0);
	                                v0_18 = 0;
	                            }
	                            return v0_18;
	                        }
	                    }
	                    boolean v4_8 = this.c.updateNetwork(v1_0);
	                    if (v4_8 != -1) {
	                        if ((this.c.enableNetwork(v4_8, 0)) && (this.c.saveConfiguration())) {
	                            v1_0 = this.a(p8);
	                            if (v1_0 != null) {
	                            } else {
	                                v0_17 = 0;
	                            }
	                        } else {
	                            if (v0_13 != -1) {
	                                v1_0.priority = v0_13;
	                            }
	                            v0_17 = 0;
	                        }
	                    } else {
	                        v0_17 = 0;
	                    }
	                }
	            } else {
	                azv.a(p9, 0);
	                v0_18 = 0;
	            }
	        } else {
	            azv.a(p9);
	            v0_18 = 0;
	        }
	        return v0_18;
	    }
	
	
	    public boolean a(String p5, boolean p6)
	    {
	        boolean v0_0 = 1;
	        if (!android.text.TextUtils.equals(p5, this.g)) {
	            boolean v1_3 = this.d.getNetworkInfo(1);
	            if ((v1_3) && (v1_3.isConnected())) {
	                boolean v1_5;
	                boolean v1_4 = v1_3.getExtraInfo();
	                if (!android.text.TextUtils.isEmpty(v1_4)) {
	                    v1_5 = blr.a(p5, v1_4);
	                } else {
	                    v1_5 = azv.a(p5, this.c.getConnectionInfo());
	                }
	                if (p6) {
	                    Object[] v3_3 = new Object[2];
	                    v3_3[0] = p5;
	                    v3_3[1] = String.valueOf(v1_5);
	                }
	                v0_0 = v1_5;
	            } else {
	                if (p6) {
	                    boolean v0_1 = new Object[1];
	                    v0_1[0] = p5;
	                }
	                v0_0 = 0;
	            }
	        } else {
	            if (p6) {
	                boolean v1_8 = new Object[1];
	                v1_8[0] = p5;
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final void b()
	    {
	        if ((azv.c()) && (this.g != null)) {
	            this.d();
	        }
	        return;
	    }
	
	
	    void d()
	    {
	        if (!android.net.ConnectivityManager.setProcessDefaultNetwork(0)) {
	            android.net.ConnectivityManager v0_1 = new Object[1];
	            v0_1[0] = this.g;
	        } else {
	            android.net.ConnectivityManager v0_2 = new Object[1];
	            v0_2[0] = this.g;
	            this.g = 0;
	            if (this.l != null) {
	                this.d.unregisterNetworkCallback(this.l);
	                this.l = 0;
	            }
	        }
	        return;
	    }
	
