.class public final Ldjn;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:J

.field b:J

.field final c:I

.field final d:Ldjb;

.field e:Ljava/util/List;

.field public final f:Ldjp;

.field final g:Ldjo;

.field public final h:Ldjq;

.field private final i:Ldjq;

.field private j:Ldia;


# direct methods
.method constructor <init>(ILdjb;ZZLjava/util/List;)V
    .locals 4

    .prologue
    const/high16 v2, 0x10000

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ldjn;->a:J

    .line 65
    new-instance v0, Ldjq;

    invoke-direct {v0, p0}, Ldjq;-><init>(Ldjn;)V

    iput-object v0, p0, Ldjn;->h:Ldjq;

    .line 66
    new-instance v0, Ldjq;

    invoke-direct {v0, p0}, Ldjq;-><init>(Ldjn;)V

    iput-object v0, p0, Ldjn;->i:Ldjq;

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Ldjn;->j:Ldia;

    .line 77
    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "connection == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_0
    if-nez p5, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "requestHeaders == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_1
    iput p1, p0, Ldjn;->c:I

    .line 80
    iput-object p2, p0, Ldjn;->d:Ldjb;

    .line 81
    iget-object v0, p2, Ldjb;->f:Ldix;

    .line 82
    invoke-virtual {v0, v2}, Ldix;->c(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Ldjn;->b:J

    .line 83
    new-instance v0, Ldjp;

    iget-object v1, p2, Ldjb;->e:Ldix;

    .line 84
    invoke-virtual {v1, v2}, Ldix;->c(I)I

    move-result v1

    int-to-long v2, v1

    .line 1313
    invoke-direct {v0, p0, v2, v3}, Ldjp;-><init>(Ldjn;J)V

    .line 84
    iput-object v0, p0, Ldjn;->f:Ldjp;

    .line 85
    new-instance v0, Ldjo;

    invoke-direct {v0, p0}, Ldjo;-><init>(Ldjn;)V

    iput-object v0, p0, Ldjn;->g:Ldjo;

    .line 86
    iget-object v0, p0, Ldjn;->f:Ldjp;

    invoke-static {v0, p4}, Ldjp;->a(Ldjp;Z)Z

    .line 87
    iget-object v0, p0, Ldjn;->g:Ldjo;

    invoke-static {v0, p3}, Ldjo;->a(Ldjo;Z)Z

    .line 89
    return-void
.end method

.method static synthetic a(Ldjn;)Ldjb;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Ldjn;->d:Ldjb;

    return-object v0
.end method

.method static synthetic b(Ldjn;)I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Ldjn;->c:I

    return v0
.end method

.method static synthetic c(Ldjn;)Ldjq;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Ldjn;->h:Ldjq;

    return-object v0
.end method

.method static synthetic d(Ldjn;)Ldia;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Ldjn;->j:Ldia;

    return-object v0
.end method

.method private d(Ldia;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 238
    monitor-enter p0

    .line 239
    :try_start_0
    iget-object v1, p0, Ldjn;->j:Ldia;

    if-eqz v1, :cond_0

    .line 240
    monitor-exit p0

    .line 249
    :goto_0
    return v0

    .line 242
    :cond_0
    iget-object v1, p0, Ldjn;->f:Ldjp;

    invoke-static {v1}, Ldjp;->a(Ldjp;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ldjn;->g:Ldjo;

    invoke-static {v1}, Ldjo;->a(Ldjo;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 243
    monitor-exit p0

    goto :goto_0

    .line 247
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 245
    :cond_1
    :try_start_1
    iput-object p1, p0, Ldjn;->j:Ldia;

    .line 246
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 247
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 248
    iget-object v0, p0, Ldjn;->d:Ldjb;

    iget v1, p0, Ldjn;->c:I

    invoke-virtual {v0, v1}, Ldjb;->b(I)Ldjn;

    .line 249
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic e(Ldjn;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ldjn;->f()V

    return-void
.end method

.method private f()V
    .locals 1

    .prologue
    .line 587
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 590
    return-void

    .line 589
    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method

.method static synthetic f(Ldjn;)V
    .locals 2

    .prologue
    .line 34
    .line 1450
    monitor-enter p0

    .line 1451
    :try_start_0
    iget-object v0, p0, Ldjn;->f:Ldjp;

    invoke-static {v0}, Ldjp;->a(Ldjp;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ldjn;->f:Ldjp;

    invoke-static {v0}, Ldjp;->b(Ldjp;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldjn;->g:Ldjo;

    invoke-static {v0}, Ldjo;->a(Ldjo;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldjn;->g:Ldjo;

    invoke-static {v0}, Ldjo;->b(Ldjo;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    .line 1452
    :goto_0
    invoke-virtual {p0}, Ldjn;->a()Z

    move-result v1

    .line 1453
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1454
    if-eqz v0, :cond_3

    .line 1459
    sget-object v0, Ldia;->h:Ldia;

    invoke-virtual {p0, v0}, Ldjn;->a(Ldia;)V

    :cond_1
    :goto_1
    return-void

    .line 1451
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 1453
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 1460
    :cond_3
    if-nez v1, :cond_1

    .line 1461
    iget-object v0, p0, Ldjn;->d:Ldjb;

    iget v1, p0, Ldjn;->c:I

    invoke-virtual {v0, v1}, Ldjb;->b(I)Ldjn;

    goto :goto_1
.end method

.method static synthetic g(Ldjn;)Ldjq;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Ldjn;->i:Ldjq;

    return-object v0
.end method

.method static synthetic h(Ldjn;)V
    .locals 3

    .prologue
    .line 34
    .line 1572
    iget-object v0, p0, Ldjn;->g:Ldjo;

    invoke-static {v0}, Ldjo;->b(Ldjo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1573
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1574
    :cond_0
    iget-object v0, p0, Ldjn;->g:Ldjo;

    invoke-static {v0}, Ldjo;->a(Ldjo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1575
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1576
    :cond_1
    iget-object v0, p0, Ldjn;->j:Ldia;

    if-eqz v0, :cond_2

    .line 1577
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stream was reset: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ldjn;->j:Ldia;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_2
    return-void
.end method


# virtual methods
.method final a(J)V
    .locals 3

    .prologue
    .line 567
    iget-wide v0, p0, Ldjn;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Ldjn;->b:J

    .line 568
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 569
    :cond_0
    return-void
.end method

.method public final a(Ldia;)V
    .locals 2

    .prologue
    .line 218
    invoke-direct {p0, p1}, Ldjn;->d(Ldia;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 222
    :goto_0
    return-void

    .line 221
    :cond_0
    iget-object v0, p0, Ldjn;->d:Ldjb;

    iget v1, p0, Ldjn;->c:I

    invoke-virtual {v0, v1, p1}, Ldjb;->b(ILdia;)V

    goto :goto_0
.end method

.method public final declared-synchronized a()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 106
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Ldjn;->j:Ldia;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 114
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 109
    :cond_1
    :try_start_1
    iget-object v1, p0, Ldjn;->f:Ldjp;

    invoke-static {v1}, Ldjp;->a(Ldjp;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Ldjn;->f:Ldjp;

    invoke-static {v1}, Ldjp;->b(Ldjp;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_2
    iget-object v1, p0, Ldjn;->g:Ldjo;

    .line 110
    invoke-static {v1}, Ldjo;->a(Ldjo;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Ldjn;->g:Ldjo;

    invoke-static {v1}, Ldjo;->b(Ldjo;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    iget-object v1, p0, Ldjn;->e:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_0

    .line 114
    :cond_4
    const/4 v0, 0x1

    goto :goto_0

    .line 106
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Ldia;)V
    .locals 2

    .prologue
    .line 229
    invoke-direct {p0, p1}, Ldjn;->d(Ldia;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 233
    :goto_0
    return-void

    .line 232
    :cond_0
    iget-object v0, p0, Ldjn;->d:Ldjb;

    iget v1, p0, Ldjn;->c:I

    invoke-virtual {v0, v1, p1}, Ldjb;->a(ILdia;)V

    goto :goto_0
.end method

.method public final b()Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 119
    iget v0, p0, Ldjn;->c:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    move v0, v1

    .line 120
    :goto_0
    iget-object v3, p0, Ldjn;->d:Ldjb;

    iget-boolean v3, v3, Ldjb;->b:Z

    if-ne v3, v0, :cond_1

    :goto_1
    return v1

    :cond_0
    move v0, v2

    .line 119
    goto :goto_0

    :cond_1
    move v1, v2

    .line 120
    goto :goto_1
.end method

.method public final declared-synchronized c()Ljava/util/List;
    .locals 3

    .prologue
    .line 136
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ldjn;->h:Ldjq;

    invoke-virtual {v0}, Ldjq;->j_()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 138
    :goto_0
    :try_start_1
    iget-object v0, p0, Ldjn;->e:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Ldjn;->j:Ldia;

    if-nez v0, :cond_0

    .line 139
    invoke-direct {p0}, Ldjn;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 142
    :catchall_0
    move-exception v0

    :try_start_2
    iget-object v1, p0, Ldjn;->h:Ldjq;

    invoke-virtual {v1}, Ldjq;->b()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 136
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 142
    :cond_0
    :try_start_3
    iget-object v0, p0, Ldjn;->h:Ldjq;

    invoke-virtual {v0}, Ldjq;->b()V

    .line 144
    iget-object v0, p0, Ldjn;->e:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldjn;->e:Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    return-object v0

    .line 145
    :cond_1
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stream was reset: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ldjn;->j:Ldia;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1
.end method

.method final declared-synchronized c(Ldia;)V
    .locals 1

    .prologue
    .line 302
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ldjn;->j:Ldia;

    if-nez v0, :cond_0

    .line 303
    iput-object p1, p0, Ldjn;->j:Ldia;

    .line 304
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    :cond_0
    monitor-exit p0

    return-void

    .line 302
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final d()Ldku;
    .locals 2

    .prologue
    .line 205
    monitor-enter p0

    .line 206
    :try_start_0
    iget-object v0, p0, Ldjn;->e:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ldjn;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 207
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "reply before requesting the sink"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 209
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    iget-object v0, p0, Ldjn;->g:Ldjo;

    return-object v0
.end method

.method final e()V
    .locals 2

    .prologue
    .line 291
    monitor-enter p0

    .line 292
    :try_start_0
    iget-object v0, p0, Ldjn;->f:Ldjp;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ldjp;->a(Ldjp;Z)Z

    .line 293
    invoke-virtual {p0}, Ldjn;->a()Z

    move-result v0

    .line 294
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 295
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 296
    if-nez v0, :cond_0

    .line 297
    iget-object v0, p0, Ldjn;->d:Ldjb;

    iget v1, p0, Ldjn;->c:I

    invoke-virtual {v0, v1}, Ldjb;->b(I)Ldjn;

    .line 299
    :cond_0
    return-void

    .line 295
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
