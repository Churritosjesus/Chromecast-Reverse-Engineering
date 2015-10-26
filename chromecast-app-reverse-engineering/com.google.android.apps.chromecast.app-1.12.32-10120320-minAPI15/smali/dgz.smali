.class final Ldgz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldku;


# instance fields
.field private final a:Ldkh;

.field private b:Z

.field private synthetic c:Ldgx;


# direct methods
.method constructor <init>(Ldgx;)V
    .locals 2

    .prologue
    .line 325
    iput-object p1, p0, Ldgz;->c:Ldgx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 326
    new-instance v0, Ldkh;

    iget-object v1, p0, Ldgz;->c:Ldgx;

    .line 1063
    iget-object v1, v1, Ldgx;->d:Ldkc;

    .line 326
    invoke-interface {v1}, Ldkc;->a()Ldkw;

    move-result-object v1

    invoke-direct {v0, v1}, Ldkh;-><init>(Ldkw;)V

    iput-object v0, p0, Ldgz;->a:Ldkh;

    return-void
.end method


# virtual methods
.method public final a()Ldkw;
    .locals 1

    .prologue
    .line 330
    iget-object v0, p0, Ldgz;->a:Ldkh;

    return-object v0
.end method

.method public final a_(Ldjz;J)V
    .locals 2

    .prologue
    .line 334
    iget-boolean v0, p0, Ldgz;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 335
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    .line 341
    :goto_0
    return-void

    .line 337
    :cond_1
    iget-object v0, p0, Ldgz;->c:Ldgx;

    .line 2063
    iget-object v0, v0, Ldgx;->d:Ldkc;

    .line 337
    invoke-interface {v0, p2, p3}, Ldkc;->h(J)Ldkc;

    .line 338
    iget-object v0, p0, Ldgz;->c:Ldgx;

    .line 3063
    iget-object v0, v0, Ldgx;->d:Ldkc;

    .line 338
    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    .line 339
    iget-object v0, p0, Ldgz;->c:Ldgx;

    .line 4063
    iget-object v0, v0, Ldgx;->d:Ldkc;

    .line 339
    invoke-interface {v0, p1, p2, p3}, Ldkc;->a_(Ldjz;J)V

    .line 340
    iget-object v0, p0, Ldgz;->c:Ldgx;

    .line 5063
    iget-object v0, v0, Ldgx;->d:Ldkc;

    .line 340
    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    goto :goto_0
.end method

.method public final declared-synchronized close()V
    .locals 2

    .prologue
    .line 349
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldgz;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 354
    :goto_0
    monitor-exit p0

    return-void

    .line 350
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Ldgz;->b:Z

    .line 351
    iget-object v0, p0, Ldgz;->c:Ldgx;

    .line 7063
    iget-object v0, v0, Ldgx;->d:Ldkc;

    .line 351
    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    .line 352
    iget-object v0, p0, Ldgz;->c:Ldgx;

    iget-object v1, p0, Ldgz;->a:Ldkh;

    invoke-static {v0, v1}, Ldgx;->a(Ldgx;Ldkh;)V

    .line 353
    iget-object v0, p0, Ldgz;->c:Ldgx;

    const/4 v1, 0x3

    .line 8063
    iput v1, v0, Ldgx;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 349
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .prologue
    .line 344
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldgz;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 346
    :goto_0
    monitor-exit p0

    return-void

    .line 345
    :cond_0
    :try_start_1
    iget-object v0, p0, Ldgz;->c:Ldgx;

    .line 6063
    iget-object v0, v0, Ldgx;->d:Ldkc;

    .line 345
    invoke-interface {v0}, Ldkc;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 344
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
