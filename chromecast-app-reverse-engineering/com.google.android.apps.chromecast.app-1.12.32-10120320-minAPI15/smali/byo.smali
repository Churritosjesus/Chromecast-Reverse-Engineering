.class public abstract Lbyo;
.super Ljava/lang/Object;

# interfaces
.implements Lbwc;
.implements Lbyy;


# instance fields
.field private final a:Lbyl;

.field private final b:Lbyz;

.field private final c:Ljava/lang/Object;

.field private d:Lbzl;

.field private e:Z

.field private f:Lbwi;

.field public final g:Landroid/content/Context;

.field public final h:Landroid/os/Looper;

.field final i:Landroid/os/Handler;

.field private j:Landroid/os/IInterface;

.field private final k:Ljava/util/ArrayList;

.field private l:Lbyt;

.field private m:I

.field private final n:Ljava/util/Set;

.field private final o:Landroid/accounts/Account;

.field private final p:Lbyx;

.field private final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "service_esmobile"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "service_googleme"

    aput-object v2, v0, v1

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILbwg;Lbwh;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lbyo;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbyo;->e:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbyo;->k:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput v0, p0, Lbyo;->m:I

    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lbyo;->g:Landroid/content/Context;

    const-string v0, "Looper must not be null"

    invoke-static {p2, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    iput-object v0, p0, Lbyo;->h:Landroid/os/Looper;

    invoke-static {p1}, Lbyz;->a(Landroid/content/Context;)Lbyz;

    move-result-object v0

    iput-object v0, p0, Lbyo;->b:Lbyz;

    new-instance v0, Lbyx;

    invoke-direct {v0, p2, p0}, Lbyx;-><init>(Landroid/os/Looper;Lbyy;)V

    iput-object v0, p0, Lbyo;->p:Lbyx;

    new-instance v0, Lbyq;

    invoke-direct {v0, p0, p2}, Lbyq;-><init>(Lbyo;Landroid/os/Looper;)V

    iput-object v0, p0, Lbyo;->i:Landroid/os/Handler;

    iput p3, p0, Lbyo;->q:I

    const/4 v0, 0x0

    iput-object v0, p0, Lbyo;->o:Landroid/accounts/Account;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lbyo;->n:Ljava/util/Set;

    new-instance v0, Lbwf;

    invoke-direct {v0, p1}, Lbwf;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lbwf;->a()Lbyl;

    move-result-object v0

    iput-object v0, p0, Lbyo;->a:Lbyl;

    invoke-static {p4}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwg;

    invoke-direct {p0, v0}, Lbyo;->a(Lbwg;)V

    invoke-static {p5}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwh;

    invoke-virtual {p0, v0}, Lbyo;->a(Lbwh;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILbwg;Lbwh;Lbyl;)V
    .locals 8

    invoke-static {p1}, Lbyz;->a(Landroid/content/Context;)Lbyz;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move-object v5, p6

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lbyo;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbyz;ILbyl;Lbwg;Lbwh;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lbyz;ILbyl;)V
    .locals 1

    .prologue
    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lbyo;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbyo;->e:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbyo;->k:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput v0, p0, Lbyo;->m:I

    const-string v0, "Context must not be null"

    invoke-static {p1, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lbyo;->g:Landroid/content/Context;

    const-string v0, "Looper must not be null"

    invoke-static {p2, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    iput-object v0, p0, Lbyo;->h:Landroid/os/Looper;

    const-string v0, "Supervisor must not be null"

    invoke-static {p3, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbyz;

    iput-object v0, p0, Lbyo;->b:Lbyz;

    new-instance v0, Lbyx;

    invoke-direct {v0, p2, p0}, Lbyx;-><init>(Landroid/os/Looper;Lbyy;)V

    iput-object v0, p0, Lbyo;->p:Lbyx;

    new-instance v0, Lbyq;

    invoke-direct {v0, p0, p2}, Lbyq;-><init>(Lbyo;Landroid/os/Looper;)V

    iput-object v0, p0, Lbyo;->i:Landroid/os/Handler;

    iput p4, p0, Lbyo;->q:I

    invoke-static {p5}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbyl;

    iput-object v0, p0, Lbyo;->a:Lbyl;

    .line 1000
    iget-object v0, p5, Lbyl;->a:Landroid/accounts/Account;

    .line 0
    iput-object v0, p0, Lbyo;->o:Landroid/accounts/Account;

    .line 2000
    iget-object v0, p5, Lbyl;->c:Ljava/util/Set;

    .line 0
    invoke-direct {p0, v0}, Lbyo;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lbyo;->n:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lbyz;ILbyl;Lbwg;Lbwh;)V
    .locals 1

    invoke-direct/range {p0 .. p5}, Lbyo;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbyz;ILbyl;)V

    invoke-static {p6}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwg;

    invoke-direct {p0, v0}, Lbyo;->a(Lbwg;)V

    invoke-static {p7}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwh;

    invoke-virtual {p0, v0}, Lbyo;->a(Lbwh;)V

    return-void
.end method

.method static synthetic a(Lbyo;Lbzl;)Lbzl;
    .locals 0

    iput-object p1, p0, Lbyo;->d:Lbzl;

    return-object p1
.end method

.method private a(Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    .prologue
    .line 0
    if-nez p1, :cond_1

    :cond_0
    return-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expanding scopes is not permitted, use implied scopes instead"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(ILandroid/os/IInterface;)V
    .locals 5

    .prologue
    const/4 v2, 0x3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 0
    if-ne p1, v2, :cond_1

    move v3, v0

    :goto_0
    if-eqz p2, :cond_2

    move v2, v0

    :goto_1
    if-ne v3, v2, :cond_3

    :goto_2
    invoke-static {v0}, La;->b(Z)V

    iget-object v1, p0, Lbyo;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput p1, p0, Lbyo;->m:I

    iput-object p2, p0, Lbyo;->j:Landroid/os/IInterface;

    packed-switch p1, :pswitch_data_0

    :cond_0
    :goto_3
    monitor-exit v1

    return-void

    :cond_1
    move v3, v1

    goto :goto_0

    :cond_2
    move v2, v1

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2

    .line 5000
    :pswitch_0
    iget-object v0, p0, Lbyo;->l:Lbyt;

    if-eqz v0, :cond_4

    const-string v0, "GmsClient"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Calling connect() while still connected, missing disconnect() for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lbyo;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lbyo;->b:Lbyz;

    invoke-virtual {p0}, Lbyo;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lbyo;->l:Lbyt;

    invoke-virtual {p0}, Lbyo;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lbyz;->b(Ljava/lang/String;Landroid/content/ServiceConnection;Ljava/lang/String;)V

    :cond_4
    new-instance v0, Lbyt;

    invoke-direct {v0, p0}, Lbyt;-><init>(Lbyo;)V

    iput-object v0, p0, Lbyo;->l:Lbyt;

    iget-object v0, p0, Lbyo;->b:Lbyz;

    invoke-virtual {p0}, Lbyo;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lbyo;->l:Lbyt;

    invoke-virtual {p0}, Lbyo;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lbyz;->a(Ljava/lang/String;Landroid/content/ServiceConnection;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GmsClient"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unable to connect to service: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lbyo;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lbyo;->i:Landroid/os/Handler;

    iget-object v2, p0, Lbyo;->i:Landroid/os/Handler;

    const/4 v3, 0x3

    const/16 v4, 0x9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_3

    .line 0
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 6000
    :pswitch_1
    :try_start_1
    iget-object v0, p0, Lbyo;->l:Lbyt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbyo;->b:Lbyz;

    invoke-virtual {p0}, Lbyo;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lbyo;->l:Lbyt;

    invoke-virtual {p0}, Lbyo;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lbyz;->b(Ljava/lang/String;Landroid/content/ServiceConnection;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lbyo;->l:Lbyt;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_3

    .line 0
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lbwg;)V
    .locals 1

    iget-object v0, p0, Lbyo;->p:Lbyx;

    invoke-virtual {v0, p1}, Lbyx;->a(Lbwg;)V

    return-void
.end method

.method static synthetic a(Lbyo;ILandroid/os/IInterface;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lbyo;->a(ILandroid/os/IInterface;)V

    return-void
.end method

.method private a(IILandroid/os/IInterface;)Z
    .locals 2

    iget-object v1, p0, Lbyo;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lbyo;->m:I

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    monitor-exit v1

    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p2, p3}, Lbyo;->a(ILandroid/os/IInterface;)V

    const/4 v0, 0x1

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lbyo;)Z
    .locals 1

    iget-boolean v0, p0, Lbyo;->e:Z

    return v0
.end method

.method static synthetic a(Lbyo;IILandroid/os/IInterface;)Z
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lbyo;->a(IILandroid/os/IInterface;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lbyo;)Lbwi;
    .locals 1

    iget-object v0, p0, Lbyo;->f:Lbwi;

    return-object v0
.end method

.method static synthetic c(Lbyo;)Lbyx;
    .locals 1

    iget-object v0, p0, Lbyo;->p:Lbyx;

    return-object v0
.end method

.method static synthetic d(Lbyo;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lbyo;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic e(Lbyo;)Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lbyo;->n:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic f(Lbyo;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lbyo;->g:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public abstract a(Landroid/os/IBinder;)Landroid/os/IInterface;
.end method

.method public a()V
    .locals 4

    iget-object v0, p0, Lbyo;->p:Lbyx;

    invoke-virtual {v0}, Lbyx;->a()V

    iget-object v2, p0, Lbyo;->k:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lbyo;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    iget-object v0, p0, Lbyo;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbyr;

    invoke-virtual {v0}, Lbyr;->d()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbyo;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lbyo;->a(ILandroid/os/IInterface;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(I)V
    .locals 4

    iget-object v0, p0, Lbyo;->i:Landroid/os/Handler;

    iget-object v1, p0, Lbyo;->i:Landroid/os/Handler;

    const/4 v2, 0x4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lbyo;->i:Landroid/os/Handler;

    iget-object v1, p0, Lbyo;->i:Landroid/os/Handler;

    const/4 v2, 0x1

    new-instance v3, Lbyu;

    invoke-direct {v3, p0, p1, p2, p3}, Lbyu;-><init>(Lbyo;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final a(Lbwh;)V
    .locals 1

    iget-object v0, p0, Lbyo;->p:Lbyx;

    invoke-virtual {v0, p1}, Lbyx;->a(Lbwh;)V

    return-void
.end method

.method public final a(Lbwi;)V
    .locals 1

    const-string v0, "Must provide a non-null ConnectionStatusReportCallbacks"

    invoke-static {p1, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwi;

    iput-object v0, p0, Lbyo;->f:Lbwi;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbyo;->e:Z

    return-void
.end method

.method public final a(Lbzf;)V
    .locals 4

    new-instance v1, Lcom/google/android/gms/common/internal/ValidateAccountRequest;

    iget-object v0, p0, Lbyo;->n:Ljava/util/Set;

    iget-object v2, p0, Lbyo;->n:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    iget-object v2, p0, Lbyo;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, p1, v0, v2, v3}, Lcom/google/android/gms/common/internal/ValidateAccountRequest;-><init>(Lbzf;[Lcom/google/android/gms/common/api/Scope;Ljava/lang/String;Landroid/os/Bundle;)V

    :try_start_0
    iget-object v0, p0, Lbyo;->d:Lbzl;

    new-instance v2, Lbys;

    invoke-direct {v2, p0}, Lbys;-><init>(Lbyo;)V

    invoke-interface {v0, v2, v1}, Lbzl;->a(Lbzi;Lcom/google/android/gms/common/internal/ValidateAccountRequest;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GmsClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lbyo;->a(I)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "GmsClient"

    const-string v2, "Remote exception occurred"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public final a(Lbzf;Ljava/util/Set;)V
    .locals 3

    .prologue
    .line 0
    :try_start_0
    invoke-virtual {p0}, Lbyo;->e()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/internal/GetServiceRequest;

    iget v2, p0, Lbyo;->q:I

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/internal/GetServiceRequest;-><init>(I)V

    iget-object v2, p0, Lbyo;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 8000
    iput-object v2, v1, Lcom/google/android/gms/common/internal/GetServiceRequest;->d:Ljava/lang/String;

    .line 9000
    iput-object v0, v1, Lcom/google/android/gms/common/internal/GetServiceRequest;->g:Landroid/os/Bundle;

    .line 0
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p2, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    .line 10000
    iput-object v0, v1, Lcom/google/android/gms/common/internal/GetServiceRequest;->f:[Lcom/google/android/gms/common/api/Scope;

    .line 0
    :cond_0
    invoke-virtual {p0}, Lbyo;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbyo;->o:Landroid/accounts/Account;

    .line 11000
    iput-object v0, v1, Lcom/google/android/gms/common/internal/GetServiceRequest;->h:Landroid/accounts/Account;

    .line 0
    :cond_1
    iget-object v0, p0, Lbyo;->d:Lbzl;

    new-instance v2, Lbys;

    invoke-direct {v2, p0}, Lbys;-><init>(Lbyo;)V

    invoke-interface {v0, v2, v1}, Lbzl;->a(Lbzi;Lcom/google/android/gms/common/internal/GetServiceRequest;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GmsClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lbyo;->a(I)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "GmsClient"

    const-string v2, "Remote exception occurred"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 4

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    const-string v1, "GmsClient:"

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v1

    const-string v2, "mStartServiceAction="

    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v1

    invoke-virtual {p0}, Lbyo;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v1, p0, Lbyo;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v2, p0, Lbyo;->m:I

    iget-object v3, p0, Lbyo;->j:Landroid/os/IInterface;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    const-string v1, "mConnectState="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    packed-switch v2, :pswitch_data_0

    const-string v0, "UNKNOWN"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :goto_0
    const-string v0, " mService="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    if-nez v3, :cond_0

    const-string v0, "null"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_1
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_0
    const-string v0, "CONNECTING"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    const-string v0, "CONNECTED"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    const-string v0, "DISCONNECTING"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    const-string v0, "DISCONNECTED"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lbyo;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    invoke-interface {v3}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public b()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public e()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final j()V
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 0
    iget-object v0, p0, Lbyo;->p:Lbyx;

    .line 7000
    iput-boolean v1, v0, Lbyx;->e:Z

    .line 0
    iget-object v0, p0, Lbyo;->g:Landroid/content/Context;

    invoke-static {v0}, Lbvt;->a(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v1, v2}, Lbyo;->a(ILandroid/os/IInterface;)V

    iget-object v1, p0, Lbyo;->i:Landroid/os/Handler;

    iget-object v2, p0, Lbyo;->i:Landroid/os/Handler;

    const/4 v3, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x2

    invoke-direct {p0, v0, v2}, Lbyo;->a(ILandroid/os/IInterface;)V

    goto :goto_0
.end method

.method public final k()Z
    .locals 3

    iget-object v1, p0, Lbyo;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lbyo;->m:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lbyo;->a:Lbyl;

    .line 4000
    iget-object v0, v0, Lbyl;->f:Ljava/lang/String;

    .line 0
    return-object v0
.end method

.method public final m()Z
    .locals 3

    iget-object v1, p0, Lbyo;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lbyo;->m:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final n()V
    .locals 2

    invoke-virtual {p0}, Lbyo;->k()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public final o()Landroid/os/IInterface;
    .locals 3

    iget-object v1, p0, Lbyo;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lbyo;->m:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    new-instance v0, Landroid/os/DeadObjectException;

    invoke-direct {v0}, Landroid/os/DeadObjectException;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lbyo;->n()V

    iget-object v0, p0, Lbyo;->j:Landroid/os/IInterface;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v2, "Client is connected but service is null"

    invoke-static {v0, v2}, La;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbyo;->j:Landroid/os/IInterface;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
