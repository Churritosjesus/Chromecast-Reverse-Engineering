.class public final Ldhy;
.super Ljava/net/HttpURLConnection;
.source "PG"


# static fields
.field private static final d:Ljava/util/Set;

.field private static final e:Ldga;


# instance fields
.field final a:Ldft;

.field public b:Ldhg;

.field c:Ldfn;

.field private f:Ldfp;

.field private g:J

.field private h:I

.field private i:Ljava/io/IOException;

.field private j:Ldfo;

.field private k:Ldgf;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 77
    new-instance v0, Ljava/util/LinkedHashSet;

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "OPTIONS"

    aput-object v2, v1, v8

    const/4 v2, 0x1

    const-string v3, "GET"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "HEAD"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "POST"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "PUT"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "DELETE"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "TRACE"

    aput-object v3, v1, v2

    const/4 v2, 0x7

    const-string v3, "PATCH"

    aput-object v3, v1, v2

    .line 78
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Ldhy;->d:Ljava/util/Set;

    .line 79
    new-array v6, v8, [B

    .line 50582
    const/4 v7, 0x0

    .line 50583
    if-nez v6, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "content == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50584
    :cond_0
    array-length v0, v6

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    int-to-long v4, v8

    invoke-static/range {v0 .. v5}, Ldgs;->a(JJJ)V

    .line 50585
    new-instance v0, Ldgb;

    invoke-direct {v0, v7, v8, v6, v8}, Ldgb;-><init>(Ldfs;I[BI)V

    .line 79
    sput-object v0, Ldhy;->e:Ldga;

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Ldft;)V
    .locals 2

    .prologue
    .line 106
    invoke-direct {p0, p1}, Ljava/net/HttpURLConnection;-><init>(Ljava/net/URL;)V

    .line 83
    new-instance v0, Ldfp;

    invoke-direct {v0}, Ldfp;-><init>()V

    iput-object v0, p0, Ldhy;->f:Ldfp;

    .line 86
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ldhy;->g:J

    .line 107
    iput-object p2, p0, Ldhy;->a:Ldft;

    .line 108
    return-void
.end method

.method private a()Ldfo;
    .locals 5

    .prologue
    .line 149
    iget-object v0, p0, Ldhy;->j:Ldfo;

    if-nez v0, :cond_0

    .line 150
    invoke-direct {p0}, Ldhy;->c()Ldhg;

    move-result-object v0

    invoke-virtual {v0}, Ldhg;->f()Ldgc;

    move-result-object v0

    .line 3126
    iget-object v1, v0, Ldgc;->f:Ldfo;

    .line 153
    invoke-virtual {v1}, Ldfo;->a()Ldfp;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    invoke-static {}, Ldgn;->a()Ldgn;

    invoke-static {}, Ldgn;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-Response-Source"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 4158
    iget-object v3, v0, Ldgc;->h:Ldgc;

    .line 3161
    if-nez v3, :cond_2

    .line 4168
    iget-object v3, v0, Ldgc;->i:Ldgc;

    .line 3162
    if-nez v3, :cond_1

    .line 3163
    const-string v0, "NONE"

    .line 154
    :goto_0
    invoke-virtual {v1, v2, v0}, Ldfp;->a(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ldfp;->a()Ldfo;

    move-result-object v0

    iput-object v0, p0, Ldhy;->j:Ldfo;

    .line 157
    :cond_0
    iget-object v0, p0, Ldhy;->j:Ldfo;

    return-object v0

    .line 3165
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CACHE "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 5088
    iget v0, v0, Ldgc;->c:I

    .line 3165
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 5168
    :cond_2
    iget-object v3, v0, Ldgc;->i:Ldgc;

    .line 3167
    if-nez v3, :cond_3

    .line 3168
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NETWORK "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6088
    iget v0, v0, Ldgc;->c:I

    .line 3168
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 3170
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CONDITIONAL_CACHE "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6158
    iget-object v0, v0, Ldgc;->h:Ldgc;

    .line 7088
    iget v0, v0, Ldgc;->c:I

    .line 3170
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ldfh;Ldhp;Ldgc;)Ldhg;
    .locals 10

    .prologue
    .line 322
    invoke-static {p1}, La;->p(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ldhy;->e:Ldga;

    .line 325
    :goto_0
    new-instance v1, Ldfz;

    invoke-direct {v1}, Ldfz;-><init>()V

    .line 326
    invoke-virtual {p0}, Ldhy;->getURL()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v1, v2}, Ldfz;->a(Ljava/net/URL;)Ldfz;

    move-result-object v1

    .line 327
    invoke-virtual {v1, p1, v0}, Ldfz;->a(Ljava/lang/String;Ldga;)Ldfz;

    move-result-object v1

    .line 328
    iget-object v0, p0, Ldhy;->f:Ldfp;

    invoke-virtual {v0}, Ldfp;->a()Ldfo;

    move-result-object v2

    .line 329
    const/4 v0, 0x0

    .line 12076
    iget-object v3, v2, Ldfo;->a:[Ljava/lang/String;

    array-length v3, v3

    div-int/lit8 v3, v3, 0x2

    .line 329
    :goto_1
    if-ge v0, v3, :cond_1

    .line 330
    invoke-virtual {v2, v0}, Ldfo;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0}, Ldfo;->b(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ldfz;->b(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 329
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 322
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 333
    :cond_1
    const/4 v0, 0x0

    .line 334
    invoke-static {p1}, La;->q(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 336
    iget-wide v4, p0, Ldhy;->g:J

    const-wide/16 v6, -0x1

    cmp-long v3, v4, v6

    if-eqz v3, :cond_5

    .line 337
    const-string v3, "Content-Length"

    iget-wide v4, p0, Ldhy;->g:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 345
    :goto_2
    const-string v3, "Content-Type"

    invoke-virtual {v2, v3}, Ldfo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    .line 346
    const-string v3, "Content-Type"

    const-string v4, "application/x-www-form-urlencoded"

    invoke-virtual {v1, v3, v4}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    :cond_2
    move v3, v0

    .line 350
    const-string v0, "User-Agent"

    invoke-virtual {v2, v0}, Ldfo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 351
    const-string v2, "User-Agent"

    .line 12367
    const-string v0, "http.agent"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 12368
    if-eqz v0, :cond_7

    .line 351
    :goto_3
    invoke-virtual {v1, v2, v0}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 354
    :cond_3
    invoke-virtual {v1}, Ldfz;->a()Ldfy;

    move-result-object v2

    .line 357
    iget-object v1, p0, Ldhy;->a:Ldft;

    .line 358
    sget-object v0, Ldgi;->b:Ldgi;

    invoke-virtual {v0, v1}, Ldgi;->a(Ldft;)Ls;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ldhy;->getUseCaches()Z

    move-result v0

    if-nez v0, :cond_4

    .line 359
    iget-object v0, p0, Ldhy;->a:Ldft;

    invoke-virtual {v0}, Ldft;->b()Ldft;

    move-result-object v1

    .line 13344
    const/4 v0, 0x0

    iput-object v0, v1, Ldft;->k:Ldh;

    .line 13345
    const/4 v0, 0x0

    iput-object v0, v1, Ldft;->j:Ls;

    .line 362
    :cond_4
    new-instance v0, Ldhg;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v6, p2

    move-object v8, p3

    move-object v9, p4

    invoke-direct/range {v0 .. v9}, Ldhg;-><init>(Ldft;Ldfy;ZZZLdfh;Ldhr;Ldhp;Ldgc;)V

    return-object v0

    .line 338
    :cond_5
    iget v3, p0, Ldhy;->chunkLength:I

    if-lez v3, :cond_6

    .line 339
    const-string v3, "Transfer-Encoding"

    const-string v4, "chunked"

    invoke-virtual {v1, v3, v4}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    goto :goto_2

    .line 341
    :cond_6
    const/4 v0, 0x1

    goto :goto_2

    .line 12368
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Java"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "java.version"

    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 5

    .prologue
    .line 566
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 567
    if-eqz p2, :cond_0

    .line 568
    iget-object v0, p0, Ldhy;->a:Ldft;

    .line 50569
    iget-object v0, v0, Ldft;->e:Ljava/util/List;

    .line 568
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 570
    :cond_0
    const-string v0, ","

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 572
    :try_start_0
    invoke-static {v4}, Ldfx;->a(Ljava/lang/String;)Ldfx;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 570
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 573
    :catch_0
    move-exception v0

    .line 574
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 577
    :cond_1
    iget-object v0, p0, Ldhy;->a:Ldft;

    .line 50570
    invoke-static {v1}, Ldgs;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 50571
    sget-object v2, Ldfx;->b:Ldfx;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 50572
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "protocols doesn\'t contain http/1.1: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50574
    :cond_2
    sget-object v2, Ldfx;->a:Ldfx;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 50575
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "protocols must not contain http/1.0: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50577
    :cond_3
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 50578
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "protocols must not contain null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50580
    :cond_4
    invoke-static {v1}, Ldgs;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Ldft;->e:Ljava/util/List;

    .line 578
    return-void
.end method

.method private a(Z)Z
    .locals 18

    .prologue
    .line 433
    :try_start_0
    move-object/from16 v0, p0

    iget-object v14, v0, Ldhy;->b:Ldhg;

    .line 23222
    iget-object v2, v14, Ldhg;->u:Ldgv;

    if-nez v2, :cond_31

    .line 23223
    iget-object v2, v14, Ldhg;->h:Ldhw;

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    throw v2
    :try_end_0
    .catch Ldho; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ldhq; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 443
    :catch_0
    move-exception v2

    .line 445
    invoke-virtual {v2}, Ldho;->a()Ljava/io/IOException;

    move-result-object v2

    .line 446
    move-object/from16 v0, p0

    iput-object v2, v0, Ldhy;->i:Ljava/io/IOException;

    .line 447
    throw v2

    .line 23225
    :cond_0
    :try_start_1
    iget-object v2, v14, Ldhg;->l:Ldfy;

    .line 23696
    invoke-virtual {v2}, Ldfy;->c()Ldfz;

    move-result-object v3

    .line 23698
    const-string v4, "Host"

    invoke-virtual {v2, v4}, Ldfy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    .line 23699
    const-string v4, "Host"

    invoke-virtual {v2}, Ldfy;->a()Ljava/net/URL;

    move-result-object v5

    invoke-static {v5}, Ldhg;->a(Ljava/net/URL;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 23702
    :cond_1
    iget-object v4, v14, Ldhg;->c:Ldfh;

    if-eqz v4, :cond_2

    iget-object v4, v14, Ldhg;->c:Ldfh;

    .line 24281
    iget-object v4, v4, Ldfh;->g:Ldfx;

    .line 23702
    sget-object v5, Ldfx;->a:Ldfx;

    if-eq v4, v5, :cond_3

    :cond_2
    const-string v4, "Connection"

    .line 23703
    invoke-virtual {v2, v4}, Ldfy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    .line 23704
    const-string v4, "Connection"

    const-string v5, "Keep-Alive"

    invoke-virtual {v3, v4, v5}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 23707
    :cond_3
    const-string v4, "Accept-Encoding"

    invoke-virtual {v2, v4}, Ldfy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    .line 23708
    const/4 v4, 0x1

    iput-boolean v4, v14, Ldhg;->j:Z

    .line 23709
    const-string v4, "Accept-Encoding"

    const-string v5, "gzip"

    invoke-virtual {v3, v4, v5}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 23712
    :cond_4
    iget-object v4, v14, Ldhg;->b:Ldft;

    .line 24330
    iget-object v4, v4, Ldft;->i:Ljava/net/CookieHandler;

    .line 23713
    if-eqz v4, :cond_5

    .line 23717
    invoke-virtual {v3}, Ldfz;->a()Ldfy;

    move-result-object v5

    .line 25074
    iget-object v5, v5, Ldfy;->c:Ldfo;

    .line 23717
    const/4 v6, 0x0

    invoke-static {v5, v6}, Ldhl;->a(Ldfo;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 23719
    invoke-virtual {v2}, Ldfy;->b()Ljava/net/URI;

    move-result-object v6

    invoke-virtual {v4, v6, v5}, Ljava/net/CookieHandler;->get(Ljava/net/URI;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    .line 23722
    invoke-static {v3, v4}, Ldhl;->a(Ldfz;Ljava/util/Map;)V

    .line 23725
    :cond_5
    const-string v4, "User-Agent"

    invoke-virtual {v2, v4}, Ldfy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    .line 23726
    const-string v2, "User-Agent"

    .line 26020
    const-string v4, "okhttp/2.4.0"

    .line 23726
    invoke-virtual {v3, v2, v4}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 23729
    :cond_6
    invoke-virtual {v3}, Ldfz;->a()Ldfy;

    move-result-object v15

    .line 23227
    sget-object v2, Ldgi;->b:Ldgi;

    iget-object v3, v14, Ldhg;->b:Ldft;

    invoke-virtual {v2, v3}, Ldgi;->a(Ldft;)Ls;

    move-result-object v2

    .line 23228
    if-eqz v2, :cond_d

    .line 23229
    invoke-interface {v2}, Ls;->l()Ldgc;

    move-result-object v2

    move-object v8, v2

    .line 23232
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 23233
    new-instance v9, Ldgw;

    invoke-direct {v9, v2, v3, v15, v8}, Ldgw;-><init>(JLdfy;Ldgc;)V

    .line 26175
    iget-object v2, v9, Ldgw;->c:Ldgc;

    if-nez v2, :cond_e

    .line 26176
    new-instance v2, Ldgv;

    iget-object v3, v9, Ldgw;->b:Ldfy;

    const/4 v4, 0x0

    .line 27033
    invoke-direct {v2, v3, v4}, Ldgv;-><init>(Ldfy;Ldgc;)V

    .line 26164
    :goto_1
    iget-object v3, v2, Ldgv;->a:Ldfy;

    if-eqz v3, :cond_7

    iget-object v3, v9, Ldgw;->b:Ldfy;

    invoke-virtual {v3}, Ldfy;->d()Ldfb;

    move-result-object v3

    .line 43140
    iget-boolean v3, v3, Ldfb;->i:Z

    .line 26164
    if-eqz v3, :cond_7

    .line 26166
    new-instance v2, Ldgv;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 44033
    invoke-direct {v2, v3, v4}, Ldgv;-><init>(Ldfy;Ldgc;)V

    .line 23233
    :cond_7
    iput-object v2, v14, Ldhg;->u:Ldgv;

    .line 23234
    iget-object v2, v14, Ldhg;->u:Ldgv;

    iget-object v2, v2, Ldgv;->a:Ldfy;

    iput-object v2, v14, Ldhg;->m:Ldfy;

    .line 23235
    iget-object v2, v14, Ldhg;->u:Ldgv;

    iget-object v2, v2, Ldgv;->b:Ldgc;

    iput-object v2, v14, Ldhg;->n:Ldgc;

    .line 23241
    if-eqz v8, :cond_8

    iget-object v2, v14, Ldhg;->n:Ldgc;

    if-nez v2, :cond_8

    .line 44130
    iget-object v2, v8, Ldgc;->g:Ldge;

    .line 23242
    invoke-static {v2}, Ldgs;->a(Ljava/io/Closeable;)V

    .line 23245
    :cond_8
    iget-object v2, v14, Ldhg;->m:Ldfy;

    if-eqz v2, :cond_34

    .line 23247
    iget-object v2, v14, Ldhg;->c:Ldfh;

    if-nez v2, :cond_2f

    .line 44319
    iget-object v2, v14, Ldhg;->c:Ldfh;

    if-eqz v2, :cond_2a

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    throw v2
    :try_end_1
    .catch Ldho; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ldhq; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 448
    :catch_1
    move-exception v2

    move-object v12, v2

    .line 450
    move-object/from16 v0, p0

    iget-object v11, v0, Ldhy;->b:Ldhg;

    .line 50474
    iget-object v2, v11, Ldhg;->e:Ldhr;

    if-eqz v2, :cond_9

    iget-object v2, v11, Ldhg;->c:Ldfh;

    if-eqz v2, :cond_9

    .line 50475
    iget-object v2, v11, Ldhg;->e:Ldhr;

    .line 50488
    iget-object v3, v12, Ldhq;->b:Ljava/io/IOException;

    .line 50475
    invoke-virtual {v11, v2, v3}, Ldhg;->a(Ldhr;Ljava/io/IOException;)V

    .line 50478
    :cond_9
    iget-object v2, v11, Ldhg;->e:Ldhr;

    if-nez v2, :cond_a

    iget-object v2, v11, Ldhg;->c:Ldfh;

    if-eqz v2, :cond_c

    :cond_a
    iget-object v2, v11, Ldhg;->e:Ldhr;

    if-eqz v2, :cond_b

    iget-object v2, v11, Ldhg;->e:Ldhr;

    .line 50479
    invoke-virtual {v2}, Ldhr;->a()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 50489
    :cond_b
    iget-object v2, v11, Ldhg;->b:Ldft;

    .line 50529
    iget-boolean v2, v2, Ldft;->u:Z

    .line 50489
    if-nez v2, :cond_4f

    .line 50490
    const/4 v2, 0x0

    .line 50480
    :goto_2
    if-nez v2, :cond_54

    .line 50481
    :cond_c
    const/4 v2, 0x0

    .line 451
    :goto_3
    if-eqz v2, :cond_55

    .line 452
    move-object/from16 v0, p0

    iput-object v2, v0, Ldhy;->b:Ldhg;

    .line 453
    const/4 v2, 0x0

    .line 465
    :goto_4
    return v2

    .line 23229
    :cond_d
    const/4 v2, 0x0

    move-object v8, v2

    goto/16 :goto_0

    .line 26180
    :cond_e
    :try_start_2
    iget-object v2, v9, Ldgw;->b:Ldfy;

    invoke-virtual {v2}, Ldfy;->e()Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v2, v9, Ldgw;->c:Ldgc;

    .line 27109
    iget-object v2, v2, Ldgc;->e:Ldfn;

    .line 26180
    if-nez v2, :cond_14

    .line 26181
    new-instance v2, Ldgv;

    iget-object v3, v9, Ldgw;->b:Ldfy;

    const/4 v4, 0x0

    .line 28033
    invoke-direct {v2, v3, v4}, Ldgv;-><init>(Ldfy;Ldgc;)V
    :try_end_2
    .catch Ldho; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ldhq; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_1

    .line 460
    :catch_2
    move-exception v2

    move-object v12, v2

    .line 462
    move-object/from16 v0, p0

    iget-object v11, v0, Ldhy;->b:Ldhg;

    .line 50532
    iget-object v10, v11, Ldhg;->p:Ldku;

    .line 50533
    iget-object v2, v11, Ldhg;->e:Ldhr;

    if-eqz v2, :cond_f

    iget-object v2, v11, Ldhg;->c:Ldfh;

    if-eqz v2, :cond_f

    .line 50534
    iget-object v2, v11, Ldhg;->e:Ldhr;

    invoke-virtual {v11, v2, v12}, Ldhg;->a(Ldhr;Ljava/io/IOException;)V

    .line 50537
    :cond_f
    if-eqz v10, :cond_10

    instance-of v2, v10, Ldhp;

    if-eqz v2, :cond_56

    :cond_10
    const/4 v2, 0x1

    .line 50538
    :goto_5
    iget-object v3, v11, Ldhg;->e:Ldhr;

    if-nez v3, :cond_11

    iget-object v3, v11, Ldhg;->c:Ldfh;

    if-eqz v3, :cond_13

    :cond_11
    iget-object v3, v11, Ldhg;->e:Ldhr;

    if-eqz v3, :cond_12

    iget-object v3, v11, Ldhg;->e:Ldhr;

    .line 50539
    invoke-virtual {v3}, Ldhr;->a()Z

    move-result v3

    if-eqz v3, :cond_13

    .line 50549
    :cond_12
    iget-object v3, v11, Ldhg;->b:Ldft;

    .line 50564
    iget-boolean v3, v3, Ldft;->u:Z

    .line 50549
    if-nez v3, :cond_57

    .line 50550
    const/4 v3, 0x0

    .line 50540
    :goto_6
    if-eqz v3, :cond_13

    if-nez v2, :cond_5a

    .line 50542
    :cond_13
    const/4 v2, 0x0

    .line 463
    :goto_7
    if-eqz v2, :cond_5b

    .line 464
    move-object/from16 v0, p0

    iput-object v2, v0, Ldhy;->b:Ldhg;

    .line 465
    const/4 v2, 0x0

    goto :goto_4

    .line 26187
    :cond_14
    :try_start_3
    iget-object v2, v9, Ldgw;->c:Ldgc;

    iget-object v3, v9, Ldgw;->b:Ldfy;

    invoke-static {v2, v3}, Ldgv;->a(Ldgc;Ldfy;)Z

    move-result v2

    if-nez v2, :cond_15

    .line 26188
    new-instance v2, Ldgv;

    iget-object v3, v9, Ldgw;->b:Ldfy;

    const/4 v4, 0x0

    .line 29033
    invoke-direct {v2, v3, v4}, Ldgv;-><init>(Ldfy;Ldgc;)V

    goto/16 :goto_1

    .line 26191
    :cond_15
    iget-object v2, v9, Ldgw;->b:Ldfy;

    invoke-virtual {v2}, Ldfy;->d()Ldfb;

    move-result-object v10

    .line 29087
    iget-boolean v2, v10, Ldfb;->a:Z

    .line 26192
    if-nez v2, :cond_16

    iget-object v2, v9, Ldgw;->b:Ldfy;

    invoke-static {v2}, Ldgw;->a(Ldfy;)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 26193
    :cond_16
    new-instance v2, Ldgv;

    iget-object v3, v9, Ldgw;->b:Ldfy;

    const/4 v4, 0x0

    .line 30033
    invoke-direct {v2, v3, v4}, Ldgv;-><init>(Ldfy;Ldgc;)V

    goto/16 :goto_1

    .line 30276
    :cond_17
    iget-object v2, v9, Ldgw;->d:Ljava/util/Date;

    if-eqz v2, :cond_1d

    const-wide/16 v2, 0x0

    iget-wide v4, v9, Ldgw;->j:J

    iget-object v6, v9, Ldgw;->d:Ljava/util/Date;

    .line 30277
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 30279
    :goto_8
    iget v4, v9, Ldgw;->l:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_18

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget v5, v9, Ldgw;->l:I

    int-to-long v6, v5

    .line 30280
    invoke-virtual {v4, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 30282
    :cond_18
    iget-wide v4, v9, Ldgw;->j:J

    iget-wide v6, v9, Ldgw;->i:J

    sub-long/2addr v4, v6

    .line 30283
    iget-wide v6, v9, Ldgw;->a:J

    iget-wide v12, v9, Ldgw;->j:J

    sub-long/2addr v6, v12

    .line 30284
    add-long/2addr v2, v4

    add-long v12, v2, v6

    .line 31247
    iget-object v2, v9, Ldgw;->c:Ldgc;

    invoke-virtual {v2}, Ldgc;->c()Ldfb;

    move-result-object v2

    .line 32100
    iget v3, v2, Ldfb;->c:I

    .line 31248
    const/4 v4, -0x1

    if-eq v3, v4, :cond_1e

    .line 31249
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33100
    iget v2, v2, Ldfb;->c:I

    .line 31249
    int-to-long v4, v2

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    .line 34100
    :cond_19
    :goto_9
    iget v4, v10, Ldfb;->c:I

    .line 26199
    const/4 v5, -0x1

    if-eq v4, v5, :cond_5d

    .line 26200
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 35100
    iget v5, v10, Ldfb;->c:I

    .line 26200
    int-to-long v6, v5

    invoke-virtual {v4, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    move-wide v6, v2

    .line 26203
    :goto_a
    const-wide/16 v2, 0x0

    .line 35129
    iget v4, v10, Ldfb;->h:I

    .line 26204
    const/4 v5, -0x1

    if-eq v4, v5, :cond_5c

    .line 26205
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 36129
    iget v3, v10, Ldfb;->h:I

    .line 26205
    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    move-wide v4, v2

    .line 26208
    :goto_b
    const-wide/16 v2, 0x0

    .line 26209
    iget-object v11, v9, Ldgw;->c:Ldgc;

    invoke-virtual {v11}, Ldgc;->c()Ldfb;

    move-result-object v11

    .line 37121
    iget-boolean v0, v11, Ldfb;->f:Z

    move/from16 v16, v0

    .line 26210
    if-nez v16, :cond_1a

    .line 37125
    iget v0, v10, Ldfb;->g:I

    move/from16 v16, v0

    .line 26210
    const/16 v17, -0x1

    move/from16 v0, v16

    move/from16 v1, v17

    if-eq v0, v1, :cond_1a

    .line 26211
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 38125
    iget v3, v10, Ldfb;->g:I

    .line 26211
    int-to-long v0, v3

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    .line 39087
    :cond_1a
    iget-boolean v10, v11, Ldfb;->a:Z

    .line 26214
    if-nez v10, :cond_25

    add-long v10, v12, v4

    add-long/2addr v2, v6

    cmp-long v2, v10, v2

    if-gez v2, :cond_25

    .line 26215
    iget-object v2, v9, Ldgw;->c:Ldgc;

    invoke-virtual {v2}, Ldgc;->a()Ldgd;

    move-result-object v3

    .line 26216
    add-long/2addr v4, v12

    cmp-long v2, v4, v6

    if-ltz v2, :cond_1b

    .line 26217
    const-string v2, "Warning"

    const-string v4, "110 HttpURLConnection \"Response is stale\""

    invoke-virtual {v3, v2, v4}, Ldgd;->b(Ljava/lang/String;Ljava/lang/String;)Ldgd;

    .line 26220
    :cond_1b
    const-wide/32 v4, 0x5265c00

    cmp-long v2, v12, v4

    if-lez v2, :cond_1c

    .line 39293
    iget-object v2, v9, Ldgw;->c:Ldgc;

    invoke-virtual {v2}, Ldgc;->c()Ldfb;

    move-result-object v2

    .line 40100
    iget v2, v2, Ldfb;->c:I

    .line 39293
    const/4 v4, -0x1

    if-ne v2, v4, :cond_24

    iget-object v2, v9, Ldgw;->h:Ljava/util/Date;

    if-nez v2, :cond_24

    const/4 v2, 0x1

    .line 26220
    :goto_c
    if-eqz v2, :cond_1c

    .line 26221
    const-string v2, "Warning"

    const-string v4, "113 HttpURLConnection \"Heuristic expiration\""

    invoke-virtual {v3, v2, v4}, Ldgd;->b(Ljava/lang/String;Ljava/lang/String;)Ldgd;

    .line 26223
    :cond_1c
    new-instance v2, Ldgv;

    const/4 v4, 0x0

    invoke-virtual {v3}, Ldgd;->a()Ldgc;

    move-result-object v3

    .line 41033
    invoke-direct {v2, v4, v3}, Ldgv;-><init>(Ldfy;Ldgc;)V

    goto/16 :goto_1

    .line 30277
    :cond_1d
    const-wide/16 v2, 0x0

    goto/16 :goto_8

    .line 31250
    :cond_1e
    iget-object v2, v9, Ldgw;->h:Ljava/util/Date;

    if-eqz v2, :cond_20

    .line 31251
    iget-object v2, v9, Ldgw;->d:Ljava/util/Date;

    if-eqz v2, :cond_1f

    iget-object v2, v9, Ldgw;->d:Ljava/util/Date;

    .line 31252
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    .line 31254
    :goto_d
    iget-object v4, v9, Ldgw;->h:Ljava/util/Date;

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    sub-long v2, v4, v2

    .line 31255
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-gtz v4, :cond_19

    const-wide/16 v2, 0x0

    goto/16 :goto_9

    .line 31252
    :cond_1f
    iget-wide v2, v9, Ldgw;->j:J

    goto :goto_d

    .line 31256
    :cond_20
    iget-object v2, v9, Ldgw;->f:Ljava/util/Date;

    if-eqz v2, :cond_23

    iget-object v2, v9, Ldgw;->c:Ldgc;

    .line 34075
    iget-object v2, v2, Ldgc;->a:Ldfy;

    .line 31257
    invoke-virtual {v2}, Ldfy;->a()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_23

    .line 31262
    iget-object v2, v9, Ldgw;->d:Ljava/util/Date;

    if-eqz v2, :cond_21

    iget-object v2, v9, Ldgw;->d:Ljava/util/Date;

    .line 31263
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    .line 31265
    :goto_e
    iget-object v4, v9, Ldgw;->f:Ljava/util/Date;

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 31266
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_22

    const-wide/16 v4, 0xa

    div-long/2addr v2, v4

    goto/16 :goto_9

    .line 31263
    :cond_21
    iget-wide v2, v9, Ldgw;->i:J

    goto :goto_e

    .line 31266
    :cond_22
    const-wide/16 v2, 0x0

    goto/16 :goto_9

    .line 31268
    :cond_23
    const-wide/16 v2, 0x0

    goto/16 :goto_9

    .line 39293
    :cond_24
    const/4 v2, 0x0

    goto :goto_c

    .line 26226
    :cond_25
    iget-object v2, v9, Ldgw;->b:Ldfy;

    invoke-virtual {v2}, Ldfy;->c()Ldfz;

    move-result-object v2

    .line 26228
    iget-object v3, v9, Ldgw;->k:Ljava/lang/String;

    if-eqz v3, :cond_27

    .line 26229
    const-string v3, "If-None-Match"

    iget-object v4, v9, Ldgw;->k:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    .line 26236
    :cond_26
    :goto_f
    invoke-virtual {v2}, Ldfz;->a()Ldfy;

    move-result-object v3

    .line 26237
    invoke-static {v3}, Ldgw;->a(Ldfy;)Z

    move-result v2

    if-eqz v2, :cond_29

    new-instance v2, Ldgv;

    iget-object v4, v9, Ldgw;->c:Ldgc;

    .line 42033
    invoke-direct {v2, v3, v4}, Ldgv;-><init>(Ldfy;Ldgc;)V

    goto/16 :goto_1

    .line 26230
    :cond_27
    iget-object v3, v9, Ldgw;->f:Ljava/util/Date;

    if-eqz v3, :cond_28

    .line 26231
    const-string v3, "If-Modified-Since"

    iget-object v4, v9, Ldgw;->g:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    goto :goto_f

    .line 26232
    :cond_28
    iget-object v3, v9, Ldgw;->d:Ljava/util/Date;

    if-eqz v3, :cond_26

    .line 26233
    const-string v3, "If-Modified-Since"

    iget-object v4, v9, Ldgw;->e:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    goto :goto_f

    .line 26237
    :cond_29
    new-instance v2, Ldgv;

    const/4 v4, 0x0

    .line 43033
    invoke-direct {v2, v3, v4}, Ldgv;-><init>(Ldfy;Ldgc;)V

    goto/16 :goto_1

    .line 44321
    :cond_2a
    iget-object v2, v14, Ldhg;->e:Ldhr;

    if-nez v2, :cond_2e

    .line 44322
    iget-object v13, v14, Ldhg;->b:Ldft;

    iget-object v4, v14, Ldhg;->m:Ldfy;

    .line 45141
    invoke-virtual {v4}, Ldfy;->a()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    .line 45142
    if-eqz v3, :cond_2b

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2c

    .line 45143
    :cond_2b
    new-instance v2, Ldho;

    new-instance v3, Ljava/net/UnknownHostException;

    invoke-virtual {v4}, Ldfy;->a()Ljava/net/URL;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ldho;-><init>(Ljava/io/IOException;)V

    throw v2

    .line 45146
    :cond_2c
    const/4 v6, 0x0

    .line 45147
    const/4 v7, 0x0

    .line 45148
    const/4 v8, 0x0

    .line 45149
    invoke-virtual {v4}, Ldfy;->e()Z

    move-result v2

    if-eqz v2, :cond_2d

    .line 45382
    iget-object v6, v13, Ldft;->m:Ljavax/net/ssl/SSLSocketFactory;

    .line 45397
    iget-object v7, v13, Ldft;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 45412
    iget-object v8, v13, Ldft;->o:Ldfd;

    .line 45155
    :cond_2d
    new-instance v2, Ldez;

    invoke-virtual {v4}, Ldfy;->a()Ljava/net/URL;

    move-result-object v4

    invoke-static {v4}, Ldgs;->a(Ljava/net/URL;)I

    move-result v4

    .line 46368
    iget-object v5, v13, Ldft;->l:Ljavax/net/SocketFactory;

    .line 46428
    iget-object v9, v13, Ldft;->p:Ldfa;

    .line 47296
    iget-object v10, v13, Ldft;->d:Ljava/net/Proxy;

    .line 47561
    iget-object v11, v13, Ldft;->e:Ljava/util/List;

    .line 47570
    iget-object v12, v13, Ldft;->f:Ljava/util/List;

    .line 48314
    iget-object v13, v13, Ldft;->h:Ljava/net/ProxySelector;

    .line 45158
    invoke-direct/range {v2 .. v13}, Ldez;-><init>(Ljava/lang/String;ILjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ldfd;Ldfa;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 44322
    iput-object v2, v14, Ldhg;->d:Ldez;
    :try_end_3
    .catch Ldho; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ldhq; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 44324
    :try_start_4
    iget-object v2, v14, Ldhg;->d:Ldez;

    iget-object v3, v14, Ldhg;->m:Ldfy;

    iget-object v4, v14, Ldhg;->b:Ldft;

    .line 49078
    new-instance v5, Ldhr;

    invoke-virtual {v3}, Ldfy;->b()Ljava/net/URI;

    move-result-object v3

    invoke-direct {v5, v2, v3, v4}, Ldhr;-><init>(Ldez;Ljava/net/URI;Ldft;)V

    .line 44324
    iput-object v5, v14, Ldhg;->e:Ldhr;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ldho; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ldhq; {:try_start_4 .. :try_end_4} :catch_1

    .line 49340
    :cond_2e
    :try_start_5
    invoke-virtual {v14}, Ldhg;->a()Ldfh;

    move-result-object v2

    .line 49341
    sget-object v3, Ldgi;->b:Ldgi;

    iget-object v4, v14, Ldhg;->b:Ldft;

    iget-object v5, v14, Ldhg;->m:Ldfy;

    invoke-virtual {v3, v4, v2, v14, v5}, Ldgi;->a(Ldft;Ldfh;Ldhg;Ldfy;)V

    .line 44330
    iput-object v2, v14, Ldhg;->c:Ldfh;

    .line 44331
    iget-object v2, v14, Ldhg;->c:Ldfh;

    .line 50203
    iget-object v2, v2, Ldfh;->b:Ldgf;

    .line 44331
    iput-object v2, v14, Ldhg;->f:Ldgf;

    .line 23251
    :cond_2f
    sget-object v2, Ldgi;->b:Ldgi;

    iget-object v3, v14, Ldhg;->c:Ldfh;

    invoke-virtual {v2, v3, v14}, Ldgi;->a(Ldfh;Ldhg;)Ldhw;

    move-result-object v2

    iput-object v2, v14, Ldhg;->h:Ldhw;

    .line 23257
    iget-boolean v2, v14, Ldhg;->r:Z

    if-eqz v2, :cond_31

    invoke-virtual {v14}, Ldhg;->c()Z

    move-result v2

    if-eqz v2, :cond_31

    iget-object v2, v14, Ldhg;->p:Ldku;

    if-nez v2, :cond_31

    .line 23258
    invoke-static {v15}, Ldhl;->a(Ldfy;)J

    move-result-wide v2

    .line 23259
    iget-boolean v4, v14, Ldhg;->k:Z

    if-eqz v4, :cond_33

    .line 23260
    const-wide/32 v4, 0x7fffffff

    cmp-long v4, v2, v4

    if-lez v4, :cond_30

    .line 23261
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB."

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 44325
    :catch_3
    move-exception v2

    .line 44326
    new-instance v3, Ldho;

    invoke-direct {v3, v2}, Ldho;-><init>(Ljava/io/IOException;)V

    throw v3

    .line 23265
    :cond_30
    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_32

    .line 23267
    iget-object v4, v14, Ldhg;->h:Ldhw;

    iget-object v5, v14, Ldhg;->m:Ldfy;

    invoke-interface {v4, v5}, Ldhw;->a(Ldfy;)V

    .line 23268
    new-instance v4, Ldhp;

    long-to-int v2, v2

    invoke-direct {v4, v2}, Ldhp;-><init>(I)V

    iput-object v4, v14, Ldhg;->p:Ldku;

    .line 434
    :cond_31
    :goto_10
    move-object/from16 v0, p0

    iget-object v2, v0, Ldhy;->b:Ldhg;

    .line 50217
    iget-object v2, v2, Ldhg;->f:Ldgf;

    .line 434
    move-object/from16 v0, p0

    iput-object v2, v0, Ldhy;->k:Ldgf;

    .line 435
    move-object/from16 v0, p0

    iget-object v2, v0, Ldhy;->b:Ldhg;

    .line 50218
    iget-object v2, v2, Ldhg;->c:Ldfh;

    .line 435
    if-eqz v2, :cond_37

    move-object/from16 v0, p0

    iget-object v2, v0, Ldhy;->b:Ldhg;

    .line 50219
    iget-object v2, v2, Ldhg;->c:Ldfh;

    .line 50220
    iget-object v2, v2, Ldfh;->i:Ldfn;

    .line 436
    :goto_11
    move-object/from16 v0, p0

    iput-object v2, v0, Ldhy;->c:Ldfn;

    .line 438
    if-eqz p1, :cond_3a

    .line 439
    move-object/from16 v0, p0

    iget-object v4, v0, Ldhy;->b:Ldhg;

    .line 50221
    iget-object v2, v4, Ldhg;->o:Ldgc;

    if-nez v2, :cond_3a

    .line 50224
    iget-object v2, v4, Ldhg;->m:Ldfy;

    if-nez v2, :cond_38

    iget-object v2, v4, Ldhg;->n:Ldgc;

    if-nez v2, :cond_38

    .line 50225
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call sendRequest() first!"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 23273
    :cond_32
    new-instance v2, Ldhp;

    invoke-direct {v2}, Ldhp;-><init>()V

    iput-object v2, v14, Ldhg;->p:Ldku;

    goto :goto_10

    .line 23276
    :cond_33
    iget-object v4, v14, Ldhg;->h:Ldhw;

    iget-object v5, v14, Ldhg;->m:Ldfy;

    invoke-interface {v4, v5}, Ldhw;->a(Ldfy;)V

    .line 23277
    iget-object v4, v14, Ldhg;->h:Ldhw;

    iget-object v5, v14, Ldhg;->m:Ldfy;

    invoke-interface {v4, v5, v2, v3}, Ldhw;->a(Ldfy;J)Ldku;

    move-result-object v2

    iput-object v2, v14, Ldhg;->p:Ldku;

    goto :goto_10

    .line 23283
    :cond_34
    iget-object v2, v14, Ldhg;->c:Ldfh;

    if-eqz v2, :cond_35

    .line 23284
    sget-object v2, Ldgi;->b:Ldgi;

    iget-object v3, v14, Ldhg;->b:Ldft;

    .line 50204
    iget-object v3, v3, Ldft;->q:Ldfi;

    .line 23284
    iget-object v4, v14, Ldhg;->c:Ldfh;

    invoke-virtual {v2, v3, v4}, Ldgi;->a(Ldfi;Ldfh;)V

    .line 23285
    const/4 v2, 0x0

    iput-object v2, v14, Ldhg;->c:Ldfh;

    .line 23288
    :cond_35
    iget-object v2, v14, Ldhg;->n:Ldgc;

    if-eqz v2, :cond_36

    .line 23290
    iget-object v2, v14, Ldhg;->n:Ldgc;

    invoke-virtual {v2}, Ldgc;->a()Ldgd;

    move-result-object v2

    iget-object v3, v14, Ldhg;->l:Ldfy;

    .line 50205
    iput-object v3, v2, Ldgd;->a:Ldfy;

    .line 23291
    iget-object v3, v14, Ldhg;->g:Ldgc;

    .line 23292
    invoke-static {v3}, Ldhg;->a(Ldgc;)Ldgc;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldgd;->c(Ldgc;)Ldgd;

    move-result-object v2

    iget-object v3, v14, Ldhg;->n:Ldgc;

    .line 23293
    invoke-static {v3}, Ldhg;->a(Ldgc;)Ldgc;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldgd;->b(Ldgc;)Ldgd;

    move-result-object v2

    .line 23294
    invoke-virtual {v2}, Ldgd;->a()Ldgc;

    move-result-object v2

    iput-object v2, v14, Ldhg;->o:Ldgc;

    .line 23307
    :goto_12
    iget-object v2, v14, Ldhg;->o:Ldgc;

    invoke-virtual {v14, v2}, Ldhg;->b(Ldgc;)Ldgc;

    move-result-object v2

    iput-object v2, v14, Ldhg;->o:Ldgc;

    goto/16 :goto_10

    .line 23297
    :cond_36
    new-instance v2, Ldgd;

    invoke-direct {v2}, Ldgd;-><init>()V

    iget-object v3, v14, Ldhg;->l:Ldfy;

    .line 50207
    iput-object v3, v2, Ldgd;->a:Ldfy;

    .line 23298
    iget-object v3, v14, Ldhg;->g:Ldgc;

    .line 23299
    invoke-static {v3}, Ldhg;->a(Ldgc;)Ldgc;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldgd;->c(Ldgc;)Ldgd;

    move-result-object v2

    sget-object v3, Ldfx;->b:Ldfx;

    .line 50209
    iput-object v3, v2, Ldgd;->b:Ldfx;

    .line 23300
    const/16 v3, 0x1f8

    .line 50211
    iput v3, v2, Ldgd;->c:I

    .line 23301
    const-string v3, "Unsatisfiable Request (only-if-cached)"

    .line 50213
    iput-object v3, v2, Ldgd;->d:Ljava/lang/String;

    .line 23302
    sget-object v3, Ldhg;->a:Ldge;

    .line 50215
    iput-object v3, v2, Ldgd;->g:Ldge;

    .line 23304
    invoke-virtual {v2}, Ldgd;->a()Ldgc;

    move-result-object v2

    iput-object v2, v14, Ldhg;->o:Ldgc;

    goto :goto_12

    .line 436
    :cond_37
    const/4 v2, 0x0

    goto/16 :goto_11

    .line 50227
    :cond_38
    iget-object v2, v4, Ldhg;->m:Ldfy;

    if-eqz v2, :cond_3a

    .line 50233
    iget-boolean v2, v4, Ldhg;->s:Z

    if-eqz v2, :cond_3b

    .line 50234
    iget-object v2, v4, Ldhg;->h:Ldhw;

    iget-object v3, v4, Ldhg;->m:Ldfy;

    invoke-interface {v2, v3}, Ldhw;->a(Ldfy;)V

    .line 50271
    :cond_39
    :goto_13
    invoke-virtual {v4}, Ldhg;->j()Ldgc;

    move-result-object v2

    move-object v3, v2

    .line 50389
    :goto_14
    iget-object v2, v3, Ldgc;->f:Ldfo;

    .line 50274
    invoke-virtual {v4, v2}, Ldhg;->a(Ldfo;)V

    .line 50277
    iget-object v2, v4, Ldhg;->n:Ldgc;

    if-eqz v2, :cond_4c

    .line 50278
    iget-object v2, v4, Ldhg;->n:Ldgc;

    .line 50407
    iget v5, v3, Ldgc;->c:I

    .line 50390
    const/16 v6, 0x130

    if-ne v5, v6, :cond_49

    .line 50391
    const/4 v2, 0x1

    .line 50278
    :goto_15
    if-eqz v2, :cond_4b

    .line 50279
    iget-object v2, v4, Ldhg;->n:Ldgc;

    invoke-virtual {v2}, Ldgc;->a()Ldgd;

    move-result-object v2

    iget-object v5, v4, Ldhg;->l:Ldfy;

    .line 50410
    iput-object v5, v2, Ldgd;->a:Ldfy;

    .line 50280
    iget-object v5, v4, Ldhg;->g:Ldgc;

    .line 50281
    invoke-static {v5}, Ldhg;->a(Ldgc;)Ldgc;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldgd;->c(Ldgc;)Ldgd;

    move-result-object v2

    iget-object v5, v4, Ldhg;->n:Ldgc;

    .line 50412
    iget-object v5, v5, Ldgc;->f:Ldfo;

    .line 50413
    iget-object v6, v3, Ldgc;->f:Ldfo;

    .line 50282
    invoke-static {v5, v6}, Ldhg;->a(Ldfo;Ldfo;)Ldfo;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldgd;->a(Ldfo;)Ldgd;

    move-result-object v2

    iget-object v5, v4, Ldhg;->n:Ldgc;

    .line 50283
    invoke-static {v5}, Ldhg;->a(Ldgc;)Ldgc;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldgd;->b(Ldgc;)Ldgd;

    move-result-object v2

    .line 50284
    invoke-static {v3}, Ldhg;->a(Ldgc;)Ldgc;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldgd;->a(Ldgc;)Ldgd;

    move-result-object v2

    .line 50285
    invoke-virtual {v2}, Ldgd;->a()Ldgc;

    move-result-object v2

    iput-object v2, v4, Ldhg;->o:Ldgc;

    .line 50414
    iget-object v2, v3, Ldgc;->g:Ldge;

    .line 50286
    invoke-virtual {v2}, Ldge;->close()V

    .line 50287
    invoke-virtual {v4}, Ldhg;->h()V

    .line 50291
    sget-object v2, Ldgi;->b:Ldgi;

    iget-object v3, v4, Ldhg;->b:Ldft;

    invoke-virtual {v2, v3}, Ldgi;->a(Ldft;)Ls;

    .line 50293
    iget-object v2, v4, Ldhg;->o:Ldgc;

    invoke-static {v2}, Ldhg;->a(Ldgc;)Ldgc;

    .line 50294
    iget-object v2, v4, Ldhg;->o:Ldgc;

    move-object v3, v4

    .line 50310
    :goto_16
    invoke-virtual {v3, v2}, Ldhg;->b(Ldgc;)Ldgc;

    move-result-object v2

    iput-object v2, v4, Ldhg;->o:Ldgc;

    .line 442
    :cond_3a
    const/4 v2, 0x1

    goto/16 :goto_4

    .line 50237
    :cond_3b
    iget-boolean v2, v4, Ldhg;->r:Z

    if-nez v2, :cond_44

    .line 50238
    new-instance v3, Ldhj;

    const/4 v2, 0x0

    iget-object v5, v4, Ldhg;->m:Ldfy;

    invoke-direct {v3, v4, v2, v5}, Ldhj;-><init>(Ldhg;ILdfy;)V

    iget-object v5, v4, Ldhg;->m:Ldfy;

    .line 50313
    iget v2, v3, Ldhj;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v3, Ldhj;->b:I

    .line 50315
    iget v2, v3, Ldhj;->a:I

    if-lez v2, :cond_3e

    .line 50316
    iget-object v2, v3, Ldhj;->c:Ldhg;

    iget-object v2, v2, Ldhg;->b:Ldft;

    .line 50369
    iget-object v2, v2, Ldft;->g:Ljava/util/List;

    .line 50316
    iget v6, v3, Ldhj;->a:I

    add-int/lit8 v6, v6, -0x1

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls;

    .line 50370
    iget-object v6, v3, Ldhj;->c:Ldhg;

    .line 50371
    iget-object v6, v6, Ldhg;->c:Ldfh;

    .line 50372
    iget-object v6, v6, Ldfh;->b:Ldgf;

    .line 50373
    iget-object v6, v6, Ldgf;->a:Ldez;

    .line 50320
    invoke-virtual {v5}, Ldfy;->a()Ljava/net/URL;

    move-result-object v7

    invoke-virtual {v7}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v7

    .line 50374
    iget-object v8, v6, Ldez;->b:Ljava/lang/String;

    .line 50320
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3c

    .line 50321
    invoke-virtual {v5}, Ldfy;->a()Ljava/net/URL;

    move-result-object v7

    invoke-static {v7}, Ldgs;->a(Ljava/net/URL;)I

    move-result v7

    .line 50375
    iget v6, v6, Ldez;->c:I

    .line 50321
    if-eq v7, v6, :cond_3d

    .line 50322
    :cond_3c
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "network interceptor "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " must retain the same host and port"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 50327
    :cond_3d
    iget v6, v3, Ldhj;->b:I

    const/4 v7, 0x1

    if-le v6, v7, :cond_3e

    .line 50328
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "network interceptor "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " must call proceed() exactly once"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 50333
    :cond_3e
    iget v2, v3, Ldhj;->a:I

    iget-object v6, v3, Ldhj;->c:Ldhg;

    iget-object v6, v6, Ldhg;->b:Ldft;

    .line 50376
    iget-object v6, v6, Ldft;->g:Ljava/util/List;

    .line 50333
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v2, v6, :cond_41

    .line 50335
    new-instance v6, Ldhj;

    iget-object v2, v3, Ldhj;->c:Ldhg;

    iget v7, v3, Ldhj;->a:I

    add-int/lit8 v7, v7, 0x1

    invoke-direct {v6, v2, v7, v5}, Ldhj;-><init>(Ldhg;ILdfy;)V

    .line 50336
    iget-object v2, v3, Ldhj;->c:Ldhg;

    iget-object v2, v2, Ldhg;->b:Ldft;

    .line 50377
    iget-object v2, v2, Ldft;->g:Ljava/util/List;

    .line 50336
    iget v3, v3, Ldhj;->a:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls;

    .line 50337
    invoke-interface {v2}, Ls;->k()Ldgc;

    move-result-object v3

    .line 50340
    iget v5, v6, Ldhj;->b:I

    const/4 v6, 0x1

    if-eq v5, v6, :cond_3f

    .line 50341
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "network interceptor "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " must call proceed() exactly once"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_3f
    move-object v2, v3

    :cond_40
    move-object v3, v2

    .line 50238
    goto/16 :goto_14

    .line 50348
    :cond_41
    iget-object v2, v3, Ldhj;->c:Ldhg;

    invoke-static {v2}, Ldhg;->a(Ldhg;)Ldhw;

    move-result-object v2

    invoke-interface {v2, v5}, Ldhw;->a(Ldfy;)V

    .line 50351
    iget-object v2, v3, Ldhj;->c:Ldhg;

    .line 50378
    iput-object v5, v2, Ldhg;->m:Ldfy;

    .line 50353
    iget-object v2, v3, Ldhj;->c:Ldhg;

    invoke-virtual {v2}, Ldhg;->c()Z

    move-result v2

    if-eqz v2, :cond_42

    .line 50379
    iget-object v2, v5, Ldfy;->d:Ldga;

    .line 50353
    if-eqz v2, :cond_42

    .line 50354
    iget-object v2, v3, Ldhj;->c:Ldhg;

    invoke-static {v2}, Ldhg;->a(Ldhg;)Ldhw;

    move-result-object v2

    .line 50380
    iget-object v6, v5, Ldfy;->d:Ldga;

    .line 50354
    invoke-virtual {v6}, Ldga;->a()J

    move-result-wide v6

    invoke-interface {v2, v5, v6, v7}, Ldhw;->a(Ldfy;J)Ldku;

    move-result-object v2

    .line 50355
    invoke-static {v2}, Ldkk;->a(Ldku;)Ldkc;

    move-result-object v2

    .line 50381
    iget-object v5, v5, Ldfy;->d:Ldga;

    .line 50356
    invoke-virtual {v5, v2}, Ldga;->a(Ldkc;)V

    .line 50357
    invoke-interface {v2}, Ldkc;->close()V

    .line 50360
    :cond_42
    iget-object v2, v3, Ldhj;->c:Ldhg;

    .line 50382
    invoke-virtual {v2}, Ldhg;->j()Ldgc;

    move-result-object v2

    .line 50383
    iget v3, v2, Ldgc;->c:I

    .line 50363
    const/16 v5, 0xcc

    if-eq v3, v5, :cond_43

    const/16 v5, 0xcd

    if-ne v3, v5, :cond_40

    .line 50384
    :cond_43
    iget-object v5, v2, Ldgc;->g:Ldge;

    .line 50363
    invoke-virtual {v5}, Ldge;->a()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v5, v6, v8

    if-lez v5, :cond_40

    .line 50364
    new-instance v4, Ljava/net/ProtocolException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "HTTP "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " had non-zero Content-Length: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 50385
    iget-object v2, v2, Ldgc;->g:Ldge;

    .line 50365
    invoke-virtual {v2}, Ldge;->a()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 50242
    :cond_44
    iget-object v2, v4, Ldhg;->q:Ldkc;

    if-eqz v2, :cond_45

    iget-object v2, v4, Ldhg;->q:Ldkc;

    invoke-interface {v2}, Ldkc;->b()Ldjz;

    move-result-object v2

    .line 50386
    iget-wide v2, v2, Ldjz;->b:J

    .line 50242
    const-wide/16 v6, 0x0

    cmp-long v2, v2, v6

    if-lez v2, :cond_45

    .line 50243
    iget-object v2, v4, Ldhg;->q:Ldkc;

    invoke-interface {v2}, Ldkc;->d()Ldkc;

    .line 50247
    :cond_45
    iget-wide v2, v4, Ldhg;->i:J

    const-wide/16 v6, -0x1

    cmp-long v2, v2, v6

    if-nez v2, :cond_47

    .line 50248
    iget-object v2, v4, Ldhg;->m:Ldfy;

    invoke-static {v2}, Ldhl;->a(Ldfy;)J

    move-result-wide v2

    const-wide/16 v6, -0x1

    cmp-long v2, v2, v6

    if-nez v2, :cond_46

    iget-object v2, v4, Ldhg;->p:Ldku;

    instance-of v2, v2, Ldhp;

    if-eqz v2, :cond_46

    .line 50250
    iget-object v2, v4, Ldhg;->p:Ldku;

    check-cast v2, Ldhp;

    .line 50387
    iget-object v2, v2, Ldhp;->a:Ldjz;

    .line 50388
    iget-wide v2, v2, Ldjz;->b:J

    .line 50251
    iget-object v5, v4, Ldhg;->m:Ldfy;

    invoke-virtual {v5}, Ldfy;->c()Ldfz;

    move-result-object v5

    const-string v6, "Content-Length"

    .line 50252
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v6, v2}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    move-result-object v2

    .line 50253
    invoke-virtual {v2}, Ldfz;->a()Ldfy;

    move-result-object v2

    iput-object v2, v4, Ldhg;->m:Ldfy;

    .line 50255
    :cond_46
    iget-object v2, v4, Ldhg;->h:Ldhw;

    iget-object v3, v4, Ldhg;->m:Ldfy;

    invoke-interface {v2, v3}, Ldhw;->a(Ldfy;)V

    .line 50259
    :cond_47
    iget-object v2, v4, Ldhg;->p:Ldku;

    if-eqz v2, :cond_39

    .line 50260
    iget-object v2, v4, Ldhg;->q:Ldkc;

    if-eqz v2, :cond_48

    .line 50262
    iget-object v2, v4, Ldhg;->q:Ldkc;

    invoke-interface {v2}, Ldkc;->close()V

    .line 50266
    :goto_17
    iget-object v2, v4, Ldhg;->p:Ldku;

    instance-of v2, v2, Ldhp;

    if-eqz v2, :cond_39

    .line 50267
    iget-object v3, v4, Ldhg;->h:Ldhw;

    iget-object v2, v4, Ldhg;->p:Ldku;

    check-cast v2, Ldhp;

    invoke-interface {v3, v2}, Ldhw;->a(Ldhp;)V

    goto/16 :goto_13

    .line 50264
    :cond_48
    iget-object v2, v4, Ldhg;->p:Ldku;

    invoke-interface {v2}, Ldku;->close()V

    goto :goto_17

    .line 50408
    :cond_49
    iget-object v2, v2, Ldgc;->f:Ldfo;

    .line 50397
    const-string v5, "Last-Modified"

    invoke-virtual {v2, v5}, Ldfo;->b(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 50398
    if-eqz v2, :cond_4a

    .line 50409
    iget-object v5, v3, Ldgc;->f:Ldfo;

    .line 50399
    const-string v6, "Last-Modified"

    invoke-virtual {v5, v6}, Ldfo;->b(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 50400
    if-eqz v5, :cond_4a

    .line 50401
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    cmp-long v2, v6, v8

    if-gez v2, :cond_4a

    .line 50402
    const/4 v2, 0x1

    goto/16 :goto_15

    .line 50406
    :cond_4a
    const/4 v2, 0x0

    goto/16 :goto_15

    .line 50297
    :cond_4b
    iget-object v2, v4, Ldhg;->n:Ldgc;

    .line 50415
    iget-object v2, v2, Ldgc;->g:Ldge;

    .line 50297
    invoke-static {v2}, Ldgs;->a(Ljava/io/Closeable;)V

    .line 50301
    :cond_4c
    invoke-virtual {v3}, Ldgc;->a()Ldgd;

    move-result-object v2

    iget-object v5, v4, Ldhg;->l:Ldfy;

    .line 50416
    iput-object v5, v2, Ldgd;->a:Ldfy;

    .line 50302
    iget-object v5, v4, Ldhg;->g:Ldgc;

    .line 50303
    invoke-static {v5}, Ldhg;->a(Ldgc;)Ldgc;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldgd;->c(Ldgc;)Ldgd;

    move-result-object v2

    iget-object v5, v4, Ldhg;->n:Ldgc;

    .line 50304
    invoke-static {v5}, Ldhg;->a(Ldgc;)Ldgc;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldgd;->b(Ldgc;)Ldgd;

    move-result-object v2

    .line 50305
    invoke-static {v3}, Ldhg;->a(Ldgc;)Ldgc;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldgd;->a(Ldgc;)Ldgd;

    move-result-object v2

    .line 50306
    invoke-virtual {v2}, Ldgd;->a()Ldgc;

    move-result-object v2

    iput-object v2, v4, Ldhg;->o:Ldgc;

    .line 50308
    iget-object v2, v4, Ldhg;->o:Ldgc;

    invoke-static {v2}, Ldhg;->c(Ldgc;)Z

    move-result v2

    if-eqz v2, :cond_3a

    .line 50309
    invoke-virtual {v4}, Ldhg;->g()V

    .line 50310
    iget-object v3, v4, Ldhg;->t:Ls;

    iget-object v2, v4, Ldhg;->o:Ldgc;

    .line 50418
    if-nez v3, :cond_4d

    move-object v3, v4

    goto/16 :goto_16

    .line 50419
    :cond_4d
    invoke-interface {v3}, Ls;->n()Ldku;

    move-result-object v5

    .line 50420
    if-nez v5, :cond_4e

    move-object v3, v4

    goto/16 :goto_16

    .line 50470
    :cond_4e
    iget-object v6, v2, Ldgc;->g:Ldge;

    .line 50422
    invoke-virtual {v6}, Ldge;->c()Ldkd;

    move-result-object v6

    .line 50423
    invoke-static {v5}, Ldkk;->a(Ldku;)Ldkc;

    move-result-object v5

    .line 50425
    new-instance v7, Ldhi;

    invoke-direct {v7, v4, v6, v3, v5}, Ldhi;-><init>(Ldhg;Ldkd;Ls;Ldkc;)V

    .line 50467
    invoke-virtual {v2}, Ldgc;->a()Ldgd;

    move-result-object v3

    new-instance v5, Ldhn;

    .line 50471
    iget-object v2, v2, Ldgc;->f:Ldfo;

    .line 50468
    invoke-static {v7}, Ldkk;->a(Ldkv;)Ldkd;

    move-result-object v6

    invoke-direct {v5, v2, v6}, Ldhn;-><init>(Ldfo;Ldkd;)V

    .line 50472
    iput-object v5, v3, Ldgd;->g:Ldge;

    .line 50469
    invoke-virtual {v3}, Ldgd;->a()Ldgc;
    :try_end_5
    .catch Ldho; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ldhq; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    move-result-object v2

    move-object v3, v4

    goto/16 :goto_16

    .line 50530
    :cond_4f
    iget-object v2, v12, Ldhq;->b:Ljava/io/IOException;

    .line 50501
    instance-of v3, v2, Ljava/net/ProtocolException;

    if-eqz v3, :cond_50

    .line 50502
    const/4 v2, 0x0

    goto/16 :goto_2

    .line 50506
    :cond_50
    instance-of v3, v2, Ljava/io/InterruptedIOException;

    if-eqz v3, :cond_51

    .line 50507
    const/4 v2, 0x0

    goto/16 :goto_2

    .line 50512
    :cond_51
    instance-of v3, v2, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v3, :cond_52

    .line 50515
    invoke-virtual {v2}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v3, v3, Ljava/security/cert/CertificateException;

    if-eqz v3, :cond_52

    .line 50516
    const/4 v2, 0x0

    goto/16 :goto_2

    .line 50519
    :cond_52
    instance-of v2, v2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v2, :cond_53

    .line 50521
    const/4 v2, 0x0

    goto/16 :goto_2

    .line 50528
    :cond_53
    const/4 v2, 0x1

    goto/16 :goto_2

    .line 50484
    :cond_54
    invoke-virtual {v11}, Ldhg;->i()Ldfh;

    move-result-object v8

    .line 50487
    new-instance v2, Ldhg;

    iget-object v3, v11, Ldhg;->b:Ldft;

    iget-object v4, v11, Ldhg;->l:Ldfy;

    iget-boolean v5, v11, Ldhg;->k:Z

    iget-boolean v6, v11, Ldhg;->r:Z

    iget-boolean v7, v11, Ldhg;->s:Z

    iget-object v9, v11, Ldhg;->e:Ldhr;

    iget-object v10, v11, Ldhg;->p:Ldku;

    check-cast v10, Ldhp;

    iget-object v11, v11, Ldhg;->g:Ldgc;

    invoke-direct/range {v2 .. v11}, Ldhg;-><init>(Ldft;Ldfy;ZZZLdfh;Ldhr;Ldhp;Ldgc;)V

    goto/16 :goto_3

    .line 50531
    :cond_55
    iget-object v2, v12, Ldhq;->b:Ljava/io/IOException;

    .line 458
    move-object/from16 v0, p0

    iput-object v2, v0, Ldhy;->i:Ljava/io/IOException;

    .line 459
    throw v2

    .line 50537
    :cond_56
    const/4 v2, 0x0

    goto/16 :goto_5

    .line 50554
    :cond_57
    instance-of v3, v12, Ljava/net/ProtocolException;

    if-eqz v3, :cond_58

    .line 50555
    const/4 v3, 0x0

    goto/16 :goto_6

    .line 50559
    :cond_58
    instance-of v3, v12, Ljava/io/InterruptedIOException;

    if-eqz v3, :cond_59

    .line 50560
    const/4 v3, 0x0

    goto/16 :goto_6

    .line 50563
    :cond_59
    const/4 v3, 0x1

    goto/16 :goto_6

    .line 50545
    :cond_5a
    invoke-virtual {v11}, Ldhg;->i()Ldfh;

    move-result-object v8

    .line 50548
    new-instance v2, Ldhg;

    iget-object v3, v11, Ldhg;->b:Ldft;

    iget-object v4, v11, Ldhg;->l:Ldfy;

    iget-boolean v5, v11, Ldhg;->k:Z

    iget-boolean v6, v11, Ldhg;->r:Z

    iget-boolean v7, v11, Ldhg;->s:Z

    iget-object v9, v11, Ldhg;->e:Ldhr;

    check-cast v10, Ldhp;

    iget-object v11, v11, Ldhg;->g:Ldgc;

    invoke-direct/range {v2 .. v11}, Ldhg;-><init>(Ldft;Ldfy;ZZZLdfh;Ldhr;Ldhp;Ldgc;)V

    goto/16 :goto_7

    .line 469
    :cond_5b
    move-object/from16 v0, p0

    iput-object v12, v0, Ldhy;->i:Ljava/io/IOException;

    .line 470
    throw v12

    :cond_5c
    move-wide v4, v2

    goto/16 :goto_b

    :cond_5d
    move-wide v6, v2

    goto/16 :goto_a
.end method

.method private b()V
    .locals 4

    .prologue
    .line 295
    iget-object v0, p0, Ldhy;->i:Ljava/io/IOException;

    if-eqz v0, :cond_0

    .line 296
    iget-object v0, p0, Ldhy;->i:Ljava/io/IOException;

    throw v0

    .line 297
    :cond_0
    iget-object v0, p0, Ldhy;->b:Ldhg;

    if-eqz v0, :cond_1

    .line 316
    :goto_0
    return-void

    .line 301
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ldhy;->connected:Z

    .line 303
    :try_start_0
    iget-boolean v0, p0, Ldhy;->doOutput:Z

    if-eqz v0, :cond_2

    .line 304
    iget-object v0, p0, Ldhy;->method:Ljava/lang/String;

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 306
    const-string v0, "POST"

    iput-object v0, p0, Ldhy;->method:Ljava/lang/String;

    .line 312
    :cond_2
    iget-object v0, p0, Ldhy;->method:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Ldhy;->a(Ljava/lang/String;Ldfh;Ldhp;Ldgc;)Ldhg;

    move-result-object v0

    iput-object v0, p0, Ldhy;->b:Ldhg;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 313
    :catch_0
    move-exception v0

    .line 314
    iput-object v0, p0, Ldhy;->i:Ljava/io/IOException;

    .line 315
    throw v0

    .line 307
    :cond_3
    :try_start_1
    iget-object v0, p0, Ldhy;->method:Ljava/lang/String;

    invoke-static {v0}, La;->q(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 308
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ldhy;->method:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " does not support writing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
.end method

.method private c()Ldhg;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 377
    invoke-direct {p0}, Ldhy;->b()V

    .line 379
    iget-object v0, p0, Ldhy;->b:Ldhg;

    invoke-virtual {v0}, Ldhg;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 380
    iget-object v0, p0, Ldhy;->b:Ldhg;

    .line 393
    :goto_0
    return-object v0

    .line 416
    :cond_0
    iget-object v4, p0, Ldhy;->b:Ldhg;

    invoke-virtual {v2}, Ldfy;->a()Ljava/net/URL;

    move-result-object v5

    invoke-virtual {v4, v5}, Ldhg;->b(Ljava/net/URL;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 417
    iget-object v4, p0, Ldhy;->b:Ldhg;

    invoke-virtual {v4}, Ldhg;->h()V

    .line 420
    :cond_1
    iget-object v4, p0, Ldhy;->b:Ldhg;

    invoke-virtual {v4}, Ldhg;->i()Ldfh;

    move-result-object v4

    .line 23070
    iget-object v2, v2, Ldfy;->b:Ljava/lang/String;

    .line 421
    check-cast v0, Ldhp;

    invoke-direct {p0, v2, v4, v0, v3}, Ldhy;->a(Ljava/lang/String;Ldfh;Ldhp;Ldgc;)Ldhg;

    move-result-object v0

    iput-object v0, p0, Ldhy;->b:Ldhg;

    .line 384
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ldhy;->a(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 388
    iget-object v0, p0, Ldhy;->b:Ldhg;

    invoke-virtual {v0}, Ldhg;->f()Ldgc;

    move-result-object v3

    .line 389
    iget-object v2, p0, Ldhy;->b:Ldhg;

    .line 14064
    iget-object v0, v2, Ldhg;->o:Ldgc;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 14539
    :cond_3
    iget-object v0, v2, Ldhg;->f:Ldgf;

    .line 14065
    if-eqz v0, :cond_5

    .line 15539
    iget-object v0, v2, Ldhg;->f:Ldgf;

    .line 16066
    iget-object v0, v0, Ldgf;->b:Ljava/net/Proxy;

    .line 14068
    :goto_1
    iget-object v4, v2, Ldhg;->o:Ldgc;

    .line 17088
    iget v4, v4, Ldgc;->c:I

    .line 14070
    sparse-switch v4, :sswitch_data_0

    :cond_4
    move-object v2, v1

    .line 391
    :goto_2
    if-nez v2, :cond_c

    .line 392
    iget-object v0, p0, Ldhy;->b:Ldhg;

    invoke-virtual {v0}, Ldhg;->h()V

    .line 393
    iget-object v0, p0, Ldhy;->b:Ldhg;

    goto :goto_0

    .line 14066
    :cond_5
    iget-object v0, v2, Ldhg;->b:Ldft;

    .line 16296
    iget-object v0, v0, Ldft;->d:Ljava/net/Proxy;

    goto :goto_1

    .line 14072
    :sswitch_0
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v4

    sget-object v5, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-eq v4, v5, :cond_6

    .line 14073
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14077
    :cond_6
    :sswitch_1
    iget-object v4, v2, Ldhg;->b:Ldft;

    .line 17428
    iget-object v4, v4, Ldft;->p:Ldfa;

    .line 14077
    iget-object v2, v2, Ldhg;->o:Ldgc;

    invoke-static {v4, v2, v0}, Ldhl;->a(Ldfa;Ldgc;Ljava/net/Proxy;)Ldfy;

    move-result-object v0

    move-object v2, v0

    goto :goto_2

    .line 14083
    :sswitch_2
    iget-object v0, v2, Ldhg;->l:Ldfy;

    .line 18070
    iget-object v0, v0, Ldfy;->b:Ljava/lang/String;

    .line 14083
    const-string v4, "GET"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, v2, Ldhg;->l:Ldfy;

    .line 19070
    iget-object v0, v0, Ldfy;->b:Ljava/lang/String;

    .line 14083
    const-string v4, "HEAD"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14092
    :cond_7
    :sswitch_3
    iget-object v0, v2, Ldhg;->b:Ldft;

    .line 19468
    iget-boolean v0, v0, Ldft;->t:Z

    .line 14092
    if-eqz v0, :cond_4

    .line 14094
    iget-object v0, v2, Ldhg;->o:Ldgc;

    const-string v4, "Location"

    invoke-virtual {v0, v4}, Ldgc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14095
    if-eqz v0, :cond_4

    .line 14096
    new-instance v4, Ljava/net/URL;

    iget-object v5, v2, Ldhg;->l:Ldfy;

    invoke-virtual {v5}, Ldfy;->a()Ljava/net/URL;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 14099
    invoke-virtual {v4}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v5, "https"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v4}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v5, "http"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14102
    :cond_8
    invoke-virtual {v4}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    iget-object v5, v2, Ldhg;->l:Ldfy;

    invoke-virtual {v5}, Ldfy;->a()Ljava/net/URL;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 14103
    if-nez v0, :cond_9

    iget-object v0, v2, Ldhg;->b:Ldft;

    .line 20459
    iget-boolean v0, v0, Ldft;->s:Z

    .line 14103
    if-eqz v0, :cond_4

    .line 14106
    :cond_9
    iget-object v0, v2, Ldhg;->l:Ldfy;

    invoke-virtual {v0}, Ldfy;->c()Ldfz;

    move-result-object v0

    .line 14107
    iget-object v5, v2, Ldhg;->l:Ldfy;

    .line 21070
    iget-object v5, v5, Ldfy;->b:Ljava/lang/String;

    .line 14107
    invoke-static {v5}, La;->q(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 14108
    const-string v5, "GET"

    invoke-virtual {v0, v5, v1}, Ldfz;->a(Ljava/lang/String;Ldga;)Ldfz;

    .line 14109
    const-string v5, "Transfer-Encoding"

    invoke-virtual {v0, v5}, Ldfz;->a(Ljava/lang/String;)Ldfz;

    .line 14110
    const-string v5, "Content-Length"

    invoke-virtual {v0, v5}, Ldfz;->a(Ljava/lang/String;)Ldfz;

    .line 14111
    const-string v5, "Content-Type"

    invoke-virtual {v0, v5}, Ldfz;->a(Ljava/lang/String;)Ldfz;

    .line 14117
    :cond_a
    invoke-virtual {v2, v4}, Ldhg;->b(Ljava/net/URL;)Z

    move-result v2

    if-nez v2, :cond_b

    .line 14118
    const-string v2, "Authorization"

    invoke-virtual {v0, v2}, Ldfz;->a(Ljava/lang/String;)Ldfz;

    .line 14121
    :cond_b
    invoke-virtual {v0, v4}, Ldfz;->a(Ljava/net/URL;)Ldfz;

    move-result-object v0

    invoke-virtual {v0}, Ldfz;->a()Ldfy;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_2

    .line 396
    :cond_c
    iget v0, p0, Ldhy;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ldhy;->h:I

    const/16 v4, 0x14

    if-le v0, v4, :cond_d

    .line 397
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Too many follow-up requests: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ldhy;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 401
    :cond_d
    invoke-virtual {v2}, Ldfy;->a()Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, Ldhy;->url:Ljava/net/URL;

    .line 21074
    iget-object v0, v2, Ldfy;->c:Ldfo;

    .line 402
    invoke-virtual {v0}, Ldfo;->a()Ldfp;

    move-result-object v0

    iput-object v0, p0, Ldhy;->f:Ldfp;

    .line 407
    iget-object v0, p0, Ldhy;->b:Ldhg;

    invoke-virtual {v0}, Ldhg;->d()Ldku;

    move-result-object v0

    .line 22070
    iget-object v4, v2, Ldfy;->b:Ljava/lang/String;

    .line 408
    iget-object v5, p0, Ldhy;->method:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    move-object v0, v1

    .line 412
    :cond_e
    if-eqz v0, :cond_0

    instance-of v4, v0, Ldhp;

    if-nez v4, :cond_0

    .line 413
    new-instance v0, Ljava/net/HttpRetryException;

    const-string v1, "Cannot retry streamed HTTP body"

    iget v2, p0, Ldhy;->responseCode:I

    invoke-direct {v0, v1, v2}, Ljava/net/HttpRetryException;-><init>(Ljava/lang/String;I)V

    throw v0

    .line 14070
    nop

    :sswitch_data_0
    .sparse-switch
        0x12c -> :sswitch_3
        0x12d -> :sswitch_3
        0x12e -> :sswitch_3
        0x12f -> :sswitch_3
        0x133 -> :sswitch_2
        0x134 -> :sswitch_2
        0x191 -> :sswitch_1
        0x197 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 535
    iget-boolean v0, p0, Ldhy;->connected:Z

    if-eqz v0, :cond_0

    .line 536
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot add request property after connection is made"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 538
    :cond_0
    if-nez p1, :cond_1

    .line 539
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "field == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 541
    :cond_1
    if-nez p2, :cond_2

    .line 547
    invoke-static {}, Ldgn;->a()Ldgn;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ignoring header "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " because its value was null."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldgn;->a(Ljava/lang/String;)V

    .line 557
    :goto_0
    return-void

    .line 552
    :cond_2
    const-string v0, "X-Android-Transports"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "X-Android-Protocols"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 553
    :cond_3
    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Ldhy;->a(Ljava/lang/String;Z)V

    goto :goto_0

    .line 555
    :cond_4
    iget-object v0, p0, Ldhy;->f:Ldfp;

    invoke-virtual {v0, p1, p2}, Ldfp;->a(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    goto :goto_0
.end method

.method public final connect()V
    .locals 1

    .prologue
    .line 111
    invoke-direct {p0}, Ldhy;->b()V

    .line 114
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ldhy;->a(Z)Z

    move-result v0

    .line 115
    if-eqz v0, :cond_0

    .line 116
    return-void
.end method

.method public final disconnect()V
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Ldhy;->b:Ldhg;

    if-nez v0, :cond_1

    .line 1585
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    iget-object v0, p0, Ldhy;->b:Ldhg;

    .line 1581
    iget-object v1, v0, Ldhg;->h:Ldhw;

    if-eqz v1, :cond_0

    .line 1583
    :try_start_0
    iget-object v1, v0, Ldhg;->h:Ldhw;

    invoke-interface {v1, v0}, Ldhw;->a(Ldhg;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final getConnectTimeout()I
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Ldhy;->a:Ldft;

    .line 11243
    iget v0, v0, Ldft;->v:I

    .line 283
    return v0
.end method

.method public final getErrorStream()Ljava/io/InputStream;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 137
    :try_start_0
    invoke-direct {p0}, Ldhy;->c()Ldhg;

    move-result-object v1

    .line 138
    invoke-virtual {v1}, Ldhg;->f()Ldgc;

    move-result-object v2

    invoke-static {v2}, Ldhg;->c(Ldgc;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 139
    invoke-virtual {v1}, Ldhg;->f()Ldgc;

    move-result-object v2

    .line 2088
    iget v2, v2, Ldgc;->c:I

    .line 139
    const/16 v3, 0x190

    if-lt v2, v3, :cond_0

    .line 140
    invoke-virtual {v1}, Ldhg;->f()Ldgc;

    move-result-object v1

    .line 2130
    iget-object v1, v1, Ldgc;->g:Ldge;

    .line 140
    invoke-virtual {v1}, Ldge;->b()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 144
    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final getHeaderField(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 179
    :try_start_0
    invoke-direct {p0}, Ldhy;->a()Ldfo;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldfo;->b(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 181
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 192
    if-nez p1, :cond_0

    .line 193
    :try_start_0
    invoke-direct {p0}, Ldhy;->c()Ldhg;

    move-result-object v0

    invoke-virtual {v0}, Ldhg;->f()Ldgc;

    move-result-object v0

    invoke-static {v0}, Ldhv;->a(Ldgc;)Ldhv;

    move-result-object v0

    invoke-virtual {v0}, Ldhv;->toString()Ljava/lang/String;

    move-result-object v0

    .line 196
    :goto_0
    return-object v0

    .line 194
    :cond_0
    invoke-direct {p0}, Ldhy;->a()Ldfo;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldfo;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 196
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 202
    :try_start_0
    invoke-direct {p0}, Ldhy;->a()Ldfo;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldfo;->a(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 204
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getHeaderFields()Ljava/util/Map;
    .locals 2

    .prologue
    .line 210
    :try_start_0
    invoke-direct {p0}, Ldhy;->a()Ldfo;

    move-result-object v0

    .line 211
    invoke-direct {p0}, Ldhy;->c()Ldhg;

    move-result-object v1

    invoke-virtual {v1}, Ldhg;->f()Ldgc;

    move-result-object v1

    invoke-static {v1}, Ldhv;->a(Ldgc;)Ldhv;

    move-result-object v1

    invoke-virtual {v1}, Ldhv;->toString()Ljava/lang/String;

    move-result-object v1

    .line 210
    invoke-static {v0, v1}, Ldhl;->a(Ldfo;Ljava/lang/String;)Ljava/util/Map;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 213
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 3

    .prologue
    .line 227
    iget-boolean v0, p0, Ldhy;->doInput:Z

    if-nez v0, :cond_0

    .line 228
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "This protocol does not support input"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 231
    :cond_0
    invoke-direct {p0}, Ldhy;->c()Ldhg;

    move-result-object v0

    .line 237
    invoke-virtual {p0}, Ldhy;->getResponseCode()I

    move-result v1

    const/16 v2, 0x190

    if-lt v1, v2, :cond_1

    .line 238
    new-instance v0, Ljava/io/FileNotFoundException;

    iget-object v1, p0, Ldhy;->url:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 241
    :cond_1
    invoke-virtual {v0}, Ldhg;->f()Ldgc;

    move-result-object v0

    .line 7130
    iget-object v0, v0, Ldgc;->g:Ldge;

    .line 241
    invoke-virtual {v0}, Ldge;->b()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final getOutputStream()Ljava/io/OutputStream;
    .locals 3

    .prologue
    .line 245
    invoke-virtual {p0}, Ldhy;->connect()V

    .line 247
    iget-object v1, p0, Ldhy;->b:Ldhg;

    .line 7384
    iget-object v0, v1, Ldhg;->q:Ldkc;

    .line 7385
    if-eqz v0, :cond_0

    .line 248
    :goto_0
    if-nez v0, :cond_2

    .line 249
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "method does not support a request body: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ldhy;->method:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7386
    :cond_0
    invoke-virtual {v1}, Ldhg;->d()Ldku;

    move-result-object v0

    .line 7387
    if-eqz v0, :cond_1

    .line 7388
    invoke-static {v0}, Ldkk;->a(Ldku;)Ldkc;

    move-result-object v0

    iput-object v0, v1, Ldhg;->q:Ldkc;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 250
    :cond_2
    iget-object v1, p0, Ldhy;->b:Ldhg;

    invoke-virtual {v1}, Ldhg;->e()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 251
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "cannot write request body after response has been read"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 254
    :cond_3
    invoke-interface {v0}, Ldkc;->c()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public final getPermission()Ljava/security/Permission;
    .locals 4

    .prologue
    .line 258
    invoke-virtual {p0}, Ldhy;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 259
    invoke-virtual {p0}, Ldhy;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-static {v0}, Ldgs;->a(Ljava/net/URL;)I

    move-result v0

    .line 260
    invoke-virtual {p0}, Ldhy;->usingProxy()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 261
    iget-object v0, p0, Ldhy;->a:Ldft;

    .line 8296
    iget-object v0, v0, Ldft;->d:Ljava/net/Proxy;

    .line 261
    invoke-virtual {v0}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    .line 262
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v1

    .line 263
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    .line 265
    :cond_0
    new-instance v2, Ljava/net/SocketPermission;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "connect, resolve"

    invoke-direct {v2, v0, v1}, Ljava/net/SocketPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public final getReadTimeout()I
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Ldhy;->a:Ldft;

    .line 11263
    iget v0, v0, Ldft;->w:I

    .line 291
    return v0
.end method

.method public final getRequestProperties()Ljava/util/Map;
    .locals 2

    .prologue
    .line 218
    iget-boolean v0, p0, Ldhy;->connected:Z

    if-eqz v0, :cond_0

    .line 219
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access request header fields after connection is set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 223
    :cond_0
    iget-object v0, p0, Ldhy;->f:Ldfp;

    invoke-virtual {v0}, Ldfp;->a()Ldfo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ldhl;->a(Ldfo;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 269
    if-nez p1, :cond_0

    move-object v0, v1

    .line 9288
    :goto_0
    return-object v0

    .line 270
    :cond_0
    iget-object v3, p0, Ldhy;->f:Ldfp;

    .line 9286
    iget-object v0, v3, Ldfp;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    move v2, v0

    :goto_1
    if-ltz v2, :cond_2

    .line 9287
    iget-object v0, v3, Ldfp;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9288
    iget-object v0, v3, Ldfp;->a:Ljava/util/List;

    add-int/lit8 v1, v2, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    .line 9286
    :cond_1
    add-int/lit8 v0, v2, -0x2

    move v2, v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 270
    goto :goto_0
.end method

.method public final getResponseCode()I
    .locals 1

    .prologue
    .line 497
    invoke-direct {p0}, Ldhy;->c()Ldhg;

    move-result-object v0

    invoke-virtual {v0}, Ldhg;->f()Ldgc;

    move-result-object v0

    .line 50568
    iget v0, v0, Ldgc;->c:I

    .line 497
    return v0
.end method

.method public final getResponseMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 493
    invoke-direct {p0}, Ldhy;->c()Ldhg;

    move-result-object v0

    invoke-virtual {v0}, Ldhg;->f()Ldgc;

    move-result-object v0

    .line 50567
    iget-object v0, v0, Ldgc;->d:Ljava/lang/String;

    .line 493
    return-object v0
.end method

.method public final setConnectTimeout(I)V
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    .line 274
    iget-object v0, p0, Ldhy;->a:Ldft;

    int-to-long v2, p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10233
    cmp-long v4, v2, v8

    if-gez v4, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "timeout < 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10234
    :cond_0
    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unit == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10235
    :cond_1
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    .line 10236
    const-wide/32 v6, 0x7fffffff

    cmp-long v1, v4, v6

    if-lez v1, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Timeout too large."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10237
    :cond_2
    cmp-long v1, v4, v8

    if-nez v1, :cond_3

    cmp-long v1, v2, v8

    if-lez v1, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Timeout too small."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10238
    :cond_3
    long-to-int v1, v4

    iput v1, v0, Ldft;->v:I

    .line 275
    return-void
.end method

.method public final setFixedLengthStreamingMode(I)V
    .locals 2

    .prologue
    .line 588
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Ldhy;->setFixedLengthStreamingMode(J)V

    .line 589
    return-void
.end method

.method public final setFixedLengthStreamingMode(J)V
    .locals 3

    .prologue
    .line 592
    iget-boolean v0, p0, Ljava/net/HttpURLConnection;->connected:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 593
    :cond_0
    iget v0, p0, Ldhy;->chunkLength:I

    if-lez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already in chunked mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 594
    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "contentLength < 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 595
    :cond_2
    iput-wide p1, p0, Ldhy;->g:J

    .line 596
    const-wide/32 v0, 0x7fffffff

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Ljava/net/HttpURLConnection;->fixedContentLength:I

    .line 597
    return-void
.end method

.method public final setIfModifiedSince(J)V
    .locals 7

    .prologue
    .line 526
    invoke-super {p0, p1, p2}, Ljava/net/HttpURLConnection;->setIfModifiedSince(J)V

    .line 527
    iget-wide v0, p0, Ldhy;->ifModifiedSince:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 528
    iget-object v0, p0, Ldhy;->f:Ldfp;

    const-string v1, "If-Modified-Since"

    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Ldhy;->ifModifiedSince:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-static {v2}, Ldhe;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ldfp;->c(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 532
    :goto_0
    return-void

    .line 530
    :cond_0
    iget-object v0, p0, Ldhy;->f:Ldfp;

    const-string v1, "If-Modified-Since"

    invoke-virtual {v0, v1}, Ldfp;->a(Ljava/lang/String;)Ldfp;

    goto :goto_0
.end method

.method public final setInstanceFollowRedirects(Z)V
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Ldhy;->a:Ldft;

    .line 10464
    iput-boolean p1, v0, Ldft;->t:Z

    .line 280
    return-void
.end method

.method public final setReadTimeout(I)V
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    .line 287
    iget-object v0, p0, Ldhy;->a:Ldft;

    int-to-long v2, p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11253
    cmp-long v4, v2, v8

    if-gez v4, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "timeout < 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11254
    :cond_0
    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unit == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11255
    :cond_1
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    .line 11256
    const-wide/32 v6, 0x7fffffff

    cmp-long v1, v4, v6

    if-lez v1, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Timeout too large."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11257
    :cond_2
    cmp-long v1, v4, v8

    if-nez v1, :cond_3

    cmp-long v1, v2, v8

    if-lez v1, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Timeout too small."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11258
    :cond_3
    long-to-int v1, v4

    iput v1, v0, Ldft;->w:I

    .line 288
    return-void
.end method

.method public final setRequestMethod(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 581
    sget-object v0, Ldhy;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 582
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected one of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ldhy;->d:Ljava/util/Set;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 584
    :cond_0
    iput-object p1, p0, Ldhy;->method:Ljava/lang/String;

    .line 585
    return-void
.end method

.method public final setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 501
    iget-boolean v0, p0, Ldhy;->connected:Z

    if-eqz v0, :cond_0

    .line 502
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set request property after connection is made"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 504
    :cond_0
    if-nez p1, :cond_1

    .line 505
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "field == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 507
    :cond_1
    if-nez p2, :cond_2

    .line 513
    invoke-static {}, Ldgn;->a()Ldgn;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ignoring header "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " because its value was null."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldgn;->a(Ljava/lang/String;)V

    .line 523
    :goto_0
    return-void

    .line 518
    :cond_2
    const-string v0, "X-Android-Transports"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "X-Android-Protocols"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 519
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ldhy;->a(Ljava/lang/String;Z)V

    goto :goto_0

    .line 521
    :cond_4
    iget-object v0, p0, Ldhy;->f:Ldfp;

    invoke-virtual {v0, p1, p2}, Ldfp;->c(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    goto :goto_0
.end method

.method public final usingProxy()Z
    .locals 2

    .prologue
    .line 486
    iget-object v0, p0, Ldhy;->k:Ldgf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldhy;->k:Ldgf;

    .line 50565
    iget-object v0, v0, Ldgf;->b:Ljava/net/Proxy;

    .line 489
    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_1
    return v0

    .line 487
    :cond_0
    iget-object v0, p0, Ldhy;->a:Ldft;

    .line 50566
    iget-object v0, v0, Ldft;->d:Ljava/net/Proxy;

    goto :goto_0

    .line 489
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
