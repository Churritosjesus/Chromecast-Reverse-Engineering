.class public final Ldhs;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field private final a:Ldfh;

.field private final b:Ldfi;


# direct methods
.method public constructor <init>(Ldfh;Ldfi;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Ldhs;->a:Ldfh;

    .line 62
    iput-object p2, p0, Ldhs;->b:Ldfi;

    .line 63
    return-void
.end method

.method public static a(IILdgf;)Ljava/net/Socket;
    .locals 5

    .prologue
    .line 149
    invoke-static {}, Ldgn;->a()Ldgn;

    move-result-object v1

    .line 14066
    :try_start_0
    iget-object v2, p2, Ldgf;->b:Ljava/net/Proxy;

    .line 15055
    iget-object v0, p2, Ldgf;->a:Ldez;

    .line 154
    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v3

    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v3, v4, :cond_0

    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v3

    sget-object v4, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v3, v4, :cond_1

    .line 15088
    :cond_0
    iget-object v0, v0, Ldez;->d:Ljavax/net/SocketFactory;

    .line 155
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    .line 159
    :goto_0
    invoke-virtual {v0, p0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 16070
    iget-object v2, p2, Ldgf;->c:Ljava/net/InetSocketAddress;

    .line 160
    invoke-virtual {v1, v0, v2, p1}, Ldgn;->a(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V

    .line 162
    return-object v0

    .line 157
    :cond_1
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0, v2}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 163
    :catch_0
    move-exception v0

    .line 164
    new-instance v1, Ldhq;

    invoke-direct {v1, v0}, Ldhq;-><init>(Ljava/io/IOException;)V

    throw v1
.end method


# virtual methods
.method public final a(IIILdfy;Ldgf;Ljava/util/List;Z)Ldht;
    .locals 14

    .prologue
    .line 75
    .line 1055
    move-object/from16 v0, p5

    iget-object v7, v0, Ldgf;->a:Ldez;

    .line 76
    new-instance v8, Ldgh;

    move-object/from16 v0, p6

    invoke-direct {v8, v0}, Ldgh;-><init>(Ljava/util/List;)V

    .line 77
    const/4 v2, 0x0

    move-object v4, v2

    .line 79
    :goto_0
    move/from16 v0, p2

    move-object/from16 v1, p5

    invoke-static {v0, p1, v1}, Ldhs;->a(IILdgf;)Ljava/net/Socket;

    move-result-object v9

    .line 1078
    move-object/from16 v0, p5

    iget-object v2, v0, Ldgf;->a:Ldez;

    iget-object v2, v2, Ldez;->e:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v2, :cond_4

    move-object/from16 v0, p5

    iget-object v2, v0, Ldgf;->b:Ljava/net/Proxy;

    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_4

    const/4 v2, 0x1

    .line 80
    :goto_1
    if-eqz v2, :cond_6

    .line 1231
    :try_start_0
    invoke-virtual/range {p4 .. p4}, Ldfy;->a()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    .line 1232
    invoke-virtual/range {p4 .. p4}, Ldfy;->a()Ljava/net/URL;

    move-result-object v2

    invoke-static {v2}, Ldgs;->a(Ljava/net/URL;)I

    move-result v5

    .line 1233
    const-string v2, "https"

    invoke-static {v2}, Ldgs;->a(Ljava/lang/String;)I

    move-result v2

    if-ne v5, v2, :cond_5

    move-object v2, v3

    .line 1234
    :goto_2
    new-instance v6, Ldfz;

    invoke-direct {v6}, Ldfz;-><init>()V

    new-instance v10, Ljava/net/URL;

    const-string v11, "https"

    const-string v12, "/"

    invoke-direct {v10, v11, v3, v5, v12}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 1235
    invoke-virtual {v6, v10}, Ldfz;->a(Ljava/net/URL;)Ldfz;

    move-result-object v3

    const-string v5, "Host"

    .line 1236
    invoke-virtual {v3, v5, v2}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    move-result-object v2

    const-string v3, "Proxy-Connection"

    const-string v5, "Keep-Alive"

    .line 1237
    invoke-virtual {v2, v3, v5}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    move-result-object v2

    .line 1240
    const-string v3, "User-Agent"

    move-object/from16 v0, p4

    invoke-virtual {v0, v3}, Ldfy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1241
    if-eqz v3, :cond_0

    .line 1242
    const-string v5, "User-Agent"

    invoke-virtual {v2, v5, v3}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 1246
    :cond_0
    const-string v3, "Proxy-Authorization"

    move-object/from16 v0, p4

    invoke-virtual {v0, v3}, Ldfy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1247
    if-eqz v3, :cond_1

    .line 1248
    const-string v5, "Proxy-Authorization"

    invoke-virtual {v2, v5, v3}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 1251
    :cond_1
    invoke-virtual {v2}, Ldfz;->a()Ldfy;

    move-result-object v2

    .line 1178
    new-instance v5, Ldgx;

    iget-object v3, p0, Ldhs;->b:Ldfi;

    iget-object v6, p0, Ldhs;->a:Ldfh;

    invoke-direct {v5, v3, v6, v9}, Ldgx;-><init>(Ldfi;Ldfh;Ljava/net/Socket;)V

    .line 1179
    move/from16 v0, p2

    move/from16 v1, p3

    invoke-virtual {v5, v0, v1}, Ldgx;->a(II)V

    .line 1180
    invoke-virtual {v2}, Ldfy;->a()Ljava/net/URL;

    move-result-object v3

    .line 1181
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v10, "CONNECT "

    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v10, ":"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v3}, Ldgs;->a(Ljava/net/URL;)I

    move-result v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, " HTTP/1.1"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 2074
    :cond_2
    iget-object v3, v2, Ldfy;->c:Ldfo;

    .line 1183
    invoke-virtual {v5, v3, v6}, Ldgx;->a(Ldfo;Ljava/lang/String;)V

    .line 1184
    invoke-virtual {v5}, Ldgx;->a()V

    .line 1185
    invoke-virtual {v5}, Ldgx;->c()Ldgd;

    move-result-object v3

    .line 2251
    iput-object v2, v3, Ldgd;->a:Ldfy;

    .line 1185
    invoke-virtual {v3}, Ldgd;->a()Ldgc;

    move-result-object v10

    .line 1188
    invoke-static {v10}, Ldhl;->a(Ldgc;)J

    move-result-wide v2

    .line 1189
    const-wide/16 v12, -0x1

    cmp-long v11, v2, v12

    if-nez v11, :cond_3

    .line 1190
    const-wide/16 v2, 0x0

    .line 1192
    :cond_3
    invoke-virtual {v5, v2, v3}, Ldgx;->a(J)Ldkv;

    move-result-object v2

    .line 1193
    const v3, 0x7fffffff

    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v11}, Ldgs;->b(Ldkv;ILjava/util/concurrent/TimeUnit;)Z

    .line 1194
    invoke-interface {v2}, Ldkv;->close()V

    .line 3088
    iget v2, v10, Ldgc;->c:I

    .line 1196
    sparse-switch v2, :sswitch_data_0

    .line 1214
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unexpected response code for CONNECT: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6088
    iget v4, v10, Ldgc;->c:I

    .line 1215
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1218
    :catch_0
    move-exception v2

    .line 1219
    new-instance v3, Ldhq;

    invoke-direct {v3, v2}, Ldhq;-><init>(Ljava/io/IOException;)V

    throw v3

    .line 1078
    :cond_4
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 1233
    :cond_5
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, ":"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_2

    .line 3146
    :sswitch_0
    iget-object v2, v5, Ldgx;->c:Ldkd;

    invoke-interface {v2}, Ldkd;->b()Ldjz;

    move-result-object v2

    .line 4060
    iget-wide v2, v2, Ldjz;->b:J

    .line 1202
    const-wide/16 v10, 0x0

    cmp-long v2, v2, v10

    if-lez v2, :cond_6

    .line 1203
    new-instance v2, Ljava/io/IOException;

    const-string v3, "TLS tunnel buffered too many bytes!"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 5055
    :sswitch_1
    move-object/from16 v0, p5

    iget-object v2, v0, Ldgf;->a:Ldez;

    .line 5111
    iget-object v2, v2, Ldez;->h:Ldfa;

    .line 6066
    move-object/from16 v0, p5

    iget-object v3, v0, Ldgf;->b:Ljava/net/Proxy;

    .line 1208
    invoke-static {v2, v10, v3}, Ldhl;->a(Ldfa;Ldgc;Ljava/net/Proxy;)Ldfy;

    move-result-object v2

    .line 1210
    if-nez v2, :cond_2

    .line 1211
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Failed to authenticate with proxy"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 84
    :cond_6
    const/4 v3, 0x0

    .line 6096
    :try_start_2
    iget-object v2, v7, Ldez;->e:Ljavax/net/ssl/SSLSocketFactory;

    .line 7075
    iget-object v5, v7, Ldez;->b:Ljava/lang/String;

    .line 7083
    iget v6, v7, Ldez;->c:I

    .line 90
    const/4 v10, 0x1

    invoke-virtual {v2, v9, v5, v6, v10}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v2

    check-cast v2, Ljavax/net/ssl/SSLSocket;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 93
    :try_start_3
    invoke-virtual {v8, v2}, Ldgh;->a(Ljavax/net/ssl/SSLSocket;)Ldfk;

    move-result-object v5

    .line 94
    invoke-static {}, Ldgn;->a()Ldgn;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v6

    .line 96
    const/4 v3, 0x0

    .line 7118
    :try_start_4
    iget-boolean v10, v5, Ldfk;->g:Z

    .line 98
    if-eqz v10, :cond_7

    .line 8075
    iget-object v10, v7, Ldez;->b:Ljava/lang/String;

    .line 8119
    iget-object v11, v7, Ldez;->i:Ljava/util/List;

    .line 99
    invoke-virtual {v6, v2, v10, v11}, Ldgn;->a(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 103
    :cond_7
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 105
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v10

    invoke-static {v10}, Ldfn;->a(Ljavax/net/ssl/SSLSession;)Ldfn;

    move-result-object v10

    .line 9118
    iget-boolean v5, v5, Ldfk;->g:Z

    .line 108
    if-eqz v5, :cond_8

    .line 109
    invoke-virtual {v6, v2}, Ldgn;->b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_8

    .line 110
    invoke-static {v5}, Ldfx;->a(Ljava/lang/String;)Ldfx;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v3

    .line 113
    :cond_8
    :try_start_5
    invoke-virtual {v6, v2}, Ldgn;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 10104
    iget-object v5, v7, Ldez;->f:Ljavax/net/ssl/HostnameVerifier;

    .line 11075
    iget-object v6, v7, Ldez;->b:Ljava/lang/String;

    .line 117
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v11

    invoke-interface {v5, v6, v11}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v5

    if-nez v5, :cond_b

    .line 118
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    .line 119
    invoke-interface {v3}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v3

    const/4 v5, 0x0

    aget-object v3, v3, v5

    check-cast v3, Ljava/security/cert/X509Certificate;

    .line 120
    new-instance v5, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v10, "Hostname "

    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12075
    iget-object v10, v7, Ldez;->b:Ljava/lang/String;

    .line 121
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v10, " not verified:\n    certificate: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 122
    invoke-static {v3}, Ldfd;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v10, "\n    DN: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 123
    invoke-virtual {v3}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v10

    invoke-interface {v10}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v10, "\n    subjectAltNames: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 124
    invoke-static {v3}, Ldjt;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 131
    :catch_1
    move-exception v3

    move-object v5, v3

    move-object v6, v2

    .line 132
    :goto_3
    if-eqz p7, :cond_d

    .line 13093
    const/4 v2, 0x1

    iput-boolean v2, v8, Ldgh;->b:Z

    .line 13097
    instance-of v2, v5, Ljava/net/ProtocolException;

    if-nez v2, :cond_c

    .line 13102
    instance-of v2, v5, Ljava/io/InterruptedIOException;

    if-nez v2, :cond_c

    .line 13108
    instance-of v2, v5, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v2, :cond_9

    .line 13111
    invoke-virtual {v5}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Ljava/security/cert/CertificateException;

    if-nez v2, :cond_c

    .line 13115
    :cond_9
    instance-of v2, v5, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-nez v2, :cond_c

    .line 13124
    instance-of v2, v5, Ljavax/net/ssl/SSLHandshakeException;

    if-nez v2, :cond_a

    instance-of v2, v5, Ljavax/net/ssl/SSLProtocolException;

    if-eqz v2, :cond_c

    :cond_a
    iget-boolean v2, v8, Ldgh;->a:Z

    if-eqz v2, :cond_c

    const/4 v2, 0x1

    .line 132
    :goto_4
    if-eqz v2, :cond_d

    const/4 v2, 0x1

    move v3, v2

    .line 133
    :goto_5
    invoke-static {v6}, Ldgs;->a(Ljava/net/Socket;)V

    .line 134
    invoke-static {v9}, Ldgs;->a(Ljava/net/Socket;)V

    .line 135
    if-nez v4, :cond_e

    .line 136
    new-instance v2, Ldhq;

    invoke-direct {v2, v5}, Ldhq;-><init>(Ljava/io/IOException;)V

    .line 140
    :goto_6
    if-nez v3, :cond_10

    .line 141
    throw v2

    .line 113
    :catchall_0
    move-exception v3

    :try_start_6
    invoke-virtual {v6, v2}, Ldgn;->a(Ljavax/net/ssl/SSLSocket;)V

    throw v3

    .line 12146
    :cond_b
    iget-object v5, v7, Ldez;->g:Ldfd;

    .line 13075
    iget-object v6, v7, Ldez;->b:Ljava/lang/String;

    .line 13083
    iget-object v11, v10, Ldfn;->b:Ljava/util/List;

    .line 128
    invoke-virtual {v5, v6, v11}, Ldfd;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 130
    new-instance v5, Ldht;

    move-object/from16 v0, p5

    invoke-direct {v5, v0, v2, v3, v10}, Ldht;-><init>(Ldgf;Ljavax/net/ssl/SSLSocket;Ldfx;Ldfn;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    return-object v5

    .line 13124
    :cond_c
    const/4 v2, 0x0

    goto :goto_4

    .line 132
    :cond_d
    const/4 v2, 0x0

    move v3, v2

    goto :goto_5

    .line 14049
    :cond_e
    iget-object v2, v4, Ldhq;->b:Ljava/io/IOException;

    .line 14054
    sget-object v6, Ldhq;->a:Ljava/lang/reflect/Method;

    if-eqz v6, :cond_f

    .line 14056
    :try_start_7
    sget-object v6, Ldhq;->a:Ljava/lang/reflect/Method;

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v2, v9, v10

    invoke-virtual {v6, v5, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_2

    .line 14050
    :cond_f
    :goto_7
    iput-object v5, v4, Ldhq;->b:Ljava/io/IOException;

    move-object v2, v4

    goto :goto_6

    :cond_10
    move-object v4, v2

    .line 144
    goto/16 :goto_0

    :catch_2
    move-exception v2

    goto :goto_7

    :catch_3
    move-exception v2

    goto :goto_7

    .line 131
    :catch_4
    move-exception v2

    move-object v5, v2

    move-object v6, v3

    goto :goto_3

    .line 1196
    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_0
        0x197 -> :sswitch_1
    .end sparse-switch
.end method
