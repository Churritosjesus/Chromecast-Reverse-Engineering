	private static final java.lang.String a
	private final android.content.Context b
	private final java.security.cert.CertificateFactory c
	private java.security.cert.CertPathValidator d
	private final java.security.cert.X509Certificate e
	private final java.security.cert.X509Certificate f
	private final java.security.cert.X509Certificate g
	private final blp h
	
	    static bkg()
	    {
	        bkg.a = bkg.getSimpleName();
	        return;
	    }
	
	
	    public bkg(android.content.Context p3)
	    {
	        this.h = new blp(bkg.a);
	        this.b = p3;
	        this.c = java.security.cert.CertificateFactory.getInstance("X.509");
	        try {
	            this.d = java.security.cert.CertPathValidator.getInstance("PKIX");
	        } catch (java.security.cert.X509Certificate v0) {
	        }
	        this.e = this.a("certs/chromecast_ca.crt");
	        this.f = this.a("certs/cast_root_ca.crt");
	        this.g = this.a("certs/chromecast_gen1_ica.crt");
	        return;
	    }
	
	
	    private java.security.cert.X509Certificate a(String p7)
	    {
	        try {
	            java.io.IOException v1 = this.b.getAssets().open(p7);
	            java.io.IOException v0_4 = ((java.security.cert.X509Certificate) this.c.generateCertificate(v1));
	        } catch (java.io.IOException v0_6) {
	            if (v1 != null) {
	                try {
	                    v1.close();
	                } catch (java.io.IOException v1) {
	                }
	            }
	            throw v0_6;
	        } catch (java.io.IOException v0_5) {
	            blp v2 = this.h;
	            Object[] v4_1 = new Object[1];
	            v4_1[0] = p7;
	            v2.b(v0_5, "Unable to read certificate asset: %s", v4_1);
	            throw v0_5;
	        }
	        if (v1 != null) {
	            try {
	                v1.close();
	            } catch (java.io.IOException v1) {
	            }
	        }
	        return v0_4;
	    }
	
	
	    private java.security.cert.X509Certificate b(String p7)
	    {
	        try {
	            int v2_1 = new java.io.ByteArrayInputStream(p7.getBytes("UTF-8"));
	        } catch (java.io.IOException v0) {
	            java.io.IOException v0_3 = 0;
	            if (v0_3 != null) {
	                try {
	                    v0_3.close();
	                } catch (java.io.IOException v0) {
	                }
	            }
	            java.io.IOException v0_7 = 0;
	            return v0_7;
	        } catch (java.io.IOException v0_4) {
	            if (v2_1 != 0) {
	                try {
	                    v2_1.close();
	                } catch (java.io.IOException v1) {
	                }
	            }
	            throw v0_4;
	        } catch (java.io.IOException v0_4) {
	            v2_1 = 0;
	        } catch (java.io.IOException v0_2) {
	            v2_1 = 0;
	            Object[] v5_1 = new Object[0];
	            this.h.b(v0_2, "Certificate exception", v5_1);
	            if (v2_1 != 0) {
	                try {
	                    v2_1.close();
	                } catch (java.io.IOException v0) {
	                }
	            }
	            v0_7 = 0;
	            return v0_7;
	        }
	        try {
	            v0_7 = ((java.security.cert.X509Certificate) this.c.generateCertificate(v2_1));
	            try {
	                v2_1.close();
	            } catch (java.io.IOException v1) {
	            }
	            return v0_7;
	        } catch (java.io.IOException v0_2) {
	        } catch (java.io.IOException v0) {
	            v0_3 = v2_1;
	        }
	    }
	
	
	    public final java.security.cert.X509Certificate a(String p9, String[] p10)
	    {
	        int v0_0 = this.b(p9);
	        try {
	            int v2_1 = new java.util.HashSet();
	            v2_1.add(new java.security.cert.TrustAnchor(this.e, 0));
	            v2_1.add(new java.security.cert.TrustAnchor(this.f, 0));
	            String v4_5 = new java.security.cert.PKIXParameters(v2_1);
	            v4_5.setRevocationEnabled(0);
	            v4_5.setPolicyQualifiersRejected(0);
	            java.security.cert.CertPathValidator v5_3 = new java.util.ArrayList();
	            v5_3.add(v0_0);
	        } catch (int v0_1) {
	            Object[] v3_1 = new Object[0];
	            this.h.b(v0_1, "exception while validating", v3_1);
	            v0_0 = 0;
	            return v0_0;
	        }
	        if ((p10 == null) || (p10.length <= 0)) {
	            v5_3.add(this.g);
	        } else {
	            int v6_2 = p10.length;
	            int v2_6 = 0;
	            while (v2_6 < v6_2) {
	                v5_3.add(this.b(p10[v2_6]));
	                v2_6++;
	            }
	        }
	        this.d.validate(this.c.generateCertPath(v5_3), v4_5);
	        return v0_0;
	    }
	
