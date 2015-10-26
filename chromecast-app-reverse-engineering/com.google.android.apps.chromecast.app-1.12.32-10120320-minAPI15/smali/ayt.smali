.class final Layt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbff;


# instance fields
.field private synthetic a:Layv;

.field private synthetic b:Layq;


# direct methods
.method constructor <init>(Layq;Layv;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Layt;->b:Layq;

    iput-object p2, p0, Layt;->a:Layv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 322
    iget-object v0, p0, Layt;->b:Layq;

    invoke-static {v0}, Layq;->c(Layq;)Layx;

    move-result-object v1

    monitor-enter v1

    .line 323
    :try_start_0
    iget-object v0, p0, Layt;->b:Layq;

    invoke-static {v0}, Layq;->c(Layq;)Layx;

    move-result-object v0

    iget-object v0, v0, Layx;->a:Ljava/util/List;

    iget-object v2, p0, Layt;->a:Layv;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 324
    iget-object v0, p0, Layt;->b:Layq;

    invoke-static {v0}, Layq;->c(Layq;)Layx;

    move-result-object v0

    iget-object v0, v0, Layx;->b:Ljava/util/List;

    iget-object v2, p0, Layt;->a:Layv;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 325
    iget-object v0, p0, Layt;->a:Layv;

    const/4 v2, 0x0

    iput-object v2, v0, Layv;->c:Layl;

    .line 326
    iget-object v0, p0, Layt;->a:Layv;

    const/4 v2, 0x0

    iput-object v2, v0, Layv;->d:Lbfe;

    .line 327
    iget-object v0, p0, Layt;->a:Layv;

    iget-object v2, v0, Layv;->b:Laym;

    .line 328
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    iget-object v0, p0, Layt;->b:Layq;

    invoke-static {v0}, Layq;->d(Layq;)Lblp;

    .line 332
    iget-object v0, p0, Layt;->b:Layq;

    invoke-static {v0}, Layq;->e(Layq;)Ljava/util/List;

    move-result-object v0

    .line 333
    if-eqz v0, :cond_0

    .line 334
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layw;

    .line 335
    invoke-interface {v0, v2}, Layw;->a(Laym;)V

    goto :goto_0

    .line 328
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 338
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 342
    iget-object v0, p0, Layt;->a:Layv;

    const/4 v1, 0x1

    iput-boolean v1, v0, Layv;->f:Z

    .line 343
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 347
    iget-object v0, p0, Layt;->b:Layq;

    invoke-static {v0}, Layq;->c(Layq;)Layx;

    move-result-object v1

    monitor-enter v1

    .line 348
    :try_start_0
    iget-object v0, p0, Layt;->b:Layq;

    invoke-static {v0}, Layq;->c(Layq;)Layx;

    move-result-object v0

    iget-object v0, v0, Layx;->a:Ljava/util/List;

    iget-object v2, p0, Layt;->a:Layv;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 349
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
