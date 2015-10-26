.class public final Ldhg;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ldge;


# instance fields
.field public final b:Ldft;

.field public c:Ldfh;

.field public d:Ldez;

.field public e:Ldhr;

.field public f:Ldgf;

.field public final g:Ldgc;

.field public h:Ldhw;

.field public i:J

.field public j:Z

.field public final k:Z

.field public final l:Ldfy;

.field public m:Ldfy;

.field public n:Ldgc;

.field public o:Ldgc;

.field public p:Ldku;

.field public q:Ldkc;

.field public final r:Z

.field public final s:Z

.field public t:Ls;

.field public u:Ldgv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 102
    new-instance v0, Ldhh;

    invoke-direct {v0}, Ldhh;-><init>()V

    sput-object v0, Ldhg;->a:Ldge;

    return-void
.end method

.method public constructor <init>(Ldft;Ldfy;ZZZLdfh;Ldhr;Ldhp;Ldgc;)V
    .locals 2

    .prologue
    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ldhg;->i:J

    .line 191
    iput-object p1, p0, Ldhg;->b:Ldft;

    .line 192
    iput-object p2, p0, Ldhg;->l:Ldfy;

    .line 193
    iput-boolean p3, p0, Ldhg;->k:Z

    .line 194
    iput-boolean p4, p0, Ldhg;->r:Z

    .line 195
    iput-boolean p5, p0, Ldhg;->s:Z

    .line 196
    iput-object p6, p0, Ldhg;->c:Ldfh;

    .line 197
    iput-object p7, p0, Ldhg;->e:Ldhr;

    .line 198
    iput-object p8, p0, Ldhg;->p:Ldku;

    .line 199
    iput-object p9, p0, Ldhg;->g:Ldgc;

    .line 201
    if-eqz p6, :cond_0

    .line 202
    sget-object v0, Ldgi;->b:Ldgi;

    invoke-virtual {v0, p6, p0}, Ldgi;->b(Ldfh;Ldhg;)V

    .line 1203
    iget-object v0, p6, Ldfh;->b:Ldgf;

    .line 203
    iput-object v0, p0, Ldhg;->f:Ldgf;

    .line 207
    :goto_0
    return-void

    .line 205
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ldhg;->f:Ldgf;

    goto :goto_0
.end method

.method public static a(Ldfo;Ldfo;)Ldfo;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 1025
    new-instance v2, Ldfp;

    invoke-direct {v2}, Ldfp;-><init>()V

    .line 17076
    iget-object v1, p0, Ldfo;->a:[Ljava/lang/String;

    array-length v1, v1

    div-int/lit8 v3, v1, 0x2

    move v1, v0

    .line 1027
    :goto_0
    if-ge v1, v3, :cond_3

    .line 1028
    invoke-virtual {p0, v1}, Ldfo;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 1029
    invoke-virtual {p0, v1}, Ldfo;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 1030
    const-string v6, "Warning"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 1033
    :cond_0
    invoke-static {v4}, Ldhl;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p1, v4}, Ldfo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    .line 1034
    :cond_1
    invoke-virtual {v2, v4, v5}, Ldfp;->a(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 1027
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18076
    :cond_3
    iget-object v1, p1, Ldfo;->a:[Ljava/lang/String;

    array-length v1, v1

    div-int/lit8 v1, v1, 0x2

    .line 1038
    :goto_1
    if-ge v0, v1, :cond_5

    .line 1039
    invoke-virtual {p1, v0}, Ldfo;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 1040
    const-string v4, "Content-Length"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 1043
    invoke-static {v3}, Ldhl;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 1044
    invoke-virtual {p1, v0}, Ldfo;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ldfp;->a(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 1038
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1048
    :cond_5
    invoke-virtual {v2}, Ldfp;->a()Ldfo;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ldgc;)Ldgc;
    .locals 2

    .prologue
    .line 312
    if-eqz p0, :cond_0

    .line 2130
    iget-object v0, p0, Ldgc;->g:Ldge;

    .line 312
    if-eqz v0, :cond_0

    .line 313
    invoke-virtual {p0}, Ldgc;->a()Ldgd;

    move-result-object v0

    const/4 v1, 0x0

    .line 2305
    iput-object v1, v0, Ldgd;->g:Ldge;

    .line 313
    invoke-virtual {v0}, Ldgd;->a()Ldgc;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static synthetic a(Ldhg;)Ldhw;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Ldhg;->h:Ldhw;

    return-object v0
.end method

.method public static a(Ljava/net/URL;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 733
    invoke-static {p0}, Ldgs;->a(Ljava/net/URL;)I

    move-result v0

    invoke-virtual {p0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldgs;->a(Ljava/lang/String;)I

    move-result v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 734
    invoke-virtual {p0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/net/URL;->getPort()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 735
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static c(Ldgc;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 667
    .line 14075
    iget-object v2, p0, Ldgc;->a:Ldfy;

    .line 15070
    iget-object v2, v2, Ldfy;->b:Ljava/lang/String;

    .line 667
    const-string v3, "HEAD"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 686
    :cond_0
    :goto_0
    return v0

    .line 15088
    :cond_1
    iget v2, p0, Ldgc;->c:I

    .line 672
    const/16 v3, 0x64

    if-lt v2, v3, :cond_2

    const/16 v3, 0xc8

    if-lt v2, v3, :cond_3

    :cond_2
    const/16 v3, 0xcc

    if-eq v2, v3, :cond_3

    const/16 v3, 0x130

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 675
    goto :goto_0

    .line 681
    :cond_3
    invoke-static {p0}, Ldhl;->a(Ldgc;)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    const-string v2, "chunked"

    const-string v3, "Transfer-Encoding"

    .line 682
    invoke-virtual {p0, v3}, Ldgc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_4
    move v0, v1

    .line 683
    goto :goto_0
.end method


# virtual methods
.method public a()Ldfh;
    .locals 4

    .prologue
    .line 346
    iget-object v0, p0, Ldhg;->b:Ldft;

    .line 2443
    iget-object v1, v0, Ldft;->q:Ldfi;

    .line 349
    :goto_0
    iget-object v0, p0, Ldhg;->d:Ldez;

    invoke-virtual {v1, v0}, Ldfi;->a(Ldez;)Ldfh;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 350
    iget-object v2, p0, Ldhg;->m:Ldfy;

    .line 3070
    iget-object v2, v2, Ldfy;->b:Ljava/lang/String;

    .line 350
    const-string v3, "GET"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Ldgi;->b:Ldgi;

    invoke-virtual {v2, v0}, Ldgi;->c(Ldfh;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 358
    :cond_0
    :goto_1
    return-object v0

    .line 3211
    :cond_1
    iget-object v0, v0, Ldfh;->c:Ljava/net/Socket;

    .line 353
    invoke-static {v0}, Ldgs;->a(Ljava/net/Socket;)V

    goto :goto_0

    .line 357
    :cond_2
    :try_start_0
    iget-object v0, p0, Ldhg;->e:Ldhr;

    invoke-virtual {v0}, Ldhr;->b()Ldgf;

    move-result-object v2

    .line 358
    new-instance v0, Ldfh;

    invoke-direct {v0, v1, v2}, Ldfh;-><init>(Ldfi;Ldgf;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 359
    :catch_0
    move-exception v0

    .line 360
    new-instance v1, Ldhq;

    invoke-direct {v1, v0}, Ldhq;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final a(Ldfo;)V
    .locals 3

    .prologue
    .line 1052
    iget-object v0, p0, Ldhg;->b:Ldft;

    .line 18330
    iget-object v0, v0, Ldft;->i:Ljava/net/CookieHandler;

    .line 1053
    if-eqz v0, :cond_0

    .line 1054
    iget-object v1, p0, Ldhg;->l:Ldfy;

    invoke-virtual {v1}, Ldfy;->b()Ljava/net/URI;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v2}, Ldhl;->a(Ldfo;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/CookieHandler;->put(Ljava/net/URI;Ljava/util/Map;)V

    .line 1056
    :cond_0
    return-void
.end method

.method public a(Ldhr;Ljava/io/IOException;)V
    .locals 4

    .prologue
    .line 506
    sget-object v0, Ldgi;->b:Ldgi;

    iget-object v1, p0, Ldhg;->c:Ldfh;

    invoke-virtual {v0, v1}, Ldgi;->b(Ldfh;)I

    move-result v0

    if-lez v0, :cond_0

    .line 509
    :goto_0
    return-void

    .line 507
    :cond_0
    iget-object v0, p0, Ldhg;->c:Ldfh;

    .line 4203
    iget-object v0, v0, Ldfh;->b:Ldgf;

    .line 6066
    iget-object v1, v0, Ldgf;->b:Ljava/net/Proxy;

    .line 5119
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v1, v2, :cond_1

    iget-object v1, p1, Ldhr;->a:Ldez;

    .line 6139
    iget-object v1, v1, Ldez;->k:Ljava/net/ProxySelector;

    .line 5119
    if-eqz v1, :cond_1

    .line 5121
    iget-object v1, p1, Ldhr;->a:Ldez;

    .line 7139
    iget-object v1, v1, Ldez;->k:Ljava/net/ProxySelector;

    .line 5121
    iget-object v2, p1, Ldhr;->b:Ljava/net/URI;

    .line 8066
    iget-object v3, v0, Ldgf;->b:Ljava/net/Proxy;

    .line 5121
    invoke-virtual {v3}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v3

    invoke-virtual {v1, v2, v3, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 5124
    :cond_1
    iget-object v1, p1, Ldhr;->c:Ldgr;

    invoke-virtual {v1, v0}, Ldgr;->a(Ldgf;)V

    goto :goto_0
.end method

.method public b(Ldgc;)Ldgc;
    .locals 4

    .prologue
    .line 642
    iget-boolean v0, p0, Ldhg;->j:Z

    if-eqz v0, :cond_0

    const-string v0, "gzip"

    iget-object v1, p0, Ldhg;->o:Ldgc;

    const-string v2, "Content-Encoding"

    invoke-virtual {v1, v2}, Ldgc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 658
    :cond_0
    :goto_0
    return-object p1

    .line 11130
    :cond_1
    iget-object v0, p1, Ldgc;->g:Ldge;

    .line 646
    if-eqz v0, :cond_0

    .line 650
    new-instance v0, Ldki;

    .line 12130
    iget-object v1, p1, Ldgc;->g:Ldge;

    .line 650
    invoke-virtual {v1}, Ldge;->c()Ldkd;

    move-result-object v1

    invoke-direct {v0, v1}, Ldki;-><init>(Ldkv;)V

    .line 13126
    iget-object v1, p1, Ldgc;->f:Ldfo;

    .line 651
    invoke-virtual {v1}, Ldfo;->a()Ldfp;

    move-result-object v1

    const-string v2, "Content-Encoding"

    .line 652
    invoke-virtual {v1, v2}, Ldfp;->a(Ljava/lang/String;)Ldfp;

    move-result-object v1

    const-string v2, "Content-Length"

    .line 653
    invoke-virtual {v1, v2}, Ldfp;->a(Ljava/lang/String;)Ldfp;

    move-result-object v1

    .line 654
    invoke-virtual {v1}, Ldfp;->a()Ldfo;

    move-result-object v1

    .line 655
    invoke-virtual {p1}, Ldgc;->a()Ldgd;

    move-result-object v2

    .line 656
    invoke-virtual {v2, v1}, Ldgd;->a(Ldfo;)Ldgd;

    move-result-object v2

    new-instance v3, Ldhn;

    .line 657
    invoke-static {v0}, Ldkk;->a(Ldkv;)Ldkd;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Ldhn;-><init>(Ldfo;Ldkd;)V

    .line 13305
    iput-object v3, v2, Ldgd;->g:Ldge;

    .line 658
    invoke-virtual {v2}, Ldgd;->a()Ldgc;

    move-result-object p1

    goto :goto_0
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 369
    iget-wide v0, p0, Ldhg;->i:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 370
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ldhg;->i:J

    .line 371
    return-void
.end method

.method public final b(Ljava/net/URL;)Z
    .locals 3

    .prologue
    .line 1133
    iget-object v0, p0, Ldhg;->l:Ldfy;

    invoke-virtual {v0}, Ldfy;->a()Ljava/net/URL;

    move-result-object v0

    .line 1134
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1135
    invoke-static {v0}, Ldgs;->a(Ljava/net/URL;)I

    move-result v1

    invoke-static {p1}, Ldgs;->a(Ljava/net/URL;)I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 1136
    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 374
    iget-object v0, p0, Ldhg;->l:Ldfy;

    .line 4070
    iget-object v0, v0, Ldfy;->b:Ljava/lang/String;

    .line 374
    invoke-static {v0}, La;->q(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final d()Ldku;
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Ldhg;->u:Ldgv;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 380
    :cond_0
    iget-object v0, p0, Ldhg;->p:Ldku;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 393
    iget-object v0, p0, Ldhg;->o:Ldgc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Ldgc;
    .locals 1

    .prologue
    .line 403
    iget-object v0, p0, Ldhg;->o:Ldgc;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 404
    :cond_0
    iget-object v0, p0, Ldhg;->o:Ldgc;

    return-object v0
.end method

.method public g()V
    .locals 3

    .prologue
    .line 543
    sget-object v0, Ldgi;->b:Ldgi;

    iget-object v1, p0, Ldhg;->b:Ldft;

    invoke-virtual {v0, v1}, Ldgi;->a(Ldft;)Ls;

    move-result-object v0

    .line 544
    if-nez v0, :cond_1

    .line 560
    :cond_0
    :goto_0
    return-void

    .line 547
    :cond_1
    iget-object v1, p0, Ldhg;->o:Ldgc;

    iget-object v2, p0, Ldhg;->m:Ldfy;

    invoke-static {v1, v2}, Ldgv;->a(Ldgc;Ldfy;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 548
    iget-object v0, p0, Ldhg;->m:Ldfy;

    .line 8070
    iget-object v0, v0, Ldfy;->b:Ljava/lang/String;

    .line 9020
    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "PATCH"

    .line 9021
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "PUT"

    .line 9022
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "DELETE"

    .line 9023
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 559
    :cond_2
    iget-object v1, p0, Ldhg;->o:Ldgc;

    invoke-static {v1}, Ldhg;->a(Ldgc;)Ldgc;

    invoke-interface {v0}, Ls;->m()Ls;

    move-result-object v0

    iput-object v0, p0, Ldhg;->t:Ls;

    goto :goto_0
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 568
    iget-object v0, p0, Ldhg;->h:Ldhw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldhg;->c:Ldfh;

    if-eqz v0, :cond_0

    .line 569
    iget-object v0, p0, Ldhg;->h:Ldhw;

    invoke-interface {v0}, Ldhw;->c()V

    .line 571
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ldhg;->c:Ldfh;

    .line 572
    return-void
.end method

.method public final i()Ldfh;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 594
    iget-object v1, p0, Ldhg;->q:Ldkc;

    if-eqz v1, :cond_2

    .line 596
    iget-object v1, p0, Ldhg;->q:Ldkc;

    invoke-static {v1}, Ldgs;->a(Ljava/io/Closeable;)V

    .line 602
    :cond_0
    :goto_0
    iget-object v1, p0, Ldhg;->o:Ldgc;

    if-nez v1, :cond_3

    .line 603
    iget-object v1, p0, Ldhg;->c:Ldfh;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ldhg;->c:Ldfh;

    .line 9211
    iget-object v1, v1, Ldfh;->c:Ljava/net/Socket;

    .line 603
    invoke-static {v1}, Ldgs;->a(Ljava/net/Socket;)V

    .line 604
    :cond_1
    iput-object v0, p0, Ldhg;->c:Ldfh;

    .line 625
    :goto_1
    return-object v0

    .line 597
    :cond_2
    iget-object v1, p0, Ldhg;->p:Ldku;

    if-eqz v1, :cond_0

    .line 598
    iget-object v1, p0, Ldhg;->p:Ldku;

    invoke-static {v1}, Ldgs;->a(Ljava/io/Closeable;)V

    goto :goto_0

    .line 609
    :cond_3
    iget-object v1, p0, Ldhg;->o:Ldgc;

    .line 10130
    iget-object v1, v1, Ldgc;->g:Ldge;

    .line 609
    invoke-static {v1}, Ldgs;->a(Ljava/io/Closeable;)V

    .line 612
    iget-object v1, p0, Ldhg;->h:Ldhw;

    if-eqz v1, :cond_4

    iget-object v1, p0, Ldhg;->c:Ldfh;

    if-eqz v1, :cond_4

    iget-object v1, p0, Ldhg;->h:Ldhw;

    invoke-interface {v1}, Ldhw;->d()Z

    move-result v1

    if-nez v1, :cond_4

    .line 613
    iget-object v1, p0, Ldhg;->c:Ldfh;

    .line 10211
    iget-object v1, v1, Ldfh;->c:Ljava/net/Socket;

    .line 613
    invoke-static {v1}, Ldgs;->a(Ljava/net/Socket;)V

    .line 614
    iput-object v0, p0, Ldhg;->c:Ldfh;

    goto :goto_1

    .line 619
    :cond_4
    iget-object v1, p0, Ldhg;->c:Ldfh;

    if-eqz v1, :cond_5

    sget-object v1, Ldgi;->b:Ldgi;

    iget-object v2, p0, Ldhg;->c:Ldfh;

    invoke-virtual {v1, v2}, Ldgi;->a(Ldfh;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 620
    iput-object v0, p0, Ldhg;->c:Ldfh;

    .line 623
    :cond_5
    iget-object v1, p0, Ldhg;->c:Ldfh;

    .line 624
    iput-object v0, p0, Ldhg;->c:Ldfh;

    move-object v0, v1

    .line 625
    goto :goto_1
.end method

.method public j()Ldgc;
    .locals 4

    .prologue
    .line 915
    iget-object v0, p0, Ldhg;->h:Ldhw;

    invoke-interface {v0}, Ldhw;->a()V

    .line 917
    iget-object v0, p0, Ldhg;->h:Ldhw;

    invoke-interface {v0}, Ldhw;->b()Ldgd;

    move-result-object v0

    iget-object v1, p0, Ldhg;->m:Ldfy;

    .line 15251
    iput-object v1, v0, Ldgd;->a:Ldfy;

    .line 918
    iget-object v1, p0, Ldhg;->c:Ldfh;

    .line 15258
    iget-object v1, v1, Ldfh;->i:Ldfn;

    .line 15271
    iput-object v1, v0, Ldgd;->e:Ldfn;

    .line 919
    sget-object v1, Ldhl;->a:Ljava/lang/String;

    iget-wide v2, p0, Ldhg;->i:J

    .line 920
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ldgd;->a(Ljava/lang/String;Ljava/lang/String;)Ldgd;

    move-result-object v0

    sget-object v1, Ldhl;->b:Ljava/lang/String;

    .line 921
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ldgd;->a(Ljava/lang/String;Ljava/lang/String;)Ldgd;

    move-result-object v0

    .line 922
    invoke-virtual {v0}, Ldgd;->a()Ldgc;

    move-result-object v0

    .line 924
    iget-boolean v1, p0, Ldhg;->s:Z

    if-nez v1, :cond_0

    .line 925
    invoke-virtual {v0}, Ldgc;->a()Ldgd;

    move-result-object v1

    iget-object v2, p0, Ldhg;->h:Ldhw;

    .line 926
    invoke-interface {v2, v0}, Ldhw;->a(Ldgc;)Ldge;

    move-result-object v0

    .line 15305
    iput-object v0, v1, Ldgd;->g:Ldge;

    .line 927
    invoke-virtual {v1}, Ldgd;->a()Ldgc;

    move-result-object v0

    .line 930
    :cond_0
    sget-object v1, Ldgi;->b:Ldgi;

    iget-object v2, p0, Ldhg;->c:Ldfh;

    .line 16083
    iget-object v3, v0, Ldgc;->b:Ldfx;

    .line 930
    invoke-virtual {v1, v2, v3}, Ldgi;->a(Ldfh;Ldfx;)V

    .line 931
    return-object v0
.end method
