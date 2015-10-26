.class final Lbwx;
.super Ljava/lang/Object;

# interfaces
.implements Lbwg;
.implements Lbwh;


# instance fields
.field private synthetic a:Lbws;


# direct methods
.method constructor <init>(Lbws;)V
    .locals 0

    iput-object p1, p0, Lbwx;->a:Lbws;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 0
    iget-object v0, p0, Lbwx;->a:Lbws;

    .line 1000
    iget-object v0, v0, Lbws;->d:Lcls;

    .line 0
    new-instance v1, Lbwv;

    iget-object v2, p0, Lbwx;->a:Lbws;

    invoke-direct {v1, v2}, Lbwv;-><init>(Lbws;)V

    invoke-interface {v0, v1}, Lcls;->a(Lbzo;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbwx;->a:Lbws;

    .line 2000
    iget-object v0, v0, Lbws;->b:Ljava/util/concurrent/locks/Lock;

    .line 0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lbwx;->a:Lbws;

    .line 3000
    invoke-virtual {v0, p1}, Lbws;->a(Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result v0

    .line 0
    if-eqz v0, :cond_0

    iget-object v0, p0, Lbwx;->a:Lbws;

    .line 4000
    invoke-virtual {v0}, Lbws;->h()V

    .line 0
    iget-object v0, p0, Lbwx;->a:Lbws;

    .line 5000
    invoke-virtual {v0}, Lbws;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 0
    :goto_0
    iget-object v0, p0, Lbwx;->a:Lbws;

    .line 7000
    iget-object v0, v0, Lbws;->b:Ljava/util/concurrent/locks/Lock;

    .line 0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lbwx;->a:Lbws;

    .line 6000
    invoke-virtual {v0, p1}, Lbws;->b(Lcom/google/android/gms/common/ConnectionResult;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 0
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbwx;->a:Lbws;

    .line 8000
    iget-object v1, v1, Lbws;->b:Ljava/util/concurrent/locks/Lock;

    .line 0
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
