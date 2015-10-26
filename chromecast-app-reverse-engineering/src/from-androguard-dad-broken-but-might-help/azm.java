	private static final java.util.Locale b
	 azr a
	private android.content.Context c
	private java.util.List d
	private java.net.InetSocketAddress e
	private java.lang.String f
	private  g
	private  h
	private android.os.Handler i
	private bridge  j
	private java.util.List k
	private java.util.concurrent.atomic.AtomicBoolean l
	private android.net.ConnectivityManager m
	private azq n
	private android.net.wifi.WifiManager o
	private java.lang.String p
	private azt q
	private bridge  r
	private final blp s
	
	    static azm()
	    {
	        azm.b = java.util.Locale.ROOT;
	        return;
	    }
	
	
	    public azm(android.content.Context p4, String p5, int p6, int p7, android.os.Handler p8)
	    {
	        this.s = new blp("SsdpScanner", 0);
	        if (p6 > 0) {
	            this.c = p4;
	            this.f = p5;
	            this.h = p7;
	            this.g = p6;
	            this.i = p8;
	            this.e = new java.net.InetSocketAddress("239.255.255.250", 1900);
	            this.l = new java.util.concurrent.atomic.AtomicBoolean();
	            this.d = new java.util.ArrayList();
	            this.k = new java.util.ArrayList();
	            this.m = ((android.net.ConnectivityManager) this.c.getSystemService("connectivity"));
	            if (this.c.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0) {
	                this.o = ((android.net.wifi.WifiManager) this.c.getSystemService("wifi"));
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("delay must be at least 1 second");
	        }
	    }
	
	
	    static synthetic azt a(azm p1, azt p2)
	    {
	        p1.q = 0;
	        return 0;
	    }
	
	
	    static synthetic String a(azm p1, String p2)
	    {
	        p1.p = 0;
	        return 0;
	    }
	
	
	    static synthetic void a(azm p6)
	    {
	        java.util.Iterator v2_1 = new Object[4];
	        v2_1[0] = "239.255.255.250";
	        v2_1[1] = Integer.valueOf(1900);
	        v2_1[2] = Integer.valueOf(p6.g);
	        v2_1[3] = p6.f;
	        boolean v0_2 = String.format(azm.b, "M-SEARCH * HTTP/1.1\r\nHOST: %s:%d\r\nMAN: \"ssdp:discover\"\r\nMX: %d\r\nST: %s\r\n\r\n", v2_1).getBytes();
	        try {
	            StringBuilder v1_2 = new java.net.DatagramPacket(v0_2, v0_2.length, p6.e);
	        } catch (boolean v0) {
	            new StringBuilder(47).append("Send thread got an exception; mShouldStop=").append(p6.j);
	            if (p6.j) {
	                return;
	            } else {
	                p6.d();
	                return;
	            }
	        }
	        while (!p6.j) {
	            java.util.Iterator v2_3 = p6.d.iterator();
	            while (v2_3.hasNext()) {
	                ((java.net.MulticastSocket) v2_3.next()).send(v1_2);
	                try {
	                    Thread.sleep(((long) p6.h));
	                } catch (boolean v0) {
	                    if (p6.j) {
	                        break;
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(azm p7, java.net.MulticastSocket p8)
	    {
	        String v0_0 = new byte[4096];
	        StringBuilder v1_1 = new java.net.DatagramPacket(v0_0, 4096);
	        try {
	            while (!p7.j) {
	                try {
	                    p8.receive(v1_1);
	                } catch (String v0) {
	                }
	                if (p7.j) {
	                    break;
	                }
	                azu v2_2 = new azu();
	                azo v3_2 = new java.io.BufferedReader(new java.io.StringReader(new String(v1_1.getData(), v1_1.getOffset(), v1_1.getLength(), "UTF8")));
	                while(true) {
	                    String v0_5 = v3_2.readLine();
	                    if (v0_5 == null) {
	                        break;
	                    }
	                    int v4_4 = v0_5.toUpperCase(azm.b);
	                    if (!v4_4.startsWith("CACHE-CONTROL:")) {
	                        if (!v4_4.startsWith("DATE:")) {
	                            if (!v4_4.startsWith("LOCATION:")) {
	                                if (!v4_4.startsWith("SERVER:")) {
	                                    if (!v4_4.startsWith("ST:")) {
	                                        if (!v4_4.startsWith("USN:")) {
	                                            if (v4_4.startsWith("BOOTID.UPNP.ORG:")) {
	                                                v0_5.substring(16).trim();
	                                            }
	                                        } else {
	                                            v2_2.b = v0_5.substring(4).trim();
	                                        }
	                                    } else {
	                                        v0_5.substring(3).trim();
	                                    }
	                                } else {
	                                    v0_5.substring(7).trim();
	                                }
	                            } else {
	                                v2_2.a = v0_5.substring(9).trim();
	                            }
	                        } else {
	                            v0_5.substring(5).trim();
	                        }
	                    } else {
	                        v0_5.substring(14).trim();
	                    }
	                }
	                String v0_10;
	                v3_2.close();
	                if ((android.text.TextUtils.isEmpty(v2_2.a)) || (android.text.TextUtils.isEmpty(v2_2.b))) {
	                    v0_10 = 0;
	                } else {
	                    v0_10 = 1;
	                }
	                if ((v0_10 != null) && (p7.a != null)) {
	                    p7.i.post(new azo(p7, v2_2));
	                }
	            }
	        } catch (String v0) {
	            new StringBuilder(50).append("Receive thread got an exception; mShouldStop=").append(p7.j);
	            if (!p7.j) {
	                p7.d();
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(azm p9, java.util.List p10)
	    {
	        Object[] v2_0 = 1;
	        if ((p10 != null) && (!p10.isEmpty())) {
	            try {
	                boolean v1_0 = p10.iterator();
	            } catch (azr v0_2) {
	                Object[] v4_2 = new Object[0];
	                p9.s.b(v0_2, "couldn\'t create socket", v4_2);
	                p9 = p9.e();
	                p9.q = 0;
	            } catch (azr v0_3) {
	                p9.q = 0;
	                throw v0_3;
	            }
	            while (v1_0.hasNext()) {
	                azr v0_28 = ((java.net.NetworkInterface) v1_0.next());
	                int v5_2 = new java.net.MulticastSocket();
	                v5_2.setNetworkInterface(v0_28);
	                v5_2.setTimeToLive(2);
	                p9.d.add(v5_2);
	            }
	            p9.q = 0;
	            p9.r = 0;
	            p9.j = 0;
	            p9.l.set(0);
	            azr v0_6 = new azn(p9);
	            v0_6.setName("SsdpScanner send thread");
	            v0_6.start();
	            p9.k.add(v0_6);
	            int v5_0 = p9.d.size();
	            java.util.Iterator v6 = p9.d.iterator();
	            boolean v1_4 = 1;
	            while (v6.hasNext()) {
	                Thread v7_1 = new Thread(new azs(p9, ((java.net.MulticastSocket) v6.next())));
	                v7_1.setName(new StringBuilder(54).append("SsdpScanner receive thread #").append(v1_4).append(" of ").append(v5_0).toString());
	                v7_1.start();
	                p9.k.add(v7_1);
	                v1_4++;
	            }
	            if (p9.o != null) {
	                azr v0_13;
	                azr v0_12 = p9.o.getConnectionInfo();
	                if (v0_12 == null) {
	                    v0_13 = 0;
	                } else {
	                    v0_13 = v0_12.getBSSID();
	                }
	                if ((p9.p != null) && ((v0_13 != null) && (p9.p.equals(v0_13)))) {
	                    v2_0 = 0;
	                }
	                p9.p = v0_13;
	            }
	            if ((v2_0 != null) && (p9.a != null)) {
	                p9.a.b();
	            }
	        } else {
	            p9.e();
	        }
	        return;
	    }
	
	
	    static synthetic blp b(azm p1)
	    {
	        return p1.s;
	    }
	
	
	    static synthetic azt c(azm p1)
	    {
	        return p1.q;
	    }
	
	
	    static synthetic azr d(azm p1)
	    {
	        return p1.a;
	    }
	
	
	    private void d()
	    {
	        if ((!this.l.getAndSet(1)) && (this.a != null)) {
	            this.i.post(new azp(this));
	        }
	        return;
	    }
	
	
	    private void e()
	    {
	        if (!this.r) {
	            this.r = 1;
	            if (this.a != null) {
	                this.a.a();
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void e(azm p0)
	    {
	        p0.e();
	        return;
	    }
	
	
	    static synthetic android.net.ConnectivityManager f(azm p1)
	    {
	        return p1.m;
	    }
	
	
	    static synthetic boolean g(azm p1)
	    {
	        return p1.r;
	    }
	
	
	    static synthetic void h(azm p0)
	    {
	        p0.b();
	        return;
	    }
	
	
	    static synthetic void i(azm p0)
	    {
	        p0.d();
	        return;
	    }
	
	
	    public final void a()
	    {
	        if ((this.d.isEmpty()) && (this.q == null)) {
	            if (this.n == null) {
	                this.n = new azq(this);
	                this.c.registerReceiver(this.n, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
	            }
	            this.q = new azt(this);
	            Void[] v1_3 = new Void[0];
	            this.q.execute(v1_3);
	        }
	        return;
	    }
	
	
	    void b()
	    {
	        if (this.q != null) {
	            this.q.cancel(1);
	            this.q = 0;
	        }
	        if (!this.d.isEmpty()) {
	            this.j = 1;
	            java.util.Iterator v1_1 = this.d.iterator();
	            while (v1_1.hasNext()) {
	                ((java.net.MulticastSocket) v1_1.next()).close();
	            }
	            java.util.Iterator v1_2 = this.k.iterator();
	            while (v1_2.hasNext()) {
	                java.util.List v0_12 = ((Thread) v1_2.next());
	                v0_12.interrupt();
	                try {
	                    while(true) {
	                        v0_12.join();
	                    }
	                } catch (InterruptedException v2) {
	                }
	            }
	            this.k.clear();
	            this.d.clear();
	        }
	        return;
	    }
	
	
	    void c()
	    {
	        if (this.n != null) {
	            try {
	                this.c.unregisterReceiver(this.n);
	            } catch (int v0) {
	            }
	            this.n = 0;
	        }
	        return;
	    }
	
