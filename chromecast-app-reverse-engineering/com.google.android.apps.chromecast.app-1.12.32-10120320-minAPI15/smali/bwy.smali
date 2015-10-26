.class public final Lbwy;
.super Ljava/lang/Object;

# interfaces
.implements Lbxj;


# instance fields
.field private final a:Lbwz;


# direct methods
.method public constructor <init>(Lbwz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbwy;->a:Lbwz;

    return-void
.end method


# virtual methods
.method public final a(Lbwp;)Lbwp;
    .locals 1

    iget-object v0, p0, Lbwy;->a:Lbwz;

    iget-object v0, v0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbwy;->a:Lbwz;

    .line 1000
    iget-object v0, v0, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwc;

    invoke-interface {v0}, Lbwc;->a()V

    goto :goto_0

    .line 0
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Lbwy;->a:Lbwz;

    iget-object v0, v0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxi;

    invoke-interface {v0}, Lbxi;->b()V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lbwy;->a:Lbwz;

    iget-object v0, v0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    iget-object v0, p0, Lbwy;->a:Lbwz;

    invoke-virtual {v0}, Lbwz;->f()V

    iget-object v0, p0, Lbwy;->a:Lbwz;

    iget-object v0, v0, Lbwz;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_2
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;Lbvz;I)V
    .locals 0

    return-void
.end method

.method public final b(Lbwp;)Lbwp;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GoogleApiClient is not connected yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 7

    .prologue
    .line 0
    iget-object v1, p0, Lbwy;->a:Lbwz;

    .line 2000
    iget-object v0, v1, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    new-instance v0, Lbws;

    iget-object v2, v1, Lbwz;->m:Lbyl;

    iget-object v3, v1, Lbwz;->n:Ljava/util/Map;

    iget-object v4, v1, Lbwz;->o:Lbwd;

    iget-object v5, v1, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    iget-object v6, v1, Lbwz;->d:Landroid/content/Context;

    invoke-direct/range {v0 .. v6}, Lbws;-><init>(Lbwz;Lbyl;Ljava/util/Map;Lbwd;Ljava/util/concurrent/locks/Lock;Landroid/content/Context;)V

    iput-object v0, v1, Lbwz;->p:Lbxj;

    iget-object v0, v1, Lbwz;->p:Lbxj;

    invoke-interface {v0}, Lbxj;->a()V

    iget-object v0, v1, Lbwz;->b:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, v1, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "DISCONNECTED"

    return-object v0
.end method
