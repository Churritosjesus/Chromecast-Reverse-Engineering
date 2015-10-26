.class final Laot;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laor;


# direct methods
.method constructor <init>(Laor;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Laot;->a:Laor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 91
    iget-object v0, p0, Laot;->a:Laor;

    invoke-static {v0}, Laor;->a(Laor;)I

    .line 92
    iget-object v0, p0, Laot;->a:Laor;

    invoke-static {v0}, Laor;->b(Laor;)I

    move-result v0

    if-nez v0, :cond_2

    .line 93
    invoke-static {}, Laor;->a()Lblp;

    .line 94
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    const/16 v1, 0x6d

    invoke-virtual {v0, v1}, Lape;->b(I)V

    .line 95
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    .line 1163
    iget-object v1, v0, Lape;->e:Lbvh;

    iget-object v0, v0, Lape;->d:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 2000
    iget-object v1, v1, Lbvh;->c:Lbvm;

    invoke-interface {v1, v0}, Lbvm;->a(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    .line 96
    iget-object v0, p0, Laot;->a:Laor;

    invoke-static {v0}, Laor;->c(Laor;)Ljava/util/concurrent/Future;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Laot;->a:Laor;

    invoke-static {v0}, Laor;->c(Laor;)Ljava/util/concurrent/Future;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 99
    :cond_0
    iget-object v0, p0, Laot;->a:Laor;

    invoke-static {}, Laor;->c()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    .line 100
    invoke-static {}, Laor;->b()Ljava/lang/Runnable;

    move-result-object v2

    iget-object v3, p0, Laot;->a:Laor;

    invoke-static {v3}, Laor;->d(Laor;)J

    move-result-wide v4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 99
    invoke-interface {v1, v2, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    invoke-static {v0, v1}, Laor;->a(Laor;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;

    .line 102
    iget-object v0, p0, Laot;->a:Laor;

    invoke-static {v0}, Laor;->e(Laor;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 103
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 105
    :cond_1
    iget-object v0, p0, Laot;->a:Laor;

    invoke-static {v0}, Laor;->e(Laor;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 107
    :cond_2
    return-void
.end method
