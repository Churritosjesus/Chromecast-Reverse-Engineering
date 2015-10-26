.class public final Lbws;
.super Ljava/lang/Object;

# interfaces
.implements Lbxj;


# instance fields
.field final a:Lbwz;

.field final b:Ljava/util/concurrent/locks/Lock;

.field c:I

.field d:Lcls;

.field e:Z

.field f:Z

.field g:Lbzf;

.field h:Z

.field i:Z

.field private final j:Landroid/content/Context;

.field private k:Lcom/google/android/gms/common/ConnectionResult;

.field private l:I

.field private m:I

.field private n:Z

.field private final o:Landroid/os/Bundle;

.field private final p:Ljava/util/Set;

.field private q:I

.field private final r:Lbyl;

.field private final s:Ljava/util/Map;

.field private final t:Lbwd;


# direct methods
.method public constructor <init>(Lbwz;Lbyl;Ljava/util/Map;Lbwd;Ljava/util/concurrent/locks/Lock;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lbws;->m:I

    iput-boolean v0, p0, Lbws;->n:Z

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lbws;->o:Landroid/os/Bundle;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lbws;->p:Ljava/util/Set;

    iput-object p1, p0, Lbws;->a:Lbwz;

    iput-object p2, p0, Lbws;->r:Lbyl;

    iput-object p3, p0, Lbws;->s:Ljava/util/Map;

    iput-object p4, p0, Lbws;->t:Lbwd;

    iput-object p5, p0, Lbws;->b:Ljava/util/concurrent/locks/Lock;

    iput-object p6, p0, Lbws;->j:Landroid/content/Context;

    return-void
.end method

.method private a(Z)V
    .locals 1

    iget-object v0, p0, Lbws;->d:Lcls;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lbws;->d:Lcls;

    invoke-interface {v0}, Lcls;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lbws;->d:Lcls;

    invoke-interface {v0}, Lcls;->i_()V

    :cond_0
    iget-object v0, p0, Lbws;->d:Lcls;

    invoke-interface {v0}, Lcls;->a()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lbws;->g:Lbzf;

    :cond_2
    return-void
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    const-string v0, "UNKNOWN"

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "STEP_GETTING_SERVICE_BINDINGS"

    goto :goto_0

    :pswitch_1
    const-string v0, "STEP_VALIDATING_ACCOUNT"

    goto :goto_0

    :pswitch_2
    const-string v0, "STEP_AUTHENTICATING"

    goto :goto_0

    :pswitch_3
    const-string v0, "STEP_GETTING_REMOTE_SERVICE"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private i()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 0
    iget-object v1, p0, Lbws;->a:Lbwz;

    .line 7000
    iget-object v0, v1, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {v1}, Lbwz;->g()Z

    new-instance v0, Lbwr;

    invoke-direct {v0, v1}, Lbwr;-><init>(Lbwz;)V

    iput-object v0, v1, Lbwz;->p:Lbxj;

    iget-object v0, v1, Lbwz;->p:Lbxj;

    invoke-interface {v0}, Lbxj;->a()V

    iget-object v0, v1, Lbwz;->b:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 0
    iget-object v0, p0, Lbws;->d:Lcls;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lbws;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbws;->d:Lcls;

    iget-object v1, p0, Lbws;->g:Lbzf;

    iget-boolean v2, p0, Lbws;->i:Z

    invoke-interface {v0, v1, v2}, Lcls;->a(Lbzf;Z)V

    :cond_0
    invoke-direct {p0, v3}, Lbws;->a(Z)V

    :cond_1
    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwe;

    iget-object v2, p0, Lbws;->a:Lbwz;

    iget-object v2, v2, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwc;

    invoke-interface {v0}, Lbwc;->a()V

    goto :goto_0

    .line 7000
    :catchall_0
    move-exception v0

    iget-object v1, v1, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    .line 0
    :cond_2
    iget-boolean v0, p0, Lbws;->n:Z

    if-eqz v0, :cond_3

    iput-boolean v3, p0, Lbws;->n:Z

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lbws;->a(I)V

    :goto_1
    return-void

    :cond_3
    iget-object v0, p0, Lbws;->o:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    :goto_2
    iget-object v1, p0, Lbws;->a:Lbwz;

    iget-object v1, v1, Lbwz;->c:Lbyx;

    invoke-virtual {v1, v0}, Lbyx;->a(Landroid/os/Bundle;)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lbws;->o:Landroid/os/Bundle;

    goto :goto_2
.end method

.method private j()Ljava/util/Set;
    .locals 6

    .prologue
    .line 0
    new-instance v1, Ljava/util/HashSet;

    iget-object v0, p0, Lbws;->r:Lbyl;

    .line 13000
    iget-object v0, v0, Lbyl;->b:Ljava/util/Set;

    .line 0
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lbws;->r:Lbyl;

    .line 14000
    iget-object v2, v0, Lbyl;->d:Ljava/util/Map;

    .line 0
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbvz;

    iget-object v4, p0, Lbws;->a:Lbwz;

    iget-object v4, v4, Lbwz;->k:Ljava/util/Map;

    invoke-virtual {v0}, Lbvz;->b()Lbwe;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final a(Lbwp;)Lbwp;
    .locals 1

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final a()V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 0
    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->c:Lbyx;

    .line 1000
    const/4 v1, 0x1

    iput-boolean v1, v0, Lbyx;->e:Z

    .line 0
    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iput-boolean v2, p0, Lbws;->n:Z

    iput-boolean v2, p0, Lbws;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lbws;->k:Lcom/google/android/gms/common/ConnectionResult;

    iput v2, p0, Lbws;->m:I

    const/4 v0, 0x2

    iput v0, p0, Lbws;->q:I

    iput-boolean v2, p0, Lbws;->f:Z

    iput-boolean v2, p0, Lbws;->h:Z

    iget-object v0, p0, Lbws;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbvz;

    iget-object v1, p0, Lbws;->a:Lbwz;

    iget-object v1, v1, Lbwz;->j:Ljava/util/Map;

    invoke-virtual {v0}, Lbvz;->b()Lbwe;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbwc;

    iget-object v2, p0, Lbws;->s:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    new-instance v4, Lbwi;

    invoke-direct {v4, p0, v0, v2}, Lbwi;-><init>(Lbws;Lbvz;I)V

    invoke-interface {v1, v4}, Lbwc;->a(Lbwi;)V

    invoke-virtual {v0}, Lbvz;->a()Lbwd;

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lbws;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbws;->r:Lbyl;

    iget-object v1, p0, Lbws;->a:Lbwz;

    .line 2000
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    .line 0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 3000
    iput-object v1, v0, Lbyl;->h:Ljava/lang/Integer;

    .line 0
    new-instance v5, Lbwx;

    .line 4000
    invoke-direct {v5, p0}, Lbwx;-><init>(Lbws;)V

    .line 0
    iget-object v0, p0, Lbws;->t:Lbwd;

    iget-object v1, p0, Lbws;->j:Landroid/content/Context;

    iget-object v2, p0, Lbws;->a:Lbwz;

    .line 5000
    iget-object v2, v2, Lbwz;->e:Landroid/os/Looper;

    .line 0
    iget-object v3, p0, Lbws;->r:Lbyl;

    iget-object v4, p0, Lbws;->r:Lbyl;

    .line 6000
    iget-object v4, v4, Lbyl;->g:Lclt;

    move-object v6, v5

    .line 0
    invoke-interface/range {v0 .. v6}, Lbwd;->a(Landroid/content/Context;Landroid/os/Looper;Lbyl;Ljava/lang/Object;Lbwg;Lbwh;)Lbwc;

    move-result-object v0

    check-cast v0, Lcls;

    iput-object v0, p0, Lbws;->d:Lcls;

    iget-object v0, p0, Lbws;->d:Lcls;

    invoke-interface {v0}, Lcls;->j()V

    :cond_1
    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iput v0, p0, Lbws;->c:I

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwc;

    invoke-interface {v0}, Lbwc;->j()V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final a(I)V
    .locals 3

    const/4 v2, 0x1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxi;

    invoke-interface {v0}, Lbxi;->b()V

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbws;->a:Lbwz;

    invoke-virtual {v0}, Lbwz;->f()V

    iget-object v0, p0, Lbws;->k:Lcom/google/android/gms/common/ConnectionResult;

    if-nez v0, :cond_1

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iput-boolean v2, p0, Lbws;->n:Z

    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lbws;->k:Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p0, v2}, Lbws;->a(Z)V

    :cond_2
    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v1, p0, Lbws;->k:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0, v1}, Lbwz;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_1
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lbws;->b(I)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lbws;->o:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_2
    invoke-virtual {p0}, Lbws;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lbws;->i()V

    goto :goto_0
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;Lbvz;I)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lbws;->b(I)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lbws;->b(Lcom/google/android/gms/common/ConnectionResult;Lbvz;I)V

    invoke-virtual {p0}, Lbws;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lbws;->i()V

    goto :goto_0
.end method

.method a(Lcom/google/android/gms/common/ConnectionResult;)Z
    .locals 3

    const/4 v0, 0x1

    iget v1, p0, Lbws;->q:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    iget v1, p0, Lbws;->q:I

    if-ne v1, v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->a()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Lbwp;)Lbwp;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GoogleApiClient is not connected yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbws;->n:Z

    return-void
.end method

.method b(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Lbws;->n:Z

    iget-object v1, p0, Lbws;->a:Lbwz;

    iget-object v1, v1, Lbwz;->l:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->a()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-direct {p0, v0}, Lbws;->a(Z)V

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lbws;->a(I)V

    iget-object v0, p0, Lbws;->a:Lbwz;

    .line 11000
    iget-boolean v0, v0, Lbwz;->g:Z

    .line 0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lbws;->j:Landroid/content/Context;

    .line 12000
    iget v1, p1, Lcom/google/android/gms/common/ConnectionResult;->c:I

    .line 0
    invoke-static {v0, v1}, Lbvt;->b(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lbws;->a:Lbwz;

    invoke-virtual {v0}, Lbwz;->g()Z

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->c:Lbyx;

    invoke-virtual {v0, p1}, Lbyx;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_2
    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->c:Lbyx;

    invoke-virtual {v0}, Lbyx;->a()V

    return-void
.end method

.method b(Lcom/google/android/gms/common/ConnectionResult;Lbvz;I)V
    .locals 4

    .prologue
    const v3, 0x7fffffff

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 0
    const/4 v2, 0x2

    if-eq p3, v2, :cond_2

    invoke-virtual {p2}, Lbvz;->a()Lbwd;

    .line 8000
    if-ne p3, v0, :cond_0

    .line 9000
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->a()Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v0

    .line 8000
    :goto_0
    if-eqz v2, :cond_5

    :cond_0
    iget-object v2, p0, Lbws;->k:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz v2, :cond_1

    iget v2, p0, Lbws;->l:I

    if-ge v3, v2, :cond_5

    .line 0
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    iput-object p1, p0, Lbws;->k:Lcom/google/android/gms/common/ConnectionResult;

    iput v3, p0, Lbws;->l:I

    :cond_2
    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->k:Ljava/util/Map;

    invoke-virtual {p2}, Lbvz;->b()Lbwe;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 10000
    :cond_3
    iget v2, p1, Lcom/google/android/gms/common/ConnectionResult;->c:I

    .line 9000
    invoke-static {v2}, Lbvt;->a(I)Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_4

    move v2, v0

    goto :goto_0

    :cond_4
    move v2, v1

    goto :goto_0

    :cond_5
    move v0, v1

    .line 8000
    goto :goto_1
.end method

.method b(I)Z
    .locals 3

    iget v0, p0, Lbws;->m:I

    if-eq v0, p1, :cond_0

    const-string v0, "GoogleApiClientConnecting"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GoogleApiClient connecting is in step "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lbws;->m:I

    invoke-static {v2}, Lbws;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " but received callback for step "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lbws;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, v0}, Lbws;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "CONNECTING"

    return-object v0
.end method

.method d()Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lbws;->c:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lbws;->c:I

    iget v1, p0, Lbws;->c:I

    if-lez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lbws;->k:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lbws;->k:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {p0, v1}, Lbws;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method e()V
    .locals 3

    iget-boolean v0, p0, Lbws;->f:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lbws;->c:I

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput v0, p0, Lbws;->m:I

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iput v0, p0, Lbws;->c:I

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwe;

    iget-object v2, p0, Lbws;->a:Lbwz;

    iget-object v2, v2, Lbwz;->k:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lbws;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbws;->f()V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lbws;->a:Lbwz;

    iget-object v2, v2, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwc;

    iget-object v2, p0, Lbws;->g:Lbzf;

    invoke-interface {v0, v2}, Lbwc;->a(Lbzf;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method f()V
    .locals 4

    const/4 v0, 0x2

    iput v0, p0, Lbws;->m:I

    iget-object v0, p0, Lbws;->a:Lbwz;

    invoke-direct {p0}, Lbws;->j()Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lbwz;->l:Ljava/util/Set;

    iget-object v0, p0, Lbws;->d:Lcls;

    iget-object v1, p0, Lbws;->g:Lbzf;

    iget-object v2, p0, Lbws;->a:Lbwz;

    iget-object v2, v2, Lbwz;->l:Ljava/util/Set;

    new-instance v3, Lbwt;

    invoke-direct {v3, p0}, Lbwt;-><init>(Lbws;)V

    invoke-interface {v0, v1, v2, v3}, Lcls;->a(Lbzf;Ljava/util/Set;Lcta;)V

    return-void
.end method

.method g()V
    .locals 4

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->l:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lbws;->j()Ljava/util/Set;

    move-result-object v0

    move-object v1, v0

    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lbws;->m:I

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iput v0, p0, Lbws;->c:I

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwe;

    iget-object v3, p0, Lbws;->a:Lbwz;

    iget-object v3, v3, Lbwz;->k:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lbws;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lbws;->i()V

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lbws;->a:Lbwz;

    iget-object v3, v3, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwc;

    iget-object v3, p0, Lbws;->g:Lbzf;

    invoke-interface {v0, v3, v1}, Lbwc;->a(Lbzf;Ljava/util/Set;)V

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    move-object v1, v0

    goto :goto_0
.end method

.method h()V
    .locals 6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbws;->e:Z

    iget-object v0, p0, Lbws;->a:Lbwz;

    iget-object v0, v0, Lbwz;->l:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Lbws;->p:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwe;

    iget-object v2, p0, Lbws;->a:Lbwz;

    iget-object v2, v2, Lbwz;->k:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lbws;->a:Lbwz;

    iget-object v2, v2, Lbwz;->k:Ljava/util/Map;

    new-instance v3, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v4, 0x11

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method
