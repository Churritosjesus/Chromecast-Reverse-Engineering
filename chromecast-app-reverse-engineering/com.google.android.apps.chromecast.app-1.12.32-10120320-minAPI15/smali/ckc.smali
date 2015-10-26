.class public final Lckc;
.super Ljava/lang/Object;

# interfaces
.implements Lbvm;


# static fields
.field private static final a:Ljava/lang/Object;

.field private static final b:Lckk;

.field private static c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 0
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lckc;->a:Ljava/lang/Object;

    new-instance v0, Lckk;

    .line 3000
    invoke-direct {v0}, Lckk;-><init>()V

    .line 0
    sput-object v0, Lckc;->b:Lckk;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lckc;Lcom/google/android/gms/common/api/GoogleApiClient;Lckh;)Lbwj;
    .locals 1

    invoke-direct {p0, p1, p2}, Lckc;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lckh;)Lbwj;

    move-result-object v0

    return-object v0
.end method

.method private final a(Lcom/google/android/gms/common/api/GoogleApiClient;Lckh;)Lbwj;
    .locals 2

    sget-object v1, Lckc;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lckc;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lckc;->c:Ljava/util/concurrent/ExecutorService;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lckc;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lckd;

    invoke-direct {v1, p0, p1, p2}, Lckd;-><init>(Lckc;Lcom/google/android/gms/common/api/GoogleApiClient;Lckh;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-object p2

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a()Lckk;
    .locals 1

    sget-object v0, Lckc;->b:Lckk;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/clearcut/LogEventParcelable;)V
    .locals 2

    .prologue
    .line 0
    .line 2000
    iget-object v0, p0, Lcom/google/android/gms/clearcut/LogEventParcelable;->e:Lbvk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/clearcut/LogEventParcelable;->d:Lcmy;

    iget-object v0, v0, Lcmy;->b:[B

    array-length v0, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/clearcut/LogEventParcelable;->d:Lcmy;

    iget-object v1, p0, Lcom/google/android/gms/clearcut/LogEventParcelable;->e:Lbvk;

    invoke-interface {v1}, Lbvk;->a()[B

    move-result-object v1

    iput-object v1, v0, Lcmy;->b:[B

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/clearcut/LogEventParcelable;->d:Lcmy;

    invoke-static {v0}, Lcms;->a(Lcms;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/clearcut/LogEventParcelable;->c:[B

    .line 0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/clearcut/LogEventParcelable;)Lbwj;
    .locals 2

    .prologue
    .line 0
    .line 1000
    sget-object v0, Lckc;->b:Lckk;

    invoke-virtual {v0}, Lckk;->a()V

    new-instance v0, Lcki;

    invoke-direct {v0, p0, p2, p1}, Lcki;-><init>(Lckc;Lcom/google/android/gms/clearcut/LogEventParcelable;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    new-instance v1, Lckg;

    invoke-direct {v1, p0}, Lckg;-><init>(Lckc;)V

    invoke-virtual {v0, v1}, Lcki;->a(Lbwk;)V

    .line 0
    invoke-direct {p0, p1, v0}, Lckc;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lckh;)Lbwj;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 4

    new-instance v0, Lcke;

    invoke-direct {v0, p0, p1, p1}, Lcke;-><init>(Lckc;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    sget-object v1, Lckc;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lckc;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v2, :cond_0

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwp;)Lbwp;

    :goto_0
    monitor-exit v1

    return-void

    :cond_0
    sget-object v2, Lckc;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Lckf;

    invoke-direct {v3, p0, p1, v0}, Lckf;-><init>(Lckc;Lcom/google/android/gms/common/api/GoogleApiClient;Lckh;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
