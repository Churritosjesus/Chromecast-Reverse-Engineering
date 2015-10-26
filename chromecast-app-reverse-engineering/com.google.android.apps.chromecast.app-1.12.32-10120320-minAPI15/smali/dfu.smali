.class final Ldfu;
.super Ldgi;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Ldgi;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldfh;Ldhg;)Ldhw;
    .locals 2

    .prologue
    .line 67
    .line 1263
    iget-object v0, p1, Ldfh;->f:Ldjb;

    if-eqz v0, :cond_0

    new-instance v0, Ldhu;

    iget-object v1, p1, Ldfh;->f:Ldjb;

    invoke-direct {v0, p2, v1}, Ldhu;-><init>(Ldhg;Ldjb;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ldhk;

    iget-object v1, p1, Ldfh;->e:Ldgx;

    invoke-direct {v0, p2, v1}, Ldhk;-><init>(Ldhg;Ldgx;)V

    goto :goto_0
.end method

.method public final a(Ldft;)Ls;
    .locals 1

    .prologue
    .line 107
    .line 5340
    iget-object v0, p1, Ldft;->j:Ls;

    .line 107
    return-object v0
.end method

.method public final a(Ldfh;Ldfx;)V
    .locals 2

    .prologue
    .line 83
    .line 3289
    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3290
    :cond_0
    iput-object p2, p1, Ldfh;->g:Ldfx;

    .line 84
    return-void
.end method

.method public final a(Ldfh;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 75
    .line 2122
    invoke-virtual {p1}, Ldfh;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 2123
    :cond_0
    iget-object v1, p1, Ldfh;->a:Ldfi;

    monitor-enter v1

    .line 2124
    :try_start_0
    iget-object v0, p1, Ldfh;->k:Ljava/lang/Object;

    if-eq v0, p2, :cond_1

    .line 2125
    monitor-exit v1

    :goto_0
    return-void

    .line 2128
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p1, Ldfh;->k:Ljava/lang/Object;

    .line 2129
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2132
    iget-object v0, p1, Ldfh;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    goto :goto_0

    .line 2129
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(Ldfi;Ldfh;)V
    .locals 3

    .prologue
    .line 111
    .line 6175
    invoke-virtual {p2}, Ldfh;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6179
    invoke-virtual {p2}, Ldfh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6183
    invoke-virtual {p2}, Ldfh;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6211
    iget-object v0, p2, Ldfh;->c:Ljava/net/Socket;

    .line 6184
    invoke-static {v0}, Ldgs;->a(Ljava/net/Socket;)V

    .line 6201
    :cond_0
    :goto_0
    return-void

    .line 6189
    :cond_1
    :try_start_0
    invoke-static {}, Ldgn;->a()Ldgn;

    move-result-object v0

    .line 7211
    iget-object v1, p2, Ldfh;->c:Ljava/net/Socket;

    .line 6189
    invoke-virtual {v0, v1}, Ldgn;->b(Ljava/net/Socket;)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6197
    monitor-enter p1

    .line 6198
    :try_start_1
    invoke-virtual {p1, p2}, Ldfi;->a(Ldfh;)V

    .line 8309
    iget v0, p2, Ldfh;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p2, Ldfh;->j:I

    .line 9240
    iget-object v0, p2, Ldfh;->f:Ldjb;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "spdyConnection != null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6201
    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 6190
    :catch_0
    move-exception v0

    .line 6192
    invoke-static {}, Ldgn;->a()Ldgn;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to untagSocket(): "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldgn;->a(Ljava/lang/String;)V

    .line 8211
    iget-object v0, p2, Ldfh;->c:Ljava/net/Socket;

    .line 6193
    invoke-static {v0}, Ldgs;->a(Ljava/net/Socket;)V

    goto :goto_0

    .line 9241
    :cond_2
    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p2, Ldfh;->h:J

    .line 6201
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public final a(Ldfk;Ljavax/net/ssl/SSLSocket;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 158
    .line 19139
    const/4 v0, 0x0

    .line 19140
    iget-object v1, p1, Ldfk;->e:[Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 19141
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    .line 19142
    const-class v1, Ljava/lang/String;

    iget-object v2, p1, Ldfk;->e:[Ljava/lang/String;

    .line 19143
    invoke-static {v1, v2, v0}, Ldgs;->a(Ljava/lang/Class;[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 19146
    :cond_0
    if-eqz p3, :cond_3

    .line 19151
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "TLS_FALLBACK_SCSV"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    .line 19153
    if-eqz v1, :cond_3

    .line 19155
    if-eqz v0, :cond_2

    .line 19158
    :goto_0
    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    .line 19159
    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19161
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    const-string v2, "TLS_FALLBACK_SCSV"

    aput-object v2, v1, v0

    .line 19166
    :goto_1
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v0

    .line 19167
    const-class v2, Ljava/lang/String;

    iget-object v3, p1, Ldfk;->f:[Ljava/lang/String;

    invoke-static {v2, v3, v0}, Ldgs;->a(Ljava/lang/Class;[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 19168
    new-instance v2, Ldfl;

    invoke-direct {v2, p1}, Ldfl;-><init>(Ldfk;)V

    .line 19169
    invoke-virtual {v2, v1}, Ldfl;->a([Ljava/lang/String;)Ldfl;

    move-result-object v1

    .line 19170
    invoke-virtual {v1, v0}, Ldfl;->b([Ljava/lang/String;)Ldfl;

    move-result-object v0

    .line 19171
    invoke-virtual {v0}, Ldfl;->a()Ldfk;

    move-result-object v0

    .line 19125
    iget-object v1, v0, Ldfk;->f:[Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 19127
    iget-object v0, v0, Ldfk;->e:[Ljava/lang/String;

    .line 19129
    if-eqz v0, :cond_1

    .line 19130
    invoke-virtual {p2, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 159
    :cond_1
    return-void

    .line 19157
    :cond_2
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v1, v0

    goto :goto_1
.end method

.method public final a(Ldfp;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 95
    .line 5222
    const-string v0, ":"

    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    .line 5223
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 5224
    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ldfp;->b(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 96
    :goto_0
    return-void

    .line 5225
    :cond_0
    const-string v0, ":"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5228
    const-string v0, ""

    invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ldfp;->b(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    goto :goto_0

    .line 5230
    :cond_1
    const-string v0, ""

    invoke-virtual {p1, v0, p2}, Ldfp;->b(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    goto :goto_0
.end method

.method public final a(Ldft;Ldfh;Ldhg;Ldfy;)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/high16 v8, 0x10000

    .line 128
    .line 10181
    invoke-virtual {p2, p3}, Ldfh;->a(Ljava/lang/Object;)V

    .line 10198
    iget-boolean v0, p2, Ldfh;->d:Z

    .line 10183
    if-nez v0, :cond_9

    .line 10184
    iget-object v0, p2, Ldfh;->b:Ldgf;

    iget-object v0, v0, Ldgf;->a:Ldez;

    .line 11123
    iget-object v6, v0, Ldez;->j:Ljava/util/List;

    .line 11243
    iget v1, p1, Ldft;->v:I

    .line 11263
    iget v2, p1, Ldft;->w:I

    .line 11281
    iget v3, p1, Ldft;->x:I

    .line 11494
    iget-boolean v7, p1, Ldft;->u:Z

    .line 12137
    iget-boolean v0, p2, Ldfh;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12139
    :cond_0
    new-instance v0, Ldhs;

    iget-object v4, p2, Ldfh;->a:Ldfi;

    invoke-direct {v0, p2, v4}, Ldhs;-><init>(Ldfh;Ldfi;)V

    .line 12141
    iget-object v4, p2, Ldfh;->b:Ldgf;

    iget-object v4, v4, Ldgf;->a:Ldez;

    .line 13096
    iget-object v4, v4, Ldez;->e:Ljavax/net/ssl/SSLSocketFactory;

    .line 12141
    if-eqz v4, :cond_3

    .line 12143
    iget-object v5, p2, Ldfh;->b:Ldgf;

    move-object v4, p4

    invoke-virtual/range {v0 .. v7}, Ldhs;->a(IIILdfy;Ldgf;Ljava/util/List;Z)Ldht;

    move-result-object v0

    .line 12155
    :goto_0
    iget-object v1, v0, Ldht;->a:Ljava/net/Socket;

    iput-object v1, p2, Ldfh;->c:Ljava/net/Socket;

    .line 12156
    iget-object v1, v0, Ldht;->c:Ldfn;

    iput-object v1, p2, Ldfh;->i:Ldfn;

    .line 12157
    iget-object v1, v0, Ldht;->b:Ldfx;

    if-nez v1, :cond_5

    sget-object v0, Ldfx;->b:Ldfx;

    :goto_1
    iput-object v0, p2, Ldfh;->g:Ldfx;

    .line 12161
    :try_start_0
    iget-object v0, p2, Ldfh;->g:Ldfx;

    sget-object v1, Ldfx;->c:Ldfx;

    if-eq v0, v1, :cond_1

    iget-object v0, p2, Ldfh;->g:Ldfx;

    sget-object v1, Ldfx;->d:Ldfx;

    if-ne v0, v1, :cond_6

    .line 12162
    :cond_1
    iget-object v0, p2, Ldfh;->c:Ljava/net/Socket;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 12163
    new-instance v0, Ldjj;

    iget-object v1, p2, Ldfh;->b:Ldgf;

    iget-object v1, v1, Ldgf;->a:Ldez;

    iget-object v1, v1, Ldez;->b:Ljava/lang/String;

    const/4 v2, 0x1

    iget-object v3, p2, Ldfh;->c:Ljava/net/Socket;

    invoke-direct {v0, v1, v2, v3}, Ldjj;-><init>(Ljava/lang/String;ZLjava/net/Socket;)V

    iget-object v1, p2, Ldfh;->g:Ldfx;

    .line 14546
    iput-object v1, v0, Ldjj;->d:Ldfx;

    .line 14556
    new-instance v1, Ldjb;

    .line 15054
    invoke-direct {v1, v0}, Ldjb;-><init>(Ldjj;)V

    .line 12164
    iput-object v1, p2, Ldfh;->f:Ldjb;

    .line 12165
    iget-object v0, p2, Ldfh;->f:Ldjb;

    .line 15510
    iget-object v1, v0, Ldjb;->i:Ldid;

    invoke-interface {v1}, Ldid;->a()V

    .line 15511
    iget-object v1, v0, Ldjb;->i:Ldid;

    iget-object v2, v0, Ldjb;->e:Ldix;

    invoke-interface {v1, v2}, Ldid;->b(Ldix;)V

    .line 15512
    iget-object v1, v0, Ldjb;->e:Ldix;

    const/high16 v2, 0x10000

    invoke-virtual {v1, v2}, Ldix;->c(I)I

    move-result v1

    .line 15513
    if-eq v1, v8, :cond_2

    .line 15514
    iget-object v0, v0, Ldjb;->i:Ldid;

    const/4 v2, 0x0

    sub-int/2addr v1, v8

    int-to-long v4, v1

    invoke-interface {v0, v2, v4, v5}, Ldid;->a(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12172
    :cond_2
    :goto_2
    iput-boolean v9, p2, Ldfh;->d:Z

    .line 10187
    invoke-virtual {p2}, Ldfh;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 16443
    iget-object v1, p1, Ldft;->q:Ldfi;

    .line 17219
    invoke-virtual {p2}, Ldfh;->e()Z

    move-result v0

    if-nez v0, :cond_7

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 12147
    :cond_3
    sget-object v0, Ldfk;->c:Ldfk;

    invoke-interface {v6, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 12148
    new-instance v0, Ldhq;

    new-instance v1, Ljava/net/UnknownServiceException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CLEARTEXT communication not supported: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ldhq;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 12152
    :cond_4
    iget-object v3, p2, Ldfh;->b:Ldgf;

    .line 14067
    invoke-static {v2, v1, v3}, Ldhs;->a(IILdgf;)Ljava/net/Socket;

    move-result-object v1

    .line 14068
    new-instance v0, Ldht;

    invoke-direct {v0, v3, v1}, Ldht;-><init>(Ldgf;Ljava/net/Socket;)V

    goto/16 :goto_0

    .line 12157
    :cond_5
    iget-object v0, v0, Ldht;->b:Ldfx;

    goto/16 :goto_1

    .line 12167
    :cond_6
    :try_start_1
    new-instance v0, Ldgx;

    iget-object v1, p2, Ldfh;->a:Ldfi;

    iget-object v2, p2, Ldfh;->c:Ljava/net/Socket;

    invoke-direct {v0, v1, p2, v2}, Ldgx;-><init>(Ldfi;Ldfh;Ljava/net/Socket;)V

    iput-object v0, p2, Ldfh;->e:Ldgx;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 12169
    :catch_0
    move-exception v0

    .line 12170
    new-instance v1, Ldhq;

    invoke-direct {v1, v0}, Ldhq;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 17220
    :cond_7
    invoke-virtual {p2}, Ldfh;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 17221
    monitor-enter v1

    .line 17222
    :try_start_2
    invoke-virtual {v1, p2}, Ldfi;->a(Ldfh;)V

    .line 17223
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 17498
    :cond_8
    iget-object v0, p1, Ldft;->c:Ldgr;

    .line 18203
    iget-object v1, p2, Ldfh;->b:Ldgf;

    .line 10190
    invoke-virtual {v0, v1}, Ldgr;->b(Ldgf;)V

    .line 18263
    :cond_9
    iget v0, p1, Ldft;->w:I

    .line 18281
    iget v1, p1, Ldft;->x:I

    .line 18295
    iget-boolean v2, p2, Ldfh;->d:Z

    if-nez v2, :cond_a

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setTimeouts - not connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 17223
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 18298
    :cond_a
    iget-object v2, p2, Ldfh;->e:Ldgx;

    if-eqz v2, :cond_b

    .line 18300
    :try_start_4
    iget-object v2, p2, Ldfh;->c:Ljava/net/Socket;

    invoke-virtual {v2, v0}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 18304
    iget-object v2, p2, Ldfh;->e:Ldgx;

    invoke-virtual {v2, v0, v1}, Ldgx;->a(II)V

    .line 129
    :cond_b
    return-void

    .line 18301
    :catch_1
    move-exception v0

    .line 18302
    new-instance v1, Ldhq;

    invoke-direct {v1, v0}, Ldhq;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final a(Ldfh;)Z
    .locals 1

    .prologue
    .line 71
    invoke-virtual {p1}, Ldfh;->a()Z

    move-result v0

    return v0
.end method

.method public final b(Ldfh;)I
    .locals 1

    .prologue
    .line 79
    .line 2317
    iget v0, p1, Ldfh;->j:I

    .line 79
    return v0
.end method

.method public final b(Ldft;)Ldgr;
    .locals 1

    .prologue
    .line 115
    .line 9498
    iget-object v0, p1, Ldft;->c:Ldgr;

    .line 115
    return-object v0
.end method

.method public final b(Ldfh;Ldhg;)V
    .locals 0

    .prologue
    .line 87
    invoke-virtual {p1, p2}, Ldfh;->a(Ljava/lang/Object;)V

    .line 88
    return-void
.end method

.method public final c(Ldft;)Ldgk;
    .locals 1

    .prologue
    .line 119
    invoke-static {p1}, Ldft;->a(Ldft;)Ldgk;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ldfh;)Z
    .locals 1

    .prologue
    .line 91
    .line 4235
    iget-object v0, p1, Ldfh;->e:Ldgx;

    if-eqz v0, :cond_0

    iget-object v0, p1, Ldfh;->e:Ldgx;

    invoke-virtual {v0}, Ldgx;->b()Z

    move-result v0

    :goto_0
    return v0

    .line 4236
    :cond_0
    const/4 v0, 0x1

    .line 91
    goto :goto_0
.end method
